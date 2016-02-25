
public class BasicNetflix implements NetflixBuilder{
	
	private Netflix netflix;
	
	public BasicNetflix() {
		netflix = new Netflix();
	}
	
	//Here will be created a Netflix account and 
	//the methods will create every part of the Netflix account
	//and then return it

	@Override
	public void buildPrice() {
		netflix.setPrice(7.99);
	}

	@Override
	public void buildHD() {
		netflix.setHD(false);
	}

	@Override
	public void buildUltraHD() {
		netflix.setUltraHD(false);
	}

	@Override
	public void buildSimultaneousScreens() {
		netflix.setSimultaneousScreens(1);
	}

	@Override
	public Netflix getNetflix() {
		return netflix;
	}
		
}
