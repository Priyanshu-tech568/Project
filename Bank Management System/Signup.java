package bank.management.system;
import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Signup extends JFrame implements ActionListener {
    Random ran = new Random();
    long first4 = (ran.nextLong()%9000L)+1000L;
    String first = " " + Math.abs(first4);

    JTextField textName,textFname, textEmail,textAddress,textCity,textPin,textState;
    JDateChooser dateChooser;
    JRadioButton rButton1,rButton2,rButton3,rButton4;
    JButton next;

    Signup(){
    super("Application Form");

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100,100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(25,10,100,100);
        add(image);

        JLabel label1 = new JLabel("Application Form No." + first);
        label1.setBounds(160,20,600,40);
        label1.setFont(new Font("Raleway",Font.BOLD,38));
        add(label1);

        JLabel label2 = new JLabel("Page 1");
        label2.setFont(new Font("Raleway", Font.BOLD,22));
        label2.setBounds(330,70,600,30);
        add(label2);

        JLabel label3 = new JLabel("Personal Details");
        label3.setFont(new Font("Raleway", Font.BOLD,22));
        label3.setBounds(290,90,600,30);
        add(label3);
//name
        JLabel labelName = new JLabel("Name :");
        labelName.setFont(new Font("Raleway", Font.BOLD,20));
        labelName.setBounds(100,190,100,30);
        add(labelName);

        textName = new JTextField();
        textName.setFont(new Font("Raleway",Font.BOLD,14));
        textName.setBounds(300,190,400,30);
        add(textName);
//father's name
        JLabel labelFname = new JLabel("Father's Name :");
        labelFname.setBounds(100,240,200,30);
        labelFname.setFont(new Font("Raleway",Font.BOLD,20));
        add(labelFname);

        textFname = new JTextField();
        textFname.setBounds(300,240,400,30);
        textFname.setFont(new Font("Raleway",Font.BOLD,14));
        add(textFname);
//date of birth
        JLabel labelDob = new JLabel("Date Of Birth :");
        labelDob.setBounds(100,340,200,30);
        labelDob.setFont(new Font("Raleway",Font.BOLD,20));
        add(labelDob);

        dateChooser = new JDateChooser();
        dateChooser.setForeground(new Color(105,105,105));
        dateChooser.setBounds(300,340,400,30);
        add(dateChooser);
//gender
        JLabel labelGender = new JLabel("Gender");
        labelGender.setBounds(100,290,200,30);
        labelGender.setFont(new Font("Raleway",Font.BOLD,20));
        add(labelGender);
        rButton1 = new JRadioButton("Male");
        rButton1.setFont(new Font("Raleway", Font.BOLD,14));
        rButton1.setBounds(300,290,60,30);
        rButton1.setBackground(new Color(222,255,228));
        add(rButton1);

        rButton2 = new JRadioButton("Female");
        rButton2.setFont(new Font("Raleway", Font.BOLD,14));
        rButton2.setBounds(450,290,90,30);
        rButton2.setBackground(new Color(222,255,228));
        add(rButton2);

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(rButton1);
        buttonGroup.add(rButton2);
// email
        JLabel labelEmail = new JLabel("Email Address");
        labelEmail.setFont(new Font("Raleway",Font.BOLD,20));
        labelEmail.setBounds(100,390,200,30);
        add(labelEmail);

        textEmail = new JTextField();
        textEmail.setBounds(300,390,400,30);
        textEmail.setFont(new Font("Raleway",Font.BOLD,14));
        add(textEmail);
//marriage status
        JLabel labelMs = new JLabel("Marital Status");
        labelMs.setFont(new Font("Raleway",Font.BOLD,20));
        labelMs.setBounds(100,440,200,30);
        add(labelMs);

        rButton3 = new JRadioButton("Married");
        rButton3.setFont(new Font("Raleway", Font.BOLD,14));
        rButton3.setBounds(300,440,100,30);
        rButton3.setBackground(new Color(222,255,228));
        add(rButton3);

        rButton4 = new JRadioButton("Unmarried");
        rButton4.setFont(new Font("Raleway", Font.BOLD,14));
        rButton4.setBounds(450,440,100,30);
        rButton4.setBackground(new Color(222,255,228));
        add(rButton4);

        ButtonGroup buttonGroup1 = new ButtonGroup();
        buttonGroup1.add(rButton3);
        buttonGroup1.add(rButton4);

//Address
        JLabel labelAddress = new JLabel("Address");
        labelAddress.setFont(new Font("Raleway",Font.BOLD,20));
        labelAddress.setBounds(100,490,200,30);
        add(labelAddress);

        textAddress = new JTextField();
        textAddress.setBounds(300,490,400,30);
        textAddress.setFont(new Font("Raleway",Font.BOLD,14));
        add(textAddress);
//city
        JLabel labelCity = new JLabel("City");
        labelCity.setFont(new Font("Raleway",Font.BOLD,20));
        labelCity.setBounds(100,540,200,30);
        add(labelCity);

        textCity = new JTextField();
        textCity.setBounds(300,540,400,30);
        textCity.setFont(new Font("Raleway",Font.BOLD,14));
        add(textCity);
//pincode
        JLabel labelPin = new JLabel("Pin");
        labelPin.setFont(new Font("Raleway",Font.BOLD,20));
        labelPin.setBounds(100,590,200,30);
        add(labelPin);

        textPin = new JTextField();
        textPin.setBounds(300,590,400,30);
        textPin.setFont(new Font("Raleway",Font.BOLD,14));
        add(textPin);
//state
        JLabel labelState = new JLabel("State");
        labelState.setFont(new Font("Raleway",Font.BOLD,20));
        labelState.setBounds(100,640,200,30);
        add(labelState);

        textState = new JTextField();
        textState.setBounds(300,640,400,30);
        textState.setFont(new Font("Raleway",Font.BOLD,14));
        add(textState);
//next Button

        next = new JButton("Next");
        next.setFont(new Font("Raleway",Font.BOLD,14));
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setBounds(620,710,80,30);
        next.addActionListener(this);
        add(next);

        getContentPane().setBackground(new Color(222,255,228));
        setLayout(null);
        setSize(850,800);
        setLocation(360,40);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String formno = first;
        String name = textName.getText();
        String fname = textFname.getText();
        String dob = ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
        String gender = null;
        if(rButton1.isSelected()){
            gender = "Male";
        } else if (rButton2.isSelected()) {
            gender = "Female";
        }
        String email = textEmail.getText();
        String marital = null;
        if(rButton3.isSelected()){
            marital = "Married";
        } else if (rButton4.isSelected()) {
            marital = "Unmarried";
        }
        String address = textAddress.getText();
        String city = textCity.getText();
        String pincode = textPin.getText();
        String state = textState.getText();

        try{
            if(textName.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Fill all the fields");
            }else{
                Connect connect1 = new Connect();
                String q = "insert into Signup values('"+formno+"','"+name+"','"+fname+"','"+dob+"','"+gender+"','"+email+"','"+marital+"','"+address+"', '"+city+"','"+pincode+"','"+state+"')";
                connect1.statement.executeUpdate(q);
                new Signup2(formno);
                setVisible(false);
            }

        }catch (Exception E){
            E.printStackTrace();

        }
    }

    public static void main(String[] args) {
    new Signup();
    }
}
