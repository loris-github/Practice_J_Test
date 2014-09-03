package com.test.net;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.*;

public class TestUDPClient {

	public static void main(String[] args) throws Exception {
		byte[] byt = new byte[1024];
		DatagramSocket dgs = new DatagramSocket();
		DatagramPacket dgp = new DatagramPacket(byt,byt.length);
		
		DataOutputStream dos = null;
		DataInputStream dis = null;
		
	}

}
