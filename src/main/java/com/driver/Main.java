package com.driver;

public class Main {
    public static void main(String[] args) {
        B obj = new B();
        String str1 = obj.meth(); // This will call the overridden method in class B
        System.out.println(str1);

        // Task 5: Call the overridden method from obj of class B
        String str2 = ((A)obj).meth(); // This will call the method in class A
        System.out.println(str2);
    }
  
}
 class A{
    public String meth(){
        return "Invoking method from class A";
    }

}
class B extends A{
     @Override
    public String meth(){
         return "Method is overridden in Extendend class B";
     }
}