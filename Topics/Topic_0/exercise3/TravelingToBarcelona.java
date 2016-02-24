
public class TravelingToBarcelona extends Travel{

	public TravelingToBarcelona() {
		try{
			
			Thread.sleep(7000);
		}catch(InterruptedException e){
			
			e.printStackTrace();
		}
	}
	
}
