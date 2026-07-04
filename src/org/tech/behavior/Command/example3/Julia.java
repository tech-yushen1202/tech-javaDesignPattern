package org.tech.behavior.Command.example3;

import org.tech.behavior.Command.example2.AudioPlayer;
import org.tech.behavior.Command.example2.Command;
import org.tech.behavior.Command.example2.PlayCommand;
import org.tech.behavior.Command.example2.RewindCommand;
import org.tech.behavior.Command.example2.StopCommand;

public class Julia {

	public static void main(String[] args) {

		// 创建接收者对象
		AudioPlayer audioPlayer = new AudioPlayer();
		// 创建命令对象
		Command playCommand = new PlayCommand(audioPlayer);
		Command rewindCommand = new RewindCommand(audioPlayer);
		Command stopCommand = new StopCommand(audioPlayer);

		MacroCommand marco = new MacroAudioCommand();

		marco.add(playCommand);
		marco.add(rewindCommand);
		marco.add(stopCommand);
		marco.execute();
	}
}