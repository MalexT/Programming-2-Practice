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

public class KonvertorGUI extends JFrame {

	private JPanel contentPane;
	private JLabel lblDinarskiIznos;
	private JTextField textFieldDin;
	private JButton btnDinUEur;
	private JTextField textFieldEur;
	private JLabel lblIznosUEvrima;
	private JButton btnKonvertujEud;

	Konvertor k =  new Konvertor();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					KonvertorGUI frame = new KonvertorGUI();
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
	public KonvertorGUI() {
		setResizable(false);
		setTitle("Konvertor");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblDinarskiIznos());
		contentPane.add(getTextFieldDin());
		contentPane.add(getBtnDinUEur());
		contentPane.add(getTextFieldEur());
		contentPane.add(getLblIznosUEvrima());
		contentPane.add(getBtnKonvertujEud());
	}
	private JLabel getLblDinarskiIznos() {
		if (lblDinarskiIznos == null) {
			lblDinarskiIznos = new JLabel("Dinarski iznos");
			lblDinarskiIznos.setBounds(36, 80, 125, 23);
		}
		return lblDinarskiIznos;
	}
	private JTextField getTextFieldDin() {
		if (textFieldDin == null) {
			textFieldDin = new JTextField();
			textFieldDin.setBounds(36, 114, 125, 20);
			textFieldDin.setColumns(10);
		}
		return textFieldDin;
	}
	private JButton getBtnDinUEur() {
		if (btnDinUEur == null) {
			btnDinUEur = new JButton("Konvertuj DUE");
			btnDinUEur.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					String s = textFieldDin.getText();
					
					double din = Double.parseDouble(s);
					textFieldEur.setText(k.dinUEur(din)+"");
				}
			});
			btnDinUEur.setBounds(36, 176, 125, 23);
		}
		return btnDinUEur;
	}
	private JTextField getTextFieldEur() {
		if (textFieldEur == null) {
			textFieldEur = new JTextField();
			textFieldEur.setColumns(10);
			textFieldEur.setBounds(264, 114, 125, 20);
		}
		return textFieldEur;
	}
	private JLabel getLblIznosUEvrima() {
		if (lblIznosUEvrima == null) {
			lblIznosUEvrima = new JLabel("Iznos u evrima");
			lblIznosUEvrima.setBounds(264, 80, 125, 23);
		}
		return lblIznosUEvrima;
	}
	private JButton getBtnKonvertujEud() {
		if (btnKonvertujEud == null) {
			btnKonvertujEud = new JButton("Konvertuj EUD");
			btnKonvertujEud.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					double eur = Double.parseDouble(textFieldEur.getText());
					
					textFieldDin.setText(k.eurUDin(eur)+"");
				}
			});
			btnKonvertujEud.setBounds(264, 176, 125, 23);
		}
		return btnKonvertujEud;
	}
}
