import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Iterator;
import java.awt.event.ActionEvent;

public class Queue extends JFrame {

	private JPanel contentPane;
	private JTextField sizefield;
	private JTextField element;
	private JTextField displaybox;
	private int q[];
	private int size;
	private int r = -1;
	private int f =0;

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
		setBounds(100, 100, 554, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(225, 227, 227));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel heading = new JLabel("Queue Data Structure");
		heading.setForeground(new Color(255, 0, 0));
		heading.setFont(new Font("Algerian", Font.BOLD, 18));
		heading.setBounds(159, 10, 225, 24);
		contentPane.add(heading);
		
		JLabel lblNewLabel = new JLabel("Create an Array");
		lblNewLabel.setForeground(new Color(0, 128, 128));
		lblNewLabel.setFont(new Font("Constantia", Font.BOLD, 18));
		lblNewLabel.setBounds(23, 53, 158, 23);
		contentPane.add(lblNewLabel);
		
		sizefield = new JTextField();
		sizefield.setBounds(199, 53, 144, 22);
		contentPane.add(sizefield);
		sizefield.setColumns(10);
		
		JButton createArray = new JButton("Create");
		createArray.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//creating an array
				size = Integer.valueOf(sizefield.getText());
				q = new int[size];
				
				String msg = "Stack of size "+ size +" Created";
				JOptionPane.showMessageDialog(contentPane, msg);
				
				
			}
		});
		createArray.setFont(new Font("Consolas", Font.BOLD | Font.ITALIC, 18));
		createArray.setForeground(new Color(0, 64, 64));
		createArray.setBounds(353, 53, 103, 24);
		contentPane.add(createArray);
		
		JLabel lblDeleteAnElement = new JLabel("Delete an Element");
		lblDeleteAnElement.setForeground(new Color(0, 128, 128));
		lblDeleteAnElement.setFont(new Font("Constantia", Font.BOLD, 18));
		lblDeleteAnElement.setBounds(23, 148, 180, 23);
		contentPane.add(lblDeleteAnElement);
		
		element = new JTextField();
		element.setColumns(10);
		element.setBounds(199, 98, 144, 22);
		contentPane.add(element);
		
		JButton push = new JButton("PUSH");
		push.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//pushing the element
				int elem;
				if(r==size-1) {
					JOptionPane.showMessageDialog(contentPane, "Insert not possible");
				}
				else {
					elem = Integer.valueOf(element.getText());
					++r;
					q[r] = elem;
					JOptionPane.showMessageDialog(contentPane, "Element inserted is "+elem);
				}
			}
		});
		push.setForeground(new Color(0, 64, 64));
		push.setFont(new Font("Consolas", Font.BOLD | Font.ITALIC, 18));
		push.setBounds(353, 97, 103, 24);
		contentPane.add(push);
		
		JLabel lblEnterAnElement = new JLabel("Enter an Element");
		lblEnterAnElement.setForeground(new Color(0, 128, 128));
		lblEnterAnElement.setFont(new Font("Constantia", Font.BOLD, 18));
		lblEnterAnElement.setBounds(23, 102, 180, 23);
		contentPane.add(lblEnterAnElement);
		
		JButton pop = new JButton("POP");
		pop.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code to pop
				if(r==-1 || f>r) {
					JOptionPane.showMessageDialog(contentPane, "Deletion not possible");
					
				}
				else {
					JOptionPane.showMessageDialog(contentPane, "Element deleted is " + q[f]);
					++f;
				}
				
			}
		});
		pop.setForeground(new Color(0, 64, 64));
		pop.setFont(new Font("Consolas", Font.BOLD | Font.ITALIC, 18));
		pop.setBounds(200, 148, 103, 24);
		contentPane.add(pop);
		
		JButton display = new JButton("Display");
		display.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code to display
				String msg = " ";
				if(r==-1 || f>r) {
					JOptionPane.showMessageDialog(contentPane, "Display Not possible");
					
				}
				else {
					for(int i =f; i<=r; i++) {
						msg = msg +" "+ q[i];
					}
					displaybox.setText(msg);
				}
				
			}
		});
		display.setForeground(new Color(0, 64, 64));
		display.setFont(new Font("Consolas", Font.BOLD | Font.ITALIC, 18));
		display.setBounds(406, 198, 124, 31);
		contentPane.add(display);
		
		displaybox = new JTextField();
		displaybox.setColumns(10);
		displaybox.setBounds(10, 202, 386, 22);
		contentPane.add(displaybox);
	}
}
