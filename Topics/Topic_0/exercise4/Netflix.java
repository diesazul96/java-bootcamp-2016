
public class Netflix {

	private double price;
	private boolean HD;
	private boolean ultraHD;
	private int simultaneousScreens;
	
	//return the price 
	public double getPrice() {
		return price;
	}
	
	//define the value 
	public void setPrice(double price) {
		this.price = price;
	}

	//return HD value
	public boolean isHD() {
		return HD;
	}

	//define the value
	public void setHD(boolean hD) {
		HD = hD;
	}
	
	//return ultraHD value
	public boolean isUltraHD() {
		return ultraHD;
	}

	//define the value
	public void setUltraHD(boolean ultraHD) {
		this.ultraHD = ultraHD;
	}

	//return the # of screens
	public int getSimultaneousScreens() {
		return simultaneousScreens;
	}

	//define the value
	public void setSimultaneousScreens(int simultaneousScreens) {
		this.simultaneousScreens = simultaneousScreens;
	}
	
	public String toString(){
		return this.getClass().getSimpleName()+" plan: " + "Price: $" + price + "; HD availability: " + HD + 
				"; Ultra HD availability: " + ultraHD + "; Simultaneous Screens: " + simultaneousScreens;
	}
	
}
