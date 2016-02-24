import java.util.Date;

public abstract class Travel {
	
	public void TravelingTo(){
		
		System.out.println("Hi, I'm "+ this.getClass().getSimpleName() + " at " + new Date());
	}
	
}
