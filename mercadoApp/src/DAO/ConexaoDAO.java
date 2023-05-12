package DAO;


import java.sql.Connection;
import javax.swing.JOptionPane;
import java.sql.DriverManager;
import java.sql.SQLException;
public class ConexaoDAO {
    //metodo publico do tipo conection 
    
    public Connection conecta(){
        //variavel do tipo connection
        Connection conn = null;
       
        try {
            String url= "jdbc:mysql://localhost:3306/venda?user=root&password=12345";
            conn = DriverManager.getConnection(url);
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null,"erro na classe ConexaoDAO"+erro.getMessage());
        }
        return conn;//tenhoq retornar algo dotipo connection
    }
}
