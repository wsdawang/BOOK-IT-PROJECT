import java.awt.*;//�����в�ֻ����������� ���� ���֡����塢��ɫ
import javax.swing.*;
public class SimpleGUI{
	JFrame frame;//һ��������
	JButton bt;//һ����ť
	public SimpleGUI(){
		frame = new JFrame("����������");
		bt = new JButton("��ť�ϵ�����");

		frame.add(bt);//��bt��ť��ӽ�frame��������

		frame.setSize(800,600);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(3);
	}
	public static void main(String[] args){
		new SimpleGUI();
	}
}