package ECE_DB1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import java.awt.Component;

import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class reigistration {

	private JFrame frame;
	private JTextField t2;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					reigistration window = new reigistration();
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
	public reigistration() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(119, 136, 153));
		frame.setBounds(100, 100, 604, 476);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Registration");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(206, 31, 135, 49);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Name");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(86, 145, 61, 22);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Password");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_2.setBounds(83, 194, 88, 27);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Email id");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_3.setBounds(83, 254, 76, 22);
		frame.getContentPane().add(lblNewLabel_3);
		
		t2 = new JTextField();
		t2.setBounds(189, 149, 172, 27);
		frame.getContentPane().add(t2);
		t2.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(189, 200, 172, 27);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(189, 255, 172, 27);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JButton t1 = new JButton("Submit");
		t1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name=t2.getText();
				JOptionPane.showMessageDialog(t1, name+" Done");
				login n=new login();
				n.setVisible(true);
				frame.setVisible(false);
						
			}
		});
		t1.setFont(new Font("Tahoma", Font.PLAIN, 19));
		t1.setBounds(161, 346, 135, 31);
		frame.getContentPane().add(t1);
	}
}
