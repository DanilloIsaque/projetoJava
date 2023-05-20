package DAO;

import DTO.atendenteDTO;
import java.sql.PreparedStatement;
import java.sql.Connection;
import javax.swing.JOptionPane;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;

public class atendenteDAO {
    
    Connection conn ;
    PreparedStatement pstm;
    ResultSet rs;
    ArrayList<atendenteDTO> listaAtd = new ArrayList<>();
    
    public void cadastrarAtendente(atendenteDTO objatendentedto){
        String sql = "insert into atendente (nome_atendente,email_atendente,senha_atendente) values (?,?,?)";
        conn = new ConexaoDAO().conecta();
        
        
        try {
            
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objatendentedto.getNome_atendente());
            pstm.setString(2, objatendentedto.getEmail_atendente());
            pstm.setString(3, objatendentedto.getSenha_atendente());
            
            JOptionPane.showMessageDialog(null, "Atendente cadastrado com sucesso!");
            pstm.execute();
            pstm.close();
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro no atendenteDAO cadastrar"+erro);
        }
    }
    
    public ArrayList<atendenteDTO> pesquisarAtd(){
        String sql = "select * from atendente";
        conn = new ConexaoDAO().conecta();
        try {
             pstm = conn.prepareStatement(sql);
             rs= pstm.executeQuery();
             
             
             while (rs.next()) {
                
                atendenteDTO objatendentedto = new atendenteDTO();
                objatendentedto.setId_atendente(rs.getInt("id_atendente"));
                objatendentedto.setNome_atendente(rs.getString("nome_atendente"));
                objatendentedto.setEmail_atendente(rs.getString("email_atendente"));
                objatendentedto.setSenha_atendente(rs.getString("senha_atendente"));
                
                listaAtd.add(objatendentedto);
                
           
            }
             
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null,"Erro pesquisarAtd"+ erro);
        }
        return listaAtd;
    }
    
    public void alterarAtendente(atendenteDTO objatendentedto){
        String sql = "update atendente set nome_atendente=? ,email_atendente= ?,senha_atendente= ? where id_atendente=?";
        conn = new ConexaoDAO().conecta();
        
        
        try {
            
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objatendentedto.getNome_atendente());
            pstm.setString(2, objatendentedto.getEmail_atendente());
            pstm.setString(3, objatendentedto.getSenha_atendente());
            //pstm.set(4, objatendentedto.getIndentificacao());
            pstm.setInt(5, objatendentedto.getId_atendente());
            
            
            
            JOptionPane.showMessageDialog(null, "Atendente alterado com sucesso!");
            pstm.execute();
            pstm.close();
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro no atendenteDAO Alterar"+erro);
        }
    }
    
    public void excluirAtendente(atendenteDTO objatendentedto){
        String sql = "delete from atendente where id_atendente=?";
        conn = new ConexaoDAO().conecta();
        try {
            
            pstm = conn.prepareStatement(sql);
            pstm.setInt(1, objatendentedto.getId_atendente());
            
            JOptionPane.showMessageDialog(null, "Atendente excluido com sucesso!");
            pstm.execute();
            pstm.close();
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro no atendenteDAO Excluir"+erro);
        }
    }
}
