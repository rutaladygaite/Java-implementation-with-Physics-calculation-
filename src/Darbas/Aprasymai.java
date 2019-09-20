package Darbas;

import Actions.AprasymasPirmas;
import Actions.AprasymasAntras;
import Actions.AprasymasTrecias;
import javax.swing.JButton;

public class Aprasymai extends javax.swing.JFrame {

    public Aprasymai() {
    	
     initComponents();
     
     new AprasymasPirmas (Aprasymas1);
     
     new AprasymasAntras (Aprasymas2);
     
     new AprasymasTrecias (Aprasymas3);
     
    }

    private void initComponents() {

        Aprasymas1 = new javax.swing.JButton();
        Aprasymas2 = new javax.swing.JButton();
        Aprasymas3 = new javax.swing.JButton();
        Close = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Aprasymas1.setBackground(new java.awt.Color(0, 102, 102));
        Aprasymas1.setText("Klemano ir Dezormo skaičiavimo būdas");

        Aprasymas2.setBackground(new java.awt.Color(0, 102, 102));
        Aprasymas2.setText("Pirmas stovinčių bangų metodas");

        Aprasymas3.setBackground(new java.awt.Color(0, 102, 102));
        Aprasymas3.setText("Antras stovinčių bangų metodas");

        Close.setBackground(new java.awt.Color(0, 102, 102));
        Close.setText("Uždaryti langą");
        Close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CloseActionPerformed(evt);}});
 
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Close, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(Aprasymas3, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                        .addComponent(Aprasymas2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Aprasymas1, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)))
                .addContainerGap(108, Short.MAX_VALUE)));
        
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(Aprasymas1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Aprasymas2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Aprasymas3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Close, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(45, Short.MAX_VALUE)));

        pack();
    }

    private void CloseActionPerformed(java.awt.event.ActionEvent evt) {
        this.dispose();   
    }
   
    public static void main(String args[]) {
 
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }}} 
        
        catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Aprasymai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);} 
        catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Aprasymai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);} 
        catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Aprasymai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);} 
        catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Aprasymai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);}

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Aprasymai().setVisible(true);
            }});
    }

    private javax.swing.JButton Aprasymas1;
    private javax.swing.JButton Aprasymas2;
    private javax.swing.JButton Aprasymas3;
    private javax.swing.JButton Close;

}

