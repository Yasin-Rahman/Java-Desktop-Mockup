
package osproject504;

//import com.toedter.calendar.JCalendar;
//import com.toedter.calendar.JDateChooser;
import java.awt.AWTException;
import java.awt.Color;
import java.awt.Desktop;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.Image;
import java.awt.Robot;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;
public class Project extends JFrame{
    JLabel pic;
    Timer tm;
    int x = 0;
    JMenuBar mb;

    
    
    
    
    
    JLabel l1, l2, l3, l4, l5, l6, l7, l8, l9, l10,lg,ls,lc,lr,ld,lt,ltf;
    JButton b1, b2, b3, b4,b5, bc,b6,bgo;
   // JMenuBar mb;
    JDateChooser jd;
    //JCalendar cal;
    JComboBox cb;
  //   FlowLayout layout;
     JTextField t1;
    
    
    Thread t = null;
    int hours = 0, minutes = 0, seconds = 0;
    String timeString = "";
    private Object jLabelYourCompanyLogo;
    
    
    
  
    
    
    
   
    String[] list = {
           /*
        "image/sec.jpg",
        "image/ss.jpg",
        "image/ee.jpg",
        "image/cc.jpg",
        "image/sec.jpg",
        "image/ss.jpg",
        "image/ee.jpg",
        "image/cc.jpg"*/
        
                      "D:/a-PhotoShops/os project/sec.jpg",//0
                      "D:/a-PhotoShops/os project/ss.jpg",//1
                      "D:/a-PhotoShops/os project/ee.jpg",//2
                      "D:/a-PhotoShops/os project/cc.jpg",//3
                      "D:/a-PhotoShops/os project/sec.jpg",//4
                      "D:/a-PhotoShops/os project/cc.jpg",//5
                      "D:/a-PhotoShops/os project/sec.jpg",
                      "D:/a-PhotoShops/os project/cc.jpg"
            
            
            
            
            
                      //"C:/Users/samsng/Desktop/jv7.jpg"//6
        
        
                    };
    
