import lib.controller.ControllerFactory;
import lib.controller.ControllerException;
import lib.controller.ControllerRegistry;

public class Main {
	public static void main(String[] args) {
		try {
			for (int i = 0; i < args.length; i++) {
				ControllerRegistry operation = ControllerRegistry.valueOf(args[i].toUpperCase());
				ControllerFactory.create(operation).run();
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
