package lib.controller;

public class ControllerFactory {
	public static AbstractController create(ControllerRegistry operation) throws ControllerException {
		switch (operation) {
			case THREAD:
				return new lib.playground.thread.Controller();
			default:
				throw new ControllerException(String.format("Method %s is unknown", operation.toString()));
		}
	}
}
