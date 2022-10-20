package polymorphismDemo;

public class Main {

	public static void main(String[] args) {
//		BaseLogger baseLogger = new DatabaseLogger();
//		baseLogger.log("Log Mesajı");
//
//		BaseLogger[] loggers = new BaseLogger[] { new FileLogger(), new DatabaseLogger(), new ConsoleLogger() };
//		
//		for (BaseLogger logger : loggers) {
//			logger.log("Log Mesajı (Array)");
//		}

		CustomerManager customerManager = new CustomerManager(new FileLogger());
		customerManager.add();

	}

}
