
public class NetflixDirector {
	
	//Here will be assembled the Product depending of the NetflixBuilder 
	//that the constructor receives as a parameter

	private NetflixBuilder netflix = null;
	
	public NetflixDirector(NetflixBuilder netflix) {
		this.netflix=netflix;
	}
	
	public void constructNetflix(){
		netflix.buildPrice();
		netflix.buildHD();
		netflix.buildUltraHD();
		netflix.buildSimultaneousScreens();
	}
	
	public Netflix getNetflix(){
		return netflix.getNetflix();
	}
	
}
