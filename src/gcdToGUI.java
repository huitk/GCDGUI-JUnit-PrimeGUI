
/* Import Java Libraries */
/* Member : Tongjit Karawapornphut G01221230
 * Jacqueline Garcia G01186986
 */
import java.io.*;
import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.math.*;

public class gcdToGUI extends JPanel
{
	
	int firstNumber;
	int secondNumber;
	int result1;
	int result2;
	
	public void gcdToGUI() {
		firstNumber = 0;
		secondNumber = 0;
		result1 = 0;
		result2 = 0;
	}


/* Create new variables for JPanel */ 
JPanel titlePanel = new JPanel();
JPanel firstValInputPanel = new JPanel();
JPanel secondValInputPanel = new JPanel();
JPanel resultAnswerPanel = new JPanel();


//JPanel resultPanel = new JPanel();
JPanel OperationLCMPanel = new JPanel();
//static String OperationGCD = "GCD";
JPanel OperationGCDPanel = new JPanel();
JPanel resetPanel = new JPanel();
JPanel clearFormPanel = new JPanel();
JPanel errorPanel = new JPanel();
//JPanel primeOrAbundantPanel = new JPanel();
JPanel primeOrAbundantAnswerPanel = new JPanel();
JPanel primeOrAbundantPanel = new JPanel();

/* Create JLabel variables */
JLabel titleLabel = new JLabel();
JLabel firstValInputLabel = new JLabel();
JLabel secondValInputLabel = new JLabel();
JLabel resultAnswerLabel = new JLabel();

//JLabel resultLabel = new JLabel();  
JLabel OperationLCMLabel = new JLabel();
JLabel OperationGCDLabel = new JLabel();
JLabel resetLabel = new JLabel();
JLabel clearFormLabel = new JLabel();
JLabel errorLabel = new JLabel();
//JLabel primeOrAbundantLabel = new JLabel();
JLabel primeOrAbundantAnswerLabel = new JLabel();
JLabel primeOrAbundantLabel = new JLabel();

/* Create variables for JButton */
JButton OperationLCMButton = new JButton();
JButton OperationGCDButton = new JButton();

JButton resetButton = new JButton();
JButton clearFormButton = new JButton();
//JButton primeOrAbundantButton = new JButton();
JButton primeOrAbundantButton = new JButton();

/* Create text field variable and size */
JTextField inputTextField1 = new JTextField(15);
JTextField inputTextField2 = new JTextField(15);
JTextField inputTextAnswer = new JTextField(30);
JTextField primeAbundantTextAnswer = new JTextField(35);




public gcdToGUI () {
	/* Set layout */
	titlePanel.setLayout(new FlowLayout(FlowLayout.CENTER));
	firstValInputPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
	secondValInputPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
	resultAnswerPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
	OperationLCMPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
	OperationGCDPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
	resetPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
	clearFormPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
	errorPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
	//primeOrAbundantPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
	primeOrAbundantAnswerPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
	primeOrAbundantPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
	/* Set font and size */
	Font bigFont = new Font("Helvetica Bold", Font.BOLD, 25);
	Font smallFont = new Font("Helvetica Bold", Font.BOLD, 15);
	Font redSmallFont = new Font("Helvetica Bold Red", Font.BOLD, 15);
	
	/* Set label to the font preferred */
	titleLabel.setFont(bigFont);
	firstValInputLabel.setFont(smallFont);
	secondValInputLabel.setFont(smallFont);
	resultAnswerLabel.setFont(smallFont);
	OperationLCMLabel.setFont(smallFont);
	OperationGCDLabel.setFont(smallFont);
	resetLabel.setFont(smallFont);
	clearFormLabel.setFont(smallFont);
	errorLabel.setFont(redSmallFont);
	//primeOrAbundantLabel.setFont(smallFont);
	primeOrAbundantAnswerLabel.setFont(smallFont);
	primeOrAbundantLabel.setFont(smallFont);
	
	/* Set input text field to the font preferred */
	inputTextField1.setFont(smallFont);
	inputTextField2.setFont(smallFont);
	inputTextAnswer.setFont(smallFont);
	primeAbundantTextAnswer.setFont(smallFont);
	
	
	/* Set name for each label */
	titleLabel.setText("GUI to Compare GCDs and LCMs");
	firstValInputLabel.setText("First val :     ");
	secondValInputLabel.setText("Second val : ");
	resultAnswerLabel.setText("Result :        ");
	errorLabel.setText("");
	primeOrAbundantAnswerLabel.setText("Prime or Abandant Answer : ");
	
	OperationLCMButton.setText("LCM");
	OperationGCDButton.setText("GCD");
	resetButton.setText("Reset");
	clearFormButton.setText("Clear Form");
	//primeOrAbundantButton.setText("Prime or Abandant");
	primeOrAbundantButton.setText("Prime or abundant");
	
	
	/* the buttons are connected to their classes 
	errorButton.addActionListener(new resetButton());
	*/
	clearFormButton.addActionListener(new clearFormButton());
	resetButton.addActionListener(new resetButton());
	OperationGCDButton.addActionListener(new OperationGCDButton());
	OperationLCMButton.addActionListener(new OperationLCMButton());
	primeOrAbundantButton.addActionListener(new primeOrAbundant());
	
	/* Labels, buttons and textFields are added to their panels */
	titlePanel.add(titleLabel);
	
	/* Each input panel has 2 items add */ 
	firstValInputPanel.add(firstValInputLabel);
	firstValInputPanel.add(inputTextField1);
	secondValInputPanel.add(secondValInputLabel);
	secondValInputPanel.add(inputTextField2);
	resultAnswerPanel.add(resultAnswerLabel);
	resultAnswerPanel.add(inputTextAnswer);
	errorPanel.add(errorLabel);
	primeOrAbundantAnswerPanel.add(primeOrAbundantAnswerLabel);
	primeOrAbundantAnswerPanel.add(primeAbundantTextAnswer);
	
	
	OperationLCMPanel.add(OperationLCMButton);
	OperationGCDPanel.add(OperationGCDButton);
	resetPanel.add(resetButton);
	clearFormPanel.add(clearFormButton);
	primeOrAbundantPanel.add(primeOrAbundantButton);
	
	
	
	/* The panels are added in the order that they should appear. Throughout the 
	declarations and initializations variables were
	kept in this order to aid in keeping them straight */
	
	setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
	add(titlePanel);
	add(firstValInputPanel);
	add(secondValInputPanel);
	add(resultAnswerPanel);
	add(primeOrAbundantAnswerPanel);
	add(OperationLCMPanel);
	add(OperationGCDPanel);
	add(resetPanel);
	add(clearFormPanel);
	add(primeOrAbundantPanel);
	//add(errorPanel);
	
}

public void display()
{	/* A JFrame is where the components of the screen will be put. */
	JFrame theFrame = new JFrame("GUI to compute GCDs and LCMs");
	/* When the frame is closed it will exit to the previous window that called it.*/
	theFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	/* Puts the panels in the JFrame */
	theFrame.setContentPane(this);
	/* sets the dimensions in pixels */
	//theFrame.setPreferredSize(new Dimension(600, 380));
	theFrame.setPreferredSize(new Dimension(800, 600));
	theFrame.pack();
	/* make the window visible */
	theFrame.setVisible(true);
}

/* This class has one method that is called when the OperstionGCD is push.
It retrieves the string from the JTextField
inputTextField, converts it to an integer and manipulates the
number.*/

class OperationGCDButton implements ActionListener {
	
