
public class ProxyTest {

	public static void main(String[] args) {
		
		Proxy proxy = new Proxy();

		TravelingToChia firstTravel = new TravelingToChia();
		firstTravel.TravelingTo();

		proxy.TravelingTo();


	}

}
