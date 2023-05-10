package ECE_DB1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ticket {

	private JFrame frame;
	private JTextField t1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ticket window = new ticket();
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
	public ticket() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 557, 412);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("hyd metro booking");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 23));
		lblNewLabel.setBounds(116, 11, 203, 38);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Name");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblNewLabel_1.setBounds(10, 90, 64, 27);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("From\r\n");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblNewLabel_2.setBounds(10, 144, 64, 38);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("To");
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblNewLabel_2_1.setBounds(10, 205, 64, 38);
		frame.getContentPane().add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_3 = new JLabel("No of Ticktes");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblNewLabel_3.setBounds(10, 280, 113, 27);
		frame.getContentPane().add(lblNewLabel_3);
		
		JComboBox c1 = new JComboBox();
		c1.setModel(new DefaultComboBoxModel(new String[] {"stations", "Lb nagar", "dlishuknagar ", "miyapur"}));
		c1.setBounds(196, 157, 86, 22);
		frame.getContentPane().add(c1);
		
		t1 = new JTextField();
		t1.setBounds(196, 98, 86, 20);
		frame.getContentPane().add(t1);
		t1.setColumns(10);
		
		JComboBox c2 = new JComboBox();
		c2.setModel(new DefaultComboBoxModel(new String[] {"stations", "Lb nagar", "dlishuknagar ", "miyapur"}));
		c2.setBounds(196, 218, 86, 22);
		frame.getContentPane().add(c2);
		
		JComboBox t2 = new JComboBox();
		t2.setModel(new DefaultComboBoxModel(new String[] {"stations", "1", "2", "3", "4", "5", "6", "7", "8", "9"}));
		t2.setBounds(196, 286, 86, 22);
		frame.getContentPane().add(t2);
		
		JButton btnNewButton = new JButton("BOOK\r\n");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name=t1.getText();
				String fs=(String)c1.getSelectedItem();
				String ts=(String)c2.getSelectedItem();
				String t=(String)t2.getSelectedItem();
				int ticket = Integer.parseInt(t);
				int bill=0;
				if(fs== "miyapur" && ts=="miyapur") {
					JOptionPane.showMessageDialog(btnNewButton, ts+"invalid");
				}
				else if(fs=="miyapur" && ts=="Lb nagar") {
					bill=ticket*30;
					JOptionPane.showMessageDialog(btnNewButton,"hello"+name+"from"+fs+"to"+ts+"bill"+bill);
			
				}
				else {
					JOptionPane.showMessageDialog(btnNewButton, "done");
				}
				
			}
		});
		btnNewButton.setBounds(230, 339, 89, 23);
		frame.getContentPane().add(btnNewButton);
	}
}
