package zadatak6.prijemni.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import java.awt.Dimension;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PrijemniGUI extends JFrame {

	private JPanel contentPane;
	private JTextArea textArea;
	private JPanel panel;
	private JLabel lblNewLabel;
	private JTextField textField;
	private JButton btnUcitaj;
	private JButton btnIspisi;
	private JButton btnIzadji;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PrijemniGUI frame = new PrijemniGUI();
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
	public PrijemniGUI() {
		setTitle("Prijemni ispit");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		contentPane.add(getTextArea(), BorderLayout.CENTER);
		contentPane.add(getPanel(), BorderLayout.NORTH);
	}

	private JTextArea getTextArea() {
		if (textArea == null) {
			textArea = new JTextArea();
		}
		return textArea;
	}
	private JPanel getPanel() {
		if (panel == null) {
			panel = new JPanel();
			panel.setPreferredSize(new Dimension(10, 110));
			panel.setLayout(null);
			panel.add(getLblNewLabel());
			panel.add(getTextField());
			panel.add(getBtnUcitaj());
			panel.add(getBtnIspisi());
			panel.add(getBtnIzadji());
		}
		return panel;
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("New label");
			lblNewLabel.setBounds(10, 11, 46, 20);
		}
		return lblNewLabel;
	}
	private JTextField getTextField() {
		if (textField == null) {
			textField = new JTextField();
			textField.setBounds(10, 36, 203, 20);
			textField.setColumns(10);
		}
		return textField;
	}
	private JButton getBtnUcitaj() {
		if (btnUcitaj == null) {
			btnUcitaj = new JButton("Ucitaj");
			btnUcitaj.setBounds(10, 67, 89, 23);
		}
		return btnUcitaj;
	}
	private JButton getBtnIspisi() {
		if (btnIspisi == null) {
			btnIspisi = new JButton("Ispisi");
			btnIspisi.setBounds(109, 67, 89, 23);
		}
		return btnIspisi;
	}
	private JButton getBtnIzadji() {
		if (btnIzadji == null) {
			btnIzadji = new JButton("Izadji");
			btnIzadji.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
				}
			});
			btnIzadji.setBounds(208, 67, 89, 23);
		}
		return btnIzadji;
	}
}
