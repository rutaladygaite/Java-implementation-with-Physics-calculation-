package Actions;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import Darbas.Aprasymas3;
public class AprasymasTrecias {
	
        public AprasymasTrecias (JButton Aprasymas31) {
        Aprasymas31 actionLstener = new Aprasymas31();
        Aprasymas31.addActionListener(actionLstener);

    }
        private class Aprasymas31 implements ActionListener{
        
        
        @Override
        public void actionPerformed(ActionEvent ae) {
            
             Toolkit.getDefaultToolkit().beep();
                        i.setVisible(true); 
        }
        
         private JFrame  i = new Aprasymas3();
    }}


    
