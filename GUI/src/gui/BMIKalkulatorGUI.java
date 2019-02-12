package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.text.Format;
import java.awt.event.ActionEvent;

public class BMIKalkulatorGUI extends JFrame {

	private JPanel contentPane;
	private JLabel lblVisina;
	private JLabel lblTezina;
	private JButton btnNewButton;
	private JLabel lblBmi;
	private JTextField textFieldVisina;
	private JTextField textFieldTezina;
	private JTextField textFieldBMI;
	private BMIKalkulator bmi = new BMIKalkulator();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BMIKalkulatorGUI frame = new BMIKalkulatorGUI();
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
	public BMIKalkulatorGUI() {
		setTitle("BMICalculator");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblVisina());
		contentPane.add(getLblTezina());
		contentPane.add(getBtnNewButton());
		contentPane.add(getLblBmi());
		contentPane.add(getTextFieldVisina());
		contentPane.add(getTextFieldTezina());
		contentPane.add(getTextFieldBMI());
	}

	private JLabel getLblVisina() {
		if (lblVisina == null) {
			lblVisina = new JLabel("Visina:");
			lblVisina.setBounds(57, 48, 71, 37);
		}
		return lblVisina;
	}
	private JLabel getLblTezina() {
		if (lblTezina == null) {
			lblTezina = new JLabel("Tezina: ");
			lblTezina.setBounds(57, 108, 71, 37);
		}
		return lblTezina;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("Izracunaj BMI");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					double visina = Double.parseDouble(textFieldVisina.getText());
					double tezina = Double.parseDouble(textFieldTezina.getText());
					
					DecimalFormat dFormat = new DecimalFormat("###,##");
					
					double dformat = bmi.izracunajBMI(visina, tezina);
					
//					textFieldBMI.setText(bmi.izracunajBMI(visina, tezina)+""	);
					textFieldBMI.setText(dFormat.format(dformat)+"");
				}
			});
			btnNewButton.setBounds(103, 165, 111, 23);
		}
		return btnNewButton;
	}
	private JLabel getLblBmi() {
		if (lblBmi == null) {
			lblBmi = new JLabel("BMI: ");
			lblBmi.setBounds(57, 200, 71, 37);
		}
		return lblBmi;
	}
	private JTextField getTextFieldVisina() {
		if (textFieldVisina == null) {
			textFieldVisina = new JTextField();
			textFieldVisina.setBounds(194, 56, 131, 20);
			textFieldVisina.setColumns(10);
		}
		return textFieldVisina;
	}
	private JTextField getTextFieldTezina() {
		if (textFieldTezina == null) {
			textFieldTezina = new JTextField();
			textFieldTezina.setBounds(194, 116, 131, 20);
			textFieldTezina.setColumns(10);
		}
		return textFieldTezina;
	}
	private JTextField getTextFieldBMI() {
		if (textFieldBMI == null) {
			textFieldBMI = new JTextField();
			textFieldBMI.setEditable(false);
			textFieldBMI.setBounds(194, 208, 131, 20);
			textFieldBMI.setColumns(10);
		}
		return textFieldBMI;
	}
}
