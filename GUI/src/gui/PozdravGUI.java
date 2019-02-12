package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PozdravGUI extends JFrame {

	private JPanel contentPane;
	private JButton btnPozdrav1;
	private JButton btnPozdrav2;
	private JLabel lblPoruka;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PozdravGUI frame = new PozdravGUI();
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
	public PozdravGUI() {
		setResizable(false);
		setTitle("Pozdrav");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getBtnPozdrav1());
		contentPane.add(getBtnPozdrav2());
		contentPane.add(getLblPoruka());
	}
	private JButton getBtnPozdrav1() {
		if (btnPozdrav1 == null) {
			btnPozdrav1 = new JButton("Pozdrav 1");
			btnPozdrav1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					lblPoruka.setText("Dobar dan");
				}
			});
			btnPozdrav1.setBounds(66, 175, 122, 23);
		}
		return btnPozdrav1;
	}
	private JButton getBtnPozdrav2() {
		if (btnPozdrav2 == null) {
			btnPozdrav2 = new JButton("Pozdrav 2");
			btnPozdrav2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					lblPoruka.setText("Laku noc!");
				}
			});
			btnPozdrav2.setBounds(254, 175, 122, 23);
		}
		return btnPozdrav2;
	}
	private JLabel getLblPoruka() {
		if (lblPoruka == null) {
			lblPoruka = new JLabel("Dobro jutro");
			lblPoruka.setBounds(169, 104, 122, 31);
		}
		return lblPoruka;
	}
}
