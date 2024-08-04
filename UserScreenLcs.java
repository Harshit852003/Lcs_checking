//package com.Technicalproject.views;

//import static com.Technicalproject.views.LSCS2.lcs;

import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class UserScreenLcs extends LCS2{

	private JFrame INPUT;
	private JTextField firststringtxtf;
	private JTextField secondstringtxtf;
	private JTextField resulttxtf;

	public static void main(String[] args) {
		UserScreenLcs window = new UserScreenLcs();

	}
	
	private void submission()
	{
		LCS2 ll=new LCS2();
		String str1=firststringtxtf.getText();
		String str2=secondstringtxtf.getText();
	    resulttxtf.setText(lcs(str1,str2));
	    resulttxtf.getText();
	}

	public UserScreenLcs(){
		INPUT = new JFrame();
		INPUT.getContentPane().setForeground(new Color(255, 0, 0));
		INPUT.getContentPane().setBackground(new Color(128, 0, 255));
		INPUT.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Bimal K Das\\OneDrive\\Pictures\\Saved Pictures\\dit university.png"));
		INPUT.setFont(new Font("Dialog", Font.BOLD, 18));
		INPUT.setTitle("INPUT");
		INPUT.setBounds(100, 100, 905, 485);
		INPUT.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		INPUT.getContentPane().setLayout(null);
		
		JLabel firststringlbl = new JLabel("First String");
		firststringlbl.setFont(new Font("Tahoma", Font.BOLD, 18));
		firststringlbl.setBounds(175, 87, 162, 39);
		INPUT.getContentPane().add(firststringlbl);
		
		JLabel secondstringlbl = new JLabel("Second String");
		secondstringlbl.setFont(new Font("Tahoma", Font.BOLD, 18));
		secondstringlbl.setBounds(175, 181, 148, 39);
		INPUT.getContentPane().add(secondstringlbl);
		
		firststringtxtf = new JTextField();
		firststringtxtf.setFont(new Font("Tahoma", Font.BOLD, 20));
		firststringtxtf.setBounds(414, 87, 301, 42);
		INPUT.getContentPane().add(firststringtxtf);
		firststringtxtf.setColumns(10);
		
		secondstringtxtf = new JTextField();
		secondstringtxtf.setFont(new Font("Tahoma", Font.BOLD, 20));
		secondstringtxtf.setBounds(414, 181, 301, 42);
		INPUT.getContentPane().add(secondstringtxtf);
		secondstringtxtf.setColumns(10);
		
		JButton submitbtn = new JButton("SUBMIT");
		submitbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				submission();
				
				
			}
		});
		submitbtn.setForeground(new Color(255, 255, 128));
		submitbtn.setBackground(new Color(255, 0, 255));
		submitbtn.setFont(new Font("Tahoma", Font.BOLD, 18));
		submitbtn.setBounds(242, 277, 148, 39);
		INPUT.getContentPane().add(submitbtn);
		
		JLabel resultlbl = new JLabel("RESULT");
		resultlbl.setFont(new Font("Tahoma", Font.BOLD, 18));
		resultlbl.setBounds(183, 364, 88, 32);
		INPUT.getContentPane().add(resultlbl);
		
		resulttxtf = new JTextField();
		resulttxtf.setFont(new Font("Tahoma", Font.BOLD, 20));
		resulttxtf.setBounds(414, 361, 301, 35);
		INPUT.getContentPane().add(resulttxtf);
		resulttxtf.setColumns(10);
		
		JLabel lcslabel = new JLabel("LCS CHECKING");
		lcslabel.setFont(new Font("Tahoma", Font.BOLD, 22));
		lcslabel.setBounds(272, 10, 236, 39);
		INPUT.getContentPane().add(lcslabel);
		INPUT.setVisible(true);
	}
	


}