//NAME AND REG NUMBER OF MEMBERS
//MUTABAZI STYVE ARTHUR  18/101/BIT-J
//ANGELLA  KEMBABAZI 19/UG/686/BSCS-S 
package org.iuea.oop.views;
import java.awt.Color;
import java.awt.Font;
import java.awt.color.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import static sun.security.jgss.GSSUtil.login;
public class loginView extends JFrame {
    


public static void main(String[]args) {
	
	JFrame frame1=new JFrame();
	  JPanel pan1=new JPanel();
	  
	  pan1.setBounds(0,0,100,100);
	  pan1.setBackground(Color.BLUE);
	  
	  JLabel label1=new JLabel("SIgnIn");
	  label1.setBounds(260, 60, 200, 20);
	  label1.setFont(new Font("Calibri",Font.BOLD,23));
	  
	  JLabel Label2=new JLabel("Password");
	  Label2.setBounds(80, 150, 150, 20);
	  Label2.setFont(new Font("calibri",Font.BOLD,17));
	  
	  JLabel label3=new JLabel("UserName");
	  label3.setBounds(80,100,200,20);
	  label3.setFont(new Font("calibri",Font.BOLD,17));
	  
	  JTextField Textfield2=new JTextField();
	  Textfield2.setBounds(300, 100, 190, 30); 
	  
	  JPasswordField JPasswordField2=new JPasswordField();
	  JPasswordField2.setBounds(300, 150, 190, 30);
	  
	  JButton button1=new JButton("cancel");
	  button1.setBounds(150, 260, 100, 30);
	  
	  JButton button2=new JButton("login");
	  button2.setBounds(300, 260, 100, 30);
          button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if(Textfield2.getText().isEmpty()||Textfield2.getText().isEmpty()){
                    JOptionPane.showMessageDialog(null, "please fill all fields."+"!");
                }else if(Textfield2.getText().equals("admin")&& JPasswordField2.getText().equals("123456")){
                    JOptionPane.showMessageDialog(null, "login success");
                }else{
                    JOptionPane.showMessageDialog(null,"incorrect username or password"+"!");
                }
                
            }
        });{
    
}
	  
	  
	
	  //add labels
	  frame1.add(label3);
	  frame1.add(Label2);
	  //add TextField
	  frame1.add(Textfield2);
	  frame1.add(JPasswordField2);
	  //add button
	  frame1.add(button1);
	  frame1.add(button2);
	  //add label
	  frame1.add(label1);
	  //add panel
	  frame1.add(pan1);
	  frame1.add(pan1);
	  
      frame1.setVisible(true);
	  frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	  frame1.setSize(600,400);
	  frame1.setLayout(null);
	
}
	
}

