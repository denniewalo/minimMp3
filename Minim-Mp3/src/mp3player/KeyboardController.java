package mp3player;

import de.hsrm.mi.prog.util.StaticScanner;

public class KeyboardController {
	private MP3Player mp3player;
	private boolean playing = true;
	
	public KeyboardController() {
		this.mp3player = new MP3Player();
	}
	
	public void start() {
		while(playing == true) {
			System.out.println("Was soll der Player machen?");
			String command = StaticScanner.nextString();
			
			//Switch mit command
			switch(command) {
			case "play":{
				mp3player.load("02_LoveWillBeWithYou.mp3");
				mp3player.play();
				break;
				}
			case "pause":{
				mp3player.pause();
				break;
				}
			}
		}
	}
}
