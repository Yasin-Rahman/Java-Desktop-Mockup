
package osproject504;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
public class OpenR extends JFrame{

    JLabel l, l1, l2, l3, l4, l5, l6, l7, l8;
    ImageIcon i;
    JButton b;
    JFrame f = new JFrame("Process");
    
    OpenR() {
        f.setSize(113, 180);
        f.setLocation(1150, 180);
     
        
        Container c = f.getContentPane();
        c.setBackground(Color.gray);
        
        
        
        b = new JButton("Open");
        b.setBounds(1, 1, 110, 30);
        f.add(b);
        b.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                
                try {
                    Process p = Runtime.getRuntime().exec("cmd /c start shell:RecycleBinFolder");
                    p.waitFor();
                } catch (IOException | InterruptedException ex) {
                }

            }
        }
        );

        b.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {

                f.setVisible(false);
            }
        }
        );

        f.setLayout(null);
       // boolean rootPaneCheckingEnabled = false;
        f.setUndecorated(rootPaneCheckingEnabled);
        f.setVisible(true);
    }

}
