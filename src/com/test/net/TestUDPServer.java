package com.test.net;

import java.net.*;
import java.io.*;

public class TestUDPServer {

	public static void main(String[] args) throws Exception {
		byte[] byt = new byte[1024];
		DatagramSocket dgs = new DatagramSocket(8888);
		DatagramPacket dgp = new DatagramPacket(byt,byt.length);
		
		while(true){
			dgs.receive(dgp);
			System.out.println(new String(byt,0,dgp.getLength()));
		}
		
		
	}

}
