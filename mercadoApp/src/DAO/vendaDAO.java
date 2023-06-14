/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import DTO.vendaDTO;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
public class vendaDAO {
    Connection conn;
    PreparedStatement pstm;
    ResultSet rs;
    
    public void cadastrarVenda(vendaDTO objVendaDTO){
          String sql = "INSERT INTO vendas (data_venda,valor_total) VALUES (?,?)";
        conn = new ConexaoDAO().conecta();
        try {
               pstm = conn.prepareStatement(sql);
            pstm.setDate(1, (Date) objVendaDTO.getDataVenda());
            pstm.setDouble(2, objVendaDTO.getValorTotal());
            pstm.execute();
            pstm.close();
        } catch (SQLException erro) {
          JOptionPane.showMessageDialog(null, "Erro na pagina vendaDAO , cadastro" + erro);
        }
    }
            
}
