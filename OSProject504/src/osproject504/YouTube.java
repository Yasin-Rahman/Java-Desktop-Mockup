/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package osproject504;

import java.awt.Desktop;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.omg.CORBA.Object;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
public class YouTube extends JFrame{
    
    JButton b1;
    JTextField t1,t2,t3,t4,t5,t6,t7,t8,t9;
    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9;
    
    
    int s1,s2,s3,s4,s5,s6,s7,s8,s9;
    
    
    
     Thread t = Thread.currentThread();
    
    
    YouTube(){
        super("Shaptak'sYouTubePlayer");
         setSize(800,600);
        
        l1=new JLabel("1)1st link:");
        l1.setBounds(10, 10, 60, 20);
        add(l1);
        t1=new JTextField();
        t1.setBounds(70, 10, 500, 20);
        add(t1);
        
        l2=new JLabel("Time:");
        l2.setBounds(580, 10, 35, 20);
        add(l2);
        t2=new JTextField();
        t2.setBounds(620, 10, 60, 20);
        add(t2);
        
        
        
        
        
        
         
        l3=new JLabel("1)2nd link:");
        l3.setBounds(10, 50, 60, 20);
        add(l3);
        t3=new JTextField();
        t3.setBounds(70, 50, 500, 20);
        add(t3);
        
        l4=new JLabel("Time:");
        l4.setBounds(580, 50, 35, 20);
        add(l4);
        t4=new JTextField();
        t4.setBounds(620, 50, 60, 20);
        add(t4);
        
        //****************
        
        l5=new JLabel("1)3rd link:");
        l5.setBounds(10, 90, 60, 20);
        add(l5);
        t5=new JTextField();
        t5.setBounds(70, 90, 500, 20);
        add(t5);
        
        l6=new JLabel("Time:");
        l6.setBounds(580, 90, 35, 20);
        add(l6);
        t6=new JTextField();
        t6.setBounds(620, 90, 60, 20);
        add(t6);
        
        
        
        
        
        
         
        l7=new JLabel("1)4th link:");
        l7.setBounds(10, 130, 60, 20);
        add(l7);
        t7=new JTextField();
        t7.setBounds(70, 130, 500, 20);
        add(t7);
        
        l8=new JLabel("Time:");
        l8.setBounds(580, 130, 35, 20);
        add(l8);
        t8=new JTextField();
        t8.setBounds(620, 130, 60, 20);
        add(t8);
        
        
         l9=new JLabel("1)4th link:");
        l9.setBounds(10, 170, 60, 20);
        add(l9);
        
        t9=new JTextField();
        t9.setBounds(70, 170, 500, 20);
        add(t9);
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        b1=new JButton("GO");
        b1.setBounds(700, 500, 70, 40);
        add(b1);
        
        
        
        
        setLayout(null);
       // setLayout(new FlowLayout());
       
       setVisible(true);
       
       
       
       
       
       
       
        b1.addActionListener(new ActionListener() {
           
            @Override
            public void actionPerformed(ActionEvent e) {

                
//Link Text Field
                 String url1 = t1.getText();
                  String url2 = t3.getText();
                  String url3 = t5.getText();
                  String url4 = t7.getText();
                  String url5 = t9.getText();
                  


//Time TextField
                  String text2 = t2.getText();              
                  String text4 = t4.getText();         
                  String text6 = t6.getText();                
                  String text8 = t8.getText();
              
                  float a = Float.parseFloat(text2);
                  float b = Float.parseFloat(text4);
                  float c = Float.parseFloat(text6);
                  float d = Float.parseFloat(text8);
                  
                  float time1=a*62*1000;
                  float time2=b*62*1000;
                  float time3=c*62*1000;
                  float time4=d*62*1000;
                         
 
                    if(Desktop.isDesktopSupported()){
                        Desktop desktop = Desktop.getDesktop();
                        try {
                            desktop.browse(new URI(url1));
                            
                            Thread.sleep((long) time1);//**********
                           
                            
                            
                            desktop.browse(new URI(url2));
                            
                            Thread.sleep((long) time2);
                            
                            
                            
                            desktop.browse(new URI(url3));
                            
                            Thread.sleep((long) time3);
                            
                            
                            desktop.browse(new URI(url4));
                            
                            Thread.sleep((long) time4);
                            
                               desktop.browse(new URI(url5));
                            
                        } catch (IOException | URISyntaxException ex) {
                           
                            ex.printStackTrace();
                        } catch (InterruptedException ex) {
                         Logger.getLogger(YouTube.class.getName()).log(Level.SEVERE, null, ex);
                     }
                    }else{
                        Runtime runtime = Runtime.getRuntime();
                        try {
                            runtime.exec("xdg-open " + url1);
                            
                          runtime.exec("xdg-open " + url2);
                           runtime.exec("xdg-open " + url3);
                            
                            
                             runtime.exec("xdg-open " + url4);
                            runtime.exec("xdg-open " + url5);
                            
                        } catch (IOException ep) {
                                                    ep.printStackTrace();
                        }
                    }
            }
        });    
       
       
       
       
       
       
        
    }

   
    
    
    
    
    
}
