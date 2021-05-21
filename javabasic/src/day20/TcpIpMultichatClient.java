package day20;

import java.net.*;
import java.io.*;
import java.util.Scanner;

public class TcpIpMultichatClient {
	public static void main(String args[]) {
		if(args.length!=1) {
			System.out.println("USAGE: java TcpIpMultichatClient 대화명");
			System.exit(0);
		}

		try {
			String serverIp = "nullmaster.iptime.org";// ip주소 외부에서도 들어올수있도록 열어둠
            
			Socket socket = new Socket(serverIp, 7777); 
			System.out.println("서버에 연결 되었습니다.");
			
			Thread sender   = new Thread(new ClientSender(socket, args[0]));
			Thread receiver = new Thread(new ClientReceiver(socket));

			sender.start();	
			receiver.start();
		} catch(ConnectException ce) {
			ce.printStackTrace();
		} catch(Exception e) {}
	} // main

	static class ClientSender extends Thread {
		Socket socket;
		DataOutputStream out; //������ �������� �ƿ�ǲ��Ʈ�� 
		String name;
					// ������ �������޹ޱ�, ��ȭ�� �ޱ�
		ClientSender(Socket socket, String name) {
			this.socket = socket;
			try {
					// DataOutputStream(OutputStream out) : �����;������� �ƿ�ǲ��Ʈ�� ����
				out = new DataOutputStream(socket.getOutputStream());
				this.name = name;
			} catch(Exception e) {}
		}
		// main���� start()�ϸ� ȣ��Ǵ� run()�޼ҵ�
		public void run() {
			Scanner scanner = new Scanner(System.in);
			try {
				if(out!=null) {
					out.writeUTF(name);
				}	

				while(out!=null) {
					out.writeUTF("["+name+"]"+scanner.nextLine());					}
			} catch(IOException e) {}
		} // run()
	} // ClientSender

	static class ClientReceiver extends Thread {
		Socket socket;
		DataInputStream in;

		ClientReceiver(Socket socket) {
			this.socket = socket;
			try {
				in = new DataInputStream(socket.getInputStream());
			} catch(IOException e) {}
		}

		public void run() {
			while(in!=null) {
				try {
					System.out.println(in.readUTF());
				} catch(IOException e) {}
			}
		} // run
	} // ClientReceiver
} // class
