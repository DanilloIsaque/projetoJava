
package DAO;
import DTO.admDTO;
import DTO.categoriaDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class categoriaDAO {
    Connection conn;
    PreparedStatement pstm;
     ResultSet rs;
    ArrayList<categoriaDTO> listaCategoria = new ArrayList<>();
    
    
    public void cadastrarCategoria(categoriaDTO objCategoriaDto){
        String sql = "INSERT INTO categoria (nome_categoria) VALUES (?)";
        conn = new ConexaoDAO().conecta();
        
        try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objCategoriaDto.getNomeCategoria());
            JOptionPane.showMessageDialog(null, "Categoria cadastrada com sucesso!");
             pstm.execute();
            pstm.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Erro na pagina CategoriaDAO , cadastro"+ e);
        }
    }

    public ArrayList<categoriaDTO> listarCategoria(){
        String sql="SELECT * FROM categoria";
        conn = new ConexaoDAO().conecta();
        
        try {
             pstm= conn.prepareStatement(sql);
            rs = pstm.executeQuery();
            
             while(rs.next()){//enquanto tiver linhas, vai ficar nesse looping
                categoriaDTO objCategoriaDto =  new categoriaDTO();
                //basicamente , pegamos um valor do banco , armazenamos na dto e dps exibimos
                objCategoriaDto.setIdCategoria(rs.getInt("id_categoria"));//acessamos a classe , pegamos a informacao no result set e entao passamos o o atributo para a variavel
                objCategoriaDto.setNomeCategoria(rs.getString("nome_categoria"));
               
                
                listaCategoria.add(objCategoriaDto);
             }
        } catch (SQLException e) {
             JOptionPane.showMessageDialog(null,"Erro na pagina CategoriaDAO , listar"+ e);
        }
        return listaCategoria;
    }
    
    public void alterarCategoria(categoriaDTO objCategoriaDto){
         String sql="UPDATE categoria SET nome_categoria=? WHERE id_categoria =?";
        conn = new ConexaoDAO().conecta();
        
        try {
             pstm =conn.prepareStatement(sql);
            pstm.setString(1,objCategoriaDto.getNomeCategoria()); //primeiro parametro q setamos(?), o q vem como parametro 
            pstm.setInt(2,objCategoriaDto.getIdCategoria());
            JOptionPane.showMessageDialog(null,"Alterado com sucesso!");
            
            pstm.execute();
            pstm.close();
        } catch (SQLException e) {
        JOptionPane.showMessageDialog(null,"Erro na classe categoriaDAO em alterar" +e);
        }
    }
    
     public void excluirCategoria(categoriaDTO objCategoriaDto){
         String sql="DELETE FROM categoria WHERE id_categoria=?";
         conn= new ConexaoDAO().conecta();
         
         try {
             pstm = conn.prepareStatement(sql);
             pstm.setInt(1,objCategoriaDto.getIdCategoria());
             pstm.execute();
             pstm.close();
             
             
             
         } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"erro na classe produtoDAO , excluirProduto" + e);
         }
     }
    
}
