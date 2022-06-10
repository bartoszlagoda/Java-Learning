package CalculatorFile;

public class Calculator {
    public void add(float firstNumber, float secondNumber){
        System.out.println("Dodawanie liczb " + firstNumber + " i " + secondNumber + " : ");
        System.out.println(firstNumber + secondNumber);
    }
    public void sub(float firstNumber, float secondNumber){
        System.out.println("Odejmowanie liczb " + firstNumber + " i " + secondNumber + " : ");
        System.out.println(firstNumber - secondNumber);
    }
    public void mul(float firstNumber, float secondNumber) {
        System.out.println("Mnożenie liczb " + firstNumber + " i " + secondNumber + " : ");
        System.out.println(firstNumber * secondNumber);
    }
    public void div(float firstNumber, float secondNumber) {
        System.out.println("Dzielenie liczb " + firstNumber + " i " + secondNumber + " : ");
        System.out.println(firstNumber / secondNumber);
    }
    public void mod(float firstNumber, float secondNumber) {
        System.out.println("Modulo " + firstNumber + " z " + secondNumber + " : ");
        System.out.println(firstNumber % secondNumber);
    }


}
