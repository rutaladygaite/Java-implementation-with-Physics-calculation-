package Actions;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import Darbas.Aprasymai;

public class AprasymaiPagrindinis {
public AprasymaiPagrindinis(JButton Aprasymai1){
Aprasymai1 actionLstener = new Aprasymai1();
Aprasymai1.addActionListener(actionLstener);
};

private class Aprasymai1 implements ActionListener{

    
    @Override
    public void actionPerformed(ActionEvent ae) {
        
      Toolkit.getDefaultToolkit().beep();
      f.setVisible(true);
   }
    
private JFrame  f = new Aprasymai();
}
}


