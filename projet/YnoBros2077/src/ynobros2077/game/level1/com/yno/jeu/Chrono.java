package ynobros2077.game.level1.com.yno.jeu;

public class Chrono implements Runnable{

	private final int PAUSE = 3; // temps d'attente entre 2 tours de boucle
	
	@Override
	public void run() {

		while(true){ 
			
			Main.scene.repaint();
			System.out.println("RAS");
			try {
				Thread.sleep(PAUSE);
			}catch (InterruptedException e) {}
		}
	}

}