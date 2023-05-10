package ECE_DB1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class login {

	private JFrame frame;
	private JTextField a1;
	private JPasswordField ps;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					login window = new login();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(211, 211, 211));
		frame.setBounds(100, 100, 584, 461);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("LOGIN");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblNewLabel.setBounds(224, 34, 91, 55);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel t1 = new JLabel("NAME");
		t1.setBackground(new Color(211, 211, 211));
		t1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		t1.setBounds(66, 171, 78, 25);
		frame.getContentPane().add(t1);
		
		JLabel t2 = new JLabel("PASSWORD");
		t2.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		t2.setBounds(62, 232, 129, 25);
		frame.getContentPane().add(t2);
		
		JButton btnNewButton = new JButton("ENTER");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name=a1.getText();
				String name1=ps.getText();
				JOptionPane.showMessageDialog(btnNewButton, name+name1+" Done");
			}
		});
		btnNewButton.setFont(new Font("Verdana", Font.BOLD, 22));
		btnNewButton.setBounds(224, 324, 129, 37);
		frame.getContentPane().add(btnNewButton);
		
		a1 = new JTextField();
		a1.setBounds(246, 171, 149, 25);
		frame.getContentPane().add(a1);
		a1.setColumns(10);
		
		ps = new JPasswordField();
		ps.setBounds(246, 232, 149, 25);
		frame.getContentPane().add(ps);
	}

	public void setVisible(boolean b) {
		// TODO Auto-generated method stub
		frame.setVisible(true);
	}
}
