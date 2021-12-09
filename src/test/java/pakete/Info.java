package pakete;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Objects;

public class Info {

    private static int mouseX, mouseY;

 public static void showWindow(){
    JFrame frame = new JFrame();

    JPanel panel = new JPanel();
    JPanel panel2 = new JPanel();

    panel2.addMouseMotionListener(new MouseMotionAdapter() {
        @Override
        public void mouseDragged(MouseEvent e) {
            frame.setLocation(frame.getX() + e.getX() - mouseX, frame.getY() + e.getY() - mouseY);
        }
    });
    panel2.addMouseListener(new MouseAdapter() {
        @Override
        public void mousePressed(MouseEvent e) {
            mouseX = e.getX();
            mouseY = e.getY();
        }
    });

    JButton close = new JButton("X");
    
    ActionListener cerrar = e -> frame.dispose();

    close.addActionListener(cerrar);
    
        close.setBackground(new java.awt.Color(0,0,0,80));
        close.setBounds(150,190,60,25);

        panel2.setBackground(new java.awt.Color(250,250,250,80));
        panel2.setBounds(0,0,350,30);

        //Background
        panel.setLayout(null);
        panel.setBackground(new java.awt.Color(0,0,0,80));

        JLabel uno = new JLabel("<html>" + "You can find it in 'C:/Users'" + "<br />" + " " + "<br />" + "This is needed for it to load your chrome settings" + "<br />" + 
        "and automatically log you in." + "<br />" + " " + "<br />" + "This is supposed to reduce bot detection." + "</html>");


        
        uno.setBounds(40,50,300,100);
        uno.setForeground(Color.white);


        panel.add(close);
        panel.add(uno);
        


        frame.setSize(350,220);
        frame.setResizable(false);
        frame.add(panel2);
        frame.add(panel);
        frame.setTitle("JOI");
        frame.setUndecorated(true);
        frame.setBackground(new java.awt.Color(0,0,0,80));
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

}
