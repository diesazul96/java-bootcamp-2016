
public class Singleton {
	
	//This variable is null to create new instances if there's anyone
	private static Singleton singletonExample = null;

	//The constructor is private to avoid other classes to used it
	private Singleton() {
	}

	//In this method will be evaluated the state of the instance.
	//If there isn't any instance then will be created a new one.
	//And if the instance already exist then will be returned the first created instance
	public static Singleton getInstance() {
		if (singletonExample == null) {
			singletonExample = new Singleton();
		}
		return singletonExample;
	}

	//This method will show a message to simulate the connection with a DB
	public void sayHello() {
		System.out.println("...Conexión Completada!!!...");
	}
}
