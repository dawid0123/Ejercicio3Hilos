package Hilos3;

public class HiloTic extends Thread{

	public void run() {
		while(true) {
			System.out.println("TIC");
			
			try {
				Thread.sleep(1000);
				
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	

}

