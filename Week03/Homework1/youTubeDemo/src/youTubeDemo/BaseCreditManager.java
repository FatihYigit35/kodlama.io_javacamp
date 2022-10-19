package youTubeDemo;

public abstract class BaseCreditManager implements ICreditManager {
	@Override
	public abstract void calculate();

	@Override
	public void save() {
		System.out.println("Kredi kaydedildi.");
	}

}
