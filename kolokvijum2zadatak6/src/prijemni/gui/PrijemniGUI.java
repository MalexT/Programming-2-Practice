package prijemni.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Dimension;
import java.awt.Component;
import java.awt.Rectangle;

public class PrijemniGUI extends JFrame {

	private static final long serialVersionUID = 1L;
	
	private JPanel contentPane;
	private JTextArea textArea;
	private JPanel gornjiPanel;
	private JLabel lblNazivFajla;
	private JTextField jtfNazivFajla;
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
		setBounds(100, 100, 481, 326);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		contentPane.add(getTextArea(), BorderLayout.CENTER);
		contentPane.add(getGornjiPanel(), BorderLayout.NORTH);
	}

	private JTextArea getTextArea() {
		if (textArea == null) {
			textArea = new JTextArea();
		}
		return textArea;
	}

	private JPanel getGornjiPanel() {
		if (gornjiPanel == null) {
			gornjiPanel = new JPanel();
			gornjiPanel.setPreferredSize(new Dimension(1, 110));
			gornjiPanel.setLayout(null);
			gornjiPanel.add(getLblNazivFajla());
			gornjiPanel.add(getJtfNazivFajla());
			gornjiPanel.add(getBtnUcitaj());
			gornjiPanel.add(getBtnIspisi());
			gornjiPanel.add(getBtnIzadji());
		}
		return gornjiPanel;
	}

	private JLabel getLblNazivFajla() {
		if (lblNazivFajla == null) {
			lblNazivFajla = new JLabel("Naziv fajla:");
			lblNazivFajla.setBounds(16, 6, 265, 16);
		}
		return lblNazivFajla;
	}

	private JTextField getJtfNazivFajla() {
		if (jtfNazivFajla == null) {
			jtfNazivFajla = new JTextField();
			jtfNazivFajla.setBounds(16, 34, 265, 26);
			jtfNazivFajla.setColumns(10);
		}
		return jtfNazivFajla;
	}

	private JButton getBtnUcitaj() {
		if (btnUcitaj == null) {
			btnUcitaj = new JButton("Ucitaj");
			btnUcitaj.setBounds(16, 72, 117, 29);
		}
		return btnUcitaj;
	}

	private JButton getBtnIspisi() {
		if (btnIspisi == null) {
			btnIspisi = new JButton("Ispisi");
			btnIspisi.setBounds(164, 72, 117, 29);
		}
		return btnIspisi;
	}

	private JButton getBtnIzadji() {
		if (btnIzadji == null) {
			btnIzadji = new JButton("Izadji");
			btnIzadji.setBounds(317, 72, 117, 29);
		}
		return btnIzadji;
	}
}
