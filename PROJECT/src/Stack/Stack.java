package Stack;

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

public class Stack extends JFrame {

	private JPanel contentPane;
	private JTextField sizefield;
	private JTextField element;
	private JTextField tfr;
	private int s[];
	private int size;
	private int top=-1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Stack frame = new Stack();
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
	public Stack() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 919, 753);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(192, 192, 192));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Stack DataStructure");
		lblNewLabel.setForeground(new Color(0, 0, 160));
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 30));
		lblNewLabel.setBounds(320, 26, 258, 35);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Enter Stack Size");
		lblNewLabel_1.setForeground(new Color(128, 0, 0));
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 30));
		lblNewLabel_1.setBounds(10, 131, 208, 35);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Enter Stack Size");
		lblNewLabel_1_1.setForeground(new Color(128, 0, 0));
		lblNewLabel_1_1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 30));
		lblNewLabel_1_1.setBounds(10, 304, 208, 35);
		contentPane.add(lblNewLabel_1_1);
		
		sizefield = new JTextField();
		sizefield.setBounds(334, 131, 476, 33);
		contentPane.add(sizefield);
		sizefield.setColumns(10);
		
		element = new JTextField();
		element.setColumns(10);
		element.setBounds(334, 311, 476, 33);
		contentPane.add(element);
		
		tfr = new JTextField();
		tfr.setColumns(10);
		tfr.setBounds(10, 623, 816, 33);
		contentPane.add(tfr);
		
		JButton btnNewButton = new JButton("Create Stack");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			//logic for creation
				size=Integer.valueOf(sizefield.getText());
				s=new int [size];
				String  message = "Stack of size " + size + " Created";
				JOptionPane.showMessageDialog(contentPane, message);
				
			}
		});
		btnNewButton.setForeground(new Color(0, 64, 0));
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 30));
		btnNewButton.setBounds(184, 217, 193, 43);
		contentPane.add(btnNewButton);
		
		JButton btnPush = new JButton("Push");
		btnPush.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			//logic for push
				int elem;
				if(top==size-1)
				{
					JOptionPane.showMessageDialog(contentPane, "Pust is not possible");
				}
				else
				{
					elem=Integer.valueOf(element.getText());
					++top;
					s[top]=elem;
					String msg="Push succesful @ position "+ top;
					JOptionPane.showInternalMessageDialog(contentPane, msg);
					element.setText("");
				}
			}
		});
		btnPush.setForeground(new Color(0, 64, 0));
		btnPush.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 30));
		btnPush.setBounds(184, 382, 193, 43);
		contentPane.add(btnPush);
		
		JButton btnNewButton_1_1 = new JButton("POP");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			//logic for pop
				if(top==-1)
				{
					JOptionPane.showMessageDialog(contentPane, "Pop not possible");
				}
				else
				{
					String message = "Element deleted is "+s[top];
					JOptionPane.showMessageDialog(contentPane, message);
					--top;
				}
			}
		});
		btnNewButton_1_1.setForeground(new Color(0, 64, 0));
		btnNewButton_1_1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 30));
		btnNewButton_1_1.setBounds(184, 462, 193, 43);
		contentPane.add(btnNewButton_1_1);
		
		JButton btnNewButton_1_1_1 = new JButton("Display");
		btnNewButton_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			//logic for Display
				String msg="";
				if(top==-1)
				{
					JOptionPane.showMessageDialog(contentPane, "Display not possible");
				}
				else
				{
					for(int i=top; i>=0; i--)
					{
						msg=msg+" "+s[i];
					}
					tfr.setText(msg);
				}
			}
		});
		btnNewButton_1_1_1.setForeground(new Color(0, 64, 0));
		btnNewButton_1_1_1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 30));
		btnNewButton_1_1_1.setBounds(184, 546, 193, 43);
		contentPane.add(btnNewButton_1_1_1);
	}

}
