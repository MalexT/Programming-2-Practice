package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.Dimension;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.awt.event.ActionEvent;

public class KonvertorTemperatureGUI extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldVrednost;
	private JComboBox comboBoxPadajucaLista;
	private JButton btnKonvertuj;
	private JTextField textFieldRezultat;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					KonvertorTemperatureGUI frame = new KonvertorTemperatureGUI();
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
	public KonvertorTemperatureGUI() {
		setTitle("Konvertor Temperature");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 376, 288);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		contentPane.add(getTextFieldVrednost());
		contentPane.add(getComboBoxPadajucaLista());
		contentPane.add(getBtnKonvertuj());
		contentPane.add(getTextFieldRezultat());
	}

	private JTextField getTextFieldVrednost() {
		if (textFieldVrednost == null) {
			textFieldVrednost = new JTextField();
			textFieldVrednost.setPreferredSize(new Dimension(120, 20));
			textFieldVrednost.setColumns(10);
		}
		return textFieldVrednost;
	}
	private JComboBox getComboBoxPadajucaLista() {
		if (comboBoxPadajucaLista == null) {
			comboBoxPadajucaLista = new JComboBox();
			comboBoxPadajucaLista.setModel(new DefaultComboBoxModel(new String[] {"Konvertuj u C", "Konvertuj u F"}));
		}
		return comboBoxPadajucaLista;
	}
	private JButton getBtnKonvertuj() {
		if (btnKonvertuj == null) {
			btnKonvertuj = new JButton("Konvertuj");
			btnKonvertuj.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					KonvertorTemperature kT = new KonvertorTemperature();
					DecimalFormat dFormat = new DecimalFormat("##,##0");
					
					if(comboBoxPadajucaLista.getSelectedItem()!=null && comboBoxPadajucaLista.getSelectedItem().equals("Konvertuj u C")) {
						textFieldRezultat.setText(""+ dFormat.format(kT.konvertujFUC(Double.parseDouble(textFieldVrednost.getText()))));
					}
					if(comboBoxPadajucaLista.getSelectedItem() != null && comboBoxPadajucaLista.getSelectedItem().equals("Konvertuj u F")) {
						textFieldRezultat.setText(""+ dFormat.format(kT.konvertujCUF(Double.parseDouble(textFieldVrednost.getText()))));
					}
						
				}
			});
		}
		return btnKonvertuj;
	}
	private JTextField getTextFieldRezultat() {
		if (textFieldRezultat == null) {
			textFieldRezultat = new JTextField();
			textFieldRezultat.setPreferredSize(new Dimension(11, 20));
			textFieldRezultat.setEditable(false);
			textFieldRezultat.setColumns(10);
		}
		return textFieldRezultat;
	}
}
