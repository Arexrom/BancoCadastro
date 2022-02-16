/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CadastroBanco;

import CadastroBanco.AdministradorDTO;
import CadastroBanco.AdministradoresDao;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import CadastroBanco.ConnectaMysql;
import java.sql.PreparedStatement;
 
import javax.swing.JOptionPane;

/**
*
*/

/**
 *
 * @author Alex 
 */
public class LoginAdministradorDAO {

    Connection conn; 
     
    
    
    
    public ResultSet autenticaUsuario(AdministradorDTO objetocadastro) {
        conn = new ConnectaMysql().Conectabd();

        try {
            String sql = "select * from administradores where nome =? and password = ?";
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1,objetocadastro.getNome());
            pstm.setString(2,objetocadastro.getPassword());
            
            ResultSet rs = pstm.executeQuery();
            return rs;
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "usuario" + erro);
        return null;
    }
        
}
}

