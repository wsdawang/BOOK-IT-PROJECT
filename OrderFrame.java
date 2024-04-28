import java.awt.*;
import javax.swing.*;
public class OrderFrame{
	JFrame frame;
	JPanel center,east,south,cc,cs;

	JLabel pic,title,total;
	JButton enter,submit,reset;
	java.awt.List list;

	public OrderFrame(){
		frame = new JFrame("商品展示界面");
		center = new JPanel(new BorderLayout());
		east = new JPanel(new BorderLayout());
		south = new JPanel(new FlowLayout());
		cc = new JPanel(new BorderLayout());
		cs = new JPanel(new FlowLayout());

		pic = new JLabel(new ImageIcon("0.png"));
		title = new JLabel("小美女一名: 999 元");
		total = new JLabel("当前总共消费 : 0 元");
		enter = new JButton("我要领养Ta！");
		submit = new JButton("提交订单");
		reset = new JButton("全部重置");
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