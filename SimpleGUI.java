import java.awt.*;//它当中不只有重量级组件 还有 布局、字体、颜色
import javax.swing.*;
public class SimpleGUI{
	JFrame frame;//一个窗体框架
	JButton bt;//一个按钮
	public SimpleGUI(){
		frame = new JFrame("标题栏内容");
		bt = new JButton("按钮上的文字");

		frame.add(bt);//将bt按钮添加进frame容器当中

		frame.setSize(800,600);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(3);
	}
	public static void main(String[] args){
		new SimpleGUI();
	}
}