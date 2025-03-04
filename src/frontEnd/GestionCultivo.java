/* @author Rojano Meza Leonardo Gael & Silva Chairez Sergio de Jesús | 5A */


package frontEnd;

import backEnd.*;
import java.util.Date;
import static javax.swing.JOptionPane.*;
import javax.swing.table.DefaultTableModel;

public class GestionCultivo extends javax.swing.JFrame {

    public GestionCultivo() {
        initComponents();
        setLocationRelativeTo(null); //Centrar
        jtCultivos.setModel(new Cultivo().generateDTModelTemplate());
        
        lbFecha.setText(new Date().toString());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        sepMenu1 = new javax.swing.JSeparator();
        btnGestionBiorreactor = new javax.swing.JLabel();
        sepMenu2 = new javax.swing.JSeparator();
        btnGestionCepaBacteriana = new javax.swing.JLabel();
        sepMenu3 = new javax.swing.JSeparator();
        btnGestionCultivo = new javax.swing.JLabel();
        sepMenu4 = new javax.swing.JSeparator();
        btnGestionEmpleado = new javax.swing.JLabel();
        sepMenu5 = new javax.swing.JSeparator();
        btnGestionEnzimas = new javax.swing.JLabel();
        sepMenu6 = new javax.swing.JSeparator();
        btnGestionMedio = new javax.swing.JLabel();
        sepMenu7 = new javax.swing.JSeparator();
        btnGestionNota = new javax.swing.JLabel();
        sepMenu8 = new javax.swing.JSeparator();
        btnConfiguracion = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        lbTinyBrandName = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtCultivos = new javax.swing.JTable();
        btnAddCultivo = new javax.swing.JButton();
        lbFecha = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(246, 241, 251));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(65, 19, 112));
        jPanel2.setForeground(new java.awt.Color(203, 168, 239));
        jPanel2.setPreferredSize(new java.awt.Dimension(240, 620));
        jPanel2.setRequestFocusEnabled(false);
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        sepMenu1.setForeground(new java.awt.Color(178, 135, 221));
        jPanel2.add(sepMenu1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 240, -1));

        btnGestionBiorreactor.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        btnGestionBiorreactor.setForeground(new java.awt.Color(246, 241, 251));
        btnGestionBiorreactor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgIcons/Bioreactor_Icon.png"))); // NOI18N
        btnGestionBiorreactor.setText("  BIOREACTORES");
        jPanel2.add(btnGestionBiorreactor, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 200, 50));

        sepMenu2.setForeground(new java.awt.Color(178, 135, 221));
        jPanel2.add(sepMenu2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 240, -1));

        btnGestionCepaBacteriana.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        btnGestionCepaBacteriana.setForeground(new java.awt.Color(246, 241, 251));
        btnGestionCepaBacteriana.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgIcons/Bacteria_Icon.png"))); // NOI18N
        btnGestionCepaBacteriana.setText("  CEPAS BACTERIANAS");
        jPanel2.add(btnGestionCepaBacteriana, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 200, 50));

        sepMenu3.setForeground(new java.awt.Color(178, 135, 221));
        jPanel2.add(sepMenu3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 240, -1));

        btnGestionCultivo.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        btnGestionCultivo.setForeground(new java.awt.Color(160, 86, 233));
        btnGestionCultivo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgIcons/Cultivo_Icon.png"))); // NOI18N
        btnGestionCultivo.setText("  CULTIVOS");
        jPanel2.add(btnGestionCultivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 200, 50));

        sepMenu4.setForeground(new java.awt.Color(178, 135, 221));
        jPanel2.add(sepMenu4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 240, -1));

        btnGestionEmpleado.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        btnGestionEmpleado.setForeground(new java.awt.Color(246, 241, 251));
        btnGestionEmpleado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgIcons/Empleado_Icon.png"))); // NOI18N
        btnGestionEmpleado.setText("  EMPLEADOS");
        jPanel2.add(btnGestionEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 200, 50));

        sepMenu5.setForeground(new java.awt.Color(178, 135, 221));
        jPanel2.add(sepMenu5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 240, -1));

        btnGestionEnzimas.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        btnGestionEnzimas.setForeground(new java.awt.Color(246, 241, 251));
        btnGestionEnzimas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgIcons/Enzima_Icon.png"))); // NOI18N
        btnGestionEnzimas.setText("  ENZIMAS");
        jPanel2.add(btnGestionEnzimas, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 200, 50));

        sepMenu6.setForeground(new java.awt.Color(178, 135, 221));
        jPanel2.add(sepMenu6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 340, 240, -1));

        btnGestionMedio.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        btnGestionMedio.setForeground(new java.awt.Color(246, 241, 251));
        btnGestionMedio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgIcons/Medio_Icon.png"))); // NOI18N
        btnGestionMedio.setText("  MEDIOS");
        jPanel2.add(btnGestionMedio, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 200, 50));

        sepMenu7.setForeground(new java.awt.Color(178, 135, 221));
        jPanel2.add(sepMenu7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 390, 240, -1));

        btnGestionNota.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        btnGestionNota.setForeground(new java.awt.Color(246, 241, 251));
        btnGestionNota.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgIcons/Nota_Icon.png"))); // NOI18N
        btnGestionNota.setText("  NOTAS");
        jPanel2.add(btnGestionNota, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, 200, 50));

        sepMenu8.setForeground(new java.awt.Color(178, 135, 221));
        jPanel2.add(sepMenu8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 440, 240, -1));

        btnConfiguracion.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        btnConfiguracion.setForeground(new java.awt.Color(246, 241, 251));
        btnConfiguracion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgIcons/Configuration_Icon.png"))); // NOI18N
        btnConfiguracion.setText("Configuración");
        jPanel2.add(btnConfiguracion, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 510, 180, 50));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, -1, 580));

        jPanel3.setBackground(new java.awt.Color(136, 62, 211));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbTinyBrandName.setBackground(new java.awt.Color(10, 5, 15));
        lbTinyBrandName.setFont(new java.awt.Font("Hubot Sans SemiBold", 0, 20)); // NOI18N
        lbTinyBrandName.setForeground(new java.awt.Color(246, 241, 251));
        lbTinyBrandName.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgResources/Sharpentier_Logo_SmallW.png"))); // NOI18N
        lbTinyBrandName.setText("Sharpentier");
        jPanel3.add(lbTinyBrandName, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, -1, 40));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 40));

        jLabel1.setFont(new java.awt.Font("Roboto Condensed Medium", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(10, 5, 15));
        jLabel1.setText("CULTIVOS");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 80, -1, -1));

        jLabel2.setFont(new java.awt.Font("Roboto Condensed ExtraBold", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(10, 5, 15));
        jLabel2.setText("GESTIÓN DE");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 60, -1, -1));

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));

        jtCultivos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Nombre", "Temperatura", "Humedad", "Tiempo de Incubacion", "Morfologia Colonial", "Tasa de Crecimiento", "Densidad Optica"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jtCultivos);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 130, 670, 400));

        btnAddCultivo.setText("Añadir Cultivo");
        btnAddCultivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddCultivoActionPerformed(evt);
            }
        });
        jPanel1.add(btnAddCultivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 540, 120, -1));

        lbFecha.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        lbFecha.setForeground(new java.awt.Color(10, 5, 15));
        lbFecha.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbFecha.setText("{Hora y fecha}");
        jPanel1.add(lbFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(667, 590, 290, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1000, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 620, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddCultivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddCultivoActionPerformed
        Instanciador objInst = new Instanciador();

        int cantObj = Integer.parseInt(showInputDialog("¿Cuántos Cultivos desea añadir?"));

        Cultivo[] arrayCultivo = new Cultivo[cantObj];

        for(int i = 0; i < cantObj; i++){
            arrayCultivo[i] = objInst.instanciarCultivo(i+1);
        }

        DefaultTableModel modelo = new Cultivo().generateDTModelTemplate();

        for(int i = 0; i < cantObj; i++){
            modelo.addRow(new Object[]{
                arrayCultivo[i].getIdCultivo(),
                arrayCultivo[i].getNombreCultivo(),
                arrayCultivo[i].getDescripcionCultivo(),
                arrayCultivo[i].getFechaCreacion(),
                arrayCultivo[i].isActivo()
            });
        }

        jtCultivos.setModel(modelo);
    }//GEN-LAST:event_btnAddCultivoActionPerformed

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
            java.util.logging.Logger.getLogger(GestionCultivo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GestionCultivo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GestionCultivo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GestionCultivo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GestionCultivo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddCultivo;
    private javax.swing.JLabel btnConfiguracion;
    private javax.swing.JLabel btnGestionBiorreactor;
    private javax.swing.JLabel btnGestionCepaBacteriana;
    private javax.swing.JLabel btnGestionCultivo;
    private javax.swing.JLabel btnGestionEmpleado;
    private javax.swing.JLabel btnGestionEnzimas;
    private javax.swing.JLabel btnGestionMedio;
    private javax.swing.JLabel btnGestionNota;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtCultivos;
    private javax.swing.JLabel lbFecha;
    private javax.swing.JLabel lbTinyBrandName;
    private javax.swing.JSeparator sepMenu1;
    private javax.swing.JSeparator sepMenu2;
    private javax.swing.JSeparator sepMenu3;
    private javax.swing.JSeparator sepMenu4;
    private javax.swing.JSeparator sepMenu5;
    private javax.swing.JSeparator sepMenu6;
    private javax.swing.JSeparator sepMenu7;
    private javax.swing.JSeparator sepMenu8;
    // End of variables declaration//GEN-END:variables
}
