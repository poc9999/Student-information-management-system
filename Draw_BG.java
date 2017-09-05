package com.langxikeji.JDBC;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class Draw_BG extends JPanel {

	Image image;

	Font font=new Font("黑体",Font.PLAIN,40);
	public Draw_BG() {

		this.setBounds(0, 0, 500, 200);

		init();
		this.repaint();
		this.setVisible(true);

	}

	public void init() {
		try {
			image = ImageIO
					.read(Draw_BG.class
							.getResourceAsStream("/com/langxikeji/JDBC/background.jpg"));

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub

		g.drawImage(image, 0, 0, 722, 361, null);
		
		g.setFont(font);
		g.setColor(Color.BLUE);
		g.drawString("浪曦学生信息管理查询系统!", 100, 180);
	}

}
