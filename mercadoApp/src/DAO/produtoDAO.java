package DAO;

import DTO.produtoDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class produtoDAO {

    Connection conn;
    PreparedStatement pstm;
    ResultSet rs;
    ArrayList<produtoDTO> listaProduto = new ArrayList<>();

    public void cadastrarPoduto(produtoDTO objprodutodto) {

        String sql = "INSERT INTO produto (nome_produto,preco_produto,qtd_estoque,id_categoria) VALUES (?,?,?,?)";
        conn = new ConexaoDAO().conecta();

        try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objprodutodto.getNome_produto());
            pstm.setString(2, objprodutodto.getPreco_produto());
            pstm.setString(3, objprodutodto.getQtd_produto());
            pstm.setInt(4, objprodutodto.getId_categoria());

            JOptionPane.showMessageDialog(null, "Produto cadastrado com sucesso!");
            pstm.execute();
            pstm.close();
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro na pagina ProdutoDAO , cadastro" + erro);
        }
    }

    public ArrayList<produtoDTO> listarProduto() {
        String sql = "SELECT * FROM produto";
        conn = new ConexaoDAO().conecta();

        try {

            pstm = conn.prepareStatement(sql);
            rs = pstm.executeQuery();

            while (rs.next()) {//enquanto tiver linhas, vai ficar nesse looping
                produtoDTO objprodutodto = new produtoDTO();
                //basicamente , pegamos um valor do banco , armazenamos na dto e dps exibimos
                objprodutodto.setId_produto(rs.getInt("id_produto"));//acessamos a classe , pegamos a informacao no result set e entao passamos o o atributo para a variavel
                objprodutodto.setNome_produto(rs.getString("Nome_produto"));
                objprodutodto.setPreco_produto(rs.getString("Preco_produto"));
                objprodutodto.setQtd_produto(rs.getString("Qtd_estoque"));
                objprodutodto.setId_categoria(rs.getInt("id_categoria"));

                listaProduto.add(objprodutodto);
            }

        } catch (SQLException erro) {

            JOptionPane.showMessageDialog(null, "Erro no listar produtoDAO" + erro);
        }
        return listaProduto;
    }

    public ResultSet listarCategoria() {
        String sql = "SELECT * FROM categoria";
        conn = new ConexaoDAO().conecta();

        try {

            pstm = conn.prepareStatement(sql);
            return pstm.executeQuery();

        } catch (SQLException erro) {

            JOptionPane.showMessageDialog(null, "Erro no listar Produtodao" + erro);

            return null;
        }

    }

    public void excluirProduto(produtoDTO objprodutodto) {

        String sql = "DELETE FROM produto WHERE id_produto=?";
        conn = new ConexaoDAO().conecta();

        try {

            pstm = conn.prepareStatement(sql);
            pstm.setInt(1, objprodutodto.getId_produto());
            JOptionPane.showMessageDialog(null, "Excluido com sucesso!");

            pstm.execute();
            pstm.close();

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir produtodao" + erro);

        }

    }

    public void alterarProduto(produtoDTO objprodutodto) {

        String sql = "UPDATE produto SET nome_produto=?, preco_produto=?, qtd_estoque=?,id_categoria=? WHERE id_produto=?";
        conn = new ConexaoDAO().conecta();

        try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objprodutodto.getNome_produto()); //primeiro parametro q setamos(?), o q vem como parametro 
            pstm.setString(2, objprodutodto.getPreco_produto());
            pstm.setString(3, objprodutodto.getQtd_produto());
            pstm.setInt(4, objprodutodto.getId_categoria());
            pstm.setInt(5, objprodutodto.getId_produto());
            
            JOptionPane.showMessageDialog(null, "Alterado com sucesso!");

            pstm.execute();
            pstm.close();
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "erro na classe produtoDao alterar produto" + erro);
        }
    }
}