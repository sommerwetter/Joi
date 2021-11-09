
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Driver;
import java.util.concurrent.TimeUnit;
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


    public static void main() {

        JFrame frame = new JFrame();

        JLabel NAME = new JLabel("Name:");
        JLabel EMAIL = new JLabel("Email:");
        JLabel PHONE = new JLabel("Tel:");
        JLabel STREET = new JLabel("Street:");
        JLabel CITY = new JLabel("City:");
        JLabel ZIP = new JLabel("Zip:");
        JLabel COUNTRY = new JLabel("Country:");
        JLabel CARDNR = new JLabel("Card Number:");
        JLabel CARDMONTH = new JLabel("Card Month:");
        JLabel CARDYEAR = new JLabel("Card Year:");
        JLabel CARDCODE = new JLabel("Card Code:");
        JLabel SIZE = new JLabel("Size");

        JButton boton = new JButton("Start");
        JButton close = new JButton("CLose");
        JPanel panel = new JPanel();

        //Button

        boton.addActionListener(new UI());
        boton.setBounds(150, 400, 70,25);

        //Panel

        panel.setLayout(null);
        

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

        //TextField
        name.setBounds(100, 20, 165, 25);
        email.setBounds(100,50,165,25);
        phone.setBounds(100,80,165,25);
        street.setBounds(100,110,165,25);
        city.setBounds(100,140,165,25);
        zip.setBounds(100,170,165,25);
        country.setBounds(100,200,165,25);
        cardnr.setBounds(100,230,165,25);
        cardmonth.setBounds(100,260,165,25);
        cardyear.setBounds(100,290,165,25);
        cardcode.setBounds(100,320,165,25);
        size.setBounds(100,350,82,25);


        //Label
        NAME.setBounds(10,20,80,25);
        EMAIL.setBounds(10,50,80,25);
        PHONE.setBounds(10,80,80,25);
        STREET.setBounds(10,110,80,25);
        CITY.setBounds(10,140,80,25);
        ZIP.setBounds(10,170,80,25);
        COUNTRY.setBounds(10,200,80,25);
        CARDNR.setBounds(10,230,80,25);
        CARDMONTH.setBounds(10,260,80,25);
        CARDYEAR.setBounds(10,290,80,25);
        CARDCODE.setBounds(10,320,80,25);
        SIZE.setBounds(10,350,40,25);

        //Frame

        frame.setSize(350,600);
        frame.setResizable(false);
        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("JOI");
        frame.setVisible(true);

    }

    @Override

    public void actionPerformed(ActionEvent e) {
        //credentials

        nombre = name.getText();
        correo = email.getText();
        telefono = phone.getText();
        calle = phone.getText();
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
