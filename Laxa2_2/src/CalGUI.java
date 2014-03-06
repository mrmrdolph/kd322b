import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.Font;


public class CalGUI extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private Cal newCal;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalGUI frame = new CalGUI();
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
	public CalGUI() {
		
		newCal = new Cal();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 288, 434);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(4, 4));
		
		JPanel panel = new JPanel();
		contentPane.add(panel);
		panel.setLayout(new GridLayout(5, 3, 4, 4));
		
		JButton btnNewButton = new JButton("1");
		panel.add(btnNewButton);
		
		JButton btnNewButton_5 = new JButton("2");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				newCal.numberButtonPressed(2);
				int i = newCal.getOperand();
				textField.setText(String.valueOf(i));
			}
		});
		panel.add(btnNewButton_5);
		
		JButton btnNewButton_10 = new JButton("3");
		btnNewButton_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				newCal.numberButtonPressed(3);
				int i = newCal.getOperand();
				textField.setText(String.valueOf(i));
			}
		});
		panel.add(btnNewButton_10);
		
		JButton btnNewButton_2 = new JButton("4");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				newCal.numberButtonPressed(4);
				int i = newCal.getOperand();
				textField.setText(String.valueOf(i));
			}
		});
		panel.add(btnNewButton_2);
		
		JButton btnNewButton_1 = new JButton("5");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				newCal.numberButtonPressed(5);
				int i = newCal.getOperand();
				textField.setText(String.valueOf(i));
			}
		});
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_6 = new JButton("6");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				newCal.numberButtonPressed(6);
				int i = newCal.getOperand();
				textField.setText(String.valueOf(i));
			}
		});
		panel.add(btnNewButton_6);
		
		JButton btnNewButton_3 = new JButton("7");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				newCal.numberButtonPressed(7);
				int i = newCal.getOperand();
				textField.setText(String.valueOf(i));
			}
		});
		panel.add(btnNewButton_3);
		
		JButton btnNewButton_8 = new JButton("8");
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				newCal.numberButtonPressed(8);
				int i = newCal.getOperand();
				textField.setText(String.valueOf(i));
			}
		});
		panel.add(btnNewButton_8);
		
		JButton btnNewButton_4 = new JButton("9");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				newCal.numberButtonPressed(9);
				int i = newCal.getOperand();
				textField.setText(String.valueOf(i));
			}
		});
		panel.add(btnNewButton_4);
		
		JButton btnNewButton_12 = new JButton("-");
		btnNewButton_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				newCal.minus();
				textField.setText("-");
			}
		});
		panel.add(btnNewButton_12);
		
		JButton btnNewButton_7 = new JButton("0");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				newCal.numberButtonPressed(0);
				int i = newCal.getOperand();
				textField.setText(String.valueOf(i));
			}
		});
		panel.add(btnNewButton_7);
		
		JButton btnNewButton_9 = new JButton("+");
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				newCal.plus();
				textField.setText("+");
			}
		});
		panel.add(btnNewButton_9);
		
		JButton btnNewButton_11 = new JButton("*");
		btnNewButton_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				newCal.mult();
				textField.setText("*");
			}
		});
		panel.add(btnNewButton_11);
		
		JButton btnNewButton_13 = new JButton("C");
		btnNewButton_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				newCal.clear();
				textField.setText(null);
			}
		});
		panel.add(btnNewButton_13);
		
		JButton btnNewButton_14 = new JButton("=");
		btnNewButton_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			newCal.equals2();
			int i = newCal.getResult();
				textField.setText(String.valueOf(i));
			}
		});
		panel.add(btnNewButton_14);
		
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				newCal.numberButtonPressed(1);
				int i = newCal.getOperand();
				textField.setText(String.valueOf(i));
			}
		});
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 18));
		contentPane.add(textField, BorderLayout.NORTH);
		textField.setColumns(10);
	}

}
