import java.util.Random;
import java.awt.*;
import javax.swing.*;

import com.toedter.calendar.JDateChooser;
import java.awt.event.*;



public class SignupOne extends JFrame implements ActionListener {

    long random;
    JTextField nameTextField, fnameTextField, dobTextField, emailTextField, addTextField, cityTextField, stateTextField, pinTextField;
    JRadioButton male, female, other, married, unmarr;
    JButton next;
    JDateChooser dateChooser;
    

    SignupOne() {

        setLayout(null);

        // Ranndom Form Number //
        Random ran = new Random();
        random = Math.abs(ran.nextLong() % 9000L + 1000L);

        JLabel formno = new JLabel("APPLICATION FORM NO. - " + random  );
        formno.setFont(new Font("Raleway", Font.BOLD, 38));
        formno.setBounds(140, 20, 600, 40);
        add(formno);

        
        // Page1- Personal Details //
        JLabel pesonalDetails = new JLabel("Page 1 : Peersonal details");
        pesonalDetails.setFont(new Font("Raleway", Font.BOLD, 20));
        pesonalDetails.setBounds(240, 80, 400, 30);
        pesonalDetails.setForeground(Color.DARK_GRAY);
        add(pesonalDetails);

        // Form Content- Name //
        JLabel name  = new JLabel("Name: ");
        name.setFont(new Font("Raleway", Font.BOLD, 15));
        name.setBounds(80, 140, 400, 20);
        add(name);

        nameTextField = new JTextField();
        nameTextField.setBounds(300, 140, 400, 22);
        nameTextField.setFont(new Font("Arial", Font.BOLD, 15));
        add(nameTextField);

        // fathers Name //
        JLabel fname = new JLabel("Father's Name: ");
        fname.setFont(new Font("Raleway", Font.BOLD, 15 ));
        fname.setBounds(80, 180, 400, 20);
        add(fname);

        fnameTextField = new JTextField();
        fnameTextField.setBounds(300, 180, 400, 22);
        fnameTextField.setFont(new Font("Arial", Font.BOLD, 15));
        add(fnameTextField);

        // Date Of Birth //
        JLabel dob = new JLabel("Date of Birth: ");
        dob.setFont(new Font("Raleway", Font.BOLD, 15 ));
        dob.setBounds(80, 220, 400, 20);
        add(dob);

        dateChooser = new JDateChooser();
        dateChooser.setBounds(300, 220, 400, 20);
        add(dateChooser);

        // Gender //
        JLabel gender = new JLabel("Gender: ");
        gender.setFont(new Font("Raleway", Font.BOLD, 15 ));
        gender.setBounds(80, 260, 400, 20);
        add(gender);

        male = new JRadioButton("Male");
        male.setBounds(300, 260, 80, 20);
        male.setBackground(Color.WHITE);
        add(male);

        female = new JRadioButton("Female");
        female.setBounds(400, 260, 80, 20);
        female.setBackground(Color.WHITE);
        add(female);

        other = new JRadioButton("Other");
        other.setBounds(500, 260, 80, 20);
        other.setBackground(Color.WHITE);
        add(other);

        // Button Selection //
        ButtonGroup gendButton = new ButtonGroup();
        gendButton.add(female);
        gendButton.add(male);
        gendButton.add(other);
        
        // Email //
        JLabel email = new JLabel("Email Address: ");
        email.setFont(new Font("Raleway", Font.BOLD, 15 ));
        email.setBounds(80, 300, 400, 20);
        add(email);

        emailTextField = new JTextField();
        emailTextField.setBounds(300, 300, 400, 22);
        emailTextField.setFont(new Font("Arial", Font.BOLD, 15));
        add(emailTextField);

        // Marital Status //
        JLabel marr = new JLabel("Marital Status: ");
        marr.setFont(new Font("Raleway", Font.BOLD, 15 ));
        marr.setBounds(80, 340, 400, 20);
        add(marr);

        married = new JRadioButton("Married");
        married.setBounds(300, 340, 100, 20);
        married.setBackground(Color.WHITE);
        add(married);

        unmarr = new JRadioButton("Unmarried");
        unmarr.setBounds(400, 340, 100, 20);
        unmarr.setBackground(Color.WHITE);
        add(unmarr);

        ButtonGroup marrButton = new ButtonGroup();
        marrButton.add(married);
        marrButton.add(unmarr);

        // Address //
        JLabel add = new JLabel("Address: ");
        add.setFont(new Font("Raleway", Font.BOLD, 15 ));
        add.setBounds(80, 380, 400, 20);
        add(add);

        addTextField = new JTextField();
        addTextField.setBounds(300, 380, 400, 22);
        addTextField.setFont(new Font("Arial", Font.BOLD, 15));
        add(addTextField);

        // City //
        JLabel city = new JLabel("City: ");
        city.setFont(new Font("Raleway", Font.BOLD, 15 ));
        city.setBounds(80, 420, 400, 20);
        add(city);

        cityTextField = new JTextField();
        cityTextField.setBounds(300, 420, 400, 22);
        cityTextField.setFont(new Font("Arial", Font.BOLD, 15));
        add(cityTextField);
        
        // State //
        JLabel state = new JLabel("State: ");
        state.setFont(new Font("Raleway", Font.BOLD, 15 ));
        state.setBounds(80, 460, 400, 20);
        add(state);

        stateTextField = new JTextField();
        stateTextField.setBounds(300, 460, 400, 22);
        stateTextField.setFont(new Font("Arial", Font.BOLD, 15));
        add(stateTextField);

        // PIN Code //
        JLabel pin = new JLabel("PIN: ");
        pin.setFont(new Font("Raleway", Font.BOLD, 15 ));
        pin.setBounds(80, 500, 400, 20);
        add(pin);

        pinTextField = new JTextField();
        pinTextField.setBounds(300, 500, 400, 22);
        pinTextField.setFont(new Font("Arial", Font.BOLD, 15));
        add(pinTextField);

        // NEXT Button //
        next = new JButton("Next");
        next.setBounds(620, 550, 80, 22);
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setFont(new Font("Raleway", Font.BOLD, 16));
        next.addActionListener(this);
        add(next);

        // Frame Background //
        getContentPane().setBackground(Color.WHITE);
        setSize(850, 800); 
        setLocation(350, 10);
        setVisible(true);

    }
    public void actionPerformed(ActionEvent ae) {

        String formno = "" + random ;
        String name = nameTextField.getText();
        String fname = fnameTextField.getText();
        String dob = ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();

        String gender = null;
        if (male.isSelected()) {
            gender = "Male";
        } else if (female.isSelected()) {
            gender = "Female";
        } else if (other.isSelected()){
            gender = "Other";
        }

        String email = emailTextField.getText();

        String marital = null;
        if (married.isSelected()) {
            marital = "Married";
        } else if (unmarr.isSelected()) {
            marital = "Unmarried";
        }

        String add = addTextField.getText();
        String city = cityTextField.getText();
        String state = stateTextField.getText();
        String pin = pinTextField.getText();

        try {
            if (name.equals("")) {
                JOptionPane.showMessageDialog(null, "Name is required");
            
            }  else {
                Conn c= new Conn();
                String query = "insert into signup values('"+formno+"', '"+name+"', '"+fname+"', '"+dob+"', '"+gender+"', '"+email+"', '"+marital+"', '"+add+"', '"+city+"', '"+state+"', '"+pin+"')"; 
                c.s.executeUpdate(query);

                setVisible(false);
                new SignupTwo(formno).setVisible(true); 
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        
        new SignupOne();
    }
}
