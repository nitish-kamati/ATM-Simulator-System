import javax.swing.*;

import java.awt.Color;

import java.sql.ResultSet;

public class Ministatement extends JFrame {


    
    Ministatement(String pinnumber) {
        
        setTitle("Mini statement");
        setLayout(null);

        
        JLabel bank = new JLabel("HDFC BANK");
        bank.setBounds(150,20,100,20);
        add(bank);        

        JLabel card = new JLabel();
        card.setBounds(20,60,300,20);
        add(card);  
        
        JLabel mini = new JLabel();
        mini.setBounds(20, 80, 400, 300);
        add(mini);

        JLabel balance = new JLabel();
        balance.setBounds(20, 400, 300, 20);
        add(balance);


        setSize(400, 500);
        setLocation(200, 20);
        getContentPane().setBackground(Color.WHITE);
        setVisible(true);   
        
        try {
            Conn conn = new Conn();
                ResultSet rs = conn.s.executeQuery("SELECT * FROM login WHERE pin = '"+pinnumber+"'");
                while(rs.next()) {
                    card.setText("Card Number: " + rs.getString("cardnumber").substring(0, 4) + "XXXXXXXX" + rs.getString("cardnumber").substring(12));
                } 
        } catch (Exception e) {
            System.out.println(e);
        }
        try {
            Conn conn = new Conn();
            int bal = 0;
            ResultSet rs = conn.s.executeQuery("select * from depositdetails where pin = '"+pinnumber+"'");
            while (rs.next()) {
                mini.setText(mini.getText() + "<html>" + rs.getString("date") + "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;" + rs.getString("type") + "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;" + rs.getString("amount") + "<br><br><html>");
                
                if (rs.getString("type").equals("Deposit")) {
                    bal += Integer.parseInt(rs.getString("amount"))  ;                      
                } else {
                    bal -= Integer.parseInt(rs.getString("amount"))  ;
                }
            }
            balance.setText("Your current account balance is Rs. " + bal);

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        new Ministatement("");
    }

    
}
