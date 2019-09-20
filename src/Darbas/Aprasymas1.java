package Darbas;
import javax.swing.*;
import java.awt.*;

public class Aprasymas1 extends javax.swing.JFrame {

public Aprasymas1() {
	
    initComponents();
}

private void initComponents() {

    jLabel1 = new javax.swing.JLabel();
    Close = new javax.swing.JButton();
    
    Close.setBackground(new java.awt.Color(0, 102, 102));
    Close.setText("Uždaryti langą");
    Close.addActionListener(new java.awt.event.ActionListener() {
    	public void actionPerformed(java.awt.event.ActionEvent evt) {
            CloseActionPerformed(evt);
        }});
     
    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    
    jLabel1.setBackground(new java.awt.Color(0, 102, 102));
    jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    jLabel1.setText("<html>Matuojant Klemano ir Dezormo būdu, atliekamas adiabatinis ir po to izoterminins procesai."
    		+ "Oras šiek tiek suslegiamas inde ir uždaromas čiaupu. "
    		+ "Slėgis matuojamas skysčio U formos manometru. Šiam tikslui gerai tinka adiabatiškai išsiplėčia ir atšąla, "
    		+ "o slėgis inde sumažėja nuo P iki aplinkos oro slėgio Pa. Po to oras pamažu įšyla iki aplinkos temperatūros T, "
    		+ "o slėgis inde padidėja iki tam tikros vertės P1. Šiuos procesus nesunku aprašyti dujų uždarytų cilindre su slankiu "
    		+ "stūmokliu, modeliu.</html>");

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        .addComponent(Close, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(107, 107, 107));
    
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
        .addGroup(layout.createSequentialGroup()
        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        .addGap(10, 10, 10)
        .addComponent(Close, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(10, 10, 10)));

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
        java.util.logging.Logger.getLogger(Aprasymas1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);} 
    catch (InstantiationException ex) {
        java.util.logging.Logger.getLogger(Aprasymas1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);} 
    catch (IllegalAccessException ex) {
        java.util.logging.Logger.getLogger(Aprasymas1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);} 
    catch (javax.swing.UnsupportedLookAndFeelException ex) {
        java.util.logging.Logger.getLogger(Aprasymas1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);}

    java.awt.EventQueue.invokeLater(new Runnable() {
        public void run() {
            new Aprasymas1().setVisible(true);
        }
    });
}
   
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton Close;
    
}



