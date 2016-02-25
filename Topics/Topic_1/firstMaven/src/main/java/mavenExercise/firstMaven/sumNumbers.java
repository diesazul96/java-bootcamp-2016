package mavenExercise.firstMaven;

public class sumNumbers {
	
	private int num1;
	private int num2;
	
	public sumNumbers(int num1, int num2) {
		this.num1=num1;
		this.num2=num2;
	}
	
	public int sumOfNumbers(){
		int sum=num1+num2;
		return sum;
	}

}
