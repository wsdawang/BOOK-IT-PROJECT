/*
	BorderLayout �߿򲼾�
*/
import java.awt.*;
import javax.swing.*;
public class TestBorderLayout{
	JFrame frame;
	JButton east,west,south,north,center;
	public TestBorderLayout(){
		frame = new JFrame("��ʾ���ʹ��BorderLayout");
		east = new JButton("��а - ��ҩʦ");
		west = new JButton("���� - ŷ����");
		south = new JButton("�ϵ� - ������");
		north = new JButton("��ؤ - ���߹�");
		center = new JButton("����ͨ - ������");
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


