package Darbas;
import javax.swing.*;
import java.awt.*;

public class Aprasymas2 extends javax.swing.JFrame {

public Aprasymas2() {
	
    initComponents();
    
}

private void initComponents() {
    
    jPanel1 = new javax.swing.JPanel();
    jLabel1 = new javax.swing.JLabel();
    jLabel2 = new javax.swing.JLabel();
    jLabel3 = new javax.swing.JLabel();
    jLabel4 = new javax.swing.JLabel();
    jLabel5 = new javax.swing.JLabel();
    jLabel6 = new javax.swing.JLabel();
    Close = new javax.swing.JButton();
    
    Close.setBackground(new java.awt.Color(0, 102, 102));
    Close.setText("Uždaryti langą");
    Close.addActionListener(new java.awt.event.ActionListener() {
    	public void actionPerformed(java.awt.event.ActionEvent evt) {
            CloseActionPerformed(evt);
        }});
    
    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    jLabel1.setBackground(new java.awt.Color(0, 102, 102));
    jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
    jLabel1.setText("<html>Stovinčių bangų metodai pagrįsti garso greičio dujose priklausomybe nuo ɣ vertės. \r\n" + 
    		"Lygtis yra: </html>");
    jLabel2.setText("<html>ɣ=µ/RT*f2</html>");
    jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    jLabel3.setText("<html>Stovinčiosios bangos sukeliamos vamzdyje, kurio viename gale yra garsiakalbis, prijungtas "
    		+ "prie harmoninės įtampos generatoriaus G, o kitame – stumdomas ritinio formos dėklas su mikrofonu. "
    		+ "Dėklo dugne, nukreiptame į vamzdžio vidų, yra nedidelė kiaurymė. Mikrofono elektrinis signalas paduodamas "
    		+ "į oscilografą. Esant tam tikram oro stulpo vamzdyje ilgiui, garsas sustiprėja. Tai nustatome iš klausos ir "
    		+ "stebėdami signalą oscilografo. Esant tam tikram oro stulpo vamzdyje ilgiui, garsas sustiprėja. Tai nustatome "
    		+ "iš klausos ir stebėdami signalą oscilografo ekrane. Atstumas tarp gretimų mikrofono padėčių, atitinkantis garso "
    		+ "sustiprėjimus, lygus pusei bangos ilgio. Jei padėtyje x0 garsas susitprėja, o pastumiant mikrofoną iki xn , "
    		+ "pastebėta n sustiprėjimų, tai bangos ilgis bus: </html>");
    jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
    jLabel4.setText("<html>Λ= 2* (xn-x0)/n</html>");
    jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    jLabel5.setText("<html>Žinodami generatoriaus įtampos dažnį f, rasime garso greitį:</html>");
    jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
    jLabel6.setText("<html>f= 2*v*(xn-x0)/n</html>");
    jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 10, Short.MAX_VALUE)
        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 10, Short.MAX_VALUE)
        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 10, Short.MAX_VALUE)
        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 10, Short.MAX_VALUE)
        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 10, Short.MAX_VALUE)
        .addComponent(Close, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(107, 107, 107));
    
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
        .addGroup(layout.createSequentialGroup()
        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
        .addGap(10, 10, 10)
        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 10, Short.MAX_VALUE)
        .addGap(10, 10, 10)
        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 10, Short.MAX_VALUE)
        .addGap(10, 10, 10)
        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 10, Short.MAX_VALUE)
        .addGap(10, 10, 10)
        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 10, Short.MAX_VALUE)
        .addGap(10, 10, 10)
        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 10, Short.MAX_VALUE)
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
        java.util.logging.Logger.getLogger(Aprasymas2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);} 
    catch (InstantiationException ex) {
        java.util.logging.Logger.getLogger(Aprasymas2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);} 
    catch (IllegalAccessException ex) {
        java.util.logging.Logger.getLogger(Aprasymas2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);} 
    catch (javax.swing.UnsupportedLookAndFeelException ex) {
        java.util.logging.Logger.getLogger(Aprasymas2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);}
    
    java.awt.EventQueue.invokeLater(new Runnable() {
        public void run() {
            new Aprasymas2().setVisible(true);
        }});
}

private javax.swing.JLabel jLabel1;
private javax.swing.JLabel jLabel2;
private javax.swing.JLabel jLabel3;
private javax.swing.JLabel jLabel4;
private javax.swing.JLabel jLabel5;
private javax.swing.JLabel jLabel6;
private javax.swing.JPanel jPanel1;
private javax.swing.JButton Close;
}


