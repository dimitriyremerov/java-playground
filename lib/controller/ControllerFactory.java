package lib.controller;

public class ControllerFactory {
	public static AbstractController create(String name) throws ControllerException {
		switch (name.toLowerCase()) {
			case "thread":
				return new lib.playground.thread.Controller();
			default:
				throw new ControllerException(String.format("Method %s is unknown", name));
		}
	}
}
