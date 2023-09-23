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
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;

public class Array extends JFrame {

	private JPanel contentPane;
	private JTextField length;
	private JTextField element;
	private JTextField insertposition;
	private JTextField deleteposition;
	private int arr[];
	
	private JTextField displaytext;

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
		setBounds(100, 100, 525, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(192, 192, 192));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel heading = new JLabel("ARRAY DATA STRUCTURE");
		heading.setBounds(106, 10, 231, 24);
		heading.setForeground(new Color(0, 64, 128));
		heading.setFont(new Font("Algerian", Font.BOLD, 18));
		contentPane.add(heading);
		
		JLabel lblNewLabel = new JLabel("Enter the length of Array*");
		lblNewLabel.setBounds(10, 56, 213, 24);
		lblNewLabel.setForeground(new Color(128, 0, 64));
		lblNewLabel.setFont(new Font("Constantia", Font.BOLD, 16));
		contentPane.add(lblNewLabel);
		
		length = new JTextField();
		length.setBounds(214, 52, 117, 29);
		contentPane.add(length);
		length.setColumns(10);
		
		JButton create = new JButton("Create Array");
		create.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//create the array
//				String input = length.getText();
//				int l = Integer.valueOf(input);
				int len = Integer.valueOf(length.getText());
				arr = new int[len];
				String message= "Array of length " + len + " Created";
				JOptionPane.showMessageDialog(contentPane, message);
				
			}
		});
		create.setFont(new Font("Bookman Old Style", Font.BOLD, 13));
		create.setBounds(341, 53, 160, 25);
		contentPane.add(create);
		
		JLabel lblEnterAnInteger = new JLabel("Enter an integer element*");
		lblEnterAnInteger.setBounds(10, 98, 229, 24);
		lblEnterAnInteger.setForeground(new Color(128, 0, 64));
		lblEnterAnInteger.setFont(new Font("Constantia", Font.BOLD, 16));
		contentPane.add(lblEnterAnInteger);
		
		element = new JTextField();
		element.setBounds(214, 98, 149, 24);
		contentPane.add(element);
		element.setColumns(10);
		
		JLabel lblIn = new JLabel("position*");
		lblIn.setBounds(10, 134, 76, 24);
		lblIn.setForeground(new Color(128, 0, 64));
		lblIn.setFont(new Font("Constantia", Font.BOLD, 16));
		contentPane.add(lblIn);
		
		insertposition = new JTextField();
		insertposition.setColumns(10);
		insertposition.setBounds(106, 132, 133, 25);
		contentPane.add(insertposition);
		
		JLabel lblEnterThePosition = new JLabel("Enter the Position*");
		lblEnterThePosition.setForeground(new Color(128, 0, 64));
		lblEnterThePosition.setFont(new Font("Constantia", Font.BOLD, 16));
		lblEnterThePosition.setBounds(10, 181, 229, 24);
		contentPane.add(lblEnterThePosition);
		
		deleteposition = new JTextField();
		deleteposition.setColumns(10);
		deleteposition.setBounds(165, 180, 96, 24);
		contentPane.add(deleteposition);
		
		JButton btnInsert = new JButton("Insert");
		btnInsert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//insert the element to the array
				int elem = Integer.valueOf(element.getText());
				int pos = Integer.valueOf(insertposition.getText());
				arr[pos] = elem;
				String message = "Element " + elem + " insterted at position "+ pos;
				JOptionPane.showMessageDialog(contentPane, message);
				element.setText("");
				insertposition.setText("");
				
				
			}
		});
		btnInsert.setFont(new Font("Bookman Old Style", Font.BOLD, 13));
		btnInsert.setBounds(249, 133, 115, 25);
		contentPane.add(btnInsert);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//delete the array
				int pos = Integer.valueOf(deleteposition.getText());
				arr[pos] =0;
				String message = "Element Deleted @ the position " + pos;
				JOptionPane.showMessageDialog(contentPane, message);
				deleteposition.setText("");
			}
		});
		btnDelete.setFont(new Font("Bookman Old Style", Font.BOLD, 13));
		btnDelete.setBounds(281, 178, 115, 25);
		contentPane.add(btnDelete);
		
		JButton btnDisplay = new JButton("Display");
		btnDisplay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//display the array
				String msg = "";
				for(int i= 0; i<= arr.length-1;i++) {
					msg = msg +" "+ arr[i];
				}
				displaytext.setText(msg);
			}
		});
		btnDisplay.setFont(new Font("Bookman Old Style", Font.BOLD, 13));
		btnDisplay.setBounds(10, 215, 115, 25);
		contentPane.add(btnDisplay);
		
		displaytext = new JTextField();
		displaytext.setBackground(new Color(255, 255, 128));
		displaytext.setBounds(150, 215, 326, 25);
		contentPane.add(displaytext);
		displaytext.setColumns(10);
	}
}
