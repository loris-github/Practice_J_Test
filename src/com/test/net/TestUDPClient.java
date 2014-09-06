package com.test.net;

import java.io.*;
import java.net.*;

public class TestUDPClient {
	
	private InetSocketAddress isa = new InetSocketAddress("127.0.0.1",8888);	
	private DatagramSocket dgs = null;
	private DatagramPacket dgp = null;
	boolean isconnect = false;
	public DataInputStream dis = new DataInputStream(System.in);
	
	
	public boolean connect(int portid){		
		try {
			dgs = new DatagramSocket(portid);
			
		} catch (SocketException e) {
			System.out.println("连接失败！");
			System.exit(-1);
		}
		
		return isconnect = true;
	}
	
	public void send(boolean isconnect){
		byte[] byt = new byte[1024];
		while(isconnect){
			try {
				dgp = new DatagramPacket(byt,dis.read(byt),isa);
				dgs.send(dgp);
			} catch (IOException e) {
				System.out.println("读取失败！");
				System.exit(-1);
			}
		}
		dgs.close();
	}

	public static void main(String[] args) throws Exception {
		TestUDPClient udpc = new TestUDPClient();
		udpc.connect(9999);
		udpc.send(udpc.isconnect);

	}

}
