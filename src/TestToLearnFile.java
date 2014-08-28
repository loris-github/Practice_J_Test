import java.io.*;

public class TestToLearnFile {

	public static void main(String[] args) throws Exception {
		String FILEPATH = "D:\\My Stuff\\Desktop\\1.txt";
		FileOutputStream fos = new FileOutputStream(FILEPATH);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		bos.write("asldfjlksadjflsdf".getBytes());
		bos.close();
		
		FileInputStream fis = new FileInputStream(FILEPATH);
		BufferedInputStream bis = new BufferedInputStream(fis);
		byte[] buf = new byte[100]; 
		int len = bis.read(buf);
		
		System.out.print(new String(buf,0,len));
		bis.close();
		

	}

}
