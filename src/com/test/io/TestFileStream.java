package com.test.io;

import java.io.*;

public class TestFileStream {
	
	String tmp = null;
	StringBuffer content = new StringBuffer();
	
	boolean reading = false;
	boolean writing = false;
	boolean writeFinish = false;
	boolean readFinish = false;
	
	String codeFormat = "GBK";	
	String addressRead = "D:\\Devuser\\Desktop\\f.html";
	String addressWrite = "D:\\Devuser\\Desktop\\f1.html";
		
	BufferedReader br = null;
	BufferedWriter bw = null;
	BufferedOutputStream bos = null;	
	
	public String getFormat (String address){		
		byte[] head = new byte[3];
		FileInputStream fis = null;
		
		try {
		fis = new FileInputStream(address);
		fis.read(head);
		
		} catch (FileNotFoundException e) {
			System.out.println("木有找到文件╮(╯▽╰)╭");
			System.exit(-1);
			
		} catch (IOException e) {
			System.out.println("念书少没读好╮(╯▽╰)╭");
			System.exit(-1);
		}
		
		if (head[0] == -1 && head[1] == -2 )    
			codeFormat = "UTF-16";    
        else if (head[0] == -2 && head[1] == -1 )    
        	codeFormat = "Unicode";    
        else if(head[0]==-17 && head[1]==-69 && head[2] ==-65)    
        	codeFormat = "UTF-8";
		
		try {
			fis.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return codeFormat;
	}
	
	public void excuteFile(String address){			
			try {
				br = new BufferedReader(new InputStreamReader(new FileInputStream(addressRead),getFormat(addressRead)));				
				reading = true;
			} catch (UnsupportedEncodingException e) {
				e.printStackTrace();
			} catch (FileNotFoundException e) {
			System.out.println("木有找到文件 ╮(╯▽╰)╭");
			System.exit(-1);
		    } 
		
		try{
			if(reading){
				while((tmp=br.readLine())!=null){
					content.append(tmp+'\n');
				}					
			}
			
			System.out.println(content.toString());
			tmp = null;
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
			System.out.println("写不了！原因不知道");
			System.exit(-1);
		}
		
		try{			
			if(writing&&readFinish){
				bw.write(content.toString());
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
		tfs.excuteFile(tfs.addressRead);
		tfs.writeFile(tfs.addressWrite);
		
		if(tfs.writeFinish){
			System.out.print("all done! exit in 5 sec!");
		}
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			System.exit(-1);
		}
		
		System.exit(-1);
	}

}
