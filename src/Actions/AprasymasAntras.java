package Actions;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import Darbas.Aprasymas2;
public class AprasymasAntras {
    
        public AprasymasAntras (JButton Aprasymas21) {
        Aprasymas21 actionLstener = new Aprasymas21();
        Aprasymas21.addActionListener(actionLstener);

    }
      private class Aprasymas21 implements ActionListener{

        
        @Override
        public void actionPerformed(ActionEvent ae) {
            
             Toolkit.getDefaultToolkit().beep();
                        h.setVisible(true);
        }
        
         private JFrame  h = new Aprasymas2();
    }
}

//