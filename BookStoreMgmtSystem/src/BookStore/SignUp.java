package BookStore;

import java.awt.event.*;
import java.sql.*;
import javax.swing.*;

public class SignUp {
	public static void main(String[] args) {
		Reg Log = new Reg();

	}
}

class Reg {
	Reg() {
		JFrame j = new JFrame("Sign Up");

		JLabel lname, lpsw, lUser, lemail;
		JTextField tfuser, tfname, tfemail;
		JPasswordField tfpsw, tfcpass;
		JButton btnreg, btnBack;

		// LABEL
		lname = new JLabel("Name : ");
		j.add(lname);
		lname.setBounds(100, 100, 100, 30);

		lUser = new JLabel("Username : ");
		j.add(lUser);
		lUser.setBounds(100, 140, 100, 30);

		lpsw = new JLabel("Password :");
		j.add(lpsw);
		lpsw.setBounds(100, 220, 100, 30);

		lpsw = new JLabel("Confirm Password:");
		j.add(lpsw);
		lpsw.setBounds(100, 260, 200, 30);

		lemail = new JLabel("Email : ");
		j.add(lemail);
		lemail.setBounds(100, 180, 100, 30);

		/// text fields

		tfname = new JTextField(30);
		j.add(tfname);
		tfname.setBounds(230, 110, 160, 20);

		tfuser = new JTextField(10);
		j.add(tfuser);
		tfuser.setBounds(230, 150, 160, 20);

		tfemail = new JTextField(30);
		j.add(tfemail);
		tfemail.setBounds(230, 185, 160, 20);

		tfpsw = new JPasswordField(30);
		j.add(tfpsw);
		tfpsw.setBounds(230, 225, 160, 20);

		tfcpass = new JPasswordField(30);
		j.add(tfcpass);
		tfcpass.setBounds(230, 265, 160, 20);

		btnBack = new JButton("Back");
		j.add(btnBack);
		btnBack.setBounds(200, 380, 150, 30);

		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Login();
				j.dispose();
			}
		});

		btnreg = new JButton("SignUp");
		j.add(btnreg);
		btnreg.setBounds(200, 340, 150, 30);

		// save action
		btnreg.addActionListener(new ActionListener() {

		public void actionPerformed(ActionEvent e) {


			String name = tfname.getText();
			String user = tfuser.getText();
			String psw = tfpsw.getText();
			String email = tfemail.getText();


			int value = userSignup(name,user,psw,email);

			if (value == 1){
			JOptionPane.showMessageDialog(j, " Congratulations!! you have successfully Signed up.");
			new Login();
			j.dispose();
			
			}else{
			JOptionPane.showMessageDialog(j, "Username Already Exist!");
			}
		}
		});

		j.setLayout(null);
		j.setSize(600, 600);
		j.setVisible(true);
		j.setDefaultCloseOperation(j.EXIT_ON_CLOSE);
		
		}
	DatabaseConnection db = new DatabaseConnection();
		public int userSignup(String name, String user,String psw, String email) {
		String query = "insert into Signup values('" + name + "','" + user + "','" + email + "','"
							+ psw + "')";
		

		try {
			int result = db.connection().executeUpdate(query);
			
			if(result>0)  {
	             return 1;
	         }
		} catch (SQLException e1) {

			e1.printStackTrace();
		}
		return 0;

	}

}

