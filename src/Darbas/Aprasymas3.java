package Darbas;

public class Aprasymas3 extends javax.swing.JFrame {

public Aprasymas3() {
	
    initComponents();
    
}

private void initComponents() {

    jLabel1 = new javax.swing.JLabel();
    jLabel2 = new javax.swing.JLabel();
    jLabel3 = new javax.swing.JLabel();
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
    jLabel1.setText("<html>Kitas stovinčių bangų metodas pagrįstas pastovaus ilgio oro stulpo akustinių virpesių amplitudės "
    		+ "priklausomybe nuo žadinamo dažnio. Keičiant įtampos dažnį, garsas sustiprėja tada, kai vamzdžio ilgis atitinka "
    		+ "sveikųjų pusbangių skaičių. Formulė: </html>");
    jLabel2.setText("<html>ɣ=(4*l*((fn+1-fn)^2)*µ)/RT</html>");
    jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    jLabel3.setText("<html>Oro µ=28,9 g/mol</html>");
    jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
        .addGap(107, 107, 107)
        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 550, Short.MAX_VALUE)
        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 10, Short.MAX_VALUE)
        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 10, Short.MAX_VALUE)
        .addComponent(Close, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
        .addGroup(layout.createSequentialGroup()
        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
        .addGap(10, 10, 10)
        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 10, Short.MAX_VALUE)
        .addGap(10, 10, 10)
        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 10, Short.MAX_VALUE)
        .addGap(10, 10, 10)
        .addComponent(Close, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(10, 10, 10)));

    pack();
    
}

private void CloseActionPerformed(java.awt.event.ActionEvent evt) {
    this.dispose();}

public static void main(String args[]) {
    try {
        for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
            if ("Nimbus".equals(info.getName())) {
                javax.swing.UIManager.setLookAndFeel(info.getClassName());
                break;
            }}} 
    
    catch (ClassNotFoundException ex) {
        java.util.logging.Logger.getLogger(Aprasymas3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);} 
    catch (InstantiationException ex) {
        java.util.logging.Logger.getLogger(Aprasymas3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);} 
    catch (IllegalAccessException ex) {
        java.util.logging.Logger.getLogger(Aprasymas3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);} 
    catch (javax.swing.UnsupportedLookAndFeelException ex) {
        java.util.logging.Logger.getLogger(Aprasymas3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);}

    java.awt.EventQueue.invokeLater(new Runnable() {
        public void run() {
            new Aprasymas3().setVisible(true);
        }});
}

private javax.swing.JLabel jLabel1;
private javax.swing.JLabel jLabel2;
private javax.swing.JLabel jLabel3;
private javax.swing.JButton Close;

}



