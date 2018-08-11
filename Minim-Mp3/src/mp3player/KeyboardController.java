package mp3player;

import de.hsrm.mi.prog.util.StaticScanner;

public class KeyboardController {
	private MP3Player mp3player;
	private boolean playing = true;
	
	public KeyboardController() {
		this.mp3player = new MP3Player();
	}
	
	public void start() {
		while(playing) {
			System.out.println("Was soll der Player machen?");
			String command = StaticScanner.nextString();
			
			//Switch mit command
			if(command.equals("play")) {
				mp3player.play("02_LoveWillBeWithYou.mp3");
				//return;
			}
		}
	}
}
