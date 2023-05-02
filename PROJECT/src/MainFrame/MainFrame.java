package MainFrame;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import CircularQueue.CircularQueue;
import DoublyLinkedList.DoublyLinkedList;
import Queue.Queue;
import SinglyLinkedList.SinglyLinkedList;
import Stack.Stack;
import array.Array;

import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainFrame extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame frame = new MainFrame();
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
	public MainFrame() {
		setBackground(new Color(64, 128, 128));
		setForeground(new Color(64, 128, 128));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 919, 768);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(128, 128, 192));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("CHOOSE A DATASTRUCTURE");
		lblNewLabel.setForeground(new Color(128, 0, 0));
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 35));
		lblNewLabel.setBounds(173, 28, 485, 42);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Array");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			//logic for Array
				new Array().setVisible(true);
			}
		});
		btnNewButton.setForeground(new Color(0, 64, 0));
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 35));
		btnNewButton.setBounds(365, 135, 117, 51);
		contentPane.add(btnNewButton);
		
		JButton btnQueue = new JButton("Queue");
		btnQueue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			//logic for Queue
				new Queue().setVisible(true);
			}
		});
		btnQueue.setForeground(new Color(0, 64, 0));
		btnQueue.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 35));
		btnQueue.setBounds(122, 261, 129, 51);
		contentPane.add(btnQueue);
		
		JButton btnStack = new JButton("Stack");
		btnStack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			//logic for Stack
				new Stack().setVisible(true);
			}
		});
		btnStack.setForeground(new Color(0, 64, 0));
		btnStack.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 35));
		btnStack.setBounds(598, 261, 129, 51);
		contentPane.add(btnStack);
		
		JButton btnDoublyLinkedlist = new JButton("Doubly LinkedList");
		btnDoublyLinkedlist.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			//logic for DLL
				new DoublyLinkedList().setVisible(true);
			}
		});
		btnDoublyLinkedlist.setForeground(new Color(0, 64, 0));
		btnDoublyLinkedlist.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 35));
		btnDoublyLinkedlist.setBounds(68, 451, 303, 51);
		contentPane.add(btnDoublyLinkedlist);
		
		JButton btnSinglyLinkedlist = new JButton("Singly LinkedList");
		btnSinglyLinkedlist.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			//SLL
				new SinglyLinkedList().setVisible(true);
			}
		});
		btnSinglyLinkedlist.setForeground(new Color(0, 64, 0));
		btnSinglyLinkedlist.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 35));
		btnSinglyLinkedlist.setBounds(522, 451, 303, 51);
		contentPane.add(btnSinglyLinkedlist);
		
		JButton btnCircularQueue = new JButton("Circular Queue");
		btnCircularQueue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			//logic for Cq
				new CircularQueue().setVisible(true);
			}
		});
		btnCircularQueue.setForeground(new Color(0, 64, 0));
		btnCircularQueue.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 35));
		btnCircularQueue.setBounds(283, 603, 303, 51);
		contentPane.add(btnCircularQueue);
	}

}
