package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import java.awt.FlowLayout;

public class EDITORGUI extends JFrame {

	private JPanel contentPane;
	private JPanel panel;
	private JLabel lblImeFajla;
	private JTextField textField;
	private JButton btnUcitaj;
	private JButton btnObrisi;
	private JButton btnSacuvaj;
	private JButton btnIzadji;
	private JTextArea textArea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EDITORGUI frame = new EDITORGUI();
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
	public EDITORGUI() {
		setTitle("Tekst Editor");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		contentPane.add(getPanel(), BorderLayout.WEST);
		contentPane.add(getTextArea(), BorderLayout.CENTER);
	}

	private JPanel getPanel() {
		if (panel == null) {
			panel = new JPanel();
			panel.setPreferredSize(new Dimension(120, 10));
			panel.add(getLblImeFajla());
			panel.add(getBtnUcitaj());
			panel.add(getBtnObrisi());
			panel.add(getBtnSacuvaj());
			panel.add(getBtnIzadji());
		}
		return panel;
	}
	
	private JLabel getLblImeFajla() {
		if (lblImeFajla == null) {
			lblImeFajla = new JLabel("Ime Fajla");
		}
		return lblImeFajla;
	}
	private JTextField getTextField() {
		if (textField == null) {
			textField = new JTextField();
			textField.setPreferredSize(new Dimension(100, 20));
			textField.setColumns(10);
		}
		return textField;
	}
	private JButton getBtnUcitaj() {
		if (btnUcitaj == null) {
			btnUcitaj = new JButton("Ucitaj");
			btnUcitaj.setHorizontalAlignment(SwingConstants.LEADING);
		}
		return btnUcitaj;
	}
	private JButton getBtnObrisi() {
		if (btnObrisi == null) {
			btnObrisi = new JButton("Obrisi");
			btnObrisi.setHorizontalAlignment(SwingConstants.LEADING);
		}
		return btnObrisi;
	}
	private JButton getBtnSacuvaj() {
		if (btnSacuvaj == null) {
			btnSacuvaj = new JButton("Sacuvaj");
			btnSacuvaj.setHorizontalAlignment(SwingConstants.LEADING);
		}
		return btnSacuvaj;
	}
	private JButton getBtnIzadji() {
		if (btnIzadji == null) {
			btnIzadji = new JButton("Izadji");
			btnIzadji.setHorizontalAlignment(SwingConstants.LEADING);
		}
		return btnIzadji;
	}
	private JTextArea getTextArea() {
		if (textArea == null) {
			textArea = new JTextArea();
		}
		return textArea;
	}
}
