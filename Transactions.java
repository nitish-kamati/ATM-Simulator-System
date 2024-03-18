import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Transactions extends JFrame implements ActionListener {

    JButton deposit, withdraw, fastcash, ministatement,  pinchange, balanceenq, exit ;

    String pinnumber;
    Transactions(String pinnumber) {
        this.pinnumber = pinnumber;

        setLayout(null);

        // Background Image //
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(700, 700, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel Image = new JLabel(i3);
        Image.setBounds(0, 0 ,700, 700);
        add(Image);

        // title on atm Machine //
        JLabel text = new JLabel("Please Select Your Transaction");
        text.setBounds(170, 220, 500, 20);
        text.setForeground(Color.white);
        text.setFont(new Font("System", Font.BOLD, 13));
        Image.add(text);

        // All butttons //
        deposit = new JButton("Deposit");
        deposit.setBounds(125, 325, 130, 20);
        deposit.addActionListener(this);
        Image.add(deposit);


        withdraw = new JButton("Cash Withdwal");
        withdraw.setBounds(270, 325, 130, 20);
        withdraw.addActionListener(this);
        Image.add(withdraw);


        fastcash = new JButton("Fast Cash");
        fastcash.setBounds(125, 350, 130, 20);
        fastcash.addActionListener(this);
        Image.add(fastcash);

        ministatement = new JButton("Mini Statement");
        ministatement.setBounds(270, 350, 130, 20);
        ministatement.addActionListener(this);
        Image.add(ministatement);

        pinchange = new JButton("Pin Change");
        pinchange.setBounds(125, 375, 130, 20);
        pinchange.addActionListener(this);
        Image.add(pinchange);


        balanceenq = new JButton("Balance Enquiry");
        balanceenq.setBounds(270, 375, 130, 20);
        balanceenq.addActionListener(this);
        Image.add(balanceenq);


        exit = new JButton("Exit");
        exit.setBounds(270, 400, 130, 20);
        exit.addActionListener(this);
        Image.add(exit);

        setSize(700, 700);
        setLocation(300, 0);
        setUndecorated(true);
        setVisible(true);

    }
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == exit) {
            System.exit(0); 
        }
    }
    public static void main(String[] args) {
        new Transactions("");
        
    }
    
}
