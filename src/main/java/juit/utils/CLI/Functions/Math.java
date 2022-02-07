package juit.utils.CLI.Functions;

public class Math {
    public int add(int num1, int num2) {
        return num1 + num2;
    }

    public int sub(int num1, int num2) {
        return num1 - num2;
    }

    public int multiply(int num1, int num2)
    {
        return num1*num2;
    }
    public int divide(int num1,int num2)
    {
        return num1/num2;
    }
    public int square(int num){
        return num*num;
    }
    public float sqrt(int num){
        return (float) java.lang.Math.sqrt(num);
    }
    public int cube(int num){
        return num*num*num;
    }
}
