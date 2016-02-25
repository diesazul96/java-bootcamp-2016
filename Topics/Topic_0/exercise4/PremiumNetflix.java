
public class PremiumNetflix implements NetflixBuilder{
	
	private Netflix netflix;
	
	public PremiumNetflix() {
		netflix = new Netflix();
	}
	
	//Here will be created a Netflix account and 
	//the methods will create every part of the Netflix account
	//and then return it

	@Override
	public void buildPrice() {
		netflix.setPrice(11.99);
	}

	@Override
	public void buildHD() {
		netflix.setHD(true);
	}

	@Override
	public void buildUltraHD() {
		netflix.setUltraHD(true);
	}

	@Override
	public void buildSimultaneousScreens() {
		netflix.setSimultaneousScreens(4);
	}

	@Override
	public Netflix getNetflix() {
		return netflix;
	}

}
