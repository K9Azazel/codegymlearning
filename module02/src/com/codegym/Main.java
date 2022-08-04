package com.codegym;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number: ");
        int numb = scanner.nextInt();
        String one = "one";
        String two = "two";
        String three = "three";
        String four = "four";
        String five = "five";
        String six = "six";
        String seven = "seven";
        String eight = "eight";
        String nine = "nine";
        String ty = "ty";

        if (numb < 0 && numb > 19) {
            System.out.println(" khong biet doc");
        }
        else if (numb <= 13){
            switch (numb){
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println(one);
                    break;
                case 2:
                    System.out.println(two);
                    break;
                case 3:
                    System.out.println(three);
                    break;
                case 4:
                    System.out.println(four);
                    break;
                case 5:
                    System.out.println(five);
                    break;
                case 6:
                    System.out.println(six);
                    break;
                case 7:
                    System.out.println(seven);
                    break;
                case 8:
                    System.out.println(eight);
                    break;
                case 9:
                    System.out.println(nine);
                    break;
                case 10:
                    System.out.println("ten");
                    break;
                case 11:
                    System.out.println(" eleven ");
                    break;
                case 12:
                    System.out.println(" twelve ");
                    break;
                case 13:
                    System.out.println(" thirty ");
                    break;

            }
        }
        else if (numb < 20){
            String teen = "teen";
            int daumot = numb - 10;
            switch (daumot) {
                case 4:
                    System.out.println("four"+teen);
                    break;
                case 5:
                    System.out.println("five"+teen);
                    break;
                case 6:
                    System.out.println("six"+teen);
                    break;
                case 7:
                    System.out.println("seven"+teen);
                    break;
                case 8:
                    System.out.println("eight"+teen);
                    break;
                case 9:
                    System.out.println("nine"+teen);
                    break;
            }
        }
    }
}