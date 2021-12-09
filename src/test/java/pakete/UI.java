package pakete;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Objects;

public class UI implements ActionListener{

    public static String nombre;
    public static JTextField name = new JTextField(20);
    public static String correo;
    public static JTextField email = new JTextField(20);
    public static String telefono;
    public static JTextField phone = new JTextField(20);
    public static String calle;
    public static JTextField street = new JTextField(30);
    public static String ciudad;
    public static JTextField city = new JTextField(20);
    public static String postal;
    public static JTextField zip = new JTextField(8);
    public static String pais;
    public static JTextField country = new JTextField(20);
    public static String tarjetanr;
    public static JTextField cardnr = new JTextField(20);
    public static String tarjetames;
    public static JTextField cardmonth = new JTextField(2);
    public static String tarjetayear;
    public static JTextField cardyear = new JTextField(4);
    public static String tarjetacodigo;
    public static JTextField cardcode = new JTextField(5);
    public static String talla;
    public static JTextField size = new JTextField(1);
    public static String pagina;
    public static JTextField link = new JTextField(50);
    public static String section;
    public static JTextField user = new JTextField(15);
    public static String usuario;

    public static JComboBox tallaBar;
    public static JComboBox monthBar;
    public static JComboBox yearBar;
    public static JComboBox linkBar;

    public static Info w2 = new Info();



    private static int mouseX, mouseY;


    public static void main() {



        JFrame frame = new JFrame();


        //LABELS

        JLabel NAME = new JLabel("Name:");
        NAME.setForeground(Color.white);
        JLabel EMAIL = new JLabel("Email:");
        EMAIL.setForeground(Color.white);
        JLabel PHONE = new JLabel("Tel:");
        PHONE.setForeground(Color.white);
        JLabel STREET = new JLabel("Street:");
        STREET.setForeground(Color.white);
        JLabel CITY = new JLabel("City:");
        CITY.setForeground(Color.white);
        JLabel ZIP = new JLabel("Zip:");
        ZIP.setForeground(Color.white);
        JLabel COUNTRY = new JLabel("Country:");
        COUNTRY.setForeground(Color.white);
        JLabel CARDNR = new JLabel("Card Number:");
        CARDNR.setForeground(Color.white);
        JLabel CARDMONTH = new JLabel("Card Month:");
        CARDMONTH.setForeground(Color.white);
        JLabel CARDYEAR = new JLabel("Card Year:");
        CARDYEAR.setForeground(Color.white);
        JLabel CARDCODE = new JLabel("Card Code:");
        CARDCODE.setForeground(Color.white);
        JLabel SIZE = new JLabel("Size");
        SIZE.setForeground(Color.white);
        JLabel LINK = new JLabel("Link:");
        LINK.setForeground(Color.white);
        JLabel TWITTER = new JLabel("Twitter: @sirtiffany");
        TWITTER.setForeground(Color.gray);
        JLabel USER = new JLabel("PC Username");
        USER.setForeground(Color.white);

        //Buttons
        JButton boton = new JButton("Start");
        JButton close = new JButton("X");
        JButton info = new JButton("?");

        //Panels
        JPanel panel = new JPanel();
        JPanel panel2 = new JPanel();

        //To be able to move the window freely
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

        //JMenuBar menuBar = new JMenuBar();

        //JMenu settings = new JMenu("Settings");



        //Dropbars

        String[] sizes =  {"Small","Medium","Large","XLarge"};
        tallaBar = new JComboBox(sizes);

        String[] months = {"01","02","03","04","05","06","07","08","09","10","11","12"};
        monthBar = new JComboBox(months);

        String[] years = {"2021","2022","2023","2024","2025","2026","2027","2028","2029","2030","2031"};
        yearBar = new JComboBox(years);

        String[] links = {"All","New","Jackets","Shirts","Tops/Sweaters","Sweatshirts","T-Shirts"};
        linkBar = new JComboBox(links);



        //Button Settings

        //Action for closing
        ActionListener cerrar = e -> System.exit(0);

        
        ActionListener pregunta = e -> w2.showWindow();

        boton.addActionListener(new UI());
        boton.setBounds(150, 470, 70,25);
        boton.setBackground(new java.awt.Color(0,0,0,80));

        close.addActionListener(cerrar);
        close.setBounds(126,560,120,30);
        close.setBackground(new java.awt.Color(0,0,0,80));

        info.addActionListener(pregunta);
        info.setBounds(230,430,60,25);
        info.setBackground(new java.awt.Color(0,0,0,80));



        //Panel

        //Moveable panel
        panel2.setBackground(new java.awt.Color(250,250,250,80));
        panel2.setBounds(0,0,350,30);

        //Background
        panel.setLayout(null);
        panel.setBackground(new java.awt.Color(0,0,0,80));

        panel.add(name);
        panel.add(email);
        panel.add(phone);
        panel.add(street);
        panel.add(city);
        panel.add(zip);
        panel.add(country);
        panel.add(cardnr);
        panel.add(monthBar);
        panel.add(yearBar);
        panel.add(cardcode);
        panel.add(tallaBar);
        panel.add(linkBar);
        panel.add(info);
        panel.add(user);

        panel.add(boton);
        panel.add(close);
        panel.add(NAME);
        panel.add(EMAIL);
        panel.add(PHONE);
        panel.add(STREET);
        panel.add(CITY);
        panel.add(ZIP);
        panel.add(COUNTRY);
        panel.add(CARDNR);
        panel.add(CARDMONTH);
        panel.add(CARDYEAR);
        panel.add(CARDCODE);
        panel.add(SIZE);
        panel.add(LINK);
        panel.add(USER);
        panel.add(TWITTER);
        
        //TextField Settings
        name.setBounds(100, 40, 165, 25);
        email.setBounds(100,70,165,25);
        phone.setBounds(100,100,165,25);
        street.setBounds(100,130,165,25);
        city.setBounds(100,160,165,25);
        zip.setBounds(100,190,165,25);
        country.setBounds(100,220,165,25);
        cardnr.setBounds(100,250,165,25);
        monthBar.setBounds(100,280,45,25);
        yearBar.setBounds(100,310,82,25);
        cardcode.setBounds(100,340,165,25);
        tallaBar.setBounds(100,370,82,25);
        linkBar.setBounds(100,400,165,25);
        user.setBounds(100,430,100,25);


        //Label Settings
        NAME.setBounds(10,40,80,25);
        EMAIL.setBounds(10,70,80,25);
        PHONE.setBounds(10,100,80,25);
        STREET.setBounds(10,130,80,25);
        CITY.setBounds(10,160,80,25);
        ZIP.setBounds(10,190,80,25);
        COUNTRY.setBounds(10,220,80,25);
        CARDNR.setBounds(10,250,80,25);
        CARDMONTH.setBounds(10,280,80,25);
        CARDYEAR.setBounds(10,310,80,25);
        CARDCODE.setBounds(10,340,80,25);
        SIZE.setBounds(10,370,40,25);
        LINK.setBounds(10,400,40,25);
        TWITTER.setBounds(5,500,120,30);
        USER.setBounds(10,430,120,25);
        

        //Frame
        frame.setSize(350,600);
        frame.setResizable(false);
        frame.add(panel2);
        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("JOI");
        frame.setUndecorated(true);
        frame.setBackground(new java.awt.Color(0,0,0,80));
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

    
    }


