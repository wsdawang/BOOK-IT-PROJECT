import java.awt.*;
import javax.swing.*;
public class TestJMenu{
	JFrame frame;
	JMenuBar bar;
	JMenu m1,m2,m3;
	JMenuItem mi11,mi12,mi13,mi21,mi22,mi31,mi32;
	public TestJMenu(){
		frame = new JFrame("��ʾ���ʹ�ò˵�");
		bar = new JMenuBar();
		m1 = new JMenu("³��");
		m2 = new JMenu("����");
		m3 = new JMenu("����");
		mi11 = new JMenuItem("�Ǵ�����");
		mi12 = new JMenuItem("���պ���");
		mi13 = new JMenuItem("��ת��");
		mi21 = new JMenuItem("��������ˮ��");
		mi22 = new JMenuItem("������");
		mi31 = new JMenuItem("ˮ����");
		mi32 = new JMenuItem("���Ŷ���");

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