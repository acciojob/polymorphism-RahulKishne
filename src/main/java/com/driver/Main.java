package com.driver;

public class Main {
    public static void main(){
        // Task 2: create object of Product in Main function called p
        Product p = new Product();

        // Task 3: call the overloaded method with two integer arguments
        int result1 = p.product(3, 4);
        System.out.println("Product of 3 and 4 is: " + result1);

        // Task 4: call the overloaded method with three integer arguments
        int result2 = p.product(2, 5, 7);
        System.out.println("Product of 2, 5, and 7 is: " + result2);

        // Task 5: call the overloaded method with two double arguments
        double result3 = p.product(2.5, 3.0);
        System.out.println("Product of 2.5 and 3.0 is: " + result3);
    }

    public static class Product {

        public int product(int x, int y) {
            return x*y;
        }
        public int product(int x,int y,int z){

            return x*y*z;
        }
        public double product(double a,double b){
            return a*b;
        }
    }
}