package com.langxikeji.JDBC;

import java.awt.Color;
import java.awt.Dialog.ModalExclusionType;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class V_Student implements ActionListener {

	private JFrame St_frame;

	private SimpleDateFormat sdf;
	private JTextField nowtime;
	// ²Ëµ¥Ïî×é¼þ
	JMenuItem All_ST, ByIdFromSt, ByIdDelSt, ByIdUpData, Insert_St;
	// ³õÊ¼»­²¼
	private JPanel panel = new JPanel();
	// ¸Ä±ä»­²¼
	private V_Check_Panel Checkpanel = new V_Check_Panel();

	private V_ById_Panel Byidpanel = new V_ById_Panel();

	private V_DelById_Panel Delpanel = new V_DelById_Panel();

	private Draw_BG Drawpanel=new Draw_BG();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					V_Student window = new V_Student();
					window.St_frame.setVisible(true);
					window.St_frame.setResizable(false);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public V_Student() {
		initialize();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

		if (e.getSource() == All_ST) {

			panel.removeAll();

			panel.add(Checkpanel);

			panel.validate();

			panel.repaint();
		} else if (e.getSource() == ByIdFromSt) {

			panel.removeAll();

			panel.add(Byidpanel);

			panel.validate();

			panel.repaint();
		} else if (e.getSource() == ByIdDelSt) {

			panel.removeAll();

			panel.add(Delpanel);

			panel.validate();

			panel.repaint();
		} else if (e.getSource() == ByIdUpData) {

			V_Updata_Panel.main(null);
		}else if(e.getSource() == Insert_St){
		
		   Insert_Stu.main(null);
		
		}

	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {

		St_frame = new JFrame();
		St_frame.setTitle("\u5B66\u751F\u4FE1\u606F\u7BA1\u7406\u7CFB\u7EDF");
		St_frame.setModalExclusionType(ModalExclusionType.APPLICATION_EXCLUDE);
		St_frame.setBounds(100, 100, 738, 514);

		St_frame.setLocationRelativeTo(null);
		St_frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		St_frame.getContentPane().setLayout(null);

		panel.setBounds(0, 64, 722, 361);
		Drawpanel.setBounds(0, 0, 722, 361);

		panel.add(Drawpanel);
		panel.setVisible(true);

		panel.setLayout(null);
		
		
		St_frame.getContentPane().add(panel);

		Timer t = new Timer();

		t.schedule(new MyTask(), 1000, 1000);

		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 722, 31);
		St_frame.getContentPane().add(menuBar);

		JMenu mnNewMenu = new JMenu("\u67E5\u8BE2\u4FE1\u606F");
		mnNewMenu.setHorizontalAlignment(SwingConstants.LEFT);
		mnNewMenu.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 18));
		menuBar.add(mnNewMenu);

		All_ST = new JMenuItem(
				"\u67E5\u770B\u6240\u6709\u5B66\u751F\u4FE1\u606F");
		All_ST.setHorizontalAlignment(SwingConstants.LEFT);
		All_ST.addActionListener(this);
		mnNewMenu.add(All_ST);

		ByIdFromSt = new JMenuItem(
				"\u6839\u636E\u5B66\u53F7\u67E5\u770B\u5B66\u751F\u4FE1\u606F");

		ByIdFromSt.addActionListener(this);
		mnNewMenu.add(ByIdFromSt);

		JMenu mnNewMenu_1 = new JMenu("\u4FEE\u6539\u4FE1\u606F");
		mnNewMenu_1.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 18));
		menuBar.add(mnNewMenu_1);

		ByIdDelSt = new JMenuItem(
				"\u6839\u636E\u5B66\u53F7\u5220\u9664\u5B66\u751F\u4FE1\u606F");
		ByIdDelSt.addActionListener(this);
		mnNewMenu_1.add(ByIdDelSt);

		ByIdUpData = new JMenuItem(
				"\u6839\u636E\u5B66\u53F7\u66F4\u65B0\u5B66\u751F\u4FE1\u606F");
		ByIdUpData.addActionListener(this);
		mnNewMenu_1.add(ByIdUpData);

		Insert_St = new JMenuItem(
				"\u52A0\u5165\u4E00\u6761\u6216\u591A\u6761\u5B66\u751F\u4FE1\u606F");
		Insert_St.addActionListener(this);
		mnNewMenu_1.add(Insert_St);

		JMenu mnNewMenu_2 = new JMenu(
				"\u4FEE\u6539\u7BA1\u7406\u5458\u4FE1\u606F");
		mnNewMenu_2.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 18));
		menuBar.add(mnNewMenu_2);

		JMenuItem mntmNewMenuItem_5 = new JMenuItem(
				"\u4FEE\u6539\u7BA1\u7406\u5458\u8D44\u6599");
		mnNewMenu_2.add(mntmNewMenuItem_5);

		JMenuItem mntmNewMenuItem_6 = new JMenuItem(
				"\u4FEE\u6539\u7BA1\u7406\u5458\u5BC6\u7801");
		mnNewMenu_2.add(mntmNewMenuItem_6);

		JMenu exit = new JMenu("\u9000\u51FA\u7CFB\u7EDF");
		exit.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 18));

		exit.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				System.exit(0);
			}

		});

		menuBar.add(exit);

		JLabel label = new JLabel("\u6B22\u8FCE\u767B\u9646!!!");
		label.setFont(new Font("»ªÎÄÐÐ¿¬", Font.PLAIN, 22));
		label.setBounds(578, 35, 122, 31);
		St_frame.getContentPane().add(label);

		JLabel label_1 = new JLabel("\u5F53\u524D\u65F6\u95F4\uFF1A");
		label_1.setForeground(Color.RED);
		label_1.setBounds(490, 435, 75, 15);
		St_frame.getContentPane().add(label_1);

		nowtime = new JTextField();
		nowtime.setForeground(Color.RED);
		nowtime.setEditable(false);
		nowtime.setText("yyyy-MM-dd HH:mm:ss");
		nowtime.setBounds(566, 432, 134, 21);
		St_frame.getContentPane().add(nowtime);
		nowtime.setColumns(10);

	}

	class MyTask extends TimerTask {

		@Override
		public void run() {
			// TODO Auto-generated method stub

			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

			String s = sdf.format(new Date());

			nowtime.setText(s);

		}
	}

}
