package Darbas;

import javax.swing.JButton;


public class SkaicBud1 extends javax.swing.JFrame {

	public SkaicBud1() {
		
	    initComponents();
	   
	}

	private void initComponents() {

	    jPanel1 = new javax.swing.JPanel();
	    jLabel2 = new javax.swing.JLabel();
	    jLabel1 = new javax.swing.JLabel();
	    jLabel3 = new javax.swing.JLabel();
	    jLabel4 = new javax.swing.JLabel();
	    Result1 = new javax.swing.JLabel();
	    Result2 = new javax.swing.JLabel();
	    jTextField1 = new javax.swing.JTextField();
	    jTextField2 = new javax.swing.JTextField();
	    ResultButton = new javax.swing.JButton();
	    Close = new javax.swing.JButton();

	    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

	    jLabel2.setText("Įveskite sekantį skirtumą:");
	    jLabel1.setText("Įveskite pradinį skirtumą:");
	    jLabel3.setText("cm");
	    jLabel4.setText("cm");
	    Result1.setText("Rezultatas gaunasi:");
	    Result2.setText(" ");

	    Close.setBackground(new java.awt.Color(0, 102, 102));
	    Close.setText("Uždaryti langą");
	    Close.addActionListener(new java.awt.event.ActionListener() {
	        public void actionPerformed(java.awt.event.ActionEvent evt) {
	            CloseActionPerformed(evt);
	        }
	    });

	    ResultButton.setBackground(new java.awt.Color(0, 102, 102));
	    ResultButton.setText("Gauti skaičiavimo rezultatą");
	    ResultButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
	    ResultButton.addActionListener(new java.awt.event.ActionListener() {
	        public void actionPerformed(java.awt.event.ActionEvent evt) {
	            ResultButtonActionPerformed(evt);
	        }
	    });

	    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
	    jPanel1.setLayout(jPanel1Layout);
	    jPanel1Layout.setHorizontalGroup(
	        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	        .addGroup(jPanel1Layout.createSequentialGroup()
	            .addGap(20, 20, 20)
	            .addContainerGap()
	            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                .addGroup(jPanel1Layout.createSequentialGroup()
	                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	                        .addGroup(jPanel1Layout.createSequentialGroup()
	                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
	                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                            .addComponent(jLabel3))
	                        .addGroup(jPanel1Layout.createSequentialGroup()
	                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
	                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                            .addComponent(jLabel4)))
	                .addContainerGap())
	                .addComponent(Result1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
	                .addComponent(Result2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
	                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
	                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
	                        .addComponent(Close, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
	                        .addComponent(ResultButton, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
	                    .addGap(130, 130, 130)))));

	    jPanel1Layout.setVerticalGroup(
	        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	        .addGroup(jPanel1Layout.createSequentialGroup()
	        	.addContainerGap()
	            .addComponent(jLabel1)
	            .addGap(10, 10, 10)
	            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                .addComponent(jLabel4)
	                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
	            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
	            .addGap(4, 4, 4)
	            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                .addComponent(jLabel3)
	                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
	            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                .addGroup(jPanel1Layout.createSequentialGroup()
	                    .addGap(1, 1, 1)))
	            .addComponent(Result1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
	            .addComponent(Result2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
	            .addComponent(ResultButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
	            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
	            .addComponent(Close, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
	            .addContainerGap(17, Short.MAX_VALUE)));

	    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
	    getContentPane().setLayout(layout);
	    
	    layout.setHorizontalGroup(
	        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
	    layout.setVerticalGroup(
	        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	        .addGroup(layout.createSequentialGroup()
	            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)));

	    pack();
	    }


	public void ResultButtonActionPerformed(java.awt.event.ActionEvent evt) {

		float a = Float.parseFloat(jTextField1.getText());
		float b = Float.parseFloat(jTextField2.getText());
		float c = a/(a-b);
		Result2.setText(Float.toString(c));}

	private void CloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CloseActionPerformed
	    this.dispose();}

	public static void main(String args[]) {
	  
	    try {
	        for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
	            if ("Nimbus".equals(info.getName())) {
	                javax.swing.UIManager.setLookAndFeel(info.getClassName());
	                break;
	            }
	        }} 
	    catch (ClassNotFoundException ex) {
	    		java.util.logging.Logger.getLogger(SkaicBud2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);} 
	    catch (InstantiationException ex) {
	    		java.util.logging.Logger.getLogger(SkaicBud2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);} 
	    catch (IllegalAccessException ex) {
	    		java.util.logging.Logger.getLogger(SkaicBud2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);} 
	    catch (javax.swing.UnsupportedLookAndFeelException ex) {
	    		java.util.logging.Logger.getLogger(SkaicBud2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);}
	    
	    java.awt.EventQueue.invokeLater(new Runnable() {
	    	public void run() {
	    		new SkaicBud1().setVisible(true);
	    	}});
	}
	
private javax.swing.JPanel jPanel1;
private javax.swing.JButton Close;
private javax.swing.JButton ResultButton;
private javax.swing.JLabel jLabel1;
private javax.swing.JLabel jLabel2;
private javax.swing.JLabel jLabel3;
private javax.swing.JLabel jLabel4;
private javax.swing.JLabel Result1;
private javax.swing.JLabel Result2;
private javax.swing.JTextField jTextField1;
private javax.swing.JTextField jTextField2;

}
