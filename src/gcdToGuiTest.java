import static org.junit.Assert.*;

import javax.swing.JButton;
import javax.swing.JTextField;

import org.junit.Test;

public class gcdToGuiTest {
	
	@Test
	/* Passed */
	/* Observability */
	public void OperationGCDButtonTest1() {
		gcdToGUI testNumber = new gcdToGUI();
		testNumber.setFirstNumber(10);
		testNumber.setSecondNumber(50); 
		assertEquals(10, testNumber.passOperationGCDButton(10, 50));
	}
	
	@Test
	/* Pass */
	/* Observability */
	public void OperationGCDButtonTest2() {
		gcdToGUI testNegative = new gcdToGUI();
		testNegative.setFirstNumber(-10);
		testNegative.setSecondNumber(-20); 
		assertEquals(10, testNegative.passOperationGCDButton(-10, -20));
	}
	
	@Test
	/* Pass */
	/* Observability */
	public void OperationLCMTest1() {
		gcdToGUI testLCMNumber = new gcdToGUI();
		testLCMNumber.setFirstNumber(30);
		testLCMNumber.setSecondNumber(50); 
		assertEquals(150, testLCMNumber.passOperationLCMButton(30, 50));
	}
	
	@Test
	/* Pass */
	/* Observability */
	public void OperationLCMButtonTest2() {
		gcdToGUI testLCMNegative = new gcdToGUI();
		testLCMNegative.setFirstNumber(-10);
		testLCMNegative.setSecondNumber(-20); 
		assertEquals(20, testLCMNegative.passOperationLCMButton(-10, -20));
	}
	
	
	
	/*Passing from JTextField. Check if all the fields are empty */
	@Test
	/* Pass */
	public void assertIsStringEmpty() {
		gcdToGUI testEmptyField = new gcdToGUI();
		String firstText = testEmptyField.inputTextField1.getText();
		String secondText = testEmptyField.inputTextField2.getText();
		String textAnswer = testEmptyField.inputTextAnswer.getText();
		String primeAbundant = testEmptyField.primeAbundantTextAnswer.getText();
		assertTrue(firstText.isEmpty());
		assertTrue(secondText.isEmpty());
		assertTrue(textAnswer.isEmpty());
		assertTrue(primeAbundant.isEmpty());
		
	}
	

	/*Test all 9 cases for method passPrimeOrAbundant */
	/*Change the gcdToGUI class by passing the method passPrimeOrAbundant to class 
	/*primeOrAbundant.ActionPerformed(ActionEvent e)*/
	/*Get rid of inputTextField1,2 to be able to access set the variable in method so the interface doesn't work*/
	/* The test case does not connect to inputTextField but it pass from the method passPrimeOrAbundant */
	/* If set any cases in method passPrimeOrAbundant to be false, that test case will fail */
	
	@Test
	/* Pass */
	/* Observability */
	public void primeAbundantTestCase1() {
		gcdToGUI  testPrime1 = new gcdToGUI();
		assertEquals("First val is prime number. Second val is prime number.",testPrime1.passPrimeOrAbundant(3,3),true);
	}
	@Test
	/* Pass */
	/* Observability */
	public void primeAbundantTestCase2() {
		gcdToGUI  testPrime1 = new gcdToGUI();
		assertEquals("First val is prime number. Second val is abundant number.",testPrime1.passPrimeOrAbundant(5,12),true);
	}
	@Test
	/* Pass */
	/* Observability */
	public void primeAbundantTestCase3() {
		gcdToGUI  testPrime1 = new gcdToGUI();
		assertEquals("First val is prime number. Second val is abundant number.",testPrime1.passPrimeOrAbundant(3,4),true);
	}
	
	@Test
	/* Pass */
	/* Observability */
	public void primeAbundantTestCase4() {
		gcdToGUI  testPrime1 = new gcdToGUI();
		assertEquals("First val is abundant number. Second val is prime number.",testPrime1.passPrimeOrAbundant(12,3),true);
	}
	
	@Test
	/* Pass */
	/* Observability */
	public void primeAbundantTestCase5() {
		gcdToGUI  testPrime1 = new gcdToGUI();
		assertEquals("First val is abundant number. Second val is abundant number.",testPrime1.passPrimeOrAbundant(12,12),true);
	}
	
	@Test
	/* Pass */
	/* Observability */
	public void primeAbundantTestCase6() {
		gcdToGUI  testPrime1 = new gcdToGUI();
		assertEquals("First val is abundant number. Second val is neither.",testPrime1.passPrimeOrAbundant(12,1),true);
	}
	
	@Test
	/* Pass */
	/* Observability */
	public void primeAbundantTestCase7() {
		gcdToGUI  testPrime1 = new gcdToGUI();
		assertEquals("First val is neither. Second val is prime number.",testPrime1.passPrimeOrAbundant(1,3),true);
	}
	
	@Test
	/* Pass */
	/* Observability */
	public void primeAbundantTestCase8() {
		gcdToGUI  testPrime1 = new gcdToGUI();
		assertEquals("First val is neither. Second val is abundant number.",testPrime1.passPrimeOrAbundant(1,12),true);
	}
	
	@Test
	/* Pass */
	/* Observability */
	public void primeAbundantTestCase9() {
		gcdToGUI  testPrime1 = new gcdToGUI();
		assertEquals("First val is neither. Second val is neither.",testPrime1.passPrimeOrAbundant(1,1),true);
	}
	
	
	
	@Test
	/* Pass */
	/* Observability */
	public void isPrimeTets() {
		gcdToGUI  isPrimeTest = new gcdToGUI();
		//isPrimeTest.isPrime(6);
		assertEquals(isPrimeTest.isPrime(3), true);
	}
	@Test
	/* Pass */
	/* Observability */
	public void isPrimeTets2() {
		gcdToGUI  isPrimeTest = new gcdToGUI();
		//isPrimeTest.isPrime(6);
		assertEquals(isPrimeTest.isPrime(4), false);
	}
	
	
	
	
}	

