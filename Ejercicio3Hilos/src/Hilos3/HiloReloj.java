package Hilos3;

public class HiloReloj {

	public static void main(String[] args) {
		HiloTic hti=new HiloTic();
		HiloTac hta=new HiloTac();
		
		
			hti.start();
			hta.start();

			

	}

}
