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
public class CadastroAdm extends javax.swing.JFrame  {
    
 
    /**
     * Creates new form TelaCadastro
     */
   
           
    public CadastroAdm() {
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
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtemail = new javax.swing.JTextField();
        txtusuario = new javax.swing.JTextField();
        jSenha = new javax.swing.JTextField();
        txtcpf = new javax.swing.JTextField();
        txttelefone = new javax.swing.JTextField();
        JSenha = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

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

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Telefone:");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(130, 310, 100, 17);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("CPF:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(154, 170, 50, 30);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Senha:");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(140, 380, 80, 50);

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

        jSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSenhaActionPerformed(evt);
            }
        });
        getContentPane().add(jSenha);
        jSenha.setBounds(200, 440, 320, 30);

        txtcpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcpfActionPerformed(evt);
            }
        });
        getContentPane().add(txtcpf);
        txtcpf.setBounds(200, 170, 320, 30);

        txttelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttelefoneActionPerformed(evt);
            }
        });
        getContentPane().add(txttelefone);
        txttelefone.setBounds(200, 300, 320, 30);

        JSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JSenhaActionPerformed(evt);
            }
        });
        getContentPane().add(JSenha);
        JSenha.setBounds(200, 390, 320, 30);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Confirma Senha:");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(90, 440, 140, 30);

        jButton2.setText("Volta");
        jButton2.setPreferredSize(new java.awt.Dimension(93, 23));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(110, 530, 140, 23);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/eiota.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 850, 640);

        setSize(new java.awt.Dimension(862, 671));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtusuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtusuarioActionPerformed
                                    
                // TODO add your handling code here:

    }//GEN-LAST:event_txtusuarioActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
          
          String nome,cpf,email,telefone,senha,endereço,rg;
         // Metodo getText, ler oque foi escrito pel usuario
          nome = txtusuario.getText();
          cpf = txtcpf.getText();
          telefone = txttelefone.getText(); 
          senha = jSenha.getText(); 
          email =  txtemail.getText(); 
        // instância de uma classe é um novo objeto criado dessa classe, 
        // com o operador new. Instanciar uma classe é criar um novo 
        // objeto do mesmo tipo dessa classe. Uma classe somente poderá
        // ser utilizada após ser instanciada.  
        AdministradorDTO objetousuario = new AdministradorDTO();
        objetousuario.setNome(nome);
        objetousuario.setEmail(email);
        objetousuario.setPassword(senha);
        objetousuario.setCpf(cpf);
        objetousuario.setTelefone(telefone);
         
        AdministradoresDao objetocadastro = new   AdministradoresDao();
        objetocadastro.cadastrouadministrador(objetousuario);
        
       
        
        

// fazendo a validação dos dados
if ((txtusuario.getText().isEmpty()) || (txtcpf.getText().isEmpty())    || (txttelefone.getText().isEmpty())) {
   JOptionPane.showMessageDialog(null, "Os campos não podem retornar vazios");
}
else {

    // instanciando a classe UsuarioDAO do pacote dao e criando seu objeto dao
      
    JOptionPane.showMessageDialog(null, " Usuário "+txtusuario.getText()+" inserido com sucesso! ");
}

// apaga os dados preenchidos nos campos de texto  

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jSenhaActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        dispose();
        new TelaLogin().setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txttelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttelefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttelefoneActionPerformed

    private void JSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JSenhaActionPerformed

    private void txtemailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtemailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtemailActionPerformed

    private void txtcpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcpfActionPerformed


        // TODO add your handling code here:
    }//GEN-LAST:event_txtcpfActionPerformed

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
            java.util.logging.Logger.getLogger(CadastroAdm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroAdm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroAdm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroAdm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroAdm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField JSenha;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jSenha;
    private javax.swing.JTextField txtcpf;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txttelefone;
    private javax.swing.JTextField txtusuario;
    // End of variables declaration//GEN-END:variables
        }
        
 
