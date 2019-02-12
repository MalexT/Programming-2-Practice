package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.JobAttributes;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Dimension;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class JEBNIGUI extends JFrame {

	private JPanel contentPane;
	private JPanel panel;
	private JLabel lblImeFajla;
	private JTextField textField;
	private JButton btnUcitaj;
	private JButton btnObrisi;
	private JButton btnSacuvaj;
	private JButton btnIzadji;
	private JScrollPane scrollPane;
	private JTextArea textAreaEditor;
	private TekstDemo td = new TekstDemo();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JEBNIGUI frame = new JEBNIGUI();
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
	public JEBNIGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		contentPane.add(getPanel(), BorderLayout.WEST);
		contentPane.add(getScrollPane(), BorderLayout.CENTER);
	}

	private JPanel getPanel() {
		if (panel == null) {
			panel = new JPanel();
			panel.setPreferredSize(new Dimension(120, 10));
			panel.add(getLblImeFajla());
			panel.add(getTextField());
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
			lblImeFajla.setHorizontalAlignment(SwingConstants.CENTER);
			lblImeFajla.setPreferredSize(new Dimension(110, 20));
		}
		return lblImeFajla;
	}
	private JTextField getTextField() {
		if (textField == null) {
			textField = new JTextField();
			textField.setPreferredSize(new Dimension(110, 20));
			textField.setColumns(10);
		}
		return textField;
	}
	private JButton getBtnUcitaj() {
		if (btnUcitaj == null) {
			btnUcitaj = new JButton("Ucitaj");
			btnUcitaj.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					String s = textField.getText();
					try {
						textAreaEditor.setText(td.ucitajTekst(s));
					} catch (IOException e) {
						JOptionPane.showMessageDialog(null, "Greska prilikom otvaranja fajla", "GRESKA", JOptionPane.ERROR_MESSAGE);
						e.printStackTrace();
					}
				}
			});
			btnUcitaj.setPreferredSize(new Dimension(110, 20));
		}
		return btnUcitaj;
	}
	private JButton getBtnObrisi() {
		if (btnObrisi == null) {
			btnObrisi = new JButton("Obrisi");
			btnObrisi.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					textAreaEditor.setText(null);
				}
			});
			btnObrisi.setPreferredSize(new Dimension(110, 20));
		}
		return btnObrisi;
	}
	private JButton getBtnSacuvaj() {
		if (btnSacuvaj == null) {
			btnSacuvaj = new JButton("Sacuvaj");
			btnSacuvaj.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String s = textField.getText();
					try {
						td.upisiTekst(s, textAreaEditor.getText());
					} catch (IOException e1) {
						JOptionPane.showMessageDialog(null, "Snimanje teksta nije uspesno.", "Snimanje teksta", JOptionPane.ERROR_MESSAGE);
						e1.printStackTrace();
					}
				}
			});
			btnSacuvaj.setPreferredSize(new Dimension(110, 20));
		}
		return btnSacuvaj;
	}
	private JButton getBtnIzadji() {
		if (btnIzadji == null) {
			btnIzadji = new JButton("Izadji");
			btnIzadji.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					int odgovor = JOptionPane.showConfirmDialog(null, "Da li zelite da izadjete iz programa?", "Izlaz", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
					if(odgovor == JOptionPane.YES_OPTION)
					System.exit(0);
				}
			});
			btnIzadji.setPreferredSize(new Dimension(110, 20));
		}
		return btnIzadji;
	}
	private JScrollPane getScrollPane() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.setViewportView(getTextAreaEditor());
		}
		return scrollPane;
	}
	private JTextArea getTextAreaEditor() {
		if (textAreaEditor == null) {
			textAreaEditor = new JTextArea();
		}
		return textAreaEditor;
	}
}
