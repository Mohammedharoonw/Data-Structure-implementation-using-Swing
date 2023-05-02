package array;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Array extends JFrame {

	private JPanel contentPane;
	private JTextField length;
	private JTextField element;
	private JTextField insertpos;
	private JTextField dpos;
	private JTextField tfr;
	private int arr[];
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Array frame = new Array();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Array() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 868, 695);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(192, 192, 192));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Array Data Structure");
		lblNewLabel.setForeground(new Color(0, 0, 128));
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 30));
		lblNewLabel.setBounds(258, 28, 269, 35);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Enter Array Length");
		lblNewLabel_1.setForeground(new Color(128, 0, 0));
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 25));
		lblNewLabel_1.setBounds(44, 133, 205, 30);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Enter an Integer Element");
		lblNewLabel_1_1.setForeground(new Color(128, 0, 0));
		lblNewLabel_1_1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 25));
		lblNewLabel_1_1.setBounds(44, 245, 266, 30);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Enter the Position");
		lblNewLabel_1_1_1.setForeground(new Color(128, 0, 0));
		lblNewLabel_1_1_1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 25));
		lblNewLabel_1_1_1.setBounds(44, 361, 189, 30);
		contentPane.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Position");
		lblNewLabel_1_1_1_1.setForeground(new Color(128, 0, 0));
		lblNewLabel_1_1_1_1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 25));
		lblNewLabel_1_1_1_1.setBounds(569, 245, 86, 30);
		contentPane.add(lblNewLabel_1_1_1_1);
		
		length = new JTextField();
		length.setBounds(356, 133, 260, 30);
		contentPane.add(length);
		length.setColumns(10);
		
		element = new JTextField();
		element.setColumns(10);
		element.setBounds(339, 245, 216, 30);
		contentPane.add(element);
		
		insertpos = new JTextField();
		insertpos.setColumns(10);
		insertpos.setBounds(665, 250, 168, 30);
		contentPane.add(insertpos);
		
		dpos = new JTextField();
		dpos.setColumns(10);
		dpos.setBounds(284, 361, 271, 30);
		contentPane.add(dpos);
		
		tfr = new JTextField();
		tfr.setColumns(10);
		tfr.setBounds(195, 562, 421, 30);
		contentPane.add(tfr);
		
		JButton btnNewButton = new JButton("Create Array");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//logic to create array
				int size=Integer.valueOf(length.getText());
				arr=new int[size];
				String message="Array of Length " + size + " Created ";
				JOptionPane.showMessageDialog(contentPane, message);
			}
		});
		btnNewButton.setForeground(new Color(0, 64, 0));
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 25));
		btnNewButton.setBounds(640, 129, 167, 39);
		contentPane.add(btnNewButton);
		
		JButton btnInsert = new JButton("Insert");
		btnInsert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//logic for Insert
				int elem=Integer.valueOf(element.getText());
				int pos=Integer.valueOf(insertpos.getText());
				if(pos<arr.length) {
					JOptionPane.showMessageDialog(contentPane, "element inserted @ position " + pos);
					arr[pos]=elem;
				}
				else {
					JOptionPane.showMessageDialog(contentPane, "Insertion not possible");
					
				}
				element.setText("");
				insertpos.setText("");
			}
		});
		btnInsert.setForeground(new Color(0, 64, 0));
		btnInsert.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 25));
		btnInsert.setBounds(474, 298, 167, 39);
		contentPane.add(btnInsert);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//logic for delete
				int pos=Integer.valueOf(dpos.getText());
				arr[pos]=0;
				String message = "Element deleted at the position " + pos;
				JOptionPane.showMessageDialog(contentPane, message);
				dpos.setText("");
			}
		});
		btnDelete.setForeground(new Color(0, 64, 0));
		btnDelete.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 25));
		btnDelete.setBounds(620, 352, 167, 39);
		contentPane.add(btnDelete);
		
		JButton btnDisplay = new JButton("Display");
		btnDisplay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String msg=" ";
				for(int i=0; i<arr.length; i++)
				{
					msg=msg+" "+arr[i];
				}
				tfr.setText(msg);
			}
		});
		btnDisplay.setForeground(new Color(0, 64, 0));
		btnDisplay.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 25));
		btnDisplay.setBounds(339, 470, 167, 39);
		contentPane.add(btnDisplay);
	}
}
