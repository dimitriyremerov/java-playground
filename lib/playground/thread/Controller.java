package lib.playground.thread;

import lib.controller.AbstractController;

public class Controller extends AbstractController {
	public void run() {
		new Thread(() -> {
			System.out.println("Hello world!");
		}).start();
	}
}
