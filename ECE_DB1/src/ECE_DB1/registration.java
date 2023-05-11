package ECE_DB1;

import java.awt.EventQueue;
import java.sql.*;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import java.awt.Color;
import javax.swing.JTable;

public class registration {

	private JFrame frame;
	private JTextField t1;
	private JTextField t2;
	private JTable table;
	private JTable table_1;
	private JTable table_2;
	private JTable table_3;
	private JTable tb;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					registration window = new registration();
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
	public registration() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(192, 192, 192));
		frame.setBounds(100, 100, 803, 495);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("REGISTRATION");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(209, 11, 234, 34);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("NAME          :");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(35, 83, 76, 26);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("PASSWORD :");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_2.setBounds(35, 132, 107, 26);
		frame.getContentPane().add(lblNewLabel_2);
		
		t1 = new JTextField();
		t1.setBounds(190, 83, 234, 21);
		frame.getContentPane().add(t1);
		t1.setColumns(10);
		
		t2 = new JTextField();
		t2.setBounds(190, 137, 234, 21);
		frame.getContentPane().add(t2);
		t2.setColumns(10);
		
		JButton btnNewButton = new JButton("SUBMIT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                String n=t1.getText();
                String r=t2.getText();
               // String d=(String) c1.getSelectedItem();
                try {
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sandeep","root","mrec");
					String q="insert into registration values('"+n+"','"+r+"')";
					Statement sta=con.createStatement();
					sta.execute(q);
					con.close();
					JOptionPane.showMessageDialog(btnNewButton, "Done...!!");
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton.setBounds(66, 232, 136, 26);
		frame.getContentPane().add(btnNewButton);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(525, 154, 171, -20);
		frame.getContentPane().add(scrollPane);
		tb = new JTable();
		tb.setBounds(471, 92, 255, 223);
		frame.getContentPane().add(tb);
		JButton l = new JButton("LOAD");
		l.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con1=DriverManager.getConnection("jdbc:mysql://localhost:3306/sandeep","root","mrec");
					Statement sta=con1.createStatement();
					String q="select * from registration";
					
					ResultSet rs2=sta.executeQuery(q);
					ResultSetMetaData r=rs2.getMetaData();
					DefaultTableModel model=(DefaultTableModel) tb.getModel();
					int col=r.getColumnCount();
					String[] colName=new String[col];
					for(int i=0;i<col;i++) {
						colName[i]=r.getColumnName(i+1);
						model.setColumnIdentifiers(colName);
						String name;
						String marks;
						while(rs2.next()) {
							name=rs2.getString(1);
							marks=rs2.getString(2);
							String[] row= {name,marks};
							model.addRow(row);
						}
						sta.close();
					}
					con1.close();
					
				} catch (ClassNotFoundException | SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		l.setFont(new Font("Tahoma", Font.PLAIN, 30));
		l.setBounds(463, 351, 121, 34);
		frame.getContentPane().add(l);
		
		table = new JTable();
		table.setBounds(557, 92, 1, 1);
		frame.getContentPane().add(table);
		
		table_1 = new JTable();
		table_1.setBounds(542, 118, 1, 1);
		frame.getContentPane().add(table_1);
		
		table_2 = new JTable();
		table_2.setBounds(530, 209, 107, -90);
		frame.getContentPane().add(table_2);
		
		table_3 = new JTable();
		table_3.setBounds(525, 118, 1, 1);
		frame.getContentPane().add(table_3);
		
		
		
		JButton btnNewButton_1 = new JButton("CLEAR");
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnNewButton_1.setBounds(625, 351, 121, 34);
		frame.getContentPane().add(btnNewButton_1);
	}
}
