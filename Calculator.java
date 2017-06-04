/*
 * In this project, you will use classes, methods, and objects to create a 
 * simple arithmetic calculator. The calculator will be able to:
 * Add two integers
 * Subtract two integers
 * Multiply two integers
 * Divide two integers
 * Apply the modulo operator on two integers
 */
package calculator;

public class Calculator {
    
    public Calculator() {
    
    }
    
    public int add(int a, int b){
        return a + b; 
    }
  
    public int subtract(int a, int b){
        return a - b; 
    }
  
    public int multiply(int a, int b){
        return a * b; 
    }
  
    public int divide(int a, int b){
        if(b == 0){
            System.out.println("Error! Dividing by zero is not allowed.");
            return 0; 
        } else {
            return a / b; 
        }
    }
    
    public int modulo(int a, int b){
    	if(b == 0){
            System.out.println("Error! Dividing by zero is not allowed.");
            return 0; 
        } else {
            return a % b;    
        }
   }
  
   public static void main(String[] args){
    Calculator myCalculator = new Calculator();
    System.out.println(myCalculator.add(5,7));
    System.out.println(myCalculator.subtract(45,11));   
    }
}

    

