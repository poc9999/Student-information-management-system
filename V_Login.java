package com.langxikeji.JDBC;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;

public class V_Login {

	private JFrame st_frame;
	private JTextField user_field;
	private JPasswordField pass_field;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					V_Login window = new V_Login();
					window.st_frame.setResizable(false);
					window.st_frame.setLocationRelativeTo(null);
					window.st_frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public V_Login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		st_frame = new JFrame();
		st_frame.setTitle("\u5B66\u751F\u4FE1\u606F\u7BA1\u7406\u6570\u636E\u5E93\u7CFB\u7EDF");
		st_frame.setBounds(100, 100, 463, 322);
		st_frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		st_frame.getContentPane().setLayout(null);
		
		JLabel user_label = new JLabel("\u7528\u6237\u540D:");
		user_label.setFont(new Font("黑体", Font.BOLD, 18));
		user_label.setHorizontalAlignment(SwingConstants.LEFT);
		user_label.setBounds(50, 75, 86, 43);
		st_frame.getContentPane().add(user_label);
		
		JLabel pass_label = new JLabel("\u767B\u5F55\u5BC6\u7801:");
		pass_label.setHorizontalAlignment(SwingConstants.LEFT);
		pass_label.setFont(new Font("黑体", Font.BOLD, 18));
		pass_label.setBounds(50, 142, 86, 43);
		st_frame.getContentPane().add(pass_label);
		
		user_field = new JTextField();
		user_field.setFont(new Font("宋体", Font.PLAIN, 18));
		user_field.setHorizontalAlignment(SwingConstants.LEFT);
		user_field.setBounds(146, 82, 189, 30);
		st_frame.getContentPane().add(user_field);
		user_field.setColumns(10);
		
		pass_field = new JPasswordField();
		pass_field.setFont(new Font("宋体", Font.PLAIN, 18));
		pass_field.setBounds(146, 151, 189, 30);
		st_frame.getContentPane().add(pass_field);
		
		JButton loginbutton = new JButton("\u767B\u5F55");
		loginbutton.setFont(new Font("宋体", Font.PLAIN, 16));
		loginbutton.setBounds(301, 220, 106, 35);
		
		
		
		loginbutton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				
				String user=user_field.getText().trim();
				
				String pass=new String (pass_field.getPassword()).trim();
				
				
				if(user.length()==0||pass.length()==0){
					
					JOptionPane.showMessageDialog(null, "用户名和密码不能为空","登录失败",JOptionPane.ERROR_MESSAGE);
				}else{
					
					if(M_Login.verification(user, pass)){
						
						st_frame.setVisible(false);
						
					    V_Student.main(null);
					}else{
						
						JOptionPane.showMessageDialog(null, "用户名或者密码输入错误","登录失败",JOptionPane.ERROR_MESSAGE);
					}
					
					
				}
				
				
				
				
			}
		});
		
		
		st_frame.getContentPane().add(loginbutton);
		
		JLabel lblNewLabel = new JLabel("\u5B66\u751F\u4FE1\u606F\u7BA1\u7406\u67E5\u8BE2\u7CFB\u7EDF");
		lblNewLabel.setFont(new Font("黑体", Font.BOLD, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(61, 21, 305, 36);
		st_frame.getContentPane().add(lblNewLabel);
	}
}
