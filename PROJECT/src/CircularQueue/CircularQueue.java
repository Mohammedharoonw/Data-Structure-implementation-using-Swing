package CircularQueue;

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

public class CircularQueue extends JFrame {

	private JPanel contentPane;
	private JTextField sizefield;
	private JTextField element;
	private JTextField tfr;
	private int Cq[];
	private int size;
	private int r=-1;
	private int f=0;
	private int count=0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CircularQueue frame = new CircularQueue();
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
	public CircularQueue() {
		setForeground(new Color(192, 192, 192));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 828, 710);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(192, 192, 192));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Circular Queue Data Structure");
		lblNewLabel.setForeground(new Color(0, 0, 128));
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 30));
		lblNewLabel.setBounds(236, 41, 394, 35);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Enter Circular Queue");
		lblNewLabel_1.setForeground(new Color(128, 0, 0));
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 25));
		lblNewLabel_1.setBounds(44, 144, 226, 30);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Enter the Element");
		lblNewLabel_1_1.setForeground(new Color(128, 0, 0));
		lblNewLabel_1_1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 25));
		lblNewLabel_1_1.setBounds(44, 325, 190, 30);
		contentPane.add(lblNewLabel_1_1);
		
		sizefield = new JTextField();
		sizefield.setBounds(404, 144, 364, 35);
		contentPane.add(sizefield);
		sizefield.setColumns(10);
		
		element = new JTextField();
		element.setColumns(10);
		element.setBounds(404, 320, 364, 35);
		contentPane.add(element);
		
		tfr = new JTextField();
		tfr.setColumns(10);
		tfr.setBounds(44, 590, 737, 35);
		contentPane.add(tfr);
		
		JButton btnNewButton = new JButton("Create C Queue");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//logic for creation
				int elem=Integer.valueOf(sizefield.getText());
				Cq=new int[elem];
				size=Cq.length;
				String msg="Circular Queue size " + elem + " is created ";
				JOptionPane.showMessageDialog(contentPane, msg);
			}
		});
		btnNewButton.setForeground(new Color(0, 64, 0));
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 25));
		btnNewButton.setBounds(236, 235, 323, 39);
		contentPane.add(btnNewButton);
		
		JButton btnDisplay = new JButton("Display");
		btnDisplay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			//logic for Display
				int f1=f;
				String msg="";
				if(count==0)
				{
					JOptionPane.showMessageDialog(contentPane, "Display not possible");
					
				}
				else
				{
					for(int i=1; i<=count; i++)
					{
						msg=msg+Cq[f1]+" ";
						f1=(f1+1)%size;
					}
					tfr.setText(msg);
				}
				
			}
		});
		btnDisplay.setForeground(new Color(0, 64, 0));
		btnDisplay.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 25));
		btnDisplay.setBounds(293, 519, 199, 39);
		contentPane.add(btnDisplay);
		
		JButton btnInsert = new JButton("Insert");
		btnInsert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			//logic for Insertion
				if(count==size)
				{
					String msg="Insertion not possible";
					JOptionPane.showMessageDialog(contentPane, msg);
				}
				else
				{
					int elem1=Integer.valueOf(element.getText());
					r=(r+1)%size;
					Cq[r]=elem1;
					count++;
					String msg="Element " + elem1 + "Inseted successfullu";
					JOptionPane.showMessageDialog(contentPane, msg);
					element.setText("");
				}
			}
		});
		btnInsert.setForeground(new Color(0, 64, 0));
		btnInsert.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 25));
		btnInsert.setBounds(99, 447, 199, 39);
		contentPane.add(btnInsert);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			//logic for Deletion
				if(count==0)
				{
					JOptionPane.showMessageDialog(contentPane, "Deletion not possible");
					
				}
				else
				{
					String msg="Element deleted is " + Cq[f];
					f=(f+1)%size;
					count--;
					JOptionPane.showMessageDialog(contentPane, msg);
				}
			}
		});
		btnDelete.setForeground(new Color(0, 64, 0));
		btnDelete.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 25));
		btnDelete.setBounds(481, 447, 199, 39);
		contentPane.add(btnDelete);
	}

}
