package org.tech.behavior.Command.example2;

public class RewindCommand implements Command {

	private AudioPlayer myAudio;

	public RewindCommand(AudioPlayer audioPlayer) {
		myAudio = audioPlayer;
	}

	public void execute() {
		myAudio.rewind();
	}

}