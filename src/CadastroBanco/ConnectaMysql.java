/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


// Classe para manter conexão banco de dados
// Utilizando Drives JDBC
// DriverManager, responsável por criar uma conexão com o banco de dados
// Connection, classe responsável por manter uma conexão aberta com o banco;
// Statement, gerencia e executa instruções SQL;
// PreparedStatement, gerencia e executa instruções SQL,permitindo também a passagem de parâmetros em uma instrução;
// ResultSet, responsável por receber os dados obtidos em uma pesquisa ao banco.

package CadastroBanco;
import java.sql.Connection;
import javax.swing.JOptionPane;
import java.sql.DriverManager;
import java.sql.SQLException;


 public class ConnectaMysql{
    public static  Connection  Conectabd()  {
         Connection  conn = null;    
                   
         try{ //O bloco try/catch é utilizado sempre quando no processo que será executado dentro de um método
              //é esperado um erro, para isso cria-se um bloco "protegido" onde qualquer erro que ocorra 
              //dentro do trecho "try" é direcionado para o trecho "catch" e sofrerá o devido tratamento de erro
            String url = "jdbc:mysql://localhost:3306/bancotqi?user=root&password=123456";
            conn = DriverManager.getConnection(url);
             
           //O método getConnection(String url, Properties info) da classe Java DriverManager 
           // tenta estabelecer uma conexão com o banco de dados usando o URL do banco de dados fornecido.  
       }catch (SQLException erro  ) {
          JOptionPane.showMessageDialog(null,"conexão" + erro.getMessage());
        }
          return conn;
             
       }

    void executaSQL(String string) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
     }
 
     

            
   
  
    