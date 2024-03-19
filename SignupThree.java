import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Struct;
import java.util.Random;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

import com.mysql.cj.xdevapi.SelectStatement;

public class SignupThree extends JFrame implements ActionListener {

    JRadioButton r1, r2, r3, r4;
    JCheckBox c1, c2, c3, c4, c5, c6, c7;
    JButton subm, cancel;
    String formno;


    SignupThree(String formno) {

        this.formno = formno;

        setLayout(null);

        // Label for Page 3 //
        JLabel l1 = new JLabel("Page 3: Acoount Details");
        l1.setFont(new Font("Raleway", Font.BOLD, 22));
        l1.setBounds(280, 40, 400, 40);
        l1.setForeground(Color.DARK_GRAY);
        add(l1);

        JLabel type = new JLabel("Account Type");
        type.setFont(new Font("Raleway", Font.BOLD, 22));
        type.setBounds(100, 100, 200, 30);
        add(type);


        // Account Type //
        r1 = new JRadioButton("Saving Account");
        r1.setFont(new Font("Raleway", Font.BOLD, 14));
        r1.setBackground(Color.white);
        r1.setBounds(100, 140, 200, 20);
        add(r1);

        r2 = new JRadioButton("Fixed Deposite Account");
        r2.setFont(new Font("Raleway", Font.BOLD, 14));
        r2.setBackground(Color.white);
        r2.setBounds(350, 140, 250, 20);
        add(r2);

        r3 = new JRadioButton("Current Account");
        r3.setFont(new Font("Raleway", Font.BOLD, 14));
        r3.setBackground(Color.white);
        r3.setBounds(100, 180, 200, 20);
        add(r3);

        r4 = new JRadioButton("Recurring Deposite Account");
        r4.setFont(new Font("Raleway", Font.BOLD, 14));
        r4.setBackground(Color.white);
        r4.setBounds(350, 180, 250, 20);
        add(r4);

        ButtonGroup groupaccount = new ButtonGroup();
        groupaccount.add(r1);
        groupaccount.add(r2);
        groupaccount.add(r3);
        groupaccount.add(r4);


        // Card Numebr //
        JLabel card = new JLabel("Card Number");
        card.setFont(new Font("Raleway", Font.BOLD, 22));
        card.setBounds(100, 220, 200, 30);
        add(card); 


        JLabel number = new JLabel("XXXX-XXXX-XXXX-2341");
        number.setFont(new Font("Raleway", Font.BOLD, 22));
        number.setBounds(330, 220, 300, 30);
        add(number); 

        JLabel carddetails = new JLabel("16 Digit card Detail");
        carddetails.setFont(new Font("Raleway", Font.ITALIC, 12));
        carddetails.setBounds(100, 245, 300, 20);
        add(carddetails); 

        // PIN //
        JLabel pin = new JLabel("PIN:");
        pin.setFont(new Font("Raleway", Font.BOLD, 22));
        pin.setBounds(100, 290, 100, 30);
        add(pin); 

        JLabel pnumber = new JLabel("XXXX");
        pnumber.setFont(new Font("Raleway", Font.BOLD, 22));
        pnumber.setBounds(330, 290, 200, 30);
        add(pnumber); 

        JLabel pindetails = new JLabel("4 digit password ");
        pindetails.setFont(new Font("Raleway", Font.ITALIC, 12));
        pindetails.setBounds(100, 315, 300, 20);
        add(pindetails);


        // Services //
        JLabel services = new JLabel("Services required");
        services.setFont(new Font("Raleway", Font.BOLD, 22));
        services.setBounds(100, 360, 200, 20);
        add(services); 
        
        // CheckBox Buttons //
        c1 = new JCheckBox("ATM Card");
        c1.setBackground(Color.WHITE);
        c1.setFont(new Font("Raleway",Font.BOLD, 14));
        c1.setBounds(100, 400, 200, 20);
        add(c1);

        c2 = new JCheckBox("Internet Banking");
        c2.setBackground(Color.WHITE);
        c2.setFont(new Font("Raleway",Font.BOLD, 14));
        c2.setBounds(350, 400, 200, 20);
        add(c2);

        c3 = new JCheckBox("Mobile Banking");
        c3.setBackground(Color.WHITE);
        c3.setFont(new Font("Raleway",Font.BOLD, 14));
        c3.setBounds(100, 440, 200, 20);
        add(c3);

        c4 = new JCheckBox("Email SMS Alert");
        c4.setBackground(Color.WHITE);
        c4.setFont(new Font("Raleway",Font.BOLD, 14));
        c4.setBounds(350, 440, 200, 20);
        add(c4);

        c5 = new JCheckBox("Cheque Book");
        c5.setBackground(Color.WHITE);
        c5.setFont(new Font("Raleway",Font.BOLD, 14  ));
        c5.setBounds(100, 480, 200, 20);
        add(c5);

        c6 = new JCheckBox("E-Statments");
        c6.setBackground(Color.WHITE);
        c6.setFont(new Font("Raleway",Font.BOLD, 14  ));
        c6.setBounds(350, 480, 200, 20);
        add(c6);


        c7 = new JCheckBox("I hereby declare that the above entered details are correct to the best of my knowledge");
        c7.setBackground(Color.WHITE);
        c7.setFont(new Font("Raleway",Font.BOLD, 10  ));
        c7.setBounds(100, 550, 450, 20);
        add(c7);
        
        // Buttons for cancela and submission //
        subm = new JButton("Submit");
        subm.setBackground(Color.BLACK);
        subm.setForeground(Color.WHITE);
        subm.setFont(new Font("Raleway", Font.BOLD, 14));
        subm.setBounds(420, 600, 100, 30);
        subm.addActionListener(this);
        add(subm);

        cancel = new JButton("Cancel");
        cancel.setBackground(Color.BLACK);
        cancel.setForeground(Color.WHITE);
        cancel.setFont(new Font("Raleway", Font.BOLD, 14));
        cancel.setBounds(220, 600, 100, 30);
        cancel.addActionListener(this);
        add(cancel);

        // Frame Details //
        getContentPane().setBackground(Color.white);
        setSize(800, 700);
        setLocation(450, 0);
        setVisible(true);

    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == subm) {

            String accountType = null;
            if (r1.isSelected()) {

                accountType = "Saving Account";
            } else if (r2.isSelected()) {
                accountType = "Fixed Deposite Acoount";
            } else if (r3.isSelected()) {
                accountType = "Current Account";
            } else if (r4.isSelected()) {
                accountType = "Recurring Deposite Account";
            }

            Random random = new Random();
            String cardnumber = "" + Math.abs((random.nextLong() % 90000000L) + 75423945000000000L);
            String pinnumber = "" + Math.abs((random.nextLong() % 9000L) + 1000L);

            String facility  = "";
            if (c1.isSelected()) {
                facility = facility + " ATM Card";
                
            } else if (c2.isSelected()) {
                facility = facility + " Internet Banking";
                
            } else if (c3.isSelected()) {
                facility = facility + " Mobile Banking";
                
            } else if (c4.isSelected()) {
                facility = facility + " Email & SMS Alert";
                
            } else if (c5.isSelected()) {
                facility = facility + " Cheque Book";
                
            } else if (c6.isSelected()) {
                facility = facility + " E-Statement";
                
            }

            try {
                if (accountType.equals("")) {
                    JOptionPane.showMessageDialog(null, "Accoutn type Required");

                    
                } else if (facility.equals("")) {
                    JOptionPane.showMessageDialog(null, "At least One service Required");
                }
                else {
                    Conn conn = new Conn();
                    String query1 = "insert into signup3 values('"+formno+ "', '"+accountType+"', '"+cardnumber+ "', '"+pinnumber+ "', '"+facility+ "' )";
                    String query2 = "insert into login values('"+formno+ "', '"+cardnumber+ "', '"+pinnumber+ "' )";
                    conn.s.executeUpdate(query1);
                    conn.s.executeUpdate(query2);


                    JOptionPane.showMessageDialog(null, "Card Number" + cardnumber + "\n Pin: " + pinnumber );

                    setVisible(false);
                    new Deposit(pinnumber).setVisible(false);
                }

            } catch (Exception e) {
                System.out.println(e);
            }
            
        } else if (ae.getSource() == cancel) {
            setVisible(false);
            new Loginn().setVisible(true);
            
        }
    }

    public static void main(String[] args) {
        new SignupThree("");
    }

    
}