	public void actionPerformed(ActionEvent e) {
		
		passOperationGCDButton(firstNumber, secondNumber);
	}
	
}

public int passOperationGCDButton(Integer firstNumber, Integer secondNumber) {
	int result1 = 0;
	String stringNumber;
	try{
		
	    firstNumber = Math.abs(firstNumber);
        secondNumber = Math.abs(secondNumber); 
	    /* call the method to calculate GCD */
	    result1 = getVal(firstNumber, secondNumber);
	    stringNumber = " " + result1;
	    
	} 
	/* If the input is not integer, give the error message */
	catch (NumberFormatException ex) {
	    System.out.println("Integer only please");
	    stringNumber = "Error. No space. Integer only please";
	    
	}
	/* Print the result in the result text answer */
    inputTextAnswer.setText(stringNumber);
    return result1;
}

class OperationLCMButton implements ActionListener {
	public void actionPerformed(ActionEvent e) {
		passOperationLCMButton(firstNumber, secondNumber);	
	}		
}

public int passOperationLCMButton(Integer firstNumber, Integer secondNumber) {
/* Create objects and variables */
	result2 = 0;
	String stringNumber;

/* Exception will go to the catch block */
	try {
		/* Add Math.ads to make negative numbers perform */
		firstNumber = Math.abs(firstNumber);
		secondNumber = Math.abs(secondNumber); 
		result2 = (firstNumber * secondNumber)/getVal(firstNumber, secondNumber);
		/* Set the string text */
		stringNumber = " " + result2;
	}
	/* If the input is not integer, give the error message */
	catch(NumberFormatException ex) {
		System.out.println("Integer only please");
		stringNumber = "Error. No space. Integer only please";
	}	
	/* Print the result in the result label */
	inputTextAnswer.setText(stringNumber);
	return result2;
}

/* this class resets the values of inputText and answerLable */

class clearFormButton implements ActionListener {
	public void actionPerformed(ActionEvent e) {
		Integer num1 = 0;
		Integer num2 = 0;
		passClearFormButton(num1, num2);
	/*		inputTextField1.setText(""); //erases the values of first val in JTextField
			inputTextField2.setText(""); //erases the value of second val in JTextField
			inputTextAnswer.setText(""); //erase the value of result in JTextField 
			primeAbundantTextAnswer.setText("");
	*/
	}
		
}
public void passClearFormButton(Integer num1, Integer num2) {
	inputTextField1.setText(""); //erases the values of first val in JTextField
	inputTextField2.setText(""); //erases the value of second val in JTextField
	inputTextAnswer.setText(""); //erase the value of result in JTextField 
	primeAbundantTextAnswer.setText("");
	
}





/* This method recall the previous number after the label the fields were clear */
class resetButton implements ActionListener {
	public void actionPerformed(ActionEvent e) {
		
			//inputTextField1.setText("9");
			//inputTextField2.setText("9"); 
			//inputTextAnswer.setText("9"); 
	}
}

/* This class is to connect the prime or abundant button to the text field 
 * It is also call isPrime and is Abundant methods and check 2 variables if they're prime or abundant number 
 */ 
class primeOrAbundant implements ActionListener {
	
