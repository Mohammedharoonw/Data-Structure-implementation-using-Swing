package DoublyLinkedList;

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

public class DoublyLinkedList extends JFrame {

	private JPanel contentPane;
	private JTextField elem1;
	private JTextField elem2;
	private JTextField tfr;
	private Node first;
	public class Node{
		int data;
		Node nextlink;
		Node prelink;
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DoublyLinkedList frame = new DoublyLinkedList();
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
	public DoublyLinkedList() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 910, 765);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(192, 192, 192));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("DoublyLinkedList DataStructure");
		lblNewLabel.setForeground(new Color(0, 0, 128));
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 30));
		lblNewLabel.setBounds(286, 44, 415, 35);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Enter the Element");
		lblNewLabel_1.setForeground(new Color(128, 0, 0));
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 25));
		lblNewLabel_1.setBounds(38, 142, 190, 30);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Enter the Element");
		lblNewLabel_1_1.setForeground(new Color(128, 0, 0));
		lblNewLabel_1_1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 25));
		lblNewLabel_1_1.setBounds(38, 260, 190, 30);
		contentPane.add(lblNewLabel_1_1);
		
		elem1 = new JTextField();
		elem1.setBounds(321, 142, 234, 35);
		contentPane.add(elem1);
		elem1.setColumns(10);
		
		elem2 = new JTextField();
		elem2.setColumns(10);
		elem2.setBounds(321, 262, 234, 35);
		contentPane.add(elem2);
		
		tfr = new JTextField();
		tfr.setColumns(10);
		tfr.setBounds(50, 661, 780, 35);
		contentPane.add(tfr);
		
		JButton btnNewButton = new JButton("Insert Front");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			//Insert front
				int ele=Integer.valueOf(elem1.getText());
				Node newnode=new Node();
				newnode.data=ele;
				newnode.nextlink=null;
				newnode.prelink=null;
				if(first==null)
				{
					first=newnode;
				}
				else
				{
					newnode.nextlink=first;
					first.prelink=newnode;
					first=newnode;
				}
				JOptionPane.showMessageDialog(contentPane, "Element inserted successfully at front");
				elem1.setText("");
				
			}
		});
		btnNewButton.setForeground(new Color(0, 64, 0));
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 30));
		btnNewButton.setBounds(613, 134, 189, 43);
		contentPane.add(btnNewButton);
		
		JButton btnInsertRear = new JButton("Insert Rear");
		btnInsertRear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			//Insert rear
				Node temp;
				int elem=Integer.valueOf(elem2.getText());
				Node newnode=new Node();
				newnode.data=elem;
				newnode.prelink=null;
				newnode.nextlink=null;
				if(first==null)
				{
					first=newnode;
					
				}
				else
				{
					temp=first;
					while(temp.nextlink!=null)
					{
						temp=temp.nextlink;
					}
					temp.nextlink=newnode;
					newnode.prelink=temp;
				}
				String message="Element inserted Successfull @ rear";
				JOptionPane.showMessageDialog(contentPane, message);
				elem2.setText("");
			}
		});
		btnInsertRear.setForeground(new Color(0, 64, 0));
		btnInsertRear.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 30));
		btnInsertRear.setBounds(613, 260, 189, 43);
		contentPane.add(btnInsertRear);
		
		JButton btnDeleteRear = new JButton("Delete Rear");
		btnDeleteRear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			//logic for delete rear
				Node temp;
				if(first==null)
				{
					JOptionPane.showMessageDialog(contentPane, "Deletion not possible");
				}
				else if(first.nextlink==null)
				{
					String msg="Element deleted is"+first.data;
					first=null;
					JOptionPane.showMessageDialog(contentPane, msg);
				}
				else
				{
					temp=first;
					while(temp.nextlink.nextlink!=null)
					{
						temp=temp.nextlink;
					}
					String msg="Element deleted at"+temp.nextlink.data;
					temp.nextlink=null;
					JOptionPane.showMessageDialog(contentPane, msg);
				}
			}
		});
		btnDeleteRear.setForeground(new Color(0, 64, 0));
		btnDeleteRear.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 30));
		btnDeleteRear.setBounds(350, 373, 189, 43);
		contentPane.add(btnDeleteRear);
		
		JButton btnDeleteFront = new JButton("Delete Front");
		btnDeleteFront.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			//Delete front
				Node temp;
				if(first==null)
				{
					JOptionPane.showMessageDialog(contentPane, "Seletion not possible");
				}
				else if(first.nextlink==null)
				{
					JOptionPane.showMessageDialog(contentPane, "Element deleted is"+first.data);
				}
				else
				{
					String msg="Element deleted is"+first.data;
					first=first.nextlink;
					first.prelink=null;
					JOptionPane.showMessageDialog(contentPane, msg);
				}
			}
		});
		btnDeleteFront.setForeground(new Color(0, 64, 0));
		btnDeleteFront.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 30));
		btnDeleteFront.setBounds(350, 458, 193, 43);
		contentPane.add(btnDeleteFront);
		
		JButton btnDisplayForward = new JButton("Display Forward");
		btnDisplayForward.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			//logic for display forward
				String msg="";
				Node temp;
				if(first==null)
				{
					JOptionPane.showMessageDialog(contentPane, "Displaty not possible");
				}
				else if(first.nextlink==null)
				{
					String message="Element desplayed in forward direction are "+first.data;
					JOptionPane.showMessageDialog(contentPane, message);
					tfr.setText(message);
				}
				else
				{
					temp=first;
					while(temp!=null)
					{
						msg=msg+temp.data+" ";
						temp=temp.nextlink;
					}
					tfr.setText(msg);
				}
			}
		});
		btnDisplayForward.setForeground(new Color(0, 64, 0));
		btnDisplayForward.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 30));
		btnDisplayForward.setBounds(142, 556, 245, 43);
		contentPane.add(btnDisplayForward);
		
		JButton btnDisplayReverse = new JButton("Display Reverse");
		btnDisplayReverse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			Node temp;
			String msg="";
			if(first==null)
			{
				JOptionPane.showMessageDialog(contentPane, "Display not possible");
			}
			if(first.nextlink==null)
			{
				String message="Element displayes in reverse"+first.data;
				JOptionPane.showMessageDialog(contentPane, message);
				tfr.setText(message);
			}
			else
			{
				temp=first;
				while(temp.nextlink!=null)
				{
					temp=temp.nextlink;
				}
				while(temp!=null)
				{
					msg=msg+temp.data+" ";
					temp=temp.prelink;
				}
				tfr.setText(msg);
			}
			}
		});
		btnDisplayReverse.setForeground(new Color(0, 64, 0));
		btnDisplayReverse.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 30));
		btnDisplayReverse.setBounds(518, 556, 245, 43);
		contentPane.add(btnDisplayReverse);
	}

}
