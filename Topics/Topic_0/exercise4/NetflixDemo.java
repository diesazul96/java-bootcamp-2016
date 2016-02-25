
public class NetflixDemo {

	public static void main(String[] args) {
		
		NetflixBuilder netflix = new BasicNetflix();
		NetflixDirector netflixDir = new NetflixDirector(netflix);
		netflixDir.constructNetflix();
		Netflix account = netflixDir.getNetflix();
		System.out.println(account);
		
		netflix = new PremiumNetflix();
		netflixDir = new NetflixDirector(netflix);
		netflixDir.constructNetflix();
		account = netflixDir.getNetflix();
		System.out.println(account);
		
	}

}
