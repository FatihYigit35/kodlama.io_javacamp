package kodlamaIoWebSimulation.logging;

public class EmailLogger implements Logger {
	@Override
	public void log(String data) {
		System.out.println(data + " : email ile loglandı");
	}
}
