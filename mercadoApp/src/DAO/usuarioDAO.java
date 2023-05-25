package DAO;

import DTO.admDTO;
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
            String sql = "select * from funcionario where usuario_funcionario = ? and senha_funcionario = ? ";
            
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objusuariodto.getEmail_usuario());
            pstm.setString(2, objusuariodto.getSenha_usuario());
            
            rs = pstm.executeQuery();
            admDTO objAdmDto = new admDTO();
            objAdmDto.setIdentificacaoAdm(rs.getInt("identificacao_funcionario"));
            
            return rs;
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro em UsuarioDAO" + erro);
            return null;
        }
    }
}
