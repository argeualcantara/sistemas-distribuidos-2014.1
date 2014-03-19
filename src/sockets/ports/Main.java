package sockets.ports;

import java.net.DatagramSocket;
import java.net.SocketException;

public class Main {

	public static void main(String[] args) {
		// no meu windows, ele come�a da porta 59442 e vai subindo a porta de 1
		// em 1 at� a 59541
		for (int i = 0; i < 100; i++) {
			try {
				DatagramSocket ds = new DatagramSocket();
				System.out.println(ds.getLocalPort());
			} catch (SocketException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		// N�o houve mudan�a de comportamento ao usar o ds.close()
		for (int i = 0; i < 100; i++) {
			try {
				DatagramSocket ds = new DatagramSocket();
				System.out.println(ds.getLocalPort());
				ds.close();
			} catch (SocketException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
