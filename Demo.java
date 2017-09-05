package com.langxikeji.JDBC;

import javax.swing.JFrame;

public class Demo extends JFrame {
	public Demo(){
		
		Draw_BG panel=new Draw_BG();
		
		this.setSize(722, 361);
		this.setLocationRelativeTo(null);
		this.add(panel);
		
		this.setVisible(true);
		
		
		
		this.setDefaultCloseOperation(3);
	}
	
	public static void main(String[] args) {
		new Demo();
	}
}
