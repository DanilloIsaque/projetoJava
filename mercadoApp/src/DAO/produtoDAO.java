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

        String sql = "INSERT INTO produto (nome_produto,preco_produto,qtd_produto) VALUES (?,?,?)";
        conn = new ConexaoDAO().conecta();

        try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objprodutodto.getNome_produto());
            pstm.setString(1, objprodutodto.getPreco_produto());
            pstm.setString(1, objprodutodto.getQtd_produto());
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
    
    
}
