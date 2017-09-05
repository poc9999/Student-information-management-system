package com.langxikeji.JDBC;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;

import javax.swing.SwingConstants;
import javax.swing.JTextField;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class Insert_Stu {

	private JFrame frame;
	private JTextField t1;
	private JTextField t2;
	private JTextField t3;
	private JTextField t4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Insert_Stu window = new Insert_Stu();
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
	public Insert_Stu() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("\u63D2\u5165\u5B66\u751F\u4FE1\u606F");
		frame.setBounds(100, 100, 450, 404);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel label = new JLabel("\u59D3\u540D\uFF1A");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("宋体", Font.PLAIN, 18));
		label.setBounds(21, 68, 78, 40);
		frame.getContentPane().add(label);

		JLabel label_1 = new JLabel("\u6027\u522B\uFF1A");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setFont(new Font("宋体", Font.PLAIN, 18));
		label_1.setBounds(21, 128, 78, 40);
		frame.getContentPane().add(label_1);

		JLabel label_2 = new JLabel("\u5E74\u9F84\uFF1A");
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setFont(new Font("宋体", Font.PLAIN, 18));
		label_2.setBounds(21, 191, 78, 40);
		frame.getContentPane().add(label_2);

		JLabel label_3 = new JLabel("\u5B66\u6821\uFF1A");
		label_3.setHorizontalAlignment(SwingConstants.CENTER);
		label_3.setFont(new Font("宋体", Font.PLAIN, 18));
		label_3.setBounds(21, 256, 78, 40);
		frame.getContentPane().add(label_3);

		t1 = new JTextField();
		t1.setColumns(10);
		t1.setBounds(141, 80, 153, 29);
		frame.getContentPane().add(t1);

		t2 = new JTextField();
		t2.setColumns(10);
		t2.setBounds(141, 140, 153, 29);
		frame.getContentPane().add(t2);

		t3 = new JTextField();
		t3.setColumns(10);
		t3.setBounds(141, 203, 153, 29);
		frame.getContentPane().add(t3);

		t4 = new JTextField();
		t4.setColumns(10);
		t4.setBounds(141, 268, 153, 29);
		frame.getContentPane().add(t4);

		JLabel label_4 = new JLabel("\u63D2\u5165\u5B66\u751F\u4FE1\u606F");
		label_4.setHorizontalAlignment(SwingConstants.CENTER);
		label_4.setForeground(Color.BLACK);
		label_4.setFont(new Font("方正舒体", Font.PLAIN, 30));
		label_4.setBounds(34, 18, 301, 40);
		frame.getContentPane().add(label_4);

		JButton b1 = new JButton("\u63D2\u5165");
		b1.setFont(new Font("宋体", Font.PLAIN, 18));
		b1.setBounds(299, 307, 105, 34);
		b1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

				M_Student.Insert_Stu(t1.getText(), t2.getText(),
						Integer.parseInt(t3.getText()), t4.getText());

				JOptionPane.showMessageDialog(null, "插入数据成功", "提示",
						JOptionPane.PLAIN_MESSAGE);
			}
		});
		frame.getContentPane().add(b1);
	}
}
