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
import java.awt.event.ActionEvent;

public class Stack extends JFrame {

	private JPanel contentPane;
	private JTextField sizefield;
	private JTextField element;
	private JTextField displaybox;
	private int s[];
	private int size;
	private int top =-1;
	

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
		setBounds(100, 100, 632, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(128, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel heading = new JLabel("STACK DATA STRUCTURE");
		heading.setForeground(new Color(128, 0, 0));
		heading.setFont(new Font("Algerian", Font.BOLD, 18));
		heading.setBounds(128, 10, 225, 24);
		contentPane.add(heading);
		
		JLabel lblNewLabel = new JLabel("Enter the Stack Size");
		lblNewLabel.setForeground(new Color(64, 0, 128));
		lblNewLabel.setFont(new Font("Cascadia Code", Font.BOLD, 18));
		lblNewLabel.setBounds(10, 44, 239, 22);
		contentPane.add(lblNewLabel);
		
		sizefield = new JTextField();
		sizefield.setBounds(248, 46, 160, 24);
		contentPane.add(sizefield);
		sizefield.setColumns(10);
		
		JLabel lblEnterAnElement = new JLabel("Enter an Element");
		lblEnterAnElement.setForeground(new Color(0, 64, 0));
		lblEnterAnElement.setFont(new Font("Cascadia Code", Font.BOLD, 18));
		lblEnterAnElement.setBounds(10, 94, 196, 22);
		contentPane.add(lblEnterAnElement);
		
		JButton stack = new JButton("Create Stack");
		stack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// stack creation code
				size = Integer.valueOf(sizefield.getText());
				s = new int[size];
				String msg = "Stack of size "+ size+" Created";
				JOptionPane.showMessageDialog(contentPane, msg);
			}
		});
		stack.setForeground(new Color(128, 0, 0));
		stack.setFont(new Font("Constantia", Font.BOLD, 18));
		stack.setBounds(418, 43, 173, 31);
		contentPane.add(stack);
		
		element = new JTextField();
		element.setColumns(10);
		element.setBounds(244, 96, 109, 24);
		contentPane.add(element);
		
		JLabel lblNewLabel_1_1 = new JLabel("POP here");
		lblNewLabel_1_1.setForeground(new Color(128, 64, 0));
		lblNewLabel_1_1.setFont(new Font("Cascadia Code", Font.BOLD, 18));
		lblNewLabel_1_1.setBounds(10, 155, 109, 22);
		contentPane.add(lblNewLabel_1_1);
		
		displaybox = new JTextField();
		displaybox.setBackground(new Color(255, 255, 128));
		displaybox.setColumns(10);
		displaybox.setBounds(193, 209, 388, 24);
		contentPane.add(displaybox);
		
		JButton push = new JButton("PUSH");
		push.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//push code
				int elem;
				if(top == size-1) {
					JOptionPane.showMessageDialog(contentPane, "Push not possible");
				}
				else {
					elem = Integer.valueOf(element.getText());
					++top;
					s[top]=elem;
					JOptionPane.showMessageDialog(contentPane, "Push successful");
					element.setText("");
				}
			}
		});
		push.setForeground(new Color(128, 0, 0));
		push.setFont(new Font("Constantia", Font.BOLD, 18));
		push.setBounds(418, 94, 173, 31);
		contentPane.add(push);
		
		JButton pop = new JButton("POP");
		pop.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//pop code
				if(top==-1) {
					JOptionPane.showMessageDialog(contentPane, "POP not possible");
				}
				else {
					String msg = "Element deleted is "+s[top];
					JOptionPane.showMessageDialog(contentPane, msg);
					--top;
				}
				
			}
		});
		pop.setForeground(new Color(128, 0, 0));
		pop.setFont(new Font("Constantia", Font.BOLD, 18));
		pop.setBounds(128, 155, 173, 31);
		contentPane.add(pop);
		
		JButton display = new JButton("Display");
		display.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Display code
				String msg = "";
				if(top == -1) {
					JOptionPane.showMessageDialog(contentPane, "Stack is empty");
				}
				else {
					for(int i = top; i>=0;i--) {
						msg = msg + " "+ s[i];
					}
					displaybox.setText(msg);
				}
				
				
			}
		});
		display.setForeground(new Color(128, 0, 0));
		display.setFont(new Font("Constantia", Font.BOLD, 18));
		display.setBounds(10, 206, 173, 31);
		contentPane.add(display);
	}

}
