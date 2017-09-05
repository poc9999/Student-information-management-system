package com.langxikeji.JDBC;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class V_DelById_Panel extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	JTextField tf = new JTextField("请输入需要删除学生的学号");

	JButton button = new JButton("删除");

	Font font = new Font("黑体", Font.PLAIN, 15);

	private static String regex = "^[0-9]*$";

	public V_DelById_Panel() {

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

				if (s.length() != 0 && s.matches(regex)) {
					
					if(M_Student.Del_ById(Integer.parseInt(s))){
						
						JOptionPane.showMessageDialog(null, "删除成功!","操作成功",JOptionPane.PLAIN_MESSAGE);
					}
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
