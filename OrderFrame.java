import java.awt.*;
import javax.swing.*;
public class OrderFrame{
	JFrame frame;
	JPanel center,east,south,cc,cs;

	JLabel pic,title,total;
	JButton enter,submit,reset;
	java.awt.List list;

	public OrderFrame(){
		frame = new JFrame("��Ʒչʾ����");
		center = new JPanel(new BorderLayout());
		east = new JPanel(new BorderLayout());
		south = new JPanel(new FlowLayout());
		cc = new JPanel(new BorderLayout());
		cs = new JPanel(new FlowLayout());

		pic = new JLabel(new ImageIcon("0.png"));
		title = new JLabel("С��Ůһ��: 999 Ԫ");
		total = new JLabel("��ǰ�ܹ����� : 0 Ԫ");
		enter = new JButton("��Ҫ����Ta��");
		submit = new JButton("�ύ����");
		reset = new JButton("ȫ������");
		list = new java.awt.List();//!!!

		south.add(enter);
		south.add(submit);
		south.add(reset);
		south.add(total);

		east.add(list);

		cc.add(pic);

		cs.add(title);

		center.add(cc);
		center.add(cs,"South");

		frame.add(south,"South");
		frame.add(center);
		frame.add(east,"East");

		frame.setSize(800,480);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(3);
	}
	public static void main(String[] args){
		new OrderFrame();
	}

}