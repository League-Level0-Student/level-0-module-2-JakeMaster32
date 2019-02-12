//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package extra;

import java.net.URI;
import javax.swing.JOptionPane;

public class SoundtrackToLife {

	public static void main(String[] args) {

		// 1. Adjust this pop-up to find out what mood the user is in.
		String x = JOptionPane
				.showInputDialog("What is your mood right now? Pick one, (Don't Capitalize) Happy, sad, angry,");

		// 2. Their answer is stored in the userMood variable. Print it out.
		if (x.equals("happy")) {
			playVideo("https://www.youtube.com/watch?v=y6Sxv-sUYtM");
		} else {
			if (x.equals("sad")) {
				playVideo("https://www.youtube.com/watch?v=qqghbvavKKg");
			} else {
			}
		}
		if (x.equals ("angry")) {playVideo("https://www.youtube.com/watch?v=-tJYN-eG1zk");
		}

		// 3. If they are in a stressed mood, use the playVideo method to play a calming
		// song from YouTube.

		// 4. Play different songs for other moods.

		/**
		 * If you can’t think of any, here are some you can use...
		 * http://bit.ly/video-for-happy http://bit.ly/video-for-sad
		 * http://bit.ly/video-for-angry
		 **/

		// If you are seeing ads at the beginning of your videos, install Adblock.

	}

	static void playVideo(String youTubeLink) {
		try {
			URI uri = new URI(youTubeLink);
			java.awt.Desktop.getDesktop().browse(uri);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
