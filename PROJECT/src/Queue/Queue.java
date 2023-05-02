package Queue;

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

public class Queue extends JFrame {

	private JPanel contentPane;
	private JTextField element;
	private JTextField sizefield;
	private JTextField tfr;
	private JButton btnNewButton;
	private JButton btnInsert;
	private JButton btnDelete;
	private JButton btnDisplay;
	private int q[];
	private int size;
	private int r=1;
	private int f=0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Queue frame = new Queue();
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
	public Queue() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 897, 738);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(192, 192, 192));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Queue DataStructure");
		lblNewLabel.setForeground(new Color(0, 0, 160));
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 30));
		lblNewLabel.setBounds(305, 25, 270, 35);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Enter Queue Size");
		lblNewLabel_1.setForeground(new Color(128, 0, 0));
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 30));
		lblNewLabel_1.setBounds(10, 146, 221, 35);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Enter An Element");
		lblNewLabel_1_1.setForeground(new Color(128, 0, 0));
		lblNewLabel_1_1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 30));
		lblNewLabel_1_1.setBounds(10, 317, 230, 35);
		contentPane.add(lblNewLabel_1_1);
		
		element = new JTextField();
		element.setBounds(350, 317, 387, 33);
		contentPane.add(element);
		element.setColumns(10);
		
		sizefield = new JTextField();
		sizefield.setColumns(10);
		sizefield.setBounds(350, 146, 387, 33);
		contentPane.add(sizefield);
		
		tfr = new JTextField();
		tfr.setColumns(10);
		tfr.setBounds(10, 613, 727, 33);
		contentPane.add(tfr);
		
		btnNewButton = new JButton("Create Queue");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			//logic to create
				size=Integer.valueOf(sizefield.getText());
				q=new int [size];
				String msg="Queue size "+size+ " will be created";
				JOptionPane.showMessageDialog(contentPane, msg);
			}
		});
		btnNewButton.setForeground(new Color(0, 64, 0));
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 30));
		btnNewButton.setBounds(207, 230, 207, 43);
		contentPane.add(btnNewButton);
		
		btnInsert = new JButton("Insert");
		btnInsert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			//logic for insert
				int elem;
				if(r==size-1)
				{
					String msg="Insertion is not possible";
					JOptionPane.showMessageDialog(contentPane, msg);
				}
				else
				{
					elem=Integer.valueOf(element.getText());
					++r;
					q[r]=elem;
					String msg="Insertion succesful @ position"+r;
					JOptionPane.showMessageDialog(contentPane, msg);
					element.setText("");
				}
			}
		});
		btnInsert.setForeground(new Color(0, 64, 0));
		btnInsert.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 30));
		btnInsert.setBounds(69, 418, 207, 43);
		contentPane.add(btnInsert);
		
		btnDelete = new JButton("Delete");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			//logic for delete
				if(r==-1||f>r)
				{
					String msg="Deletion not possible at position"+r;
					JOptionPane.showMessageDialog(contentPane, msg);
				}
				else
				{
					String msg="Element deleted is"+q[f];
					JOptionPane.showMessageDialog(contentPane, msg);
					++f;
				}
				
			}
		});
		btnDelete.setForeground(new Color(0, 64, 0));
		btnDelete.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 30));
		btnDelete.setBounds(448, 418, 207, 43);
		contentPane.add(btnDelete);
		
		btnDisplay = new JButton("Display");
		btnDisplay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			//logic for display
				String msg=("");
				if(r==-1 || f>r)
				{
					JOptionPane.showInternalMessageDialog(contentPane, "Display not possible");
				}
				else
				{
					for(int i=f;i<=r;i++)
					{
						msg=msg+" "+q[i];
					}
					tfr.setText(msg);
				}
			}
		});
		btnDisplay.setForeground(new Color(0, 64, 0));
		btnDisplay.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 30));
		btnDisplay.setBounds(257, 525, 207, 43);
		contentPane.add(btnDisplay);
	}
}
