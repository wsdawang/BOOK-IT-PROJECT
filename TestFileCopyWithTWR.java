import java.io.*;
//TWR Try-With-Resources              since JDK7.0
public class TestFileCopyWithTWR{
	public static void main(String[] args){
		try(FileInputStream fis = new FileInputStream("1.mp3");
			FileOutputStream fos = new FileOutputStream("3.mp3");){
			byte[] data = new byte[5<<20];//?
			int len;
			while((len = fis.read(data))!=-1){
				fos.write(data,0,len);
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}