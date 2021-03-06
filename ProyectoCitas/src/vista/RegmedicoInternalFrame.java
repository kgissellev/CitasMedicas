/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

/**
 *
 * @author kgramirez
 */
public class RegmedicoInternalFrame extends javax.swing.JInternalFrame {

    /**
     * Creates new form RegmedicoInternalFrame
     */
    private Controlador.MedicoControl medicoControlador;
    
    public RegmedicoInternalFrame() {
        initComponents();
        medicoControlador = new Controlador.MedicoControl(this);
        btn_registrarMed.addActionListener(medicoControlador);
        btn_nuevoMed.addActionListener(medicoControlador);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_Medidentificacion = new javax.swing.JTextField();
        txt_Mednombres = new javax.swing.JTextField();
        txt_Medapellidos = new javax.swing.JTextField();
        btn_registrarMed = new javax.swing.JButton();
        btn_nuevoMed = new javax.swing.JButton();

        setTitle("Registro Médicos");

        jLabel1.setText("Identificación: ");

        jLabel2.setText("Nombres:");

        jLabel3.setText("Apellidos:");

        txt_Medidentificacion.setName("IdentificaciónTxt"); // NOI18N

        txt_Mednombres.setName("NombresTxt"); // NOI18N
        txt_Mednombres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_MednombresActionPerformed(evt);
            }
        });

        txt_Medapellidos.setName("ApellidosTxt"); // NOI18N

        btn_registrarMed.setText("Registrar");
        btn_registrarMed.setName("RegistrarBtn"); // NOI18N
        btn_registrarMed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_registrarMedActionPerformed(evt);
            }
        });

        btn_nuevoMed.setText("Nuevo");
        btn_nuevoMed.setName("NuevoBtn"); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(btn_registrarMed))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_nuevoMed, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txt_Medidentificacion)
                        .addComponent(txt_Mednombres)
                        .addComponent(txt_Medapellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(97, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txt_Medidentificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_Mednombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_Medapellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)))
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_registrarMed)
                    .addComponent(btn_nuevoMed))
                .addContainerGap(49, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_MednombresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_MednombresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_MednombresActionPerformed

    private void btn_registrarMedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_registrarMedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_registrarMedActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btn_nuevoMed;
    public javax.swing.JButton btn_registrarMed;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    public javax.swing.JTextField txt_Medapellidos;
    public javax.swing.JTextField txt_Medidentificacion;
    public javax.swing.JTextField txt_Mednombres;
    // End of variables declaration//GEN-END:variables
}
