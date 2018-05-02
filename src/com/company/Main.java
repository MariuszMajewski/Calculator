package com.company;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Witaj w kalkulatorze");
        System.out.println("");
        System.out.println("Kalkulator umożliwia dodawanie, odejmowanie, mnożenie i dzielenie dwóch liczb całkowictych lub zmiennoprzcinkowych");
        System.out.println("");
        System.out.println("Podaj pierwszą liczbę");
        Number liczba1 = 0;
        Number liczba2 = 0;
        Scanner scanner = new Scanner(System.in);
        if(scanner.hasNextInt()){
            liczba1 = scanner.nextInt();
        } else if (scanner.hasNextFloat()) {
            liczba1 = scanner.nextFloat();
        } else if (scanner.hasNextDouble()) {
            liczba1 = scanner.nextDouble();
        }
        else {
            System.out.println("Podałeś nieprawidłową liczbę.");
        }
        char znak = ' ';
        System.out.println("Podaj znak operacji");
        if(scanner.hasNextLine()){
            scanner.nextLine();
            String read = scanner.nextLine();
            znak = read.charAt(0);
        }

        if(znak=='+'||znak=='-'||znak=='*'||znak=='/'){

        }
        else
            System.out.println("Podałeś niewłaściwy znak.");


        System.out.println("Podaj drugą liczbę");
        if(scanner.hasNextInt()){
            liczba2 = scanner.nextInt();
        } else if (scanner.hasNextFloat()) {
            liczba2 = scanner.nextFloat();
        } else if (scanner.hasNextDouble()) {
            liczba2 = scanner.nextDouble();
        }
        else {
            System.out.println("Podałeś nieprawidłową liczbę.");
        }
        Number wynik = 0;
        if(znak=='+'){
            wynik = liczba1.doubleValue() + liczba2.doubleValue();
        }
        else if(znak=='-'){
            wynik = liczba1.doubleValue() - liczba2.doubleValue();
        }
        else if(znak=='*'){
            wynik = liczba1.doubleValue() * liczba2.doubleValue();
        }
        else if(znak=='/'){
            wynik = liczba1.doubleValue() / liczba2.doubleValue();
        }
            if(wynik.doubleValue()%2==0)
                System.out.println("Wynik: "+ wynik.intValue());
            else
                System.out.println("Wynik: "+ wynik);
    }
}