/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CadastroBanco;
import CadastroBanco.AdministradorDTO;
import CadastroBanco.ConnectaMysql;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
/**
 *
 * @author user
 */
public class AdministradoresDao {
    
    Connection conn; 
    PreparedStatement pstm; 
    
    public void cadastrouadministrador(AdministradorDTO objetocadastro) {
       String sql =  "insert into administradores(nome,email,cpf,telefone,password) values (?,?,?,?,?)";
        
        conn =   new ConnectaMysql().Conectabd();
        
       try{
          pstm = conn.prepareStatement(sql);
           pstm.setString(1,objetocadastro.getNome());
           pstm.setString(2,objetocadastro.getEmail());
           pstm.setString(3,objetocadastro.getCpf());
           pstm.setString(4,objetocadastro.getTelefone());
           pstm.setString(5,objetocadastro.getPassword());
           pstm.execute();
           pstm.close();
           JOptionPane.showMessageDialog(null,"ADM cadastrado com sucesso");
            
      } catch (Exception erro ) {
          
           JOptionPane.showMessageDialog(null, "CadastroDao" + erro );
       }
       
    }
    
    
}
    
    

