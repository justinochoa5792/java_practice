package com.example;

import java.util.ArrayList;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        String name = "Justin";
        System.out.println("Hello World!");
        System.out.println(name.toUpperCase());

        addExclamation(name);
        doStuff();

        String[] fruits = new String[3];
        fruits[0] = "Mango";
        fruits[1] = "Apple";
        fruits[0] = "Strawberry";
        System.out.println(fruits[1]);
        ArrayList fruitList = new ArrayList<>();
        fruitList.add("Orange");
        fruitList.add("Banana");
        fruitList.add("Blueberry");
        
        System.out.println(fruitList);
        fruitList.remove("Blueberry");
        System.out.println(fruitList);

    }
    public static void addExclamation(String s){
        System.out.println( s + "!");
    }

    public static void doStuff(){
        int a = 5;

        if(a == 5){
            System.out.println("The Number is 5");
        }else{
            System.out.println("The Number is not 5");
        }

        for(int i = 0; i <= a; i++){
            System.out.println(i);

        }

        while(a < 10){
            System.out.println("Hi");
            a++;
        }
    }
}
