package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Signup2 extends JFrame implements ActionListener {
    String formno;
    JComboBox combobox1, combobox2,combobox3,combobox4,combobox5;
    JTextField textPan,textAadhar;
    JRadioButton r1,r2,r3,r4;
    JButton next;

    Signup2(String formno){
        super ("Application Form");

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(150,5,100,100);
        add(image);

        this.formno = formno;

        JLabel l1 = new JLabel("Page 2");
        l1.setFont(new Font("Raleway", Font.BOLD,22));
        l1.setBounds(300,30,600,40);
        add(l1);

        JLabel l2 = new JLabel("Application Details");
        l2.setFont(new Font("Raleway", Font.BOLD,22));
        l2.setBounds(300,60,600,40);
        add(l2);

//Form no
        JLabel l12 = new JLabel("Form No :");
        l12.setFont(new Font("Raleway", Font.BOLD,22));
        l12.setBounds(700,10,180,30);
        add(l12);

        JLabel l13 = new JLabel(formno);
        l13.setFont(new Font("Raleway", Font.BOLD,14));
        l13.setBounds(760,10,60,30);
        add(l13);

// religion
        JLabel l3 = new JLabel("Religion :");
        l3.setFont(new Font("Raleway", Font.BOLD,18));
        l3.setBounds(100,120,100,40);
        add(l3);

        String religion[] = {"Hinduism","Muslim","Sikh","Christan","Other"};
        combobox1 = new JComboBox(religion);
        combobox1.setBackground(new Color(252,208,76));
        combobox1.setFont(new Font("Raleway", Font.BOLD,14));
        combobox1.setBounds(350,120,320,30);
        add(combobox1);
//Category
        JLabel l4 = new JLabel("Category :");
        l4.setFont(new Font("Raleway", Font.BOLD,18));
        l4.setBounds(100,170,100,30);
        add(l4);

        String category[] = {"General","OBC","Sc","St","Other"};
        combobox2 = new JComboBox(category);
        combobox2.setBackground(new Color(252,208,76));
        combobox2.setFont(new Font("Raleway", Font.BOLD,14));
        combobox2.setBounds(350,170,320,30);
        add(combobox2);

//income
        JLabel l5 = new JLabel("Income :");
        l5.setFont(new Font("Raleway", Font.BOLD,18));
        l5.setBounds(100,220,100,30);
        add(l5);

        String income[] = {"Null","<1,50,000","<2,50,000","5,00,000 to 10,00,000","Above 10,00,000"};
        combobox3 = new JComboBox(income);
        combobox3.setBackground(new Color(252,208,76));
        combobox3.setFont(new Font("Raleway", Font.BOLD,14));
        combobox3.setBounds(350,220,320,30);
        add(combobox3);
// Education
        JLabel l6 = new JLabel("Educational :");
        l6.setFont(new Font("Raleway", Font.BOLD,18));
        l6.setBounds(100,270,150,30);
        add(l6);

        String educational[] = {"10th","12th","Graduation","Post Graduation","Doctorate","Other"};
        combobox4 = new JComboBox(educational);
        combobox4.setBackground(new Color(252,208,76));
        combobox4.setFont(new Font("Raleway", Font.BOLD,14));
        combobox4.setBounds(350,270,320,30);
        add(combobox4);
//occupation
        JLabel l7= new JLabel("Occupation :");
        l7.setFont(new Font("Raleway", Font.BOLD,18));
        l7.setBounds(100,320,150,30);
        add(l7);

        String occupation[] = {"Salaries","Self Employed","Business","Student","Retired","Other"};
        combobox5 = new JComboBox(occupation);
        combobox5.setBackground(new Color(252,208,76));
        combobox5.setFont(new Font("Raleway", Font.BOLD,14));
        combobox5.setBounds(350,320,320,30);
        add(combobox5);
//pan
        JLabel l8= new JLabel("pan No :");
        l8.setFont(new Font("Raleway", Font.BOLD,18));
        l8.setBounds(100,370,150,30);
        add(l8);

        textPan = new JTextField();
        textPan.setBounds(350,370,320,30);
        textPan.setFont(new Font("Raleway", Font.BOLD,18));
        add(textPan);
//aadhar
        JLabel l9= new JLabel("Aadhar No :");
        l9.setFont(new Font("Raleway", Font.BOLD,18));
        l9.setBounds(100,420,150,30);
        add(l9);

        textAadhar = new JTextField();
        textAadhar.setBounds(350,420,320,30);
        textAadhar.setFont(new Font("Raleway", Font.BOLD,18));
        add(textAadhar);
//senior citizen
        JLabel l10= new JLabel("Senior Citizen :");
        l10.setFont(new Font("Raleway", Font.BOLD,18));
        l10.setBounds(100,470,150,30);
        add(l10);

        r1 = new JRadioButton("Yes");
        r1.setFont(new Font("Raleway",Font.BOLD,14));
        r1.setBackground(new Color(252,208,76));
        r1.setBounds(350,470,100,30);
        add(r1);

        r2 = new JRadioButton("No");
        r2.setFont(new Font("Raleway",Font.BOLD,14));
        r2.setBackground(new Color(252,208,76));
        r2.setBounds(460,470,100,30);
        add(r2);
        ButtonGroup buttonGroup2 = new ButtonGroup();
        buttonGroup2.add(r1);
        buttonGroup2.add(r2);
//existing account
        JLabel l11= new JLabel("Existing Account :");
        l11.setFont(new Font("Raleway", Font.BOLD,18));
        l11.setBounds(100,520,180,30);
        add(l11);

        r3 = new JRadioButton("Yes");
        r3.setFont(new Font("Raleway",Font.BOLD,14));
        r3.setBackground(new Color(252,208,76));
        r3.setBounds(350,520,100,30);
        add(r3);

        r4 = new JRadioButton("No");
        r4.setFont(new Font("Raleway",Font.BOLD,14));
        r4.setBackground(new Color(252,208,76));
        r4.setBounds(460,520,100,30);
        add(r4);
        ButtonGroup buttonGroup3 = new ButtonGroup();
        buttonGroup3.add(r3);
        buttonGroup3.add(r3);
//next button
        next = new JButton("Next");
        next.setFont(new Font("Raleway",Font.BOLD,18));
        next.setBackground(Color.WHITE);
        next.setForeground(Color.BLACK);
        next.setBounds(570,640,100,30);
        next.addActionListener(this);
        add(next);








        setLayout(null);
        setSize(850,750);
        setLocation(450,80);
        getContentPane().setBackground(new Color(252,208,76));
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        String rel = (String) combobox1.getSelectedItem();
        String cate = (String) combobox2.getSelectedItem();
        String inc = (String) combobox3.getSelectedItem();
        String edu = (String) combobox4.getSelectedItem();
        String occ = (String) combobox5.getSelectedItem();

        String pan = textPan.getText();
        String aadhar = textAadhar.getText();

        String scitizen = " ";
        if(r1.isSelected()){
            scitizen = "Yes";
        }else if (r2.isSelected()){
            scitizen = "No";
        }

        String eaccount = " ";
        if(r3.isSelected()){
            eaccount = "Yes";
        }else if (r4.isSelected()){
            eaccount = "No";
        }
        try{
        if(textPan.getText().equals("") || textAadhar.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Fill all the fields");
        }else{
            Connect connect2 = new Connect();
            String q = "insert into Signuptwo values('"+formno+"','"+rel+"','"+cate+"','"+inc+"','"+edu+"','"+occ+"','"+pan+"','"+aadhar+"','"+scitizen+"','"+eaccount+"')";
            connect2.statement.executeUpdate(q);
            new Signup3(formno);
            setVisible(false);
        }
        }catch(Exception E){
        E.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Signup2("");

    }



}
