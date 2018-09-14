
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;
import org.jasypt.util.text.BasicTextEncryptor;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author CESARDOMINGO
 */
public class Principal extends javax.swing.JFrame {

    Conectado conector = new Conectado();
    Connection cn = conector.conexion();

    public final BasicTextEncryptor textEncryptor;

    public static String Username = "";
    public static String PassWord = "";
    String Mensage = "";
    String To = "";
    String Subject = "";

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
        setTitle("Gestor de Correos 1.0");
        setResizable(false);
        setLocationRelativeTo(null);
        this.textEncryptor = new BasicTextEncryptor();
        textEncryptor.setPassword("123");
        TAMensaje.setLineWrap(true);
        TAMensaje.setWrapStyleWord(true);
        //------------ ComboBOX  Usuario---------------------------
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM correos");
            while (rs.next()) {
                this.JCorreosUsuarios.addItem(rs.getString("correo"));
                this.JCorreoDestinatario.addItem(rs.getString("correo"));
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }

    public boolean esValido(String email) {
        //Initialize reg ex for email.
        String expression = "^[\\w\\.-]+@([\\w\\-]+\\.)+[A-Z]{2,4}$";
        CharSequence inputStr = email;
        //Make the comparison case-insensitive.
        Pattern pattern = Pattern.compile(expression, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(inputStr);

        return matcher.matches();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Password = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tfPara = new javax.swing.JTextField();
        TAsunto = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        TAMensaje = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        BEnviar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        tfUsuario = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        TPass = new javax.swing.JPasswordField();
        BAgregarUsuario = new javax.swing.JButton();
        JCorreosUsuarios = new javax.swing.JComboBox<>();
        JCorreoDestinatario = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        Password.setText("jLabel8");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setForeground(new java.awt.Color(153, 153, 153));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Para");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(50, 165, 27, 16);

        jLabel2.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Asunto");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(50, 200, 40, 16);

        jLabel3.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Mensaje:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(50, 230, 51, 16);
        jPanel1.add(tfPara);
        tfPara.setBounds(108, 160, 146, 19);
        jPanel1.add(TAsunto);
        TAsunto.setBounds(108, 199, 360, 19);

        TAMensaje.setColumns(20);
        TAMensaje.setRows(5);
        jScrollPane1.setViewportView(TAMensaje);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(50, 252, 418, 95);

        jLabel4.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Gestor de Correos");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel4MousePressed(evt);
            }
        });
        jPanel1.add(jLabel4);
        jLabel4.setBounds(6, 0, 480, 31);

        BEnviar.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        BEnviar.setText("ENVIAR");
        BEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BEnviarActionPerformed(evt);
            }
        });
        jPanel1.add(BEnviar);
        BEnviar.setBounds(352, 365, 116, 26);

        jLabel5.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Correo");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(54, 56, 39, 15);

        tfUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfUsuarioActionPerformed(evt);
            }
        });
        jPanel1.add(tfUsuario);
        tfUsuario.setBounds(259, 52, 157, 19);

        jLabel6.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Contraseña");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(54, 89, 64, 15);
        jPanel1.add(TPass);
        TPass.setBounds(130, 85, 286, 19);

        BAgregarUsuario.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        BAgregarUsuario.setMnemonic('N');
        BAgregarUsuario.setText("+");
        BAgregarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BAgregarUsuarioActionPerformed(evt);
            }
        });
        jPanel1.add(BAgregarUsuario);
        BAgregarUsuario.setBounds(422, 51, 45, 22);
        BAgregarUsuario.getAccessibleContext().setAccessibleDescription("");

        JCorreosUsuarios.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "..." }));
        JCorreosUsuarios.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                JCorreosUsuariosItemStateChanged(evt);
            }
        });
        JCorreosUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JCorreosUsuariosActionPerformed(evt);
            }
        });
        jPanel1.add(JCorreosUsuarios);
        JCorreosUsuarios.setBounds(111, 49, 142, 24);

        JCorreoDestinatario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "..." }));
        JCorreoDestinatario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JCorreoDestinatarioActionPerformed(evt);
            }
        });
        jPanel1.add(JCorreoDestinatario);
        JCorreoDestinatario.setBounds(266, 157, 151, 24);

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("-----------------------------------------------------------------------------------------------------");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(23, 123, 445, 15);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/2.jpg"))); // NOI18N
        jPanel1.add(jLabel8);
        jLabel8.setBounds(0, 0, 490, 450);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 489, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 410, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BAgregarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BAgregarUsuarioActionPerformed
        // TODO add your handling code here:
        NCorreoU correou = new NCorreoU();
        correou.setVisible(true);
    }//GEN-LAST:event_BAgregarUsuarioActionPerformed

    private void BEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BEnviarActionPerformed
        // TODO add your handling code here:
        try {

            if (tfUsuario.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Debe seleccionar un usuario.");
                return;
            }

            if (tfPara.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Debe agregar un destinatario.");
                return;
            }

            if (!esValido(tfUsuario.getText())) {
                JOptionPane.showMessageDialog(null, "Ingrese Correo Valido", "ERROR", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (!esValido(tfPara.getText())) {
                JOptionPane.showMessageDialog(null, "Ingrese Correo Valido", "ERROR", JOptionPane.ERROR_MESSAGE);
                return;
            }
            Username = tfUsuario.getText();
            PassWord = new String(TPass.getPassword());
            Mensage = TAMensaje.getText();
            To = tfPara.getText();
            Subject = TAsunto.getText();
            SendMail();
            Limpiar();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e + e.getMessage(),
                    "Corrige uno de los correos", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_BEnviarActionPerformed

    private void JCorreosUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JCorreosUsuariosActionPerformed
        // TODO add your handling code here:
        tfUsuario.setText((String) JCorreosUsuarios.getSelectedItem());
    }//GEN-LAST:event_JCorreosUsuariosActionPerformed

    private void JCorreoDestinatarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JCorreoDestinatarioActionPerformed
        // TODO add your handling code here:
        tfPara.setText((String) JCorreoDestinatario.getSelectedItem());
    }//GEN-LAST:event_JCorreoDestinatarioActionPerformed

    private void jLabel4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MousePressed
         Limpiar();
    }//GEN-LAST:event_jLabel4MousePressed

    private void tfUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfUsuarioActionPerformed

    }//GEN-LAST:event_tfUsuarioActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        Cerrar();
    }//GEN-LAST:event_formWindowClosing

    private void JCorreosUsuariosItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_JCorreosUsuariosItemStateChanged
        // TODO add your handling code here:
        String correousuario;
        correousuario = (String) JCorreosUsuarios.getSelectedItem();
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery("SELECT correo, pass FROM correos where correo ='" + correousuario + "'");
            while (rs.next()) {
                tfUsuario.setText(rs.getString("correo"));
                Password.setText(rs.getString("pass"));
                String textoPlano = textEncryptor.decrypt(Password.getText());
                TPass.setText(textoPlano);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_JCorreosUsuariosItemStateChanged
    private void SendMail() {
        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");

        Session session = Session.getInstance(props,
                new javax.mail.Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(Username, PassWord);
            }
        });
        try {
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(Username));
            message.setRecipients(Message.RecipientType.TO,
                    InternetAddress.parse(To));
            message.setSubject(Subject);
            message.setText(Mensage);

            Transport.send(message);
            JOptionPane.showMessageDialog(this, "Mensaje enviado correctamente");

        } catch (MessagingException e) {
            throw new RuntimeException(e);
        }
    }

    private void Limpiar() {
        JCorreosUsuarios.removeAllItems();
        JCorreoDestinatario.removeAllItems();
        JCorreosUsuarios.addItem("...");
        JCorreoDestinatario.addItem("...");
        TAsunto.setText("");
        TAMensaje.setText("");
        TPass.setText("");
        tfPara.setText("");
        tfUsuario.setText("");

        //------------ ComboBOX  Usuario---------------------------
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM correos");
            while (rs.next()) {
                this.JCorreosUsuarios.addItem(rs.getString("correo"));
                this.JCorreoDestinatario.addItem(rs.getString("correo"));
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    private void Cerrar() {
        if (JOptionPane.showConfirmDialog(this, "Esta a punto de salir de la aplicación.\n¿Desea continuar?", "Cerrar",
                JOptionPane.YES_NO_OPTION, 0) == JOptionPane.YES_OPTION) {
            System.exit(0);
        } else {
            this.setDefaultCloseOperation(0);
        }
    }

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Principal().setVisible(true);
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BAgregarUsuario;
    private javax.swing.JButton BEnviar;
    private javax.swing.JComboBox<String> JCorreoDestinatario;
    private javax.swing.JComboBox<String> JCorreosUsuarios;
    private javax.swing.JLabel Password;
    private javax.swing.JTextArea TAMensaje;
    private javax.swing.JTextField TAsunto;
    public static javax.swing.JPasswordField TPass;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField tfPara;
    public static javax.swing.JTextField tfUsuario;
    // End of variables declaration//GEN-END:variables

}
