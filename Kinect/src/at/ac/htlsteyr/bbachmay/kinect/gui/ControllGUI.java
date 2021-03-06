package at.ac.htlsteyr.bbachmay.kinect.gui;

import javax.swing.*;
import javax.swing.border.*;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.FlowLayout;

public class ControllGUI extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JButton freeze_btn;
	private JButton exitprog_btn;
	private JProgressBar bar_left;
	private JProgressBar bar_right;
	private boolean frozen;
	private boolean exit;

	/**
	 * Create the frame.
	 */
	public ControllGUI() {
		frozen = false;
		exit = false;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 480, 80);
		setTitle("Robo-Controll");
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		freeze_btn = new JButton("Freeze");
		freeze_btn.addActionListener(this);
		freeze_btn.setFont(new Font("Tahoma", Font.BOLD, 11));
		freeze_btn.setActionCommand("freeze");
		contentPane.add(freeze_btn);
		bar_right = new JProgressBar(-360, 360);
		bar_right.setStringPainted(true);
		contentPane.add(bar_right);
		bar_left = new JProgressBar(-360, 360);
		bar_left.setStringPainted(true);
		contentPane.add(bar_left);
		exitprog_btn = new JButton("Exit");
		exitprog_btn.addActionListener(this);
		exitprog_btn.setActionCommand("exit");
		contentPane.add(exitprog_btn);

		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals("freeze"))
			frozen = true;
		if (e.getActionCommand().equals("exit"))
			exit = true;
	}

	public boolean frozen() {
		return frozen;
	}

	public boolean is_exit() {
		return exit;
	}
}
