package com.driver;

public class Main {
    public static void main(){
        Product p=new Product();
        p.product(6,7);
        p.product(5,6,7);
        p.product(4,8);
    }

    public static class Product {
        int x;
        int y;
        int z;
        double a;
        double b;
        public int product(int x, int y) {
            this.x=x;
            this.y=y;
            return x;
        }
        public int product(int x,int y,int z){
            this.x=x;
            this.y=y;
            this.z=z;
            return x;
        }
        public double product(double a,double b){
             this.a=a;
             this.b=b;
            return a;
        }
    }
}