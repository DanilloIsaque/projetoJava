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


    
    public int cadastrarVenda(vendaDTO objVendaDTO){
          String sql = "INSERT INTO vendas (data_venda,valor_total) VALUES (?,?)";
        conn = new ConexaoDAO().conecta();
        int id= 0;
        try {
               pstm = conn.prepareStatement(sql);
            pstm.setDate(1, (Date) objVendaDTO.getDataVenda());
            pstm.setDouble(2, objVendaDTO.getValorTotal());
            pstm.execute();
             rs = pstm.executeQuery("SELECT last_insert_id()");
             while(rs.next()){
                 id= rs.getInt(1);
             }
             
             pstm.close();
           
           return id;
        } catch (Exception erro) {
        
            return 0;
        }
        
        
    }
            
}
