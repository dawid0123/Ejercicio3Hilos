package Hilos3;

public class HiloTac extends Thread{

	public void run() {
		while(true) {
			System.out.println("TAC");
			
			try {
			
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