    public Project() throws IOException, URISyntaxException{
        
        
        super("Java SlideShow");
        pic = new JLabel();
     
        
        
        
        String[] a = {"a", "b","c","d","e"};
        cb = new JComboBox(a);
        cb.setBounds(1100, 710, 20, 30);
        add(cb);
        
        
       // ImageIcon IIGoogle = new ImageIcon(getClass().getResource("image/cc.jpg"));
        
          ImageIcon IIGoogle = new ImageIcon(getClass().getResource("image/GoogleT.png"));
        lg = new JLabel(IIGoogle);
        lg.setBounds(120, 652, 150, 150);
        add(lg);
        
        Desktop d=  Desktop.getDesktop();
        
        
        
        
        
        
        
        lg.addMouseListener(new MouseAdapter(){
   // @Override
    public void mouseClicked(MouseEvent ep){
        if(ep.getClickCount()==1)
            try {
                    d.browse(new URI("https://www.google.com"));
                } catch (URISyntaxException ex) {
                    Logger.getLogger(Project.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(Project.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
});
        
        
        
        
        
        
        
          ltf=new JLabel("Give the URL:");
        ltf.setBounds(500, 700, 120, 20);
        add(ltf);

        
      
        
        
        
         t1=new JTextField("https://");
        t1.setBounds(500, 720, 500, 20);
        add(t1);
        
        bgo=new JButton("Go");
        bgo.setBounds(1010, 715, 50,30);
        add(bgo);
        
             bgo.addActionListener(new ActionListener() {
           
            @Override
            public void actionPerformed(ActionEvent e) {

                
//Link Text Field
                 String url1 = t1.getText();
                  
                  


//Time TextField
                 
              
                
                         
 
                    if(Desktop.isDesktopSupported()){
                        Desktop desktop = Desktop.getDesktop();
                        try {
                            desktop.browse(new URI(url1));
                            
                           
                           
                            
                            
                           
                           
                            
                        } catch (IOException | URISyntaxException ex) {
                           
                            ex.printStackTrace();
                        }
                    }else{
                        Runtime runtime = Runtime.getRuntime();
                        try {
                            runtime.exec("xdg-open " + url1);
                            
                         
                            
                        } catch (IOException ep) {
                                                    ep.printStackTrace();
                        }
                    }
            }
        });   
        
        
      
       
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        ImageIcon IIYouTube = new ImageIcon(getClass().getResource("image/TYou.png"));
        b6 = new JButton(IIYouTube);
        b6.setBounds(360, 705, 100, 50);
        b6.setToolTipText("YouTubePlayer");
        
        
        
        
        
        
        b6.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent event) {

                YouTube ob1 = new YouTube();

            }
        }
        );
        
        
        
        
        add(b6);
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        ImageIcon IIStart = new ImageIcon(getClass().getResource("image/Start.png"));
        ls = new JLabel(IIStart);
        ls.setBounds(10, 680, 100, 100);
        ls.setToolTipText("Start");
        
        
        
        
        
        
         
        
        
        
         ls.addMouseListener(new MouseAdapter(){
   // @Override
    public void mouseClicked(MouseEvent ep){
        if(ep.getClickCount()==1) {
               
               GraphicsDevice gd = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice();
        Robot robo = null;
        try {
            robo = new Robot(gd);
        } catch (AWTException ex) {
            Logger.getLogger(Project.class.getName()).log(Level.SEVERE, null, ex);
        }
        robo.setAutoDelay(100);
        robo.keyPress(KeyEvent.VK_WINDOWS);
        robo.keyRelease(KeyEvent.VK_WINDOWS);
            }
    }
        });
        add(ls);

        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        /*
        lg.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
               
                try {
                    d.browse(new URI("https://www.google.com"));
                } catch (URISyntaxException ex) {
                    Logger.getLogger(Project.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(Project.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });*/
        /*
        JLabel jLabel6 = null;
        setBounds(1000, 500, 120, 60);
        
        
        
          Date dt = new Date();
    SimpleDateFormat D = new SimpleDateFormat("dd-MM-YYYY");
    jLabel6.setText(D.format(dt));
    add(jLabel6);
        */
        
        
        
        
   
       lt=new JLabel("3.30PM");
        lt.setBounds(1210, 700, 120, 20);
        add(lt);

        jd = new JDateChooser();
        //jd.setBounds(1210, 740, 120, 20);
        //add(jd);
        
        
        
        
       // showDate();
        
       
       // Date dx = new Date();
        
       
        
    
    
    
    
    
        
        mb = new JMenuBar();
        mb.setBounds(0, 700, 1500, 80);
        mb.setBackground(Color.decode("#3D1714"));
        add(mb);
        
        
        
        
        
        
        
          ImageIcon IIMyCpmputer = new ImageIcon(getClass().getResource("image/MyComputerT.png"));
          //ImageIcon IIMyCpmputer = new ImageIcon("MyComputer.png");
        lc = new JLabel(IIMyCpmputer);
        lc.setBounds(1225, 20, 95, 97);
        
        
         
        lc.addMouseListener(new MouseAdapter(){
   // @Override
    public void mouseClicked(MouseEvent ep){
        if(ep.getClickCount()==2)
            try {
                    Process p = Runtime.getRuntime().exec("cmd /c start shell:mycomputerfolder");
             
                    p.waitFor();
                } catch (IOException | InterruptedException ex) {
                }
    }
});
        
         lc.addMouseListener(new MouseAdapter() {
               public void mousePressed(MouseEvent e) {
                  if (e.getButton() == MouseEvent.BUTTON3) {
                      OpenMy ob1 = new OpenMy();
                  }
               }
            });
        
        
        
        add(lc);

        
        
        
        
        
        
       
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
         ImageIcon IIRecycle = new ImageIcon(getClass().getResource("image/recyclebinT.png"));
        lr = new JLabel(IIRecycle);
        lr.setBounds(1225, 130, 93, 100);
        
        
        
         lr.addMouseListener(new MouseAdapter(){
   // @Override
    public void mouseClicked(MouseEvent ep){
        if(ep.getClickCount()==2)
            try {
                    Process p = Runtime.getRuntime().exec("cmd /c start shell:RecycleBinFolder");
                    p.waitFor();
                } catch (IOException | InterruptedException ex) {
                }
    }
});
        
        
         lr.addMouseListener(new MouseAdapter() {
               public void mousePressed(MouseEvent e) {
                  if (e.getButton() == MouseEvent.BUTTON3) {
                      OpenR ob1 = new OpenR();
                  }
                  
               }
            });
        
    
        add(lr);
        
        
        
        
      
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
     pic.setBounds(0, 0, 1500, 800);


        //Call The Function SetImageSize
        SetImageSize(6);
        

       //set a timer
        tm = new Timer(500,new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                SetImageSize(x);
                x += 1;
                if(x >= list.length )
                    x = 0; 
            }
        });
        add(pic);
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        tm.start();
        setLayout(null);
       // setSize(800, 400);
        setSize(1500,800);
       // getContentPane().setBackground(Color.decode("#bdb67b"));
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
         setUndecorated(rootPaneCheckingEnabled);
        
          setResizable(false);
        
        
        
        
        setVisible(true);
    }
    
    
    /*
     void showDate(){
         ld.setBounds(500, 500, 80, 50);
    Date d = new Date();
    SimpleDateFormat D = new SimpleDateFormat("dd-MM-YYYY");
    ld.setText(D.format(d));
    
    
}*/
    /*
    void showTime(){
    ld.setBounds(500, 800, 80, 50);
    new Timer(0 , (ActionEvent e) -> {
        Date d = new Date();
        
        SimpleDateFormat t = new SimpleDateFormat("HH:mm:ss a");
        lc.setText(t.format(d));
    }).start();
    
}
    */
    
    
    
    
    
    
   
    
    
    
    
    
    
    
    
    
    //create a function to resize the image 
    public void SetImageSize(int i){
        ImageIcon icon = new ImageIcon(list[i]);
        Image img = icon.getImage();
        Image newImg = img.getScaledInstance(pic.getWidth(), pic.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon newImc = new ImageIcon(newImg);
        pic.setIcon(newImc);
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
   
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}