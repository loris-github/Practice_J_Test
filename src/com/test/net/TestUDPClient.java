package com.test.net;

import java.io.*;
import java.net.*;

public class TestUDPClient {

	public static void main(String[] args) throws Exception {
		
		byte[] byt = (new String("hello")).getBytes();
		DatagramSocket dgs = new DatagramSocket(9999);		
		DatagramPacket dgp = new DatagramPacket(byt,byt.length,new InetSocketAddress("127.0.0.1",8888));
		dgs.send(dgp);
		dgs.close();
		
	}

}
