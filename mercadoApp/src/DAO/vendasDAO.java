package DAO;

import DTO.vendasDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;



public class vendasDAO {

    Connection conn;
    PreparedStatement pstm;
    ResultSet rs;
    ArrayList<vendasDTO> listaVendas = new ArrayList<>();

    public ArrayList<vendasDTO> listarVendas() {

        String sql = "SELECT * FROM vendas";
        conn = new ConexaoDAO().conecta();

        try {

            pstm = conn.prepareStatement(sql);
            rs = pstm.executeQuery();
            
             while (rs.next()) {//enquanto tiver linhas, vai ficar nesse looping
                vendasDTO objvendasdto = new vendasDTO();
                //basicamente , pegamos um valor do banco , armazenamos na dto e dps exibimos
                objvendasdto.setId_produto(rs.getInt("id_produto"));//acessamos a classe , pegamos a informacao no result set e entao passamos o o atributo para a variavel
                objvendasdto.setId_venda(rs.getInt("id_venda"));
                objvendasdto.setQtd_produto(rs.getString("qtd_produto"));
                objvendasdto.setData_venda(rs.getDate("data_venda"));

                listaVendas.add(objvendasdto);
            }

        } catch (SQLException erro) {

            JOptionPane.showMessageDialog(null, "Erro no consultar VendasDAO" + erro);
        }
        
        return listaVendas;
    }
}
