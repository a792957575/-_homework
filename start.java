package game;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.image.BufferedImage;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.concurrent.TimeUnit;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;

/*
 * start.java
 *
 * Created on __DATE__, __TIME__
 */

/**
 *
 * @author  __USER__
 */
@SuppressWarnings("serial")
public class start extends javax.swing.JFrame {
	static music m1=new music("C:\\Users\\怠惰\\Desktop\\music\\Copy of OMOSHIRO MUSIC.wav"); 
	static music m2=new music("C:\\Users\\怠惰\\Desktop\\music\\電波リレーの勝者.wav"); 
	static music m3=new music("C:\\Users\\怠惰\\Desktop\\music\\不安の立像.wav"); 
	static music m4=new music("C:\\Users\\怠惰\\Desktop\\music\\リビングゲーム.wav"); 
	static music m5=new music("C:\\Users\\怠惰\\Desktop\\music\\変わらないからこそ.wav"); 
	static music m6=new music("C:\\Users\\怠惰\\Desktop\\music\\FURYOUミュージック.wav");
	static music m7=new music("C:\\Users\\怠惰\\Desktop\\music\\夜の向日葵.wav");
	static music m8=new music("C:\\Users\\怠惰\\Desktop\\music\\戸松遥 - セパレイト・ウェイズ.wav");
	BufferedImage img;
	BufferedImage people1;
	BufferedImage people2;
	BufferedImage wenben = picture.getImge("/image/背景图/文本框.png");
	BufferedImage wenben1 = picture.getImge("/image/背景图/文本框.png");
	private static String tallking;
	private static String tallking0;
	private static String tallking1;
	private static String tallking2;
	private static String anniu1;
	private static String anniu2;
	private JButton jButton = new JButton();
	private JButton jButton2 = new JButton();
	private JButton jbutton2 = new JButton();
	private JButton jbutton1 = new JButton();
	private int i = 1;//计数下一步的次数
	private int f=1;
	/** Creates new form start */
	public start() {
		m1.start();
		initComponents();
		img = picture.getImge("/image/背景图/背景1.jpg");
		jbutton2.setBounds(100, 800, 50, 30);
	}

