import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import java.util.*;



public class Deposit extends JFrame implements ActionListener{

    JTextField amount;
    JButton deposit, back;
    String pinnumber;

    Deposit(String pinnumebr) {
        

        this.pinnumber  = pinnumebr;
        
    

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(700, 700, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        add(image);


        JLabel text = new JLabel("Enter the amount you want to deposit");
        text.setBounds(140, 210, 300, 20);
        text.setForeground(Color.white);
        text.setFont(new Font("System", Font.BOLD, 13));
        image.add(text);

;

        amount = new JTextField();
        amount.setFont(new Font("Raleway", Font.BOLD, 20));
        amount.setBounds(130, 250, 250, 20);
        image.add(amount);

        deposit = new JButton("Deposit");
        deposit.setBounds(290, 360, 100, 22);
        deposit.addActionListener(this);
        image.add(deposit);

        back = new JButton("Back");
        back.setBounds(290, 385, 100, 22);
        back.addActionListener(this);
        image.add(back);



        setSize(700, 700);
        setLocation(300, 0);
        setVisible(true);
    }


    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == deposit) {
            String getamount = amount.getText();
            Date date = new Date();
            if (getamount.equals("")) {
                JOptionPane.showMessageDialog(null, "Please enter the amout you want to deposit");
                
            } else {
                try {

                
                Conn conn = new Conn();
                String query = "insert into depositdetails values('"+pinnumber+"', '"+date+"', 'Deposit' , '"+getamount+"')";
                conn.s.executeUpdate(query);
                JOptionPane.showMessageDialog(null, "Rs "+getamount+" Deposited successfully");
                setVisible(false);
                new Transactions(pinnumber).setVisible(true);

                } catch (Exception e) {
                    System.out.println(e);

                }

            }




            
        } else if (ae.getSource() == back) {
            setVisible(false);
            new Transactions(pinnumber).setVisible(true);

            
        }
        
    }
    public static void main(String[] args) {
        new Deposit("");
    }

    
}
