
public class AbstractFactory {
	public PositionFactory getPositionFactory(String type) {
		if ("Forward".equals(type)) {
			return new ForwardFactory();
		} else {
			return new DefendersFactory();
		}
	}
}
