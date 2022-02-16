/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CadastroBanco;

import java.sql.Connection;
import java.sql.PreparedStatement;
 
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class ClientesDAO {
    
    Connection conn; 
    PreparedStatement pstm; 
    
    public void cadastroclientes(ClientesDTO objetoclientes) {
       String sql =  "insert into usuarios (nome,email,endereço,cpf,salario,telefone) values (?,?,?,?,?,?)";
        
        conn =   new ConnectaMysql().Conectabd();
         
       try{
          pstm = conn.prepareStatement(sql);
           pstm.setString(1,objetoclientes.getNome());
           pstm.setString(2,objetoclientes.getEmail());
           pstm.setString(3,objetoclientes.getEndereço()); 
           pstm.setString(4,objetoclientes.getCpf());
           pstm.setString(5,objetoclientes.getSalario());  
           pstm.setString(6,objetoclientes.getTelefone());  
           pstm.execute();
           pstm.close();
           JOptionPane.showMessageDialog(null,"");
        
            
      } catch (Exception erro ) {
          
           JOptionPane.showMessageDialog(null, "CadastroDao" + erro );
       }
       
    }
    
    
}
