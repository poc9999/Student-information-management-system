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

	JTextField tf = new JTextField("��������Ҫɾ��ѧ����ѧ��");

	JButton button = new JButton("ɾ��");

	Font font = new Font("����", Font.PLAIN, 15);

	private static String regex = "^[0-9]*$";

	public V_DelById_Panel() {

		this.setBounds(0, 0, 738, 514);

		this.setLayout(null);

		button.setBounds(540, 10, 100, 30);

		button.setFont(font);

		tf.setBounds(200, 10, 300, 30);

		// ���ı��������굥���¼�����
		tf.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				tf.setText("");
			}

		});

		// ����ť���ϼ���
		button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

				String s = tf.getText().trim();

				if (s.length() != 0 && s.matches(regex)) {
					
					if(M_Student.Del_ById(Integer.parseInt(s))){
						
						JOptionPane.showMessageDialog(null, "ɾ���ɹ�!","�����ɹ�",JOptionPane.PLAIN_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(null, "����Ƿ��ַ�", "�������",
							JOptionPane.ERROR_MESSAGE);

				}

			}

		});

		this.add(tf);
		this.add(button);
		this.setVisible(true);
	}

}
