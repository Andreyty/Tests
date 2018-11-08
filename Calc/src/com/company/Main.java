package com.company;

import java.util.Scanner;
import java.lang.String;
public class Main {

    public static void main(String[] args) {


        while(true){

            Scanner scan = new Scanner(System.in);
            String input = new String();
            double first_argument = 0;
            double second_argument = 0;
            double result = 0;
            input = scan.next();


            if (input.equals("quit")){
                break;
            }

            try {
                first_argument = Double.parseDouble(input);

            }catch (NumberFormatException exc){
                System.out.println("First arguement is not a number, please, try again");
                continue;
            }

            Scanner de = new Scanner(System.in);

            String operator = de.next();

            if (operator.equals("quit")){
                break;
            }

            if (operator.equals("+") || operator.equals("-")||operator.equals("*") || operator.equals("/")){

            }else {
                System.out.println("Can not understan what to do... Try from start");
                continue;
            }



            Scanner se = new Scanner(System.in);
            String second = new String();
            second = se.next();

            if (second.equals("quit")){
                break;
            }

            try {
                second_argument = Double.parseDouble(second);
            }catch (NumberFormatException exc){
                System.out.println("Second arguement is not a number, please, try again");
                continue;
            }


            switch (operator){
                case "+":
                    result = first_argument+second_argument;
                    break;
                case "-":
                    result = first_argument-second_argument;
                    break;
                case "*":
                    result = first_argument*second_argument;
                    break;
                case "/":
                    if (second_argument == 0){
                        System.out.println("Division by zero, please, try again");
                        continue;
                    }else{
                        result = first_argument/second_argument;
                        break;
                    }
            }



            System.out.println("Result = " + result);

        }

    }
}