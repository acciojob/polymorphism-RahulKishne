package com.driver;

public class Main {
    public static void main(){
        Product p=new Product();
        p.product(6,7);
        p.product(5,6,7);
        p.product(4,8);
    }

    public static class Product {
        public int product(int x, int y) {
            int a = x + y;
            return a;
        }
        public int product(int x,int y,int z){
            int sum=x+y+z;
            return sum;
        }
        public double product(double x,double y){
            double c=x+y;
            return c;
        }
    }
}