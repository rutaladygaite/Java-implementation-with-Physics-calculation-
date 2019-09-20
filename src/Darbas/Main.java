package Darbas;

import Actions.Reagavimas1;
import Actions.Reagavimas2;
import Actions.Reagavimas3;
import Actions.AprasymaiPagrindinis;

public class Main extends javax.swing.JFrame {

public Main() {
	
    initComponents();
    
    new Reagavimas1(SkaicBud1);
    
    new Reagavimas2(SkaicBud2);
    
    new Reagavimas3(SkaicBud3);
    
    new AprasymaiPagrindinis(Aprasymai);
    }

private void initComponents() {

    jPanel1 = new javax.swing.JPanel();
    SkaicBud1 = new javax.swing.JButton();
    SkaicBud2 = new javax.swing.JButton();
    SkaicBud3 = new javax.swing.JButton();
    Aprasymai = new javax.swing.JButton();
    Close = new javax.swing.JButton();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    jPanel1.setPreferredSize(new java.awt.Dimension(450, 450));
    
    SkaicBud1.setBackground(new java.awt.Color(0, 102, 102));
    SkaicBud1.setText("Klemano ir Dezormo skaičiavimo būdas");

    SkaicBud2.setBackground(new java.awt.Color(0, 102, 102));
    SkaicBud2.setText("Pirmas stovinčių bangų metodas");

    SkaicBud3.setBackground(new java.awt.Color(0, 102, 102));
    SkaicBud3.setText("Antras stovinčių bangų metodas");

    Aprasymai.setBackground(new java.awt.Color(0, 102, 102));
    Aprasymai.setText("Skaičiavimo būdų aprašymai");
    
    Close.setBackground(new java.awt.Color(0, 102, 102));
    Close.setText("Uždaryti langą");

    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    
    jPanel1Layout.setHorizontalGroup(
    		
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
            .addContainerGap(163, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
            	.addComponent(Aprasymai, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                .addComponent(SkaicBud1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(SkaicBud2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(SkaicBud3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Close, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGap(130, 130, 130))
    );
    
    jPanel1Layout.setVerticalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel1Layout.createSequentialGroup()
            .addGap(34, 34, 34)
            .addComponent(Aprasymai, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(18, 18, 18)
            .addComponent(SkaicBud1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(18, 18, 18)
            .addComponent(SkaicBud2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(18, 18, 18)
            .addComponent(SkaicBud3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(18, 18, 18)
            .addComponent(Close, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap(27, Short.MAX_VALUE))
    );

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 473, Short.MAX_VALUE)
            .addContainerGap())
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 333, Short.MAX_VALUE)
    );

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
            }
        }
    } catch (ClassNotFoundException ex) {
        java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
        java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
        java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
        java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }

    java.awt.EventQueue.invokeLater(new Runnable() {
        public void run() {
            new Main().setVisible(true);
        }
    });
}

private javax.swing.JButton Aprasymai;
private javax.swing.JButton SkaicBud1;
private javax.swing.JButton SkaicBud2;
private javax.swing.JButton SkaicBud3;
private javax.swing.JButton Close;
private javax.swing.JPanel jPanel1;

}



