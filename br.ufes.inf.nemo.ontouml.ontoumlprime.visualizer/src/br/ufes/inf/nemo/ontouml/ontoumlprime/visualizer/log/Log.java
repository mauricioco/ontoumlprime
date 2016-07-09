package br.ufes.inf.nemo.ontouml.ontoumlprime.visualizer.log;

/**
 * Class to modularize log calls.
 * @author mauriciocarvalhodeoliveira
 */
public class Log {

	// TODO make class name stand out.

	private static int currentLevel = 1000000;

	public static void setLogLevel(int level) {
		currentLevel = level;
	}

	public static void printDivider() {
		System.out.println("--------------------------------------------------------------------------------");
	}

	public static void p(int level, Class<?> sender, String message) {
		printIdentation(level);
		if (level <= currentLevel) {
			System.out.println("(" + level + ") " + sender.getSimpleName() + ": " + message);
		}
	}

	public static void e(int level, Class<?> sender, String message) {
		printIdentationErr(level);
		if (level <= currentLevel) {
			System.err.println("(" + level + ") " + sender.getSimpleName() + ": " + message);
		}
	}

	public static void e(int level, Class<?> sender, Exception exception) {
		printIdentationErr(level);
		if (level <= currentLevel) {
			System.err.println("(" + level + ") " + sender.getSimpleName() + ": " + exception.getLocalizedMessage());
		}
	}

	private static void printIdentation(int level) {
		for (int i = 100; i < level; i += 100) {
			System.out.print(" ");
		}
	}

	private static void printIdentationErr(int level) {
		for (int i = 100; i < level; i += 100) {
			System.err.print(" ");
		}
	}

}