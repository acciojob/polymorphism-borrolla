package com.driver;
public class Main {
   //Task 1:
    // * create a class Product inside Main class
    public static class Product{
        //create a method of following defination
        public int product(int x, int y){
             return x * y;
        }

        //Task 4:
       // * create an Overloaded method product of following defination
       // * public int product(int x, int y, int z) {}
        public int product(int x, int y,int z)
        {
            return x * y * z;
        }

        ///  Task 5
        ///  * create an Overloaded method product of following definition
        ///  * public double product(double x, double y)
       public double product(double x, double y) {
           return x * y;

       }
   }
    public static void main(String[] args) {
        //task2:
        //create object of Product in Main function called p
        Product p = new Product();

        // Call the methods and print the results
        System.out.println("Product of 2 and 3 (int): " + p.product(2,3));
        System.out.println("Product of 2, 3 and 4: " + p.product(2,3,4));
        System.out.println("product of 2.5 and  3.5: " + p.product(2.5,3.5));
    }

}