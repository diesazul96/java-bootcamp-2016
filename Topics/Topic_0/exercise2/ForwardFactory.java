
public class ForwardFactory extends PositionFactory{

	@Override
	public SoccerPlayer getPlayer(String type) {
		if ("Messi".equalsIgnoreCase(type)) {
			return new Messi();
		} else {
			return new Ronaldo();
		}
	}
	
}
