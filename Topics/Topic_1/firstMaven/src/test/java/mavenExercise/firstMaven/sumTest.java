package mavenExercise.firstMaven;

import static org.junit.Assert.*;
import org.junit.Test;

public class sumTest {
	
	@Test
	public void sumaPositivos() {
	      System.out.println("Sumando dos números positivos...");
	       sumNumbers sum = new sumNumbers(2, 3);
	       assertTrue(sum.sumOfNumbers() == 5);
	}
	
	@Test
	public void sumarNegativos(){
		System.out.println("Sumando dos numeros negativos...");
		sumNumbers sum = new sumNumbers(-2, -3);
		assertTrue(sum.sumOfNumbers() == -5);
	}
	
	@Test
	public void sumarPositivoYNegativo(){
		System.out.println("Sumando un numero positivo y un numero negativo");
		sumNumbers sum = new sumNumbers(-2, 3);
		assertTrue(sum.sumOfNumbers() == 1);
	}

}
