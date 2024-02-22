import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.UIManager;

public class CalIITS {

	private JFrame frame;
	private JTextField textField;

	double first;
	double second;
	double result;
	String operation;
	String answer;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalIITS window = new CalIITS();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public CalIITS() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBackground(UIManager.getColor("Button.highlight"));
		frame.setBounds(100, 100, 450, 580);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.BOLD, 20));
		textField.setBounds(46, 27, 345, 58);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnDevide = new JButton("/");
		btnDevide.setBackground(Color.ORANGE);
		btnDevide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "/";
			}
		});
		btnDevide.setFont(new Font("Tahoma", Font.BOLD, 23));
		btnDevide.setBounds(338, 173, 60, 58);
		frame.getContentPane().add(btnDevide);
		
		JButton btnAddition = new JButton("+");
		btnAddition.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "+";
			}
		});
		btnAddition.setBackground(Color.ORANGE);
		btnAddition.setFont(new Font("Tahoma", Font.BOLD, 23));
		btnAddition.setBounds(337, 255, 60, 56);
		frame.getContentPane().add(btnAddition);
		
		JButton btnSubstract = new JButton("-");
		btnSubstract.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "-";
			}
		});
		btnSubstract.setBackground(Color.ORANGE);
		btnSubstract.setFont(new Font("Tahoma", Font.BOLD, 23));
		btnSubstract.setBounds(337, 335, 60, 58);
		frame.getContentPane().add(btnSubstract);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn7.getText();
				textField.setText(number);
			}
		});
		btn7.setBackground(new Color(255, 255, 0));
		btn7.setFont(new Font("Tahoma", Font.BOLD, 23));
		btn7.setBounds(10, 173, 85, 58);
		frame.getContentPane().add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn8.getText();
				textField.setText(number);
			}
		});
		btn8.setBackground(Color.YELLOW);
		btn8.setFont(new Font("Tahoma", Font.BOLD, 23));
		btn8.setBounds(105, 173, 85, 58);
		frame.getContentPane().add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn9.getText();
				textField.setText(number);
			}
		});
		btn9.setBackground(Color.YELLOW);
		btn9.setFont(new Font("Tahoma", Font.BOLD, 23));
		btn9.setBounds(196, 173, 85, 58);
		frame.getContentPane().add(btn9);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn4.getText();
				textField.setText(number);
			}
		});
		btn4.setBackground(Color.YELLOW);
		btn4.setFont(new Font("Tahoma", Font.BOLD, 23));
		btn4.setBounds(10, 255, 85, 58);
		frame.getContentPane().add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn5.getText();
				textField.setText(number);
			}
		});
		btn5.setBackground(Color.YELLOW);
		btn5.setFont(new Font("Tahoma", Font.BOLD, 23));
		btn5.setBounds(105, 253, 85, 58);
		frame.getContentPane().add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn6.getText();
				textField.setText(number);
			}
		});
		btn6.setBackground(Color.YELLOW);
		btn6.setFont(new Font("Tahoma", Font.BOLD, 23));
		btn6.setBounds(196, 255, 85, 58);
		frame.getContentPane().add(btn6);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn1.getText();
				textField.setText(number);
			}
		});
		btn1.setBackground(Color.YELLOW);
		btn1.setFont(new Font("Tahoma", Font.BOLD, 23));
		btn1.setBounds(10, 335, 85, 58);
		frame.getContentPane().add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn2.getText();
				textField.setText(number);
			}
		});
		btn2.setBackground(Color.YELLOW);
		btn2.setFont(new Font("Tahoma", Font.BOLD, 23));
		btn2.setBounds(105, 335, 85, 58);
		frame.getContentPane().add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn3.getText();
				textField.setText(number);
			}
		});
		btn3.setBackground(Color.YELLOW);
		btn3.setFont(new Font("Tahoma", Font.BOLD, 23));
		btn3.setBounds(196, 335, 85, 58);
		frame.getContentPane().add(btn3);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn0.getText();
				textField.setText(number);
			}
		});
		btn0.setBackground(Color.YELLOW);
		btn0.setFont(new Font("Tahoma", Font.BOLD, 23));
		btn0.setBounds(10, 432, 85, 58);
		frame.getContentPane().add(btn0);
		
		JButton btnDecimal = new JButton(".");
		btnDecimal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btnDecimal.getText();
				textField.setText(number);
			}
		});
		btnDecimal.setBackground(Color.YELLOW);
		btnDecimal.setFont(new Font("Tahoma", Font.BOLD, 23));
		btnDecimal.setBounds(105, 432, 85, 58);
		frame.getContentPane().add(btnDecimal);
		
		JButton btnEqual = new JButton("=");
		btnEqual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String answer;
			second = Double.parseDouble(textField.getText());
			if(operation == "+") {
				result = first + second;
				answer = String.format("%.2f", result);
				textField.setText(answer);
			} else if(operation == "-") {
				result = first - second;
				answer = String.format("%.2f", result);
				textField.setText(answer);
			} else if(operation == "*") {
				result = first * second;
				answer = String.format("%.2f", result);
				textField.setText(answer);
			} else if(operation == "/") {
				result = first / second;
				answer = String.format("%.2f", result);
				textField.setText(answer);
				
			}
			
				
			}
		});
		btnEqual.setBackground(Color.YELLOW);
		btnEqual.setFont(new Font("Tahoma", Font.BOLD, 23));
		btnEqual.setBounds(196, 432, 85, 58);
		frame.getContentPane().add(btnEqual);
		
		JButton btnMultiply = new JButton("X");
		btnMultiply.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "*";
			}
		});
		btnMultiply.setBackground(Color.ORANGE);
		btnMultiply.setFont(new Font("Tahoma", Font.BOLD, 23));
		btnMultiply.setBounds(338, 432, 60, 58);
		frame.getContentPane().add(btnMultiply);
		
		JButton btnBack = new JButton("\uF0E7");
		btnBack.setFont(new Font("Wingdings", Font.BOLD, 23));
		btnBack.setBackground(Color.ORANGE);
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Back = null;
				if(textField.getText().length()>0) {
					StringBuilder str = new StringBuilder(textField.getText());
					str.deleteCharAt(textField.getText().length()-1);
					Back = str.toString();
					textField.setText(Back);
				}
			}
		});
		btnBack.setBounds(28, 95, 96, 58);
		frame.getContentPane().add(btnBack);
		
		JButton btnCLEAR = new JButton("CLEAR");
		btnCLEAR.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		btnCLEAR.setBackground(Color.ORANGE);
		btnCLEAR.setFont(new Font("Tahoma", Font.BOLD, 23));
		btnCLEAR.setBounds(196, 106, 143, 47);
		frame.getContentPane().add(btnCLEAR);
	}
}
