
import java.awt.Image;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import java.awt.*;
import java.awt.event.*;

// Git //
public class Loginn extends JFrame implements ActionListener {

    JButton login, signUp, clear;
    JTextField cardTextField ;
    JPasswordField pinTextField;

    Loginn() {

        // Frame title //
        setTitle("DIGITAL AUTOMATED TELLER MACHINE");

        setLayout(null);

        // Setting Bank Logo //
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/logoo.jpg"));
        Image i2 = i1.getImage().getScaledInstance(120, 120, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel label = new JLabel(i3);
        label.setBounds(70, 10, 100, 100);
        add(label);

        // Labelling the Frame//
        JLabel text  = new JLabel("Welcome to DIGITAL ATM");
        text.setFont(new Font("Osward", Font.BOLD, 38));
        text.setBounds(200, 40, 500, 40);
        text.setForeground(Color.BLACK);
        add(text);

        // Caed Label //
        JLabel cardNo  = new JLabel("Card No :");
        cardNo.setFont(new Font("Raleway", Font.BOLD, 25));
        cardNo.setBounds(100, 140, 400, 30);
        add(cardNo);

        //Card text field Label //
        cardTextField = new JTextField();
        cardTextField.setBounds(300, 140, 400, 30);
        cardTextField.setFont(new Font("Arial", Font.BOLD, 15));
        add(cardTextField);

        // Pin Label //
        JLabel pinNo  = new JLabel("PIN         :");
        pinNo.setFont(new Font("Raleway", Font.BOLD, 25));
        pinNo.setBounds(100, 200, 250, 30);
        add(pinNo);

        //Pin Text Field Label //
        pinTextField = new JPasswordField();
        pinTextField.setBounds(300, 200, 400, 30);
        pinTextField.setFont(new Font("Arial", Font.BOLD, 15));
        add(pinTextField);

        // Button - sing in //
        login = new JButton("Sign In");
        login.setBounds(300, 300, 80, 25);
        login.setBackground(Color.black);
        login.setForeground(Color.white);
        login.addActionListener(this);
        add(login);

        // Button - clear //
        clear = new JButton("Clear");
        clear.setBounds(400, 300, 80, 25);
        clear.setBackground(Color.black);
        clear.setForeground(Color.white);
        clear.addActionListener(this);
        add(clear);

        // Button - sign up //
        signUp = new JButton("Sign Up");
        signUp.setBounds(300, 340, 180, 25);
        signUp.setBackground(Color.black);
        signUp.setForeground(Color.white);
        signUp.addActionListener(this);
        add(signUp);


        // Frame -BG Color,  size , location , visibility //
        getContentPane().setBackground(Color.white);
        setSize(800, 480);
        setVisible(true);
        setLocation(350, 100);

    }

    // function - Action Event //
    public void actionPerformed(ActionEvent ae ) {
        if (ae.getSource() == clear) {
            cardTextField.setText("");
            pinTextField.setText("");

        } else if (ae.getSource() == login) {
            Conn conn = new Conn();
            String cardnumber = cardTextField.getText();
            String pinnumber = pinTextField.getText();
            String query = "select * from login where cardnumber = '"+cardnumber+"' and pin = '"+pinnumber+"'";
            
            try {
                ResultSet rs = conn.s.executeQuery(query);
                if (rs.next()) {
                    setVisible(false);
                    new Transactions(pinnumber).setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(null, "Incorrect Pin Or Card Number");
                }

            } catch (Exception e) {
                System.out.println(e);
            }


    } else if (ae.getSource() == signUp) {
        setVisible(false);
        new SignupOne().setVisible(true);   
        }
    }
    public static void main(String[] args) {
        new Loginn();
    }
    
}
