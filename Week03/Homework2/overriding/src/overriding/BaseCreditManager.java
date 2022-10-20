package overriding;

public class BaseCreditManager {
	public double calculate(double price) { // final eklersek extend edilen sınıflar override edemez
		return price * 1.18;
	}
}
