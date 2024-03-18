import java.util.Random;
import java.awt.*;
import javax.swing.*;

import java.awt.event.*;



public class SignupTwo extends JFrame implements ActionListener {

    
    JTextField panNumTextField, adhaarTextField;
    JRadioButton yes , no;
    JButton next, prev;
    JComboBox rel, cat, incom, edudt,occdetail;
    String formno;
    

    SignupTwo( String formno) {
        this.formno = formno;

        setLayout(null);
        setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 2");

        // Page2- Personal Details //
        JLabel additionalDetails = new JLabel("Page 2 : Additional Details");
        additionalDetails.setFont(new Font("Raleway", Font.BOLD, 20));
        additionalDetails.setBounds(240, 80, 400, 30);
        additionalDetails.setForeground(Color.DARK_GRAY);
        add(additionalDetails);

        // Form Content //
        JLabel religion  = new JLabel("Relegion: ");
        religion.setFont(new Font("Raleway", Font.BOLD, 15));
        religion.setBounds(80, 140, 400, 20);
        add(religion);

        String valReligion[] = {"Hindu" , "Muslim", "Sikh", "Christian", "Other"};
        rel = new JComboBox(valReligion);
        rel.setFont(new Font("Raleway", Font.BOLD, 15));
        rel.setBounds(320, 140, 400, 20);
        rel.setBackground(Color.WHITE);

        add(rel);

    
        // category //
        JLabel category = new JLabel("Category: ");
        category.setFont(new Font("Raleway", Font.BOLD, 15 ));
        category.setBounds(80, 180, 400, 20);
        add(category);

        String valcategory[] = {"Gneral" , "OBC", "SC", "ST", "EWS"};
        cat = new JComboBox(valcategory);
        cat.setFont(new Font("Raleway", Font.BOLD, 15));
        cat.setBounds(320, 180, 400, 20);
        cat.setBackground(Color.WHITE);
        add(cat);

        
        // Income //
        JLabel income = new JLabel("Income:  ");
        income.setFont(new Font("Raleway", Font.BOLD, 15 ));
        income.setBounds(80, 220, 400, 20);
        add(income);

        String valincome[] = {"Null", ">10k-50k", "50k-90k", ">1 lakh"};
        incom = new JComboBox(valincome);
        incom.setFont(new Font("Raleway", Font.BOLD, 15));
        incom.setBounds(320, 220, 400, 20);
        incom.setBackground(Color.WHITE);
        add(incom);


        // Educational details //
        JLabel edudetails = new JLabel("Educational Qualifications: ");
        edudetails.setFont(new Font("Raleway", Font.BOLD, 15 ));
        edudetails.setBounds(80, 260, 350, 20);
        add(edudetails);

        String edudetail[] = {"10th Pass", "12th Pass", "Graduated", "Other"};
        edudt = new JComboBox(edudetail);
        edudt.setFont(new Font("Raleway", Font.BOLD, 15));
        edudt.setBounds(320, 260, 400, 20);
        edudt.setBackground(Color.WHITE);
        add(edudt);

    
        // Occupation //
        JLabel occupation = new JLabel("Occupation: ");
        occupation.setFont(new Font("Raleway", Font.BOLD, 15 ));
        occupation.setBounds(80, 300, 400, 20);
        add(occupation);

        String occdetails[] = {"Student", "Business", "Service", "Farmer", "Other"};
        occdetail = new JComboBox(occdetails);
        occdetail.setFont(new Font("Raleway", Font.BOLD, 15));
        occdetail.setBounds(320, 300, 400, 20);
        occdetail.setBackground(Color.WHITE);
        add(occdetail);


        
        // PAN NUMBER //
        JLabel panNum = new JLabel("PAN Number: ");
        panNum.setFont(new Font("Raleway", Font.BOLD, 15 ));
        panNum.setBounds(80, 340, 400, 20);
        add(panNum);

        panNumTextField = new JTextField();
        panNumTextField.setBounds(320, 340, 400, 22);
        panNumTextField.setFont(new Font("Arial", Font.BOLD, 15));
        add(panNumTextField);

        
        // Adhaar Number//
        JLabel adhaar = new JLabel("Adhaar Number: ");
        adhaar.setFont(new Font("Raleway", Font.BOLD, 15 ));
        adhaar.setBounds(80, 380, 400, 20);
        add(adhaar);

        adhaarTextField = new JTextField();
        adhaarTextField.setBounds(320, 380, 400, 22);
        adhaarTextField.setFont(new Font("Arial", Font.BOLD, 15));
        add(adhaarTextField);

        // Senior Citizen //
        JLabel srcitizen = new JLabel("Senior Citizen: ");
        srcitizen.setFont(new Font("Raleway", Font.BOLD, 15 ));
        srcitizen.setBounds(80, 420, 400, 20);
        add(srcitizen);

        yes = new JRadioButton("Yes");
        yes.setFont(new Font("Raleway", Font.BOLD, 15 ));
        yes.setBounds(320, 420, 80, 20);
        yes.setBackground(Color.WHITE);
        add(yes);

        no = new JRadioButton("No");
        no.setFont(new Font("Raleway", Font.BOLD, 15 ));
        no.setBounds(420, 420, 80, 20);
        no.setBackground(Color.WHITE);
        add(no);

        ButtonGroup scButton = new ButtonGroup();
        scButton.add(yes);
        scButton.add(no);

        // Existing account //
        JLabel existacc = new JLabel("Existing Account: ");
        existacc.setFont(new Font("Raleway", Font.BOLD, 15 ));
        existacc.setBounds(80, 460, 400, 20);
        add(existacc);

        yes = new JRadioButton("Yes");
        yes.setFont(new Font("Raleway", Font.BOLD, 15 ));
        yes.setBounds(320, 460, 80, 20);
        yes.setBackground(Color.WHITE);
        add(yes);

        no = new JRadioButton("No");
        no.setFont(new Font("Raleway", Font.BOLD, 15 ));
        no.setBounds(420, 460, 80, 20);
        no.setBackground(Color.WHITE);
        add(no);

        ButtonGroup exaccButton = new ButtonGroup();
        exaccButton.add(yes);
        exaccButton.add(no);

        // NEXT Button //
        next = new JButton("Next");
        next.setBounds(620, 550, 80, 22);
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setFont(new Font("Raleway", Font.BOLD, 16));
        next.addActionListener(this);
        add(next);

        // PREVIOUS BUTTON //
        prev = new JButton("Previous");
        prev.setBounds(80, 550, 120, 22);
        prev.setBackground(Color.BLACK);
        prev.setForeground(Color.WHITE);
        prev.setFont(new Font("Raleway", Font.BOLD, 16));
        prev.addActionListener(this);
        add(prev);


        // Frame Background //
        getContentPane().setBackground(Color.WHITE);
        setSize(850, 800); 
        setLocation(350, 10);
        setVisible(true);

    }
    public void actionPerformed(ActionEvent ae) {

        if (ae.getSource() == prev ){

            setVisible(false);
            new SignupOne().setVisible(true);  
            } 

        String religion = (String) rel.getSelectedItem();
        String category = (String) cat.getSelectedItem();
        String income = (String) incom.getSelectedItem();
        String edudetails = (String) edudt.getSelectedItem();
        String occupation = (String) occdetail.getSelectedItem();

        String panNum = panNumTextField.getText();
        String adhaar = adhaarTextField.getText();
        

        String srcitizen = null;
        if (yes.isSelected()) {
            srcitizen = "Yes";
        } else if (no.isSelected()) {
            srcitizen = "No";
        } 

        String existacc = null;
        if (yes.isSelected()) {
            existacc = "Yes";
        } else if (no.isSelected()) {
            existacc = "No";
        }

        try {
            if (panNum.equals("")) {
                JOptionPane.showMessageDialog(null, "PAN Number is required");
            
            } else if (adhaar.equals("")) {
                JOptionPane.showMessageDialog(null, "Adhaar Number is required");

            } else {
                Conn c= new Conn(); 
                String query = "insert into signuptwo values('"+formno+"', '"+religion+"', '"+category+"', '"+income+"', '"+edudetails+"', '"+occupation+"', '"+panNum+"', '"+adhaar+"', '"+srcitizen+"', '"+existacc+"')"; 
                c.s.executeUpdate(query);
            }
        // Signup-3  OBJECT //

        setVisible(false);
        new SignupThree(formno).setVisible(true);
        

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        
        new SignupTwo("");
    }
}
