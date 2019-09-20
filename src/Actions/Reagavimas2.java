package Actions;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import Darbas.SkaicBud2;

        
public class Reagavimas2 {
      public Reagavimas2(JButton Reagavimas21) {
        Reagavimas21 actionLstener = new Reagavimas21();
        Reagavimas21.addActionListener(actionLstener);
    }
    private JLabel label;
    
    private class Reagavimas21 implements ActionListener {

        public void actionPerformed(ActionEvent ae) {
            
            Toolkit.getDefaultToolkit().beep();
                        y.setVisible(true);
        }
       private JFrame  y = new SkaicBud2();
    }
}