    @Override

    //Action after pressing Start
    public void actionPerformed(ActionEvent e) {

        //credentials

        nombre = name.getText();
        correo = email.getText();
        telefono = phone.getText();
        calle = street.getText();
        ciudad = city.getText();
        postal = zip.getText();
        pais = country.getText();
        tarjetanr = cardnr.getText();
        tarjetames = (String) monthBar.getSelectedItem();
        tarjetayear = (String) yearBar.getSelectedItem();
        tarjetacodigo = cardcode.getText();
        talla = (String) tallaBar.getSelectedItem();
        usuario = user.getText();
        section = (String) linkBar.getSelectedItem();
        if (linkBar.getSelectedItem().equals("All")){
            pagina = "https://www.supremenewyork.com/shop/all";
        }
        if (linkBar.getSelectedItem().equals("New")){
            pagina = "https://www.supremenewyork.com/shop/new";
        }
        if (linkBar.getSelectedItem().equals("Jackets")) {
            pagina = "https://www.supremenewyork.com/shop/all/jackets";
        }
        if (linkBar.getSelectedItem().equals("Shirts")){
            pagina = "https://www.supremenewyork.com/shop/all/shirts";
        }
        if (linkBar.getSelectedItem().equals("Tops/Sweaters")){
            pagina = "https://www.supremenewyork.com/shop/all/tops_sweaters";
        }
        if (linkBar.getSelectedItem().equals("Sweatshirts")){
            pagina = "https://www.supremenewyork.com/shop/all/sweatshirts";
        }
        if (linkBar.getSelectedItem().equals("T-Shirts")){
            pagina = "https://www.supremenewyork.com/shop/all/t-shirts";
        }

        Bot.main();
    }




}
