import java.awt.*;
import javax.swing.*;
public class TestJMenu{
	JFrame frame;
	JMenuBar bar;
	JMenu m1,m2,m3;
	JMenuItem mi11,mi12,mi13,mi21,mi22,mi31,mi32;
	public TestJMenu(){
		frame = new JFrame("演示如何使用菜单");
		bar = new JMenuBar();
		m1 = new JMenu("鲁菜");
		m2 = new JMenu("粤菜");
		m3 = new JMenu("川菜");
		mi11 = new JMenuItem("糖醋鲤鱼");
		mi12 = new JMenuItem("葱烧海参");
		mi13 = new JMenuItem("九转大肠");
		mi21 = new JMenuItem("果子狸炖水鱼");
		mi22 = new JMenuItem("龙虎斗");
		mi31 = new JMenuItem("水煮鱼");
		mi32 = new JMenuItem("麻婆豆腐");

		addAll(m1,mi11,mi12,mi13);
		addAll(m2,mi21,mi22);
		addAll(m3,mi31,mi32);
		addAll(bar,m1,m2,m3);

		frame.setJMenuBar(bar);//!!!
		frame.setSize(800,600);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(3);
	}
	public static void addAll(Container con,Component ... cs){
		for(Component c : cs){
			con.add(c);
		}
	}
	public static void main(String[] args){
		new TestJMenu();
	}

}