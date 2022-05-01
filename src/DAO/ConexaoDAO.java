package DAO;

import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoDAO {

    public Connection conectaDB(){
        Connection conn = null;

        try {
            String url = "jdbc:mysql://localhost/bancologin?user=root&password=";
            conn = DriverManager.getConnection(url);


        }catch (SQLException erro){
            JOptionPane.showMessageDialog(null,"DAO.ConexaoDAO: " + erro.getMessage());

        }
        return conn;
        }
}
