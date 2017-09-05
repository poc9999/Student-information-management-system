package com.langxikeji.JDBC;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;

import javax.swing.SwingConstants;
import javax.swing.JButton;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

public class V_Updata_Panel {

	private JFrame frame;
	private JTextField t2;
	private JTextField t3;
	private JTextField t4;
	private JTextField t5;
	private JTextField t1;

	private boolean flag = false;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					V_Updata_Panel window = new V_Updata_Panel();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public V_Updata_Panel() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("\u5B66\u751F\u4FE1\u606F\u4FEE\u6539");
		frame.setBounds(100, 100, 450, 456);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("\u59D3\u540D\uFF1A");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("宋体", Font.PLAIN, 18));
		lblNewLabel.setBounds(28, 135, 78, 40);
		frame.getContentPane().add(lblNewLabel);

		JLabel label = new JLabel("\u6027\u522B\uFF1A");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("宋体", Font.PLAIN, 18));
		label.setBounds(28, 185, 78, 40);
		frame.getContentPane().add(label);

		JLabel label_1 = new JLabel("\u5E74\u9F84\uFF1A");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setFont(new Font("宋体", Font.PLAIN, 18));
		label_1.setBounds(28, 235, 78, 40);
		frame.getContentPane().add(label_1);

		JLabel label_2 = new JLabel("\u5B66\u6821\uFF1A");
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setFont(new Font("宋体", Font.PLAIN, 18));
		label_2.setBounds(28, 285, 78, 40);
		frame.getContentPane().add(label_2);

		final JButton b2 = new JButton("\u786E\u8BA4\u4FEE\u6539");
		b2.setFont(new Font("宋体", Font.PLAIN, 14));
		b2.setBounds(288, 346, 94, 40);
		b2.setEnabled(false);
		frame.getContentPane().add(b2);

		JLabel lblNewLabel_1 = new JLabel(
				"\u5B66\u751F\u4FE1\u606F\u4FEE\u6539");
		lblNewLabel_1.setForeground(Color.BLACK);
		lblNewLabel_1.setFont(new Font("方正舒体", Font.PLAIN, 30));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(49, 10, 301, 40);
		frame.getContentPane().add(lblNewLabel_1);

		t1 = new JTextField();
		t1.setColumns(10);
		t1.setBounds(106, 93, 153, 29);
		frame.getContentPane().add(t1);

		t2 = new JTextField();
		t2.setEditable(false);
		t2.setBounds(106, 143, 153, 29);
		frame.getContentPane().add(t2);
		t2.setColumns(10);

		t3 = new JTextField();
		t3.setColumns(10);
		t3.setEditable(false);
		t3.setBounds(106, 193, 153, 29);
		frame.getContentPane().add(t3);

		t4 = new JTextField();
		t4.setColumns(10);
		t4.setEditable(false);
		t4.setBounds(106, 243, 153, 29);
		frame.getContentPane().add(t4);

		t5 = new JTextField();
		t5.setColumns(10);
		t5.setEditable(false);
		t5.setBounds(106, 293, 153, 29);
		frame.getContentPane().add(t5);

		JLabel label_3 = new JLabel("\u5B66\u53F7\uFF1A");
		label_3.setHorizontalAlignment(SwingConstants.CENTER);
		label_3.setFont(new Font("宋体", Font.PLAIN, 18));
		label_3.setBounds(28, 85, 78, 40);
		frame.getContentPane().add(label_3);

		JButton b1 = new JButton("\u9A8C\u8BC1\u5B66\u53F7");
		b1.setFont(new Font("宋体", Font.PLAIN, 15));
		b1.setBounds(288, 85, 94, 40);

		b1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

				if (t1.getText().trim().length() != 0) {

					if (M_Student.Check_ById(Integer.parseInt(t1.getText()
							.trim()))) {

						t2.setEditable(true);
						t3.setEditable(true);
						t4.setEditable(true);
						t5.setEditable(true);
						b2.setEnabled(true);
						flag = true;
					} else {
						JOptionPane.showMessageDialog(null, "该学生编号不存在", "警告",
								JOptionPane.WARNING_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(null, "非法字符", "警告",
							JOptionPane.ERROR_MESSAGE);
				}
			}
		});

		b2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
					M_Student.Updata_ById(Integer.parseInt(t1.getText()),
							t2.getText(), t3.getText(),
							Integer.parseInt(t4.getText()), t5.getText());
					
					JOptionPane.showMessageDialog(null, "修改成功","提示",JOptionPane.PLAIN_MESSAGE);

			}
		});
		frame.getContentPane().add(b1);

	}

}
