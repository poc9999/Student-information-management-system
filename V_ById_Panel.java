package com.langxikeji.JDBC;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

public class V_ById_Panel extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Object[] v_name = { "序号", "姓名", "性别", "年龄", "学校" };

	JTextField tf = new JTextField("请输入需要查找学生的学号");

	JButton button = new JButton("查找");

	JPanel panel = new JPanel();

	Font font = new Font("黑体", Font.PLAIN, 15);

	private static String regex = "^[0-9]*$";

	public V_ById_Panel() {

		this.setBounds(0, 0, 738, 514);

		this.setLayout(null);

		button.setBounds(540, 10, 100, 30);

		button.setFont(font);

		tf.setBounds(200, 10, 300, 30);

		// 给文本框加上鼠标单击事件监听
		tf.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				tf.setText("");
			}

		});

		// 给按钮加上监听
		button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

				String s = tf.getText().trim();

					if (s.length() != 0 || s.matches(regex)) {

						JTable table = new JTable(M_Student.Stu_ById(Integer
								.parseInt(s)), v_name);

						table.setRowHeight(20);
						
						table.setEnabled(false);
						JScrollPane jp = new JScrollPane(table);
						jp.setBounds(0, 50, 738, 514);

						// 匿名内部类调用this 需要类名的this
						V_ById_Panel.this.add(jp);
					} else {
						JOptionPane.showMessageDialog(null, "输入非法字符", "输入错误",
								JOptionPane.ERROR_MESSAGE);

					}
				
			}

		});

		this.add(tf);
		this.add(button);
		this.setVisible(true);
	}
}
