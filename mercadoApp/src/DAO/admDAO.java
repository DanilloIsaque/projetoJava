package DAO;
import java.sql.Connection;
import DTO.admDTO;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.sql.SQLException;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author isa
 */
public class admDAO {
    //acesso de objetos , recebimento
    //ele tem q receber os objetos da classe dto
    
    //colocando aqui , vou poder usar em outros metodos(excluir,consulta e alterar)
    Connection conn;//fazendo a conexao
    PreparedStatement pstm;//preparando a conexao
    ResultSet rs;
    ArrayList<admDTO> listaAdm = new ArrayList<>();
    
    public void cadastrarAdm(admDTO objAdmDto ){
        String sql = "INSERT INTO adm (nome_adm,email_adm,senha_adm) values(?,?,?)";
        conn = new ConexaoDAO().conecta();
        
        try {
            pstm =conn.prepareStatement(sql);
            pstm.setString(1,objAdmDto.getNomeAdm()); //primeiro parametro q setamos(?), o q vem como parametro 
            pstm.setString(2,objAdmDto.getEmailAdm());
            pstm.setString(3,objAdmDto.getSenhaAdm());
            JOptionPane.showMessageDialog(null,"Cadastrado com sucesso!");
            
            pstm.execute();
            pstm.close();
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null,"erro na classe admDAO" + erro);
        }
    }
  
    //quando utilizamos resultset, estamos pegando o data table e percorrendo o sql
    public ArrayList<admDTO> listarAdm(){    //<objetos>
     
        String sql="SELECT * FROM adm";
        conn = new ConexaoDAO().conecta();
        
        try {
            pstm= conn.prepareStatement(sql);
            rs = pstm.executeQuery();
            
            while(rs.next()){//enquanto tiver linhas, vai ficar nesse looping
                admDTO objAdmDto =  new admDTO();
                //basicamente , pegamos um valor do banco , armazenamos na dto e dps exibimos
                objAdmDto.setIdAdm(rs.getInt("id_adm"));//acessamos a classe , pegamos a informacao no result set e entao passamos o o atributo para a variavel
                objAdmDto.setNome(rs.getString("nome_adm"));
                objAdmDto.setEmail(rs.getString("email_adm"));
                objAdmDto.setSenha(rs.getString("senha_adm"));
                
                listaAdm.add(objAdmDto);
                
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"erro ao consultar Adm na classe admDAO" + e);
        }
        return listaAdm;
     }
    
    public void alterarAdm(admDTO objAdmDto){
          String sql = "UPDATE adm SET nome_adm=?, email_adm=?, senha_adm=? WHERE id_adm=?";
        conn = new ConexaoDAO().conecta();
        
        try {
            pstm =conn.prepareStatement(sql);
            pstm.setString(1,objAdmDto.getNomeAdm()); //primeiro parametro q setamos(?), o q vem como parametro 
            pstm.setString(2,objAdmDto.getEmailAdm());
            pstm.setString(3,objAdmDto.getSenhaAdm());
            pstm.setInt(4,objAdmDto.getIdAdm());
            JOptionPane.showMessageDialog(null,"Alterado com sucesso!");
            
            pstm.execute();
            pstm.close();
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null,"erro na classe admDAO , alterarAdm" + erro);
        }
        
    }
}
