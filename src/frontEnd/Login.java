/* @author Rojano Meza Leonardo Gael & Silva Chairez Sergio de Jesús | 5A */


package frontEnd;

import java.util.Date;

public class Login extends javax.swing.JFrame {

    public Login() {
        initComponents();
        setLocationRelativeTo(null); //Centrar
        
        lbFecha.setText(new Date().toString());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbSharpentierLogo = new javax.swing.JLabel();
        lbLogoSubText = new javax.swing.JLabel();
        lbLogoText = new javax.swing.JLabel();
        lbBannerBackground = new javax.swing.JLabel();
        lbTinyBrandName = new javax.swing.JLabel();
        lbFrameTitle = new javax.swing.JLabel();
        lbUsuario = new javax.swing.JLabel();
        jtfUsuario = new javax.swing.JTextField();
        sepUsuario = new javax.swing.JSeparator();
        lbContra = new javax.swing.JLabel();
        sepContra = new javax.swing.JSeparator();
        jpfContra = new javax.swing.JPasswordField();
        btnEntrar = new javax.swing.JPanel();
        lbBtnEntrar = new javax.swing.JLabel();
        lbFecha = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sharpentier | Principal");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(246, 241, 251));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 450));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbSharpentierLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbSharpentierLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgResources/Sharpentier_Logo.png"))); // NOI18N
        jPanel1.add(lbSharpentierLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 80, 300, -1));

        lbLogoSubText.setFont(new java.awt.Font("Hubot Sans Medium", 0, 10)); // NOI18N
        lbLogoSubText.setForeground(new java.awt.Color(10, 5, 15));
        lbLogoSubText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbLogoSubText.setText("Powered by Altalogia Laboratories®");
        jPanel1.add(lbLogoSubText, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 250, 300, -1));

        lbLogoText.setBackground(new java.awt.Color(255, 255, 255));
        lbLogoText.setFont(new java.awt.Font("Hubot Sans SemiBold", 0, 30)); // NOI18N
        lbLogoText.setForeground(new java.awt.Color(136, 62, 211));
        lbLogoText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbLogoText.setText("Sharpentier");
        jPanel1.add(lbLogoText, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 210, 300, 40));

        lbBannerBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgResources/Banner.png"))); // NOI18N
        jPanel1.add(lbBannerBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 0, -1, -1));

        lbTinyBrandName.setBackground(new java.awt.Color(10, 5, 15));
        lbTinyBrandName.setFont(new java.awt.Font("Hubot Sans SemiBold", 0, 20)); // NOI18N
        lbTinyBrandName.setForeground(new java.awt.Color(136, 62, 211));
        lbTinyBrandName.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgResources/Sharpentier_Logo_Small.png"))); // NOI18N
        lbTinyBrandName.setText("Sharpentier");
        jPanel1.add(lbTinyBrandName, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, -1));

        lbFrameTitle.setFont(new java.awt.Font("Roboto ExtraBold", 1, 18)); // NOI18N
        lbFrameTitle.setForeground(new java.awt.Color(10, 5, 15));
        lbFrameTitle.setText("INICIAR SESIÓN");
        jPanel1.add(lbFrameTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, -1, -1));

        lbUsuario.setFont(new java.awt.Font("Roboto SemiBold", 0, 12)); // NOI18N
        lbUsuario.setForeground(new java.awt.Color(10, 5, 15));
        lbUsuario.setText("USUARIO");
        jPanel1.add(lbUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 380, -1));

        jtfUsuario.setBackground(new java.awt.Color(255, 255, 255));
        jtfUsuario.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        jtfUsuario.setText("usuario123");
        jPanel1.add(jtfUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 380, -1));

        sepUsuario.setForeground(new java.awt.Color(189, 144, 235));
        sepUsuario.setPreferredSize(new java.awt.Dimension(100, 10));
        jPanel1.add(sepUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 380, 10));

        lbContra.setFont(new java.awt.Font("Roboto SemiBold", 0, 12)); // NOI18N
        lbContra.setForeground(new java.awt.Color(10, 5, 15));
        lbContra.setText("CONTRASEÑA");
        jPanel1.add(lbContra, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 380, -1));

        sepContra.setForeground(new java.awt.Color(189, 144, 235));
        sepContra.setPreferredSize(new java.awt.Dimension(100, 10));
        jPanel1.add(sepContra, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, 380, 10));

        jpfContra.setBackground(new java.awt.Color(255, 255, 255));
        jpfContra.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        jpfContra.setText("password");
        jPanel1.add(jpfContra, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 380, -1));

        btnEntrar.setBackground(new java.awt.Color(136, 62, 211));
        btnEntrar.setToolTipText("");

        lbBtnEntrar.setFont(new java.awt.Font("Roboto SemiBold", 1, 12)); // NOI18N
        lbBtnEntrar.setForeground(new java.awt.Color(255, 255, 255));
        lbBtnEntrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbBtnEntrar.setText("ENTRAR");

        javax.swing.GroupLayout btnEntrarLayout = new javax.swing.GroupLayout(btnEntrar);
        btnEntrar.setLayout(btnEntrarLayout);
        btnEntrarLayout.setHorizontalGroup(
            btnEntrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnEntrarLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lbBtnEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        btnEntrarLayout.setVerticalGroup(
            btnEntrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnEntrarLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lbBtnEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(btnEntrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, 130, 40));

        lbFecha.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        lbFecha.setForeground(new java.awt.Color(10, 5, 15));
        lbFecha.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbFecha.setText("{Hora y fecha}");
        jPanel1.add(lbFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 420, 290, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnEntrar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jpfContra;
    private javax.swing.JTextField jtfUsuario;
    private javax.swing.JLabel lbBannerBackground;
    private javax.swing.JLabel lbBtnEntrar;
    private javax.swing.JLabel lbContra;
    private javax.swing.JLabel lbFecha;
    private javax.swing.JLabel lbFrameTitle;
    private javax.swing.JLabel lbLogoSubText;
    private javax.swing.JLabel lbLogoText;
    private javax.swing.JLabel lbSharpentierLogo;
    private javax.swing.JLabel lbTinyBrandName;
    private javax.swing.JLabel lbUsuario;
    private javax.swing.JSeparator sepContra;
    private javax.swing.JSeparator sepUsuario;
    // End of variables declaration//GEN-END:variables
}
