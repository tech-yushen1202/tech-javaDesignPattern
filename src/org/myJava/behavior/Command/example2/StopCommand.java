package org.myJava.behavior.Command.example2;

public class StopCommand implements Command {
	
	private AudioPlayer myAudio;

	public StopCommand(AudioPlayer audioPlayer) {
		myAudio = audioPlayer;
	}

	public void execute() {
		myAudio.stop();
	}

}