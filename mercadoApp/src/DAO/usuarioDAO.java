package DAO;

import DTO.usuarioDTO;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.ResultSet;

public class usuarioDAO {

    Connection conn;
    PreparedStatement pstm;
    ResultSet rs;

    public ResultSet autenticacaoUser(usuarioDTO objusuariodto) {
        conn = new ConexaoDAO().conecta();

        try {
            String sql = "select * from atendente where email_atendente = ? and senha_atendente = ? ";
            
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objusuariodto.getEmail_usuario());
            pstm.setString(2, objusuariodto.getSenha_usuario());
            
            rs = pstm.executeQuery();
            return rs;
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro em UsuarioDAO" + erro);
            return null;
        }
    }
}
