package Actions;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import Darbas.Aprasymas1;

public class AprasymasPirmas {
    
      public AprasymasPirmas (JButton Aprasymas11) {
        Aprasymas11 actionLstener = new Aprasymas11();
        Aprasymas11.addActionListener(actionLstener);

    }
      private class Aprasymas11 implements ActionListener{

        public void actionPerformed(ActionEvent ae) {
//            
             Toolkit.getDefaultToolkit().beep();
                        g.setVisible(true);
                        
   
        }
        
         private JFrame  g = new Aprasymas1();
    }
}

