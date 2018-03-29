package module4;

public class Calculator {
    public double add(double x,double y){
        return x+y;
    }
    public double subtract(double x,double y){
        return x-y;
    }
    public static void main(String[]args){
        Calculator myCalculator=new Calculator();
        System.out.println(myCalculator.add(3,7));
        System.out.println(myCalculator.subtract(3,7));
    }
}