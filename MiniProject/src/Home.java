import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Home extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home frame = new Home();
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
	public Home() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 569, 353);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("CHOOSE A DATA STRUCTURE");
		lblNewLabel.setForeground(new Color(0, 0, 64));
		lblNewLabel.setFont(new Font("Algerian", Font.BOLD, 18));
		lblNewLabel.setBackground(new Color(255, 255, 255));
		lblNewLabel.setBounds(150, 30, 253, 24);
		contentPane.add(lblNewLabel);
		
		JButton array = new JButton("ARRAY");
		array.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//place array opening code here
//				Array a = new Array();
//				a.setVisible(true);
				new Array().setVisible(true);
				
			}
		});
		array.setForeground(new Color(255, 0, 0));
		array.setFont(new Font("Constantia", Font.BOLD | Font.ITALIC, 16));
		array.setBounds(195, 75, 152, 29);
		contentPane.add(array);
		
		JButton stack = new JButton("STACK");
		stack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//place stack window opening code
				new Stack().setVisible(true);
			}
		});
		stack.setForeground(new Color(0, 0, 128));
		stack.setFont(new Font("Constantia", Font.BOLD | Font.ITALIC, 16));
		stack.setBounds(72, 129, 154, 29);
		contentPane.add(stack);
		
		JButton queue = new JButton("QUEUE");
		queue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//place queue window opening code
				new Queue().setVisible(true);
			}
		});
		queue.setForeground(new Color(64, 0, 64));
		queue.setFont(new Font("Constantia", Font.BOLD | Font.ITALIC, 16));
		queue.setBounds(307, 129, 173, 29);
		contentPane.add(queue);
		
		JButton cqueue = new JButton("CIRCULAR QUEUE");
		cqueue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//place circular queue window opening code
			}
		});
		cqueue.setForeground(new Color(128, 64, 0));
		cqueue.setFont(new Font("Constantia", Font.BOLD | Font.ITALIC, 16));
		cqueue.setBounds(10, 206, 263, 29);
		contentPane.add(cqueue);
		
		JButton sll = new JButton("SINGLY LINKED LIST");
		sll.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//place singly linked list window opening code
			}
		});
		sll.setForeground(new Color(0, 128, 192));
		sll.setFont(new Font("Constantia", Font.BOLD | Font.ITALIC, 16));
		sll.setBounds(282, 206, 263, 29);
		contentPane.add(sll);
		
		JButton dll = new JButton("DOUBLY LIKED LIST");
		dll.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//place doubly linked list window opening code
			}
		});
		dll.setForeground(new Color(128, 128, 128));
		dll.setFont(new Font("Constantia", Font.BOLD | Font.ITALIC, 16));
		dll.setBounds(150, 259, 288, 29);
		contentPane.add(dll);
	}
}
