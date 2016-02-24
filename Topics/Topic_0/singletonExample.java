
public class singletonExample {
	
	//This variable is Static to be used by any instance of this class
	private static SingletonExample singletontest = null;
	
	//The constructor is private to avoid other classes to use it
	private SingletonExample() {
	}

	//This method will create a new instance of the class 
	//if there's no one, and if there's an instance this 
	//one will be returned
	public static SingletonExample getInstance() {
		if (singletontest == null) {
			singletontest = new SingletonExample();
		}
		return singletonExample;
	}

	//This method sends a message to simulate the conection to a DB
	public void saySomething() {
		System.out.println("Sucessfull Conection");
	}
}
