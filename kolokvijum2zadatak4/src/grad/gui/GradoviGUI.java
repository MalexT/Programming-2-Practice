package grad.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import grad.Grad;
import grad.KatalogGradova;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GradoviGUI extends JFrame {

	private JPanel contentPane;
	private JLabel lblNazivGrada;
	private JLabel lblBrojStanovnika;
	private JTextField textField;
	private JTextField textField_1;
	private JButton btnDodaj;
	private JButton btnSacuvaj;
	private JButton btnObrisi;
	private KatalogGradova katalog = new KatalogGradova();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GradoviGUI frame = new GradoviGUI();
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
	public GradoviGUI() {
		setTitle("Katalog Gradova");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblNazivGrada());
		contentPane.add(getLblBrojStanovnika());
		contentPane.add(getTextField());
		contentPane.add(getTextField_1());
		contentPane.add(getBtnDodaj());
		contentPane.add(getBtnSacuvaj());
		contentPane.add(getBtnObrisi());
	}

	private JLabel getLblNazivGrada() {
		if (lblNazivGrada == null) {
			lblNazivGrada = new JLabel("Naziv Grada");
			lblNazivGrada.setBounds(45, 64, 108, 14);
		}
		return lblNazivGrada;
	}
	private JLabel getLblBrojStanovnika() {
		if (lblBrojStanovnika == null) {
			lblBrojStanovnika = new JLabel("Broj Stanovnika");
			lblBrojStanovnika.setBounds(223, 64, 108, 14);
		}
		return lblBrojStanovnika;
	}
	private JTextField getTextField() {
		if (textField == null) {
			textField = new JTextField();
			textField.setBounds(45, 117, 108, 20);
			textField.setColumns(10);
		}
		return textField;
	}
	private JTextField getTextField_1() {
		if (textField_1 == null) {
			textField_1 = new JTextField();
			textField_1.setBounds(223, 117, 108, 20);
			textField_1.setColumns(10);
		}
		return textField_1;
	}
	private JButton getBtnDodaj() {
		if (btnDodaj == null) {
			btnDodaj = new JButton("Dodaj");
			btnDodaj.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					try {
					String naziv = textField.getText();
					int brojStanovnika = Integer.parseInt(textField_1.getText());
					Grad g = new Grad();
					g.setNaziv(naziv);
					g.setBrojStanovnika(brojStanovnika);
					katalog.dodajGrad(g);
					JOptionPane.showMessageDialog(null, "Grad je uspesno dodat", "Uspeh", JOptionPane.INFORMATION_MESSAGE);
					}catch(Exception e1) {
						JOptionPane.showMessageDialog(null, "Greska prilikom dodavanja grada", "Greska", JOptionPane.ERROR_MESSAGE);
					}
				}
			});
			btnDodaj.setBounds(45, 190, 89, 23);
		}
		return btnDodaj;
	}
	private JButton getBtnSacuvaj() {
		if (btnSacuvaj == null) {
			btnSacuvaj = new JButton("Sacuvaj");
			btnSacuvaj.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					try {
						katalog.upisiGradoveUKategorije();
						JOptionPane.showMessageDialog(null, "Gradovi su sacuvani", "Uspeh", JOptionPane.INFORMATION_MESSAGE);
					} catch (Exception e1) {
						JOptionPane.showMessageDialog(null, "Greska prilikom cuvanja", "Greska", JOptionPane.ERROR_MESSAGE);
						e1.printStackTrace();
					}
					
					
				}
			});
			btnSacuvaj.setBounds(144, 190, 110, 23);
		}
		return btnSacuvaj;
	}
	private JButton getBtnObrisi() {
		if (btnObrisi == null) {
			btnObrisi = new JButton("Obrisi");
			btnObrisi.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					textField.setText(null);
					textField_1.setText(null);
				}
			});
			btnObrisi.setBounds(264, 190, 105, 23);
		}
		return btnObrisi;
	}
}