	public void actionPerformed(ActionEvent e) {
		
		passPrimeOrAbundant(firstNumber, secondNumber);
	}
	
}

public boolean passPrimeOrAbundant(Integer firstNumber, Integer secondNumber) {
	
	String stringText;
	
	Boolean ifTrue = true;
	
	/* Check both number if they are prime, abundant number, or both, or neither */
	if(isPrime(firstNumber) == true && isPrime(secondNumber) == true) {
		stringText = "First val is prime number. Second val is prime number.";
		primeAbundantTextAnswer.setText(stringText);
		ifTrue = true;
		return ifTrue;
	}
	else if(isPrime(firstNumber) == true && isAbundant(secondNumber) == true) {
		stringText = "First val is prime number. Second val is abundant number.";
		primeAbundantTextAnswer.setText(stringText);
		ifTrue = true;
		return ifTrue;
	}
	else if(isPrime(firstNumber) == true && isPrime(secondNumber) == false && isAbundant(secondNumber) == false) {
		stringText = "First val is prime number. Second val is neither.";
		primeAbundantTextAnswer.setText(stringText);
		ifTrue = true;
		return ifTrue;
	}
	else if(isAbundant(firstNumber) == true && isPrime(secondNumber) == true) {
		stringText = "First val is abundant number. Second val is prime number.";
		primeAbundantTextAnswer.setText(stringText);
		ifTrue = true;
		return ifTrue;
	}
	else if(isAbundant(firstNumber) == true && isAbundant(secondNumber) == true) {
		stringText = "First val is abundant num. Second val is abundant number.";
		primeAbundantTextAnswer.setText(stringText);
		ifTrue = true;
		return ifTrue;
	}
	else if(isAbundant(firstNumber) == true && isPrime(secondNumber) == false && isAbundant(secondNumber) == false) {
		stringText = "First val is abundant number. Second val is neither.";
		primeAbundantTextAnswer.setText(stringText);
		ifTrue = true;
		return ifTrue;
	}
	else if(isPrime(firstNumber) == false && isAbundant(firstNumber) == false && isPrime(secondNumber) == true) {
		stringText = "First val is neither. Second val is prime number.";
		primeAbundantTextAnswer.setText(stringText);
		ifTrue = true;
		return ifTrue;
	}
	else if(isPrime(firstNumber) == false && isAbundant(firstNumber) == false && isAbundant(secondNumber) == true) {
		stringText = "First val is neither. Second val is abundant number.";
		primeAbundantTextAnswer.setText(stringText);
		ifTrue = true;
		return ifTrue;
	}
	else if(isPrime(firstNumber) == false && isAbundant(firstNumber) == false && isPrime(secondNumber) == false &&isAbundant(secondNumber) == false) {
		stringText = "First val is neither. Second val is neither.";
		primeAbundantTextAnswer.setText(stringText);
		ifTrue = true;
		return ifTrue;
	}
	else {
		ifTrue = false;
	}
	return ifTrue;
	
}
	
public void setFirstNumber(int firstNumber) {
	this.firstNumber = firstNumber;
}

public int getFirstNumber() {
	return firstNumber;
}

public void setSecondNumber(int secondNumber) {
	this.secondNumber = firstNumber;
}

public int getsecondNumber() {
	return secondNumber;
}

public void setResult1(int result1) {
	this.result1 = result1;
}

public int getResult1() {
	return result1;
}


/* Main method */
 public static void main(String[] args) throws IOException {
	  	/* Create an object in class gcdToGui and make the screen appear */
		gcdToGUI myGUI = new gcdToGUI();
	    myGUI.display();

}

/* This method is to check if the number is a prime number */
 
public Boolean isPrime(int number) {
	Boolean isPrime = true;
	/* If number is negative, they are not prime. Check number until 2 */
	if(number <= 1) {
		return isPrime =false;
	}
	else if(number == 2)
        return isPrime;
	else if(number % 2 == 0) {
		return isPrime = false;
	}
	/* Start checking from number 3 until the variable that the user select in the input field */
	for (int i = 3; i <= Math.sqrt(number); i += 2) 
    {
        if (number % i == 0) {
            return isPrime = false;
        }
    }
    return isPrime;
}
		

/* This method is to calculate abundant number */

private static int getSum(int number) {
	 int sum = 0; 
	 /* Run the loop until the square of that number */
     for (int i=1; i<=(Math.sqrt(number)); i++) {	
          if (number % i==0) { 
        	  /* if the division is equal to i, take only one of them */
              if (number/i == i) 
                 sum = sum + i; 
              /* If the division is not equal to i, take both of them. */
              else {
          
                 sum = sum + i; 
                 sum = sum + (number / i); 
              } 
          } 
      } 
     sum = sum - number; 
      return sum; 
} 

/* This method is to get the calculation from getSum and check if that number an abundant number */
public boolean isAbundant(int number) {
	if(number < 0) {
		return false;
	}
	/* If that sum is more than the number itself, it is abundant number */
	return (getSum(number) > number); 
} 


/* Computes the greatest common divisor of two integers */
 
private int getVal(int a, int b) {

   int num = 0;
   if (a < b) {
   
      for (int k = a; k >= 1; k--) {
      
         if (a%k == 0 && b%k == 0) {
         
            num = k;
            break;
         }
      }
   }
   if (b < a) {
   
      for (int p=b; p>=1; p--) {
      
         if (b%p==0 && a%p==0) {
         
            num=p;
            break;
         }
      }
   }
   return num;
 }

}  