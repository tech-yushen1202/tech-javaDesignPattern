package org.myJava.behavior.Command.example3;

import java.util.ArrayList;
import java.util.List;

import org.myJava.behavior.Command.example2.Command;

public class MacroAudioCommand implements MacroCommand {

	private List<Command> commandList = new ArrayList<Command>();

	/**
	 * 宏命令聚集管理方法
	 */
	public void add(Command cmd) {
		commandList.add(cmd);
	}

	/**
	 * 宏命令聚集管理方法
	 */
	public void remove(Command cmd) {
		commandList.remove(cmd);
	}

	/**
	 * 执行方法
	 */
	public void execute() {
		for (Command cmd : commandList) {
			cmd.execute();
		}
	}

}
