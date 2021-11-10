package com.Joi;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class UI implements ActionListener {


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


    private static int mouseX, mouseY;


    public static void main() {

        JFrame frame = new JFrame();

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
        JLabel TWITTER = new JLabel("Twitter: @sirtiffany");
        TWITTER.setForeground(Color.gray);

        JButton boton = new JButton("Start");
        JButton close = new JButton("X");
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


        //Button

        ActionListener cerrar = e -> System.exit(0);

        boton.addActionListener(new UI());
        boton.setBounds(150, 420, 70,25);
        boton.setBackground(new java.awt.Color(0,0,0,80));
        close.addActionListener(cerrar);
        close.setBounds(126,560,120,30);
        close.setBackground(new java.awt.Color(0,0,0,80));

        //Panel

        panel2.setBackground(new java.awt.Color(250,250,250,80));
        panel2.setBounds(3,3,350,30);
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
        panel.add(cardmonth);
        panel.add(cardyear);
        panel.add(cardcode);
        panel.add(size);

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
        panel.add(TWITTER);

        //TextField
        name.setBounds(100, 40, 165, 25);
        email.setBounds(100,70,165,25);
        phone.setBounds(100,100,165,25);
        street.setBounds(100,130,165,25);
        city.setBounds(100,160,165,25);
        zip.setBounds(100,190,165,25);
        country.setBounds(100,220,165,25);
        cardnr.setBounds(100,250,165,25);
        cardmonth.setBounds(100,280,165,25);
        cardyear.setBounds(100,310,165,25);
        cardcode.setBounds(100,340,165,25);
        size.setBounds(100,370,82,25);


        //Label
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
        TWITTER.setBounds(5,500,120,30);

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
        tarjetames = cardmonth.getText();
        tarjetayear = cardyear.getText();
        tarjetacodigo = cardcode.getText();
        talla = size.getText();

        Bot.main();
    }




}
