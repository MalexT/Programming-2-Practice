package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.JTextField;
import java.awt.Dimension;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class KonvertorMetrickiGUI extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldUnos;
	private JComboBox comboBox;
	private JTextField textFieldIspis;
	private JButton btnKonvertuj;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					KonvertorMetrickiGUI frame = new KonvertorMetrickiGUI();
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
	public KonvertorMetrickiGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		contentPane.add(getTextFieldUnos());
		contentPane.add(getComboBox());
		contentPane.add(getTextFieldIspis());
		contentPane.add(getBtnKonvertuj());
	}

	private JTextField getTextFieldUnos() {
		if (textFieldUnos == null) {
			textFieldUnos = new JTextField();
			textFieldUnos.setPreferredSize(new Dimension(1200, 20));
			textFieldUnos.setColumns(15);
		}
		return textFieldUnos;
	}

	private JComboBox getComboBox() {
		if (comboBox == null) {
			comboBox = new JComboBox();
			comboBox.setModel(new DefaultComboBoxModel(
					new String[] { "km -> milje", "milje -> km", "m -> stope", "stope -> m", "kg -> lb", "lb -> kg" }));
		}
		return comboBox;
	}

	private JTextField getTextFieldIspis() {
		if (textFieldIspis == null) {
			textFieldIspis = new JTextField();
			textFieldIspis.setEditable(false);
			textFieldIspis.setColumns(15);
		}
		return textFieldIspis;
	}

	private JButton getBtnKonvertuj() {
		if (btnKonvertuj == null) {
			btnKonvertuj = new JButton("Konvertuj");
			btnKonvertuj.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					MetrickoImperijalniKonvertor mik = new MetrickoImperijalniKonvertor();

					if (comboBox.getSelectedItem() != null && comboBox.getSelectedItem().equals("km -> milje")) {
						textFieldIspis.setText("" + mik.konvertujKmUMi(Double.parseDouble(textFieldUnos.getText())));
					}
					if (comboBox.getSelectedItem() != null && comboBox.getSelectedItem().equals("milje -> km")) {
						textFieldIspis.setText("" + mik.konvertujMiUKm(Double.parseDouble(textFieldUnos.getText())));
					}
					if (comboBox.getSelectedItem() != null && comboBox.getSelectedItem().equals("m -> stope")) {
						textFieldIspis.setText("" + mik.konvertujMUSt(Double.parseDouble(textFieldUnos.getText())));
					}
					if (comboBox.getSelectedItem() != null && comboBox.getSelectedItem().equals("stope - > m")) {
						textFieldIspis.setText("" + mik.konvertujStUM(Double.parseDouble(textFieldUnos.getText())));
					}
					if (comboBox.getSelectedItem() != null && comboBox.getSelectedItem().equals("kg -> lb")) {
						textFieldIspis.setText("" + mik.konvertujKgULb(Double.parseDouble(textFieldUnos.getText())));
					}
					if (comboBox.getSelectedItem() != null && comboBox.getSelectedItem().equals("lb -> kg")) {
						textFieldIspis.setText("" + mik.konvertujLbUKg(Double.parseDouble(textFieldUnos.getText())));
					}
				}
			});
		}
		return btnKonvertuj;
	}
}