	//GEN-BEGIN:initComponents
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {


		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setBounds(new java.awt.Rectangle(0, 0, 1920, 1080));
		setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
		setLocationByPlatform(true);
		setResizable(false);
		getContentPane().setLayout(
				new org.netbeans.lib.awtextra.AbsoluteLayout());

		jButton.setBackground(new java.awt.Color(153, 153, 153));
		jButton.setText("\u4e0b\u4e00\u6b65");
		jButton.setBorderPainted(false);
		jButton.setDoubleBuffered(true);
		jButton.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton1ActionPerformed(evt);
			}
		});
		getContentPane().add(
				jButton,
				new org.netbeans.lib.awtextra.AbsoluteConstraints(1600, 830,
						90, 30));
		jButton2.setBackground(new java.awt.Color(153, 153, 153));
		jButton2.setText("\u8df3\u8fc7");
		jButton2.setBorderPainted(false);
		jButton2.setDoubleBuffered(true);
		jButton2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton2ActionPerformed(evt);
			}
		});
		getContentPane().add(
				jButton2,
				new org.netbeans.lib.awtextra.AbsoluteConstraints(1600, 0, 90,
						30));
		jbutton2.setBackground(new java.awt.Color(153, 153, 153));
		jbutton2.setBorderPainted(false);
		jbutton2.setDoubleBuffered(true);
		jbutton2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jbutton2ActionPerformed(evt);
			}
		});
		getContentPane().add(
				jbutton2,
				new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 800,
						200, 30));
		
		jbutton1.setBackground(new java.awt.Color(153, 153, 153));
		jbutton1.setBorderPainted(false);
		jbutton1.setDoubleBuffered(true);
		jbutton1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jbutton1ActionPerformed(evt);
			}
		});
		getContentPane().add(
				jbutton1,
				new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 800,
						200, 30));

		pack();
		jbutton2.setVisible(false);
		jbutton1.setVisible(false);
		setLocationRelativeTo(null);
		setVisible(false);
	}// </editor-fold>
	//GEN-END:initComponents

	public void paint(Graphics g) {
		super.paint(g);
		if(f==11){
			g.drawImage(img, 0, 0, null);
			g.setColor(Color.black);
			g.setFont(new Font("Times New Roman ", Font.BOLD, 50));
			g.drawString(tallking0, 500, 500);
		}else if(f==5||f==6||f==7||f==8||f==10){
			g.drawImage(img, 0, 0, null);
			jButton.repaint();
			jButton2.repaint();
		}
		g.drawImage(img, 0, 0, null);
		if(people1!=null||people2!=null){
			g.drawImage(people1, 950, 100,800,800, null);//右
			g.drawImage(people2,0, 100,800,800, null);//左
			}
			else if(people2!=null){
				g.drawImage(people1, 950, 100,800,800, null);//右
			}
			else if(people1!=null){
				g.drawImage(people2, 0, 100,800,800, null);//右
			}
		if(tallking!=null){
			g.drawImage(wenben, 60, 735, null);
		}
		g.setColor(Color.WHITE);
		g.setFont(new Font("Times New Roman ", Font.BOLD, 30));
		if(tallking2!=null){
		g.drawString(tallking1, 100, 800);
		g.drawString(tallking2, 100, 830);
		}
		else if(tallking2==null){
			g.drawString(tallking1, 100, 800);
		}
		else i++;
		jButton.repaint();
		jButton2.repaint();
		jbutton1.repaint();
		jbutton2.repaint();
	}

	@SuppressWarnings("deprecation")
	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//下一步
		if(i==7){
			i++;
		}
		// TODO add your handling code here:
		jbutton2.setVisible(false);
		jbutton1.setVisible(false);
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://121.199.41.193:3306/daojianzhilv?useSSL=false", "liming", "Aa5202411/n");
			Statement statement=conn.createStatement();
			ResultSet result=statement.executeQuery("SELECT * FROM T_Dialogue where Dialogue_Id="+i);
			while(result.next()){
				tallking=result.getString("Dialogue");
				anniu1=result.getString("choice-2");
				anniu2=result.getString("choice-1");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(tallking.length()>45){
			tallking1=tallking.substring(0, 45);
			tallking2=tallking.substring(46, tallking.length());
		}
		else{
			tallking1=tallking;
			tallking2=null;
		}
		if(i==5){
			img = picture.getImge("/image/背景图/背景2.JPG");
		}
		else if(i==8||i==12||i==16||i==20||i==24){
				people1= picture.getImge("/image/人物/克莱因1.png");
				people2= picture.getImge("/image/人物/桐人1.png");
				}
		else if(i==9||i==13||i==17||i==25){
					people1= picture.getImge("/image/人物/克莱因2.png");
					people2= picture.getImge("/image/人物/桐人2.png");
					}
		else if(i==10||i==14||i==18||i==22){
					people1= picture.getImge("/image/人物/克莱因3.png");
					people2= picture.getImge("/image/人物/桐人3.png");
					}
		else if(i==11||i==15||i==19||i==23){
			if(i==19)
				m1.stop();
					people1= picture.getImge("/image/人物/克莱因1.png");
					people2= picture.getImge("/image/人物/桐人5.png");
					}
		else if(i==21){
			people1= picture.getImge("/image/人物/克莱因2.png");
			people2= picture.getImge("/image/人物/桐人2.png");
			img = picture.getImge("/image/背景图/变异的初始之镇.JPG");
			m2.start();
		}
		else if(i==26){
			people1= null;
			people2= null;
		}
		else if(i==36){
			img = picture.getImge("/image/背景图/披斗篷的红色巨人.jpg");
		}
		else if(i==51){
			m1.stop();
			m2.stop();
		}
		else if(i==53){
			m3.start();
			people1= picture.getImge("/image/人物/克莱因1.png");
			people2= picture.getImge("/image/人物/桐人5.png");
		}
		else if(i==54||i==58||i==62||i==66||i==70||i==74||i==78||i==82||i==86||i==90||i==94){
			people1= picture.getImge("/image/人物/克莱因1.png");
			people2= picture.getImge("/image/人物/桐人1.png");
			}
	else if(i==55||i==59||i==63||i==67||i==71||i==75||i==79||i==83||i==87||i==91||i==95){
				people1= picture.getImge("/image/人物/克莱因2.png");
				people2= picture.getImge("/image/人物/桐人2.png");
				}
	else if(i==56||i==60||i==64||i==68||i==72||i==76||i==80||i==84||i==88||i==92){
				people1= picture.getImge("/image/人物/克莱因3.png");
				people2= picture.getImge("/image/人物/桐人3.png");
				}
	else if(i==57||i==61||i==65||i==69||i==73||i==77||i==81||i==85||i==89||i==93){
				people1= picture.getImge("/image/人物/克莱因1.png");
				people2= picture.getImge("/image/人物/桐人5.png");
				}
		else if(i==97){
			m1.stop();
			m2.stop();
			m3.stop();
			img = picture.getImge("/image/背景图/背景3.png");
		}
		else if(i==98){
			m4.start();
			people1=null;
			jButton.setVisible(false);
			jbutton2.setVisible(true);
			jbutton1.setVisible(true);
			jbutton2.setText(anniu1);
			jbutton1.setText(anniu2);
		}
		else if(i==101){
			img = picture.getImge("/image/背景图/小镇.png");
		}
		else if(i==104||i==107||i==110||i==113){
			people1= picture.getImge("/image/人物/亚丝娜1.png");
			people2= picture.getImge("/image/人物/桐人1.png");
			}
	else if(i==105||i==108||i==111||i==114){
				people1= picture.getImge("/image/人物/亚丝娜2.png");
				people2= picture.getImge("/image/人物/桐人2.png");
				}
	else if(i==106||i==109||i==112||i==115){
				people1= picture.getImge("/image/人物/亚丝娜3.png");
				people2= picture.getImge("/image/人物/桐人3.png");
				}
		else if(i==139){
			m4.stop();
			}
			
		else if(i==140){
			img = picture.getImge("/image/背景图/森林.png");
		}
		else if(i==247){
			m1.stop();
			m2.stop();
			m3.stop();
			m4.stop();
		}
		else if(i==248){
			m5.start();
			img = picture.getImge("/image/背景图/旅馆.png");
		}
		else if(i==249||i==255||i==261||i==267||i==273||i==279){
			people1= picture.getImge("/image/人物/亚丝娜1.png");
			people2= picture.getImge("/image/人物/桐人1.png");
			}
	else if(i==250||i==256||i==262||i==268||i==274||i==280){
				people1= picture.getImge("/image/人物/亚丝娜2.png");
				people2= picture.getImge("/image/人物/桐人2.png");
				}
	else if(i==251||i==257||i==263||i==269||i==275||i==281){
				people1= picture.getImge("/image/人物/亚丝娜3.png");
				people2= picture.getImge("/image/人物/桐人3.png");
				}
	else if(i==252||i==258||i==264||i==270||i==276||i==282){
				people1= picture.getImge("/image/人物/亚丝娜4.png");
				people2= picture.getImge("/image/人物/桐人4.png");
				}
	else if(i==253||i==259||i==265||i==271||i==277||i==283){
		people1= picture.getImge("/image/人物/亚丝娜5.png");
		people2= picture.getImge("/image/人物/桐人5.png");
		}
	else if(i==254||i==260||i==266||i==272||i==278||i==284){
		people1= picture.getImge("/image/人物/亚丝娜6.png");
		people2= picture.getImge("/image/人物/桐人1.png");
		}
	else if(i==388){
		m1.stop();
		m2.stop();
		m3.stop();
		m4.stop();
		m5.stop();
		}
	else if(i==389){
		m6.start();
		}
	else if(i==390){
		img = picture.getImge("/image/背景图/迷宫.JPG");
		}
	else if(i==393||i==396||i==399||i==402||i==405){
		people1= picture.getImge("/image/人物/亚丝娜战斗2.png");
		people2= picture.getImge("/image/人物/桐人战斗2.png");
		}
	else if(i==391||i==394||i==397||i==400||i==403||i==406){
		people1= picture.getImge("/image/人物/亚丝娜战斗3.png");
		people2= picture.getImge("/image/人物/桐人战斗3.png");
		}
	else if(i==392||i==395||i==398||i==401||i==404||i==407){
		people1= picture.getImge("/image/人物/亚丝娜战斗1.png");
		people2= picture.getImge("/image/人物/桐人战斗2.png");
		}
	else if(i==916){
		m1.stop();
		m2.stop();
		m3.stop();
		m4.stop();
		m5.stop();
		m6.stop();
	}
	else if(i==917){
		m7.start();
	}
	else if(i==920){
		jButton.setVisible(false);
		jbutton2.setVisible(true);
		jbutton1.setVisible(true);
		jbutton2.setText(anniu1);
		jbutton1.setText(anniu2);
	}
	else if(i==922||i==928||i==935||i==940){
		people1= picture.getImge("/image/人物/亚丝娜1.png");
		people2= picture.getImge("/image/人物/结衣1.png");
		}
	else if(i==923||i==929||i==936){
		people1= picture.getImge("/image/人物/亚丝娜2.png");
		people2= picture.getImge("/image/人物/结衣2.png");
		}
else if(i==924||i==930||i==937){
		people1= picture.getImge("/image/人物/亚丝娜3.png");
		people2= picture.getImge("/image/人物/结衣3.png");
		}
else if(i==925||i==933||i==938||i==919){
		people1= picture.getImge("/image/人物/亚丝娜4.png");
		people2= picture.getImge("/image/人物/结衣4.png");
		}
else if(i==926||i==934||i==939||i==918){
people1= picture.getImge("/image/人物/亚丝娜5.png");
people2= picture.getImge("/image/人物/结衣5.png");
}
else if(i==927||i==937||i==917){
people1= picture.getImge("/image/人物/亚丝娜6.png");
people2= picture.getImge("/image/人物/结衣6.png");
}
		repaint();
		i = i + 1;
	}
	@SuppressWarnings("deprecation")
	private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//跳过
		// TODO add your handling code here:
		if (f == 1) {
			i=50;
		} else if (f == 2) {
			i=246;
		}
		else if (f == 3) {
			i=387;
		}
		else if (f == 4) {
			i=1001;
		}
		else if (f == 5) {
			i=1000;
		}
		else if (f == 6) {
			i=999;	
		}
		else if (f == 7) {
			i=998;
		}
		else if (f == 8) {
			i=915;
		}
		else if (f ==10 ) {
			i=996;
		}
		else if (f == 9) {
			i=997;
		}
		f++;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://121.199.41.193:3306/daojianzhilv?useSSL=false", "liming", "Aa5202411/n");
			Statement statement=conn.createStatement();
			ResultSet result=statement.executeQuery("SELECT * FROM T_Dialogue where Dialogue_Id="+i);
			while(result.next()){
				tallking=result.getString("Dialogue");
				anniu1=result.getString("choice-2");
				anniu2=result.getString("choice-1");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(tallking.length()>45){
			tallking1=tallking.substring(0, 45);
			tallking2=tallking.substring(46, tallking.length());
		}
		else{
			tallking1=tallking;
			tallking2=null;
		}
		if (i == 50) {
			img = picture.getImge("/image/背景图/披斗篷的红色巨人.jpg");
			people1= picture.getImge("/image/人物/克莱因3.png");
			people2= picture.getImge("/image/人物/桐人3.png");
		}
		else if (i == 246) {
			people1= null;
			people2= null;
			img=picture.getImge("/image/背景图/森林3.JPG");
		}else if (i == 387) {
			people1= null;
			people2= null;
			img=picture.getImge("/image/背景图/森林.png");
		}
		else if (i == 915) {
			wenben= picture.getImge("/image/背景图/文本框.png");
			people1= picture.getImge("/image/人物/亚丝娜2.png");
			people2= picture.getImge("/image/人物/结衣2.png");
			img=picture.getImge("/image/背景图/落日的世界.JPG");
		}
		else if (i == 996) {
			wenben=null;
			tallking=null;
			tallking1=null;
			tallking2=null;
			tallking0="end";
			img=picture.getImge("/image/背景图/落日的世界.JPG");
			people1=picture.getImge("/image/CG/亚丝娜结婚1.png");
			people2=picture.getImge("/image/CG/亚丝娜结婚2.png");
			jButton.setVisible(false);
			jButton2.setVisible(false);
			jbutton2.setVisible(false);
			jbutton1.setVisible(false);
			m1.stop();
			m2.stop();
			m3.stop();
			m4.stop();
			m5.stop();
			m6.stop();
			m7.stop();
			m8.start();
		}
		else if(i==997){
			wenben=null;
			tallking=null;
			tallking1=null;
			tallking2=null;
			jButton.setVisible(false);
			img=picture.getImge("/image/背景图/湖2.JPG");
			people1=picture.getImge("/image/CG/战斗结婚cg (2).png");
			people2=picture.getImge("/image/CG/战斗结婚cg.png");
		}else if(i==998){
			people1=null;
			people2=null;
			wenben=null;
			tallking=null;
			tallking1=null;
			tallking2=null;
			img=picture.getImge("/image/CG/和辛一起睡.png");
		}else if(i==999){
			people1=null;
			people2=null;
			wenben=null;
			tallking=null;
			tallking1=null;
			tallking2=null;
			img=picture.getImge("/image/CG/最后的交谈.png");
		}else if(i==1000){
			people1=null;
			people2=null;
			wenben=null;
			tallking=null;
			tallking1=null;
			tallking2=null;
			img=picture.getImge("/image/CG/你找到我了cg.jpeg");
		}else if(i==1001){
			people1=null;
			people2=null;
			wenben=null;
			tallking=null;
			tallking1=null;
			tallking2=null;
			img=picture.getImge("/image/CG/不要死.png");
		}
		
		repaint();
		i=i+1;
	}
	@SuppressWarnings("unused")
	private void jbutton2ActionPerformed(java.awt.event.ActionEvent evt) {
		jButton.setVisible(true);
		if(i==99){
			i=101;
		}else if(i==921){
			i=928;
		}
		jbutton2.setVisible(false);
		jbutton1.setVisible(false);
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://121.199.41.193:3306/daojianzhilv?useSSL=false", "liming", "Aa5202411/n");
			Statement statement=conn.createStatement();
			ResultSet result=statement.executeQuery("SELECT * FROM T_Dialogue where Dialogue_Id="+i);
			while(result.next()){
				tallking=result.getString("Dialogue");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(tallking.length()>45){
			tallking1=tallking.substring(0, 45);
			tallking2=tallking.substring(46, tallking.length());
		}
		else{
			tallking1=tallking;
			tallking2=null;
		}
		repaint();
		i = i + 1;
	}

	@SuppressWarnings("unused")
	private void jbutton1ActionPerformed(java.awt.event.ActionEvent evt) {
		jButton.setVisible(true);
		if(i==99){
			i=100;
		}
		else if(i==921){
			i=922;
		}
		jbutton2.setVisible(false);
		jbutton1.setVisible(false);
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://121.199.41.193:3306/daojianzhilv?useSSL=false", "liming", "Aa5202411/n");
			Statement statement=conn.createStatement();
			ResultSet result=statement.executeQuery("SELECT * FROM T_Dialogue where Dialogue_Id="+i);
			while(result.next()){
				tallking=result.getString("Dialogue");
				anniu1=result.getString("choice-2");
				anniu2=result.getString("choice-1");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(tallking.length()>45){
			tallking1=tallking.substring(0, 45);
			tallking2=tallking.substring(46, tallking.length());
		}
		else{
			tallking1=tallking;
			tallking2=null;
		}
		repaint();
		i = i + 1;
	}
	
