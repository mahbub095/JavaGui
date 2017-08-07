import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class Calculator extends JFrame {
	private JTextField console;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator frame = new Calculator();
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
	public Calculator() {
		setResizable(false);
		setTitle("                    MAHBUB");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 371, 406);
		JPanel contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		console = new JTextField();
		console.setEditable(false);
		console.setBounds(27, 28, 308, 66);
		contentPane.add(console);
		console.setColumns(10);
		
		JButton button = new JButton("1");
		button.setBackground(Color.BLUE);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String gettext=console.getText();
				console.setText(gettext+"1");
			}
		});
		button.setBounds(27, 134, 60, 23);
		contentPane.add(button);
		
		JButton button_1 = new JButton("2");
		button_1.setBackground(Color.CYAN);
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String gettext=console.getText();
				console.setText(gettext+"2");
			}
		});
		button_1.setBounds(97, 134, 73, 23);
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("3");
		button_2.setBackground(Color.BLUE);
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String gettext=console.getText();
				console.setText(gettext+"3");
			}
		});
		button_2.setBounds(180, 134, 73, 23);
		contentPane.add(button_2);
		
		JButton button_3 = new JButton("4");
		button_3.setBackground(Color.GRAY);
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String gettext=console.getText();
				console.setText(gettext+"4");
			}
		});
		button_3.setBounds(263, 134, 72, 23);
		contentPane.add(button_3);
		
		JButton button_4 = new JButton("5");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String gettext=console.getText();
				console.setText(gettext+"5");
			}
		});
		button_4.setBounds(27, 190, 60, 23);
		contentPane.add(button_4);
		
		JButton button_5 = new JButton("6");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String gettext=console.getText();
				console.setText(gettext+"6");
			}
		});
		button_5.setBounds(97, 190, 73, 23);
		contentPane.add(button_5);
		
		JButton button_6 = new JButton("7");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String gettext=console.getText();
				console.setText(gettext+"7");
			}
		});
		button_6.setBounds(180, 190, 73, 23);
		contentPane.add(button_6);
		
		JButton button_7 = new JButton("8");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String gettext=console.getText();
				console.setText(gettext+"8");
			}
		});
		button_7.setBounds(263, 190, 72, 23);
		contentPane.add(button_7);
		
		JButton button_8 = new JButton("9");
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String gettext=console.getText();
				console.setText(gettext+"9");
			}
		});
		button_8.setBounds(27, 240, 60, 23);
		contentPane.add(button_8);
		
		JButton button_9 = new JButton("0");
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String gettext=console.getText();
				console.setText(gettext+"0");
			}
		});
		button_9.setBounds(97, 240, 73, 23);
		contentPane.add(button_9);
		
		JButton button_11 = new JButton("+");
		button_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String gettext=console.getText();
				console.setText(gettext+"+");
			}
		});
		button_11.setBounds(27, 284, 60, 23);
		contentPane.add(button_11);
		
		JButton button_12 = new JButton("-");
		button_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String gettext=console.getText();
				console.setText(gettext+"-");
			}
		});
		button_12.setBounds(97, 284, 73, 23);
		contentPane.add(button_12);
		
		JButton button_13 = new JButton("*");
		button_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String gettext=console.getText();
				console.setText(gettext+"*");		}
		});
		button_13.setBounds(180, 284, 73, 23);
		contentPane.add(button_13);
		
		JButton button_14 = new JButton("/");
		button_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String gettext=console.getText();
				console.setText(gettext+"/");
			}
		});
		button_14.setBounds(263, 284, 72, 23);
		contentPane.add(button_14);
		
		JButton btnAc = new JButton("=");
		btnAc.setBackground(Color.GREEN);
		btnAc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			ScriptEngineManager c=new ScriptEngineManager();
			ScriptEngine r=c.getEngineByName("JavaScript");
			String result=console.getText();
			try {
				console.setText(r.eval(result).toString());
			} catch (ScriptException e1) {
				// TODO Auto-generated catch block
				console.setText("Please Take Correct Input (:(");
			}
			}
		});
		btnAc.setBounds(27, 324, 60, 23);
		contentPane.add(btnAc);
		
		JButton btnAc_1 = new JButton("AC");
		btnAc_1.setBackground(Color.RED);
		btnAc_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				console.setText(null);
			}
		});
		btnAc_1.setBounds(97, 324, 73, 23);
		contentPane.add(btnAc_1);
	}
}
