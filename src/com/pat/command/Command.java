package com.pat.command;
/**
 * 命令类，所有的命令
 * @author ZX
 *
 */
public abstract class Command {
	public abstract void execute();
}
/**
 * 命令A
 * @author Administrator
 *
 */
class CommandA extends Command{
    Receiver receiver;
	@Override
	public void execute() {
		receiver.takeOff();
		
	}
	public CommandA(Receiver receiver) {
		this.receiver=receiver;
	}
}
/**
 * 命令B
 * @author Administrator
 *
 */
class CommandB extends Command{
    Receiver receiver;
	@Override
	public void execute() {
		receiver.land();
		
	}
	public CommandB(Receiver receiver) {
		this.receiver=receiver;
	}
}