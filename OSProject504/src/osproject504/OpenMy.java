/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package osproject504;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JTextField;
public class OpenMy {

    JLabel l, l1, l2, l3, l4, l5, l6, l7, l8;
    ImageIcon i;
    JButton b;
    JFrame f = new JFrame("Process");

    OpenMy() {
       f.setSize(113, 180);
       f.setLocation(1150, 80);
     
        
        Container c = f.getContentPane();
        c.setBackground(Color.gray);
        

        b = new JButton("Open");
        b.setBounds(1, 1, 110, 30);
        f.add(b);
        b.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {

                try {
                    Process p = Runtime.getRuntime().exec("cmd /c start shell:mycomputerfolder");
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
        f.setUndecorated(true);
        f.setVisible(true);
    }

}
