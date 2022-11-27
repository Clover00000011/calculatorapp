package calculatorapp;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Window.Type;
import javax.swing.JTextField;
import java.awt.Component;
import javax.swing.JButton;
import javax.swing.DropMode;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.JTable;
import javax.swing.JToggleButton;
import javax.swing.ButtonGroup;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Color;

public class Calcframe extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calcframe frame = new Calcframe();
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
	
	double num,ans;
	int calculation;
	private JTextField textFieldnum;
	
	public void arithmetic_operation()
	{
		switch(calculation)
		{
		case 1: // +
			ans= num + Double.parseDouble(textField.getText());
			textField.setText(Double.toString(ans));
			break;
			
		case 2: // -
			ans= num - Double.parseDouble(textField.getText());
			textField.setText(Double.toString(ans));
			break;
			
		case 3: // *
			ans= num * Double.parseDouble(textField.getText());
			textField.setText(Double.toString(ans));
			break;
			
		case 4: // /
			ans= num / Double.parseDouble(textField.getText());
			textField.setText(Double.toString(ans));
			break;
		}
	}
	
	public Calcframe() {
		setBackground(new Color(192, 192, 192));
		setResizable(false);
		setType(Type.UTILITY);
		setTitle("Calculator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 290, 353);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBackground(new Color(128, 128, 128));
		textField.setEditable(false);
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setFont(new Font("Tahoma", Font.BOLD, 23));
		textField.setBounds(10, 11, 259, 42);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnback = new JButton("<--");
		btnback.setBackground(new Color(128, 128, 128));
		btnback.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int length= textField.getText().length();
				int number= textField.getText().length() - 1;
				String store;
				
				if(length > 0)
				{
					StringBuilder back= new StringBuilder(textField.getText());
					back.deleteCharAt(number);
					store=back.toString();
					textField.setText(store);
					
				}
			}
		});
		btnback.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnback.setBounds(4, 87, 104, 32);
		contentPane.add(btnback);
		
		JButton btnc = new JButton("C");
		btnc.setBackground(new Color(128, 128, 128));
		btnc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
				textFieldnum.setText(" ");
			}
		});
		btnc.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnc.setBounds(118, 87, 77, 32);
		contentPane.add(btnc);
		
		JButton btnplus = new JButton("+");
		btnplus.setBackground(new Color(128, 128, 128));
		btnplus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num = Double.parseDouble(textField.getText());
				calculation =1;
				textField.setText("");
				textFieldnum.setText(num + "+");
				
			}
		});
		btnplus.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnplus.setBounds(205, 87, 64, 32);
		contentPane.add(btnplus);
		
		JButton btn1 = new JButton("1");
		btn1.setBackground(new Color(128, 128, 128));
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "1");
			}
		});
		btn1.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn1.setBounds(4, 130, 64, 32);
		contentPane.add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.setBackground(new Color(128, 128, 128));
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "2");
			}
		});
		btn2.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn2.setBounds(71, 130, 64, 32);
		contentPane.add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.setBackground(new Color(128, 128, 128));
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "3");
			}
		});
		btn3.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn3.setBounds(138, 130, 64, 32);
		contentPane.add(btn3);
		
		JButton btnminus = new JButton("-");
		btnminus.setBackground(new Color(128, 128, 128));
		btnminus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num = Double.parseDouble(textField.getText());
				calculation =2;
				textField.setText("");
				textFieldnum.setText(num + "-");
				
			}
		});
		btnminus.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnminus.setBounds(205, 130, 64, 32);
		contentPane.add(btnminus);
		
		JButton btn4 = new JButton("4");
		btn4.setBackground(new Color(128, 128, 128));
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "4");
			}
		});
		btn4.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn4.setBounds(4, 173, 64, 32);
		contentPane.add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.setBackground(new Color(128, 128, 128));
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "5");
			}
		});
		btn5.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn5.setBounds(71, 173, 64, 32);
		contentPane.add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.setBackground(new Color(128, 128, 128));
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "6");
			}
		});
		btn6.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn6.setBounds(138, 173, 64, 32);
		contentPane.add(btn6);
		
		JButton btnmultiply = new JButton("*");
		btnmultiply.setBackground(new Color(128, 128, 128));
		btnmultiply.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num = Double.parseDouble(textField.getText());
				calculation =3;
				textField.setText("");
				textFieldnum.setText(num + "*");
				
			}
		});
		btnmultiply.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnmultiply.setBounds(205, 173, 64, 32);
		contentPane.add(btnmultiply);
		
		JButton btn7 = new JButton("7");
		btn7.setBackground(new Color(128, 128, 128));
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "7");
			}
		});
		btn7.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn7.setBounds(4, 216, 64, 32);
		contentPane.add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.setBackground(new Color(128, 128, 128));
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "8");
			}
		});
		btn8.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn8.setBounds(71, 216, 64, 32);
		contentPane.add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.setBackground(new Color(128, 128, 128));
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "9");
			}
		});
		btn9.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn9.setBounds(138, 216, 64, 32);
		contentPane.add(btn9);
		
		JButton btndivision = new JButton("/");
		btndivision.setBackground(new Color(128, 128, 128));
		btndivision.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num = Double.parseDouble(textField.getText());
				calculation =4;
				textField.setText("");
				textFieldnum.setText(num + "/");
				
			}
		});
		btndivision.setFont(new Font("Tahoma", Font.BOLD, 20));
		btndivision.setBounds(205, 216, 64, 32);
		contentPane.add(btndivision);
		
		JButton btn0 = new JButton("0");
		btn0.setBackground(new Color(128, 128, 128));
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "0");
			}
		});
		btn0.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn0.setBounds(4, 259, 64, 32);
		contentPane.add(btn0);
		
		JButton btnperiod = new JButton(".");
		btnperiod.setBackground(new Color(128, 128, 128));
		btnperiod.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + ".");
			}
		});
		btnperiod.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnperiod.setBounds(71, 259, 64, 32);
		contentPane.add(btnperiod);
		
		JButton btnequal = new JButton("=");
		btnequal.setBackground(new Color(128, 128, 128));
		btnequal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				arithmetic_operation();
				textFieldnum.setText(" ");
			}
		});
		btnequal.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnequal.setBounds(138, 259, 131, 32);
		contentPane.add(btnequal);
		
		textFieldnum = new JTextField();
		textFieldnum.setBackground(new Color(255, 128, 128));
		textFieldnum.setEditable(false);
		textFieldnum.setBounds(183, 56, 86, 20);
		contentPane.add(textFieldnum);
		textFieldnum.setColumns(10);
	}
	
}
