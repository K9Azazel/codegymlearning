package com.codegym;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	double usd;
	Scanner sc = new Scanner(System.in);
	System.out.print ("Moi ban nhap so tien USD: ");
	usd = sc.nextDouble();
	double quydoi = usd * 23000;
	System.out.print("Gia tri VND: " + quydoi);
    }
}
