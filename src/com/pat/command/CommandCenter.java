package com.pat.command;
/**
 * 指挥中心
 * @author ZX
 *
 */
public class CommandCenter {
	private Command command;
	public CommandCenter(Command command) {
		this.command=command;
	}
	public void call() {
		command.execute();
	}
}
