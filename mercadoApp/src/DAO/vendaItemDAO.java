/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import DTO.Item;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
/**
 *
 * @author isa
 */
public class vendaItemDAO {
    Connection conn;
    PreparedStatement pstm;
    ResultSet rs;
    
    public boolean cadastrarProdutoVenda(ArrayList<Item> objItem){
        String sql = "INSERT INTO venda_item (id_venda,id_produto,valor_venda,quantidade) VALUES (?,?,?,?)";
        conn = new ConexaoDAO().conecta();
    
        try {
            int cont =objItem.size();
            for(int i = 0;i<cont;i++){
            
               pstm = conn.prepareStatement(sql);
            pstm.setInt(1,objItem.get(i).getIDproduto());
            pstm.setInt(2, objItem.get(i).getIDproduto());
            pstm.setDouble(3,objItem.get(i).getValor());
            pstm.setInt(4, objItem.get(i).getQuantidade());
            
            pstm.execute();
            pstm.close();
            }
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        
        }
    }
}
