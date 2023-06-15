/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;
import DTO.Data;
import DTO.Item;
import DTO.produtoDTO;
import DTO.vendaDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;
/**
 *
 * @author isa
 */
public class Relatorio {
       SimpleDateFormat sdf= new SimpleDateFormat("yyyy-MM-dd");
    Connection conn;
     PreparedStatement pstm;
    ResultSet rs;
      ArrayList<Item> listaVendas = new ArrayList<>();
    public ArrayList<Item> listarModificado(Data data){
       
        String sql="select v.id_venda,p.nome_produto,vi.valor_venda,vi.quantidade,v.data_venda "
                + "from venda_item vi "
                + "inner join produto p "
                + "on vi.id_produto = p.id_produto "
                + "inner join vendas v "
                + "on vi.id_venda = v.id_venda "
                + "where v.data_venda "
                + "between "
                + "'"+sdf.format(data.getDataInicial())+"'"+ "and "+ "'"+sdf.format(data.getDataFinal())+"'" ;
                
           conn = new ConexaoDAO().conecta();
           
           try {
               pstm= conn.prepareStatement(sql);
                 rs = pstm.executeQuery();

            while (rs.next()) {
                Item item = new Item();
                produtoDTO produto = new produtoDTO();
                vendaDTO venda = new vendaDTO();
                
                venda.setIdVenda(rs.getInt("v.id_venda"));
                produto.setNome_produto(rs.getString("p.nome_produto"));
                item.setValor(rs.getDouble("vi.valor_venda"));
                item.setQuantidade(rs.getInt("vi.quantidade"));
                venda.setDataVenda(rs.getDate("v.data_venda"));
                item.setVenda(venda);
                item.setProduto(produto);
                
                listaVendas.add(item);
            }
               
            
        } catch (SQLException e) {
             JOptionPane.showMessageDialog(null, "Erro no listar Relatorio" + e);

        }
           return listaVendas;
    }
}
