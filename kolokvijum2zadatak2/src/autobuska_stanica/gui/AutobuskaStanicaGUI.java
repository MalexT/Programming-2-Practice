package autobuska_stanica.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import autobuska_stanica.AutobuskaStanica;
import autobuska_stanica.Polazak;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.util.GregorianCalendar;
import java.awt.event.ActionEvent;

public class AutobuskaStanicaGUI extends JFrame {

	private JPanel contentPane;
	private JLabel lblUnos;
	private JLabel lblDestinacija;
	private JLabel lblPolazakdmg;
	private JLabel lblBrojSlobodnihMesta;
	private JButton btnDodaj;
	private JButton btnObrisi;
	private JLabel lblRezervacija;
	private JLabel lblDestinacija_1;
	private JLabel lblBrojKarata;
	private JButton btnRezervisi;
	private JTextField textFieldDestinacija;
	private JTextField textFieldDan;
	private JTextField textFieldMesec;
	private JTextField textFieldGodina;
	private JTextField textFieldSlobodnaMesta;
	private JTextField textFieldDestinacijaRez;
	private JTextField textFieldBrojKarata;
	private AutobuskaStanica stanica = new AutobuskaStanica();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AutobuskaStanicaGUI frame = new AutobuskaStanicaGUI();
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
	public AutobuskaStanicaGUI() {
		setTitle("Autobuska Stanica");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblUnos());
		contentPane.add(getLblDestinacija());
		contentPane.add(getLblPolazakdmg());
		contentPane.add(getLblBrojSlobodnihMesta());
		contentPane.add(getBtnDodaj());
		contentPane.add(getBtnObrisi());
		contentPane.add(getLblRezervacija());
		contentPane.add(getLblDestinacija_1());
		contentPane.add(getLblBrojKarata());
		contentPane.add(getBtnRezervisi());
		contentPane.add(getTextFieldDestinacija());
		contentPane.add(getTextFieldDan());
		contentPane.add(getTextFieldMesec());
		contentPane.add(getTextFieldGodina());
		contentPane.add(getTextFieldSlobodnaMesta());
		contentPane.add(getTextFieldDestinacijaRez());
		contentPane.add(getTextFieldBrojKarata());
	}
	private JLabel getLblUnos() {
		if (lblUnos == null) {
			lblUnos = new JLabel("Unos");
			lblUnos.setFont(new Font("Tahoma", Font.PLAIN, 19));
			lblUnos.setBounds(10, 11, 122, 26);
		}
		return lblUnos;
	}
	private JLabel getLblDestinacija() {
		if (lblDestinacija == null) {
			lblDestinacija = new JLabel("Destinacija:");
			lblDestinacija.setBounds(10, 48, 150, 14);
		}
		return lblDestinacija;
	}
	private JLabel getLblPolazakdmg() {
		if (lblPolazakdmg == null) {
			lblPolazakdmg = new JLabel("Polazak (d/m/g):");
			lblPolazakdmg.setBounds(10, 73, 150, 14);
		}
		return lblPolazakdmg;
	}
	private JLabel getLblBrojSlobodnihMesta() {
		if (lblBrojSlobodnihMesta == null) {
			lblBrojSlobodnihMesta = new JLabel("Broj slobodnih mesta:");
			lblBrojSlobodnihMesta.setBounds(10, 98, 150, 14);
		}
		return lblBrojSlobodnihMesta;
	}
	private JButton getBtnDodaj() {
		if (btnDodaj == null) {
			btnDodaj = new JButton("Dodaj");
			btnDodaj.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					try {
					String dest = textFieldDestinacija.getText();
					int dan = Integer.parseInt(textFieldDan.getText());
					int mes = Integer.parseInt(textFieldMesec.getText());
					int god = Integer.parseInt(textFieldGodina.getText());
					int brojMesta = Integer.parseInt(textFieldSlobodnaMesta.getText());
					Polazak p = new Polazak();
					GregorianCalendar datum = new GregorianCalendar(god, mes-1, dan);
					p.setDestinacija(dest);
					p.setBrojSlobodnihMesta(brojMesta);
					p.setVreme(datum);
					
					stanica.unesiPolazak(p);
					JOptionPane.showMessageDialog(null, "Polazak je uspesno dodata", "Dodavanje polaska", JOptionPane.INFORMATION_MESSAGE);
					textFieldSlobodnaMesta.setText(null);
					textFieldDan.setText(null);
					textFieldMesec.setText(null);
					textFieldGodina.setText(null);
					textFieldDestinacija.setText(null);
					} catch (Exception e1) {
						JOptionPane.showMessageDialog(null, "Nije uspesno dodat polazak", "Neuspeh", JOptionPane.ERROR_MESSAGE);
						textFieldSlobodnaMesta.setText(null);
						textFieldDan.setText(null);
						textFieldMesec.setText(null);
						textFieldGodina.setText(null);
						textFieldDestinacija.setText(null);
					}
				}
			});
			btnDodaj.setBounds(10, 133, 89, 23);
		}
		return btnDodaj;
	}
	private JButton getBtnObrisi() {
		if (btnObrisi == null) {
			btnObrisi = new JButton("Obrisi");
			btnObrisi.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					textFieldSlobodnaMesta.setText(null);
					textFieldDan.setText(null);
					textFieldMesec.setText(null);
					textFieldGodina.setText(null);
					textFieldDestinacija.setText(null);
				}
			});
			btnObrisi.setBounds(125, 133, 89, 23);
		}
		return btnObrisi;
	}
	private JLabel getLblRezervacija() {
		if (lblRezervacija == null) {
			lblRezervacija = new JLabel("Rezervacija");
			lblRezervacija.setFont(new Font("Tahoma", Font.PLAIN, 19));
			lblRezervacija.setBounds(10, 163, 108, 25);
		}
		return lblRezervacija;
	}
	private JLabel getLblDestinacija_1() {
		if (lblDestinacija_1 == null) {
			lblDestinacija_1 = new JLabel("Destinacija");
			lblDestinacija_1.setBounds(10, 192, 108, 14);
		}
		return lblDestinacija_1;
	}
	private JLabel getLblBrojKarata() {
		if (lblBrojKarata == null) {
			lblBrojKarata = new JLabel("Broj Karata:");
			lblBrojKarata.setBounds(10, 217, 108, 14);
		}
		return lblBrojKarata;
	}
	private JButton getBtnRezervisi() {
		if (btnRezervisi == null) {
			btnRezervisi = new JButton("Rezervisi");
			btnRezervisi.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String dest = textFieldDestinacijaRez.getText();
					int brojK = Integer.parseInt(textFieldBrojKarata.getText());
					
					boolean uspesno = stanica.rezervisiKarte(dest, brojK);
					if(uspesno)
						JOptionPane.showMessageDialog(null, "Uspesno dodata rezervacija", "Uspeh", JOptionPane.INFORMATION_MESSAGE);
					else
						JOptionPane.showMessageDialog(null, "Nije uspesna rezervacija", "Greska", JOptionPane.ERROR_MESSAGE);
				}
			});
			btnRezervisi.setBounds(10, 242, 89, 23);
		}
		return btnRezervisi;
	}
	private JTextField getTextFieldDestinacija() {
		if (textFieldDestinacija == null) {
			textFieldDestinacija = new JTextField();
			textFieldDestinacija.setBounds(172, 45, 164, 20);
			textFieldDestinacija.setColumns(10);
		}
		return textFieldDestinacija;
	}
	private JTextField getTextFieldDan() {
		if (textFieldDan == null) {
			textFieldDan = new JTextField();
			textFieldDan.setBounds(172, 70, 29, 20);
			textFieldDan.setColumns(2);
		}
		return textFieldDan;
	}
	private JTextField getTextFieldMesec() {
		if (textFieldMesec == null) {
			textFieldMesec = new JTextField();
			textFieldMesec.setBounds(211, 70, 29, 20);
			textFieldMesec.setColumns(1);
		}
		return textFieldMesec;
	}
	private JTextField getTextFieldGodina() {
		if (textFieldGodina == null) {
			textFieldGodina = new JTextField();
			textFieldGodina.setBounds(250, 70, 86, 20);
			textFieldGodina.setColumns(4);
		}
		return textFieldGodina;
	}
	private JTextField getTextFieldSlobodnaMesta() {
		if (textFieldSlobodnaMesta == null) {
			textFieldSlobodnaMesta = new JTextField();
			textFieldSlobodnaMesta.setBounds(172, 95, 29, 20);
			textFieldSlobodnaMesta.setColumns(10);
		}
		return textFieldSlobodnaMesta;
	}
	private JTextField getTextFieldDestinacijaRez() {
		if (textFieldDestinacijaRez == null) {
			textFieldDestinacijaRez = new JTextField();
			textFieldDestinacijaRez.setBounds(142, 189, 164, 20);
			textFieldDestinacijaRez.setColumns(10);
		}
		return textFieldDestinacijaRez;
	}
	private JTextField getTextFieldBrojKarata() {
		if (textFieldBrojKarata == null) {
			textFieldBrojKarata = new JTextField();
			textFieldBrojKarata.setBounds(142, 214, 29, 20);
			textFieldBrojKarata.setColumns(10);
		}
		return textFieldBrojKarata;
	}
}
