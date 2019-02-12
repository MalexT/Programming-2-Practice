package zadatak2.autobuska_stanica.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.JobAttributes;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import zadatak2.autobuska_stanica.AutobuskaStanica;
import zadatak2.autobuska_stanica.Polazak;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
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
	private JTextField textFieldDestin;
	private JTextField txtFieldD;
	private JTextField txtBrojslobodnihmesta;
	private JTextField textFieldM;
	private JTextField textFieldG;
	private JTextField textFieldDestinac;
	private JTextField textFieldBrK;
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
		setResizable(false);
		setTitle("Autobuska Stanica");
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
		contentPane.add(getTextFieldDestin());
		contentPane.add(getTxtFieldD());
		contentPane.add(getTxtBrojslobodnihmesta());
		contentPane.add(getTextFieldM());
		contentPane.add(getTextFieldG());
		contentPane.add(getTextFieldDestinac());
		contentPane.add(getTextFieldBrK());
	}
	private JLabel getLblUnos() {
		if (lblUnos == null) {
			lblUnos = new JLabel("UNOS");
			lblUnos.setBounds(40, 21, 46, 14);
		}
		return lblUnos;
	}
	private JLabel getLblDestinacija() {
		if (lblDestinacija == null) {
			lblDestinacija = new JLabel("Destinacija:");
			lblDestinacija.setBounds(40, 46, 151, 14);
		}
		return lblDestinacija;
	}
	private JLabel getLblPolazakdmg() {
		if (lblPolazakdmg == null) {
			lblPolazakdmg = new JLabel("Polazak (d/m/g)");
			lblPolazakdmg.setBounds(40, 71, 151, 14);
		}
		return lblPolazakdmg;
	}
	private JLabel getLblBrojSlobodnihMesta() {
		if (lblBrojSlobodnihMesta == null) {
			lblBrojSlobodnihMesta = new JLabel("Broj slobodnih mesta:");
			lblBrojSlobodnihMesta.setBounds(40, 96, 151, 14);
		}
		return lblBrojSlobodnihMesta;
	}
	private JButton getBtnDodaj() {
		if (btnDodaj == null) {
			btnDodaj = new JButton("Dodaj");
			btnDodaj.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					try {
						Polazak p = new Polazak();
						p.setDestinacija(textFieldDestin.getText());
						p.setBrojSlobodnihMesta(Integer.parseInt(txtBrojslobodnihmesta.getText()));
						int dan = Integer.parseInt(txtFieldD.getText());
						int mes = Integer.parseInt(textFieldM.getText());
						int god = Integer.parseInt(textFieldG.getText());
						GregorianCalendar vreme = new GregorianCalendar(god, mes-1, dan);
						p.setVreme(vreme);
						stanica.unesiPolazak(p);
						JOptionPane.showMessageDialog(null, "Uspesno unet polazak", "Uspeh", JOptionPane.INFORMATION_MESSAGE);
					}catch(Exception e) {
						JOptionPane.showMessageDialog(null, "Problem pri unosu polaska", "Greska", JOptionPane.ERROR_MESSAGE);
					}
				}
			});
			btnDodaj.setBounds(40, 121, 89, 23);
		}
		return btnDodaj;
	}
	private JButton getBtnObrisi() {
		if (btnObrisi == null) {
			btnObrisi = new JButton("Obrisi");
			btnObrisi.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					textFieldDestin.setText(null);
					txtBrojslobodnihmesta.setText(null);
					textFieldM.setText(null);
					textFieldG.setText(null);
					txtFieldD.setText(null);
				}
			});
			btnObrisi.setBounds(157, 121, 89, 23);
		}
		return btnObrisi;
	}
	private JLabel getLblRezervacija() {
		if (lblRezervacija == null) {
			lblRezervacija = new JLabel("REZERVACIJA");
			lblRezervacija.setBounds(40, 169, 120, 14);
		}
		return lblRezervacija;
	}
	private JLabel getLblDestinacija_1() {
		if (lblDestinacija_1 == null) {
			lblDestinacija_1 = new JLabel("Destinacija");
			lblDestinacija_1.setBounds(40, 194, 120, 14);
		}
		return lblDestinacija_1;
	}
	private JLabel getLblBrojKarata() {
		if (lblBrojKarata == null) {
			lblBrojKarata = new JLabel("Broj karata:");
			lblBrojKarata.setBounds(40, 219, 120, 14);
		}
		return lblBrojKarata;
	}
	private JButton getBtnRezervisi() {
		if (btnRezervisi == null) {
			btnRezervisi = new JButton("Rezervisi");
			btnRezervisi.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					String dest = textFieldDestinac.getText();
					int brojKarata =Integer.parseInt(textFieldBrK.getText());
					
					if(stanica.rezervisiKarte(dest, brojKarata))
						JOptionPane.showMessageDialog(null, "Rezervacija je uspenso obavljena", "Uspeh", JOptionPane.INFORMATION_MESSAGE);
					else {
						JOptionPane.showMessageDialog(null, "Rezervacija nije uspela", "Greska", JOptionPane.ERROR_MESSAGE);
					}
					
				}
			});
			btnRezervisi.setBounds(40, 244, 89, 23);
		}
		return btnRezervisi;
	}
	private JTextField getTextFieldDestin() {
		if (textFieldDestin == null) {
			textFieldDestin = new JTextField();
			textFieldDestin.setBounds(212, 40, 177, 20);
			textFieldDestin.setColumns(10);
		}
		return textFieldDestin;
	}
	private JTextField getTxtFieldD() {
		if (txtFieldD == null) {
			txtFieldD = new JTextField();
			txtFieldD.setBounds(212, 65, 34, 20);
			txtFieldD.setColumns(10);
		}
		return txtFieldD;
	}
	private JTextField getTxtBrojslobodnihmesta() {
		if (txtBrojslobodnihmesta == null) {
			txtBrojslobodnihmesta = new JTextField();
			txtBrojslobodnihmesta.setBounds(212, 90, 177, 20);
			txtBrojslobodnihmesta.setColumns(10);
		}
		return txtBrojslobodnihmesta;
	}
	private JTextField getTextFieldM() {
		if (textFieldM == null) {
			textFieldM = new JTextField();
			textFieldM.setColumns(10);
			textFieldM.setBounds(269, 65, 34, 20);
		}
		return textFieldM;
	}
	private JTextField getTextFieldG() {
		if (textFieldG == null) {
			textFieldG = new JTextField();
			textFieldG.setColumns(10);
			textFieldG.setBounds(324, 65, 34, 20);
		}
		return textFieldG;
	}
	private JTextField getTextFieldDestinac() {
		if (textFieldDestinac == null) {
			textFieldDestinac = new JTextField();
			textFieldDestinac.setBounds(212, 194, 177, 20);
			textFieldDestinac.setColumns(10);
		}
		return textFieldDestinac;
	}
	private JTextField getTextFieldBrK() {
		if (textFieldBrK == null) {
			textFieldBrK = new JTextField();
			textFieldBrK.setBounds(212, 219, 34, 20);
			textFieldBrK.setColumns(10);
		}
		return textFieldBrK;
	}
}
