import lib.controller.ControllerFactory;
import lib.controller.ControllerException;

public class Main {
	public static void main(String[] args) {
		try {
			for (int i = 0; i < args.length; i++) {
				ControllerFactory.create(args[i]).run();
			}
		} catch (ControllerException controllerExc) {
			System.err.println(controllerExc.getMessage());
			System.exit(1);
		} catch (Exception exc) {
			System.err.println(exc.getMessage());
			System.exit(2);
		}
	}
}
