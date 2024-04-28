/*
	BorderLayout 边框布局
*/
import java.awt.*;
import javax.swing.*;
public class TestBorderLayout{
	JFrame frame;
	JButton east,west,south,north,center;
	public TestBorderLayout(){
		frame = new JFrame("演示如何使用BorderLayout");
		east = new JButton("东邪 - 黄药师");
		west = new JButton("西毒 - 欧阳锋");
		south = new JButton("南帝 - 段正淳");
		north = new JButton("北丐 - 洪七公");
		center = new JButton("中神通 - 王重阳");
		//frame.setLayout(new BorderLayout());
		frame.add(east,"East");
		frame.add(west,"West");
		frame.add(south,"South");
		frame.add(north,"North");
		frame.add(center);

		frame.setSize(800,600);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(3);
	}
	public static void main(String[] args){
		new TestBorderLayout();
	}
}


