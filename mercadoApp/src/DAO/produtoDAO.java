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
   

 
    
    public produtoDTO getProduto(String nomeProduto){
       return this.getProdutoNome(nomeProduto);
    }
   
    public produtoDTO retornarValores(int id_produto){
          produtoDTO objProdutoDto = new produtoDTO();
           String sql = "SELECT id_produto,nome_produto,preco_produto,qtd_estoque,id_categoria FROM produto where id_produto = '"+id_produto+"'";
        conn = new ConexaoDAO().conecta();
         try {

            pstm = conn.prepareStatement(sql);
            rs = pstm.executeQuery();

            while (rs.next()) {//enquanto tiver linhas, vai ficar nesse looping
               
                //basicamente , pegamos um valor do banco , armazenamos na dto e dps exibimos
                objProdutoDto.setId_produto(rs.getInt("id_produto"));//acessamos a classe , pegamos a informacao no result set e entao passamos o o atributo para a variavel
                objProdutoDto.setNome_produto(rs.getString("nome_produto"));
                objProdutoDto.setPreco_produto(rs.getDouble("preco_produto"));
                objProdutoDto.setQtd_produto(rs.getInt("qtd_estoque"));
                objProdutoDto.setId_categoria(rs.getInt("id_categoria"));
                
                
            }

        } catch (SQLException erro) {

            JOptionPane.showMessageDialog(null, "Erro no listar produtoDAO" + erro);
        }
            return objProdutoDto;
        
    }
    
    public produtoDTO getProdutoNome(String nomeProduto){
        produtoDTO objProdutoDto = new produtoDTO();
           String sql = "SELECT id_produto,nome_produto,preco_produto,qtd_estoque,id_categoria FROM produto where nome_produto = '"+nomeProduto+"'";
        conn = new ConexaoDAO().conecta();
         try {

            pstm = conn.prepareStatement(sql);
            rs = pstm.executeQuery();

            while (rs.next()) {//enquanto tiver linhas, vai ficar nesse looping
               
                //basicamente , pegamos um valor do banco , armazenamos na dto e dps exibimos
                objProdutoDto.setId_produto(rs.getInt("id_produto"));//acessamos a classe , pegamos a informacao no result set e entao passamos o o atributo para a variavel
                objProdutoDto.setNome_produto(rs.getString("nome_produto"));
                objProdutoDto.setPreco_produto(rs.getDouble("preco_produto"));
                objProdutoDto.setQtd_produto(rs.getInt("qtd_estoque"));
                objProdutoDto.setId_categoria(rs.getInt("id_categoria"));
                
                
            }

        } catch (SQLException erro) {

            JOptionPane.showMessageDialog(null, "Erro no listar produtoDAO" + erro);
        }
            return objProdutoDto;
        
    }
    public void cadastrarPoduto(produtoDTO objprodutodto) {

        String sql = "INSERT INTO produto (nome_produto,preco_produto,qtd_estoque,id_categoria) VALUES (?,?,?,?)";
        conn = new ConexaoDAO().conecta();

        try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objprodutodto.getNome_produto());
            pstm.setDouble(2, objprodutodto.getPreco_produto());
            pstm.setInt(3, objprodutodto.getQtd_produto());
            pstm.setInt(4,objprodutodto.getId_categoria());
            JOptionPane.showMessageDialog(null, "Produto: "+objprodutodto.getNome_produto()+" cadastrado com sucesso!");
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
                objprodutodto.setNome_produto(rs.getString("nome_produto"));
                objprodutodto.setPreco_produto(rs.getDouble("preco_produto"));
                objprodutodto.setQtd_produto(rs.getInt("qtd_estoque"));
                objprodutodto.setId_categoria(rs.getInt("id_categoria"));
                
                listaProduto.add(objprodutodto);
            }

        } catch (SQLException erro) {

            JOptionPane.showMessageDialog(null, "Erro no listar produtoDAO" + erro);
        }
            return listaProduto;
    }
    
    public ResultSet listarCategoria(){
        conn = new ConexaoDAO().conecta();
        String sql="SELECT * FROM categoria ORDER BY nome_categoria";
        
        try {
            pstm=conn.prepareStatement(sql);
            return pstm.executeQuery();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"erro no metodo listarCategoria em produtoDAO" +  e.getMessage());
            return null;
        }
        
    }
     public ResultSet listarProdutoCbx(){
        conn = new ConexaoDAO().conecta();
        String sql="SELECT * FROM produto ORDER BY nome_produto";
        
        try {
            pstm=conn.prepareStatement(sql);
            return pstm.executeQuery();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"erro no metodo listarProdutoCbx em produtoDAO" +  e.getMessage());
            return null;
        }
        
    }
    
}
