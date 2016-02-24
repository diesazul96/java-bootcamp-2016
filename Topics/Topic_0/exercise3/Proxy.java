import java.util.Date;

public class Proxy {
	
	TravelingToBarcelona travelBarca;
	
	public Proxy() {
		System.out.println("Creating proxy at " + new Date());
	}
	
	public void TravelingTo(){
		
		if(travelBarca == null){
			
			travelBarca= new TravelingToBarcelona();
		}
		travelBarca.TravelingTo();
	}
}
