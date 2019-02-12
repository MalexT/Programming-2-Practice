package zadatak4.grad.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import zadatak4.grad.Grad;
import zadatak4.grad.KatalogGradova;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;

public class KatalogGradovaGUI extends JFrame {

	private JPanel contentPane;
	private JLabel lblNazivGrada;
	private JLabel lblBrojStanovnika;
	private JTextField textNazivGrada;
	private JTextField textBrojStanovnika;
	private JButton btnDodaj;
	private JButton btnSacuvaj;
	private JButton btnObrisi;
	private KatalogGradova kt = new KatalogGradova();
	private JTextArea textArea;
	private JButton btnPrikazi;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					KatalogGradovaGUI frame = new KatalogGradovaGUI();
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
	public KatalogGradovaGUI() {
		setTitle("Katalog Gradova");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 613, 437);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblNazivGrada());
		contentPane.add(getLblBrojStanovnika());
		contentPane.add(getTextNazivGrada());
		contentPane.add(getTextBrojStanovnika());
		contentPane.add(getBtnDodaj());
		contentPane.add(getBtnSacuvaj());
		contentPane.add(getBtnObrisi());
		contentPane.add(getTextArea());
		contentPane.add(getBtnPrikazi());
	}

	private JLabel getLblNazivGrada() {
		if (lblNazivGrada == null) {
			lblNazivGrada = new JLabel("Naziv grada");
			lblNazivGrada.setBounds(38, 81, 117, 14);
		}
		return lblNazivGrada;
	}

	private JLabel getLblBrojStanovnika() {
		if (lblBrojStanovnika == null) {
			lblBrojStanovnika = new JLabel("Broj stanovnika");
			lblBrojStanovnika.setBounds(197, 81, 103, 14);
		}
		return lblBrojStanovnika;
	}

	private JTextField getTextNazivGrada() {
		if (textNazivGrada == null) {
			textNazivGrada = new JTextField();
			textNazivGrada.setBounds(38, 106, 103, 20);
			textNazivGrada.setColumns(10);
		}
		return textNazivGrada;
	}

	private JTextField getTextBrojStanovnika() {
		if (textBrojStanovnika == null) {
			textBrojStanovnika = new JTextField();
			textBrojStanovnika.setColumns(10);
			textBrojStanovnika.setBounds(197, 106, 103, 20);
		}
		return textBrojStanovnika;
	}

	private JButton getBtnDodaj() {
		if (btnDodaj == null) {
			btnDodaj = new JButton("Dodaj");
			btnDodaj.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {

					try {
						String naziv = textNazivGrada.getText();
						int brojStanovnika = Integer.parseInt(textBrojStanovnika.getText());
						Grad g = new Grad();
						g.setNaziv(naziv);
						g.setBrojStanovnika(brojStanovnika);
						kt.dodajGrad(g);
						JOptionPane.showMessageDialog(null, "Grad je uspesno dodat", "Uspeh",
								JOptionPane.INFORMATION_MESSAGE);
					} catch (Exception e) {
						JOptionPane.showMessageDialog(null, "Greska prilikom dodavanja grada", "Greska",
								JOptionPane.ERROR_MESSAGE);
					}
				}
			});
			btnDodaj.setBounds(38, 167, 89, 23);
		}
		return btnDodaj;
	}

	private JButton getBtnSacuvaj() {
		if (btnSacuvaj == null) {
			btnSacuvaj = new JButton("Sacuvaj");
			btnSacuvaj.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					try {
						kt.upisiGradoveUKategorije();
						JOptionPane.showMessageDialog(null, "Gradovi su sacuvani", "Uspeh",
								JOptionPane.INFORMATION_MESSAGE);
					} catch (Exception e) {
						JOptionPane.showMessageDialog(null, "Gradovi nisu uspesno uneti", "Greska",
								JOptionPane.ERROR_MESSAGE);
					}
				}
			});
			btnSacuvaj.setBounds(137, 167, 89, 23);
		}
		return btnSacuvaj;
	}

	private JButton getBtnObrisi() {
		if (btnObrisi == null) {
			btnObrisi = new JButton("Obrisi");
			btnObrisi.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					textNazivGrada.setText(null);
					textBrojStanovnika.setText(null);
				}
			});
			btnObrisi.setBounds(236, 167, 89, 23);
		}
		return btnObrisi;
	}

	private JTextArea getTextArea() {
		if (textArea == null) {
			textArea = new JTextArea();
			textArea.setBounds(38, 216, 287, 139);
		}
		return textArea;
	}

	private JButton getBtnPrikazi() {
		if (btnPrikazi == null) {
			btnPrikazi = new JButton("Prikazi");
			btnPrikazi.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					kt.ispisiListu();
				}
			});
			btnPrikazi.setBounds(347, 130, 89, 23);
		}
		return btnPrikazi;
	}
}
