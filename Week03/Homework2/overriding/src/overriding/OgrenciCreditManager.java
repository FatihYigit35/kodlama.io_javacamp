package overriding;

public class OgrenciCreditManager extends BaseCreditManager{
	public double calculate(double price) {
		return price * 1.1;
	}
}
