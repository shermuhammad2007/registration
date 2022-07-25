package com.company;

import java.util.Scanner;

import static java.lang.System.in;

public class Main {

    public static void main(String[] args) {
Regestrationn regestrationn = new Regestrationn();
        Scanner scanner = new Scanner(in);
while (true){
    System.out.println("[1] sign up");
    System.out.println("[2] sign in");
    System.out.println("[3] Search ");
    System.out.println("[4] List");

    int a = scanner.nextInt();
    switch (a){
        case 1 ->{
            regestrationn.add();
        }
        case 2->{
            regestrationn.sign();
        }
        case 3->{
            regestrationn.search();
        }
        case 4->{
            regestrationn.list();
        }

    }
}


    }
}
