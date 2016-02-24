
public class DefendersFactory extends PositionFactory{

	@Override
	public SoccerPlayer getPlayer(String type) {
		if ("Puyol".equalsIgnoreCase(type)) {
			return new Puyol();
		} else {
			return new Alves();
		}
	}
}
