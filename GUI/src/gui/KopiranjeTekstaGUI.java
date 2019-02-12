package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class KopiranjeTekstaGUI extends JFrame {

	private JPanel contentPane;
	private JLabel lblUnesiteTekst;
	private JTextField textFieldUnos;
	private JButton btnPrekopiraj;
	private JLabel lblTekst;
	private JTextField textFieldIspis;
	private JButton btnIzlaz;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					KopiranjeTekstaGUI frame = new KopiranjeTekstaGUI();
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
	public KopiranjeTekstaGUI() {
		setResizable(false);
		setTitle("Kopiranje teksta");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 368, 381);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblUnesiteTekst());
		contentPane.add(getTextFieldUnos());
		contentPane.add(getBtnPrekopiraj());
		contentPane.add(getLblTekst());
		contentPane.add(getTextFieldIspis());
		contentPane.add(getBtnIzlaz());
	}

	private JLabel getLblUnesiteTekst() {
		if (lblUnesiteTekst == null) {
			lblUnesiteTekst = new JLabel("Unesite Tekst");
			lblUnesiteTekst.setBounds(41, 107, 106, 31);
		}
		return lblUnesiteTekst;
	}

	private JTextField getTextFieldUnos() {
		if (textFieldUnos == null) {
			textFieldUnos = new JTextField();
			textFieldUnos.setBounds(41, 163, 106, 20);
			textFieldUnos.setColumns(10);
		}
		return textFieldUnos;
	}

	private JButton getBtnPrekopiraj() {
		if (btnPrekopiraj == null) {
			btnPrekopiraj = new JButton("Prekopiraj");
			btnPrekopiraj.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String s = textFieldUnos.getText();

					lblTekst.setText(s);
					textFieldIspis.setText(s);
				}
			});
			btnPrekopiraj.setBounds(41, 232, 106, 23);
		}
		return btnPrekopiraj;
	}

	private JLabel getLblTekst() {
		if (lblTekst == null) {
			lblTekst = new JLabel("Tekst");
			lblTekst.setBounds(200, 107, 106, 31);
		}
		return lblTekst;
	}

	private JTextField getTextFieldIspis() {
		if (textFieldIspis == null) {
			textFieldIspis = new JTextField();
			textFieldIspis.setColumns(10);
			textFieldIspis.setBounds(200, 163, 106, 20);
		}
		return textFieldIspis;
	}

	private JButton getBtnIzlaz() {
		if (btnIzlaz == null) {
			btnIzlaz = new JButton("Izlaz");
			btnIzlaz.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					System.exit(0);
				}
			});
			btnIzlaz.setBounds(200, 232, 106, 23);
		}
		return btnIzlaz;
	}
}
