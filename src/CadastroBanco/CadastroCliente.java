/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package CadastroBanco;
import java.util.Scanner;
import CadastroBanco.AdministradoresDao;
import javax.swing.JOptionPane;
import CadastroBanco.AdministradorDTO;
 

/**
 *
 * @author alex
 */
public class CadastroCliente extends javax.swing.JFrame  {
    
 
    /**
     * Creates new form TelaCadastro
     */
   
           
    public CadastroCliente() {
        initComponents();
        
    }
        

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtemail = new javax.swing.JTextField();
        txtusuario = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        txcpf = new javax.swing.JTextField();
        txcendere = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextsalario = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtTelefone = new javax.swing.JTextField();
        tema = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jButton1.setText("CADASTRAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(550, 530, 140, 27);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Nome: ");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(150, 60, 80, 50);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("CPF:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(154, 170, 50, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Email:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(150, 110, 80, 50);

        txtemail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtemailActionPerformed(evt);
            }
        });
        getContentPane().add(txtemail);
        txtemail.setBounds(200, 120, 320, 30);

        txtusuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtusuarioActionPerformed(evt);
            }
        });
        getContentPane().add(txtusuario);
        txtusuario.setBounds(200, 70, 320, 30);

        jButton2.setText("Volta");
        jButton2.setPreferredSize(new java.awt.Dimension(93, 23));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(110, 530, 140, 23);

        txcpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txcpfActionPerformed(evt);
            }
        });
        getContentPane().add(txcpf);
        txcpf.setBounds(200, 170, 320, 30);

        txcendere.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txcendereActionPerformed(evt);
            }
        });
        getContentPane().add(txcendere);
        txcendere.setBounds(200, 250, 320, 30);

        jLabel2.setText("Endereço");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(140, 250, 110, 30);

        jLabel5.setText("Salario");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(140, 300, 80, 30);
        getContentPane().add(jTextsalario);
        jTextsalario.setBounds(200, 300, 320, 30);

        jLabel6.setText("Telefone");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(140, 220, 80, 18);

        txtTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefoneActionPerformed(evt);
            }
        });
        getContentPane().add(txtTelefone);
        txtTelefone.setBounds(200, 210, 320, 30);

        tema.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/eiota.jpg"))); // NOI18N
        tema.setText("jLabel2");
        getContentPane().add(tema);
        tema.setBounds(0, 0, 850, 640);

        setSize(new java.awt.Dimension(862, 671));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtusuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtusuarioActionPerformed
                                    
                // TODO add your handling code here:

    }//GEN-LAST:event_txtusuarioActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
          
          String nome,email,cpf,telefone,endereco,salario;
          
             nome = txtusuario.getText();
             email = txtemail.getText();
             cpf =  txcpf.getText();
             telefone = txtTelefone.getText();
             endereco = txcendere.getText();
             salario = jTextsalario.getText();
             
             
             
         // Metodo getText, ler oque foi escrito pel usuario
          ClientesDTO objetoClientes = new ClientesDTO();
            objetoClientes.setNome(nome);
            objetoClientes.setEmail(email);
            objetoClientes.setCpf(cpf);
            objetoClientes.setTelefone(telefone);
            objetoClientes.setEndereço(endereco);
            objetoClientes.setSalario(salario);
            
           ClientesDAO  objetocadastra = new ClientesDAO();
           objetocadastra.cadastroclientes(objetoClientes);
           
        // instância de uma classe é um novo objeto criado dessa classe, 
        // com o operador new. Instanciar uma classe é criar um novo 
        // objeto do mesmo tipo dessa classe. Uma classe somente poderá
        // ser utilizada após ser instanciada.  
   
        

// fazendo a validação dos dados
if ((txtusuario.getText().isEmpty()) || (txcpf.getText().isEmpty()) )   {
   JOptionPane.showMessageDialog(null, "Os campos não podem retornar vazios");
}
else {

    // instanciando a classe UsuarioDAO do pacote dao e criando seu objeto dao
      
    JOptionPane.showMessageDialog(null, " Usuário "+txtusuario.getText()+" inserido com sucesso! ");
}

// apaga os dados preenchidos nos campos de texto  

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        dispose();
        new TelaLogin().setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtemailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtemailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtemailActionPerformed

    private void txcpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txcpfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txcpfActionPerformed

    private void txcendereActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txcendereActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txcendereActionPerformed

    private void txtTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefoneActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
      /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField jTextsalario;
    private javax.swing.JLabel tema;
    private javax.swing.JTextField txcendere;
    private javax.swing.JTextField txcpf;
    private javax.swing.JTextField txtTelefone;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txtusuario;
    // End of variables declaration//GEN-END:variables
        }
        
 