package SinglyLinkedList;

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

public class SinglyLinkedList extends JFrame {

	private JPanel contentPane;
	private JTextField elem1;
	private JTextField elem2;
	private JTextField tfr;
	private Node first;
	public class Node{
		int data;
		Node link;
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SinglyLinkedList frame = new SinglyLinkedList();
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
	public SinglyLinkedList() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 920, 761);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(192, 192, 192));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("SinglyLinkedList DataStructure");
		lblNewLabel.setForeground(new Color(0, 0, 160));
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 30));
		lblNewLabel.setBounds(238, 24, 404, 35);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Enter an Element");
		lblNewLabel_1.setForeground(new Color(128, 0, 0));
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 30));
		lblNewLabel_1.setBounds(10, 147, 226, 35);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Enter an Element");
		lblNewLabel_1_1.setForeground(new Color(128, 0, 0));
		lblNewLabel_1_1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 30));
		lblNewLabel_1_1.setBounds(10, 297, 226, 35);
		contentPane.add(lblNewLabel_1_1);
		
		elem1 = new JTextField();
		elem1.setBounds(306, 147, 333, 33);
		contentPane.add(elem1);
		elem1.setColumns(10);
		
		elem2 = new JTextField();
		elem2.setColumns(10);
		elem2.setBounds(306, 297, 333, 33);
		contentPane.add(elem2);
		
		tfr = new JTextField();
		tfr.setColumns(10);
		tfr.setBounds(10, 624, 854, 33);
		contentPane.add(tfr);
		
		JButton btnNewButton = new JButton("Insert Rear");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			//logic for Insert rear
				Node temp;
				int elem=Integer.valueOf(elem1.getText());
				Node newnode=new Node();
				newnode.data=elem;
				newnode.link=null;
				if(first==null)
				{
					first=newnode;
				}
				else
				{
					temp=first;
					while(temp.link!=null)
					{
						temp=temp.link;
					}
					temp.link=newnode;
				}
				String message="Element inserted succesful @ rear";
				JOptionPane.showMessageDialog(contentPane, message);
				elem1.setText("");
			}
		});
		btnNewButton.setForeground(new Color(0, 64, 0));
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 30));
		btnNewButton.setBounds(675, 147, 177, 43);
		contentPane.add(btnNewButton);
		
		JButton btnInsertFront = new JButton("Insert Front");
		btnInsertFront.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			//logic for insert front
				int ele=Integer.valueOf(elem2.getText());
				Node newnode=new Node();
				newnode.data=ele;
				newnode.link=null;
				if(first==null)
				{
					first=newnode;
				}
				else
				{
					newnode.link=first;
					first=newnode;
					JOptionPane.showMessageDialog(contentPane, "Element inserted successful @ front");
					elem2.setText("");
				}
			}
		});
		btnInsertFront.setForeground(new Color(0, 64, 0));
		btnInsertFront.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 30));
		btnInsertFront.setBounds(675, 297, 189, 43);
		contentPane.add(btnInsertFront);
		
		JButton btnDeleteRear = new JButton("Delete Rear");
		btnDeleteRear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			//Delete Rear
				Node temp;
				if(first==null)
				{
					String msg="Deletion not possible";
					JOptionPane.showMessageDialog(contentPane, msg);
					
				}
				else if(first.link==null)
				{
					String msg="Element deleted is " + first.data;
					first=null;
					JOptionPane.showMessageDialog(contentPane, msg);
				}
				else
				{
					temp=first;
					while(temp.link.link!=null)
					{
						temp=temp.link;
					}
					String msg="Element deleted is"+temp.link.data;
					temp.link=null;
					JOptionPane.showMessageDialog(contentPane, msg);
				}
			}
		});
		btnDeleteRear.setForeground(new Color(0, 64, 0));
		btnDeleteRear.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 30));
		btnDeleteRear.setBounds(173, 398, 181, 43);
		contentPane.add(btnDeleteRear);
		
		JButton btnDeleteFront = new JButton("Delete Front");
		btnDeleteFront.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			//logic for delete front
				if(first==null)
				{
					JOptionPane.showMessageDialog(contentPane, "Deletion not possible");
				}
				else if(first.link==null)
				{
					JOptionPane.showMessageDialog(contentPane, "Element deleted is" + first.data);
					first=null;
				}
				else
				{
					JOptionPane.showMessageDialog(contentPane, "Element deleted is"+first.data);
					first=first.link;
				}
			}
		});
		btnDeleteFront.setForeground(new Color(0, 64, 0));
		btnDeleteFront.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 30));
		btnDeleteFront.setBounds(575, 398, 193, 43);
		contentPane.add(btnDeleteFront);
		
		JButton btnDisplay = new JButton("Display");
		btnDisplay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			//logic for Display
				String msg="";
				Node temp;
				if(first==null)
				{
					JOptionPane.showMessageDialog(contentPane, "Display is not possible");
				}
				else if(first.link==null)
				{
					String message = "Display element is "+first.data;
					JOptionPane.showMessageDialog(contentPane, message);
					tfr.setText(msg);
				}
				else
				{
					temp=first;
					while(temp!=null)
					{
						msg=msg+temp.data+" ";
						temp=temp.link;
					}
					tfr.setText(msg);
				}
			}
		});
		btnDisplay.setForeground(new Color(0, 64, 0));
		btnDisplay.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 30));
		btnDisplay.setBounds(368, 523, 193, 43);
		contentPane.add(btnDisplay);
	}

}
