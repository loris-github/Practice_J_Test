package com.test.io;

import java.io.*;

public class TestFileStream {
	
	String tmp = null;
	boolean reading = false;
	boolean writing = false;
	boolean writeFinish = false;
	boolean readFinish = false;
	
	String addressRead = "D:\\MyCode\\myeclipse workspace\\Test\\src\\FileDemo.java";
	String addreassWrite = "D:\\Devuser\\Desktop\\f1.html";
		
	BufferedReader br = null;
	BufferedOutputStream bos = null;
	
	public void readFile(String address){
			try {
				br = new BufferedReader(new InputStreamReader(new FileInputStream(address),"UTF-8"));
				reading = true;
			} catch (UnsupportedEncodingException e) {
				e.printStackTrace();
			}			
		 catch (FileNotFoundException e) {
			System.out.println("木有找到文件 ╮(╯▽╰)╭");
			System.exit(-1);
		}
		
		try{			
			if(reading){
				while((tmp=br.readLine())!=null){
					System.out.print(tmp+'\n');
				}					
			}
			br.close();
			readFinish = true;
			System.out.println("read finish!");
		}
		
		catch(IOException e){
			System.out.println("读取错误");
			System.exit(-1);
		}
	}
	
	public void writeFile(String address){
		try {
			bw = new BufferedWriter (new FileWriter(address));
			writing = true;
		} catch (IOException e) {
			System.out.println("木有找到文件 ╮(╯▽╰)╭");
			System.exit(-1);
		}
		
		try{			
			if(writing&&readFinish){
				bw.write(tmp);					
			}
			bw.close();
			writeFinish = true;
		}
		
		catch(IOException e){
			System.out.println("写入错误");
			System.exit(-1);
		}
	}
	
	
	public static void main(String[] args) {
		TestFileStream tfs = new TestFileStream();
		tfs.readFile(tfs.addressRead);
		//tfs.writeFile(tfs.addreassWrite);
		
		/*if(tfs.writeFinish){
			System.out.print("all done! exit in 5 sec!");
		}
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			System.exit(-1);
		}
		
		System.exit(-1);*/
	}

}
