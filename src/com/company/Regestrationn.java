package com.company;

import java.util.Objects;
import java.util.Scanner;

import static java.lang.System.in;

public class Regestrationn implements Regestration {
    String name;
    String password;
    static  String[] arrLogin = new String[100];
    static  String[] arrPass = new String[100];
int count = 0;
boolean isHave = false;
Scanner scanner = new Scanner(in);
    @Override
    public void add() {
        System.out.println("input name: ");
        String name = scanner.next();
        System.out.println("input password: ");
String password = scanner.next();

arrLogin[count] =name;
arrPass[count] =password;
count++;

    }

    @Override
    public void search() {
        System.out.println(" Search ");
        System.out.println("input name: ");

        String s = scanner.next();
        for (int i = 0; i < count; i++) {
            if (Objects.equals(arrLogin[i], s)){
                isHave = true;
                break;
            }
        }
        if (isHave){
            System.out.println(" bor !!! ");
        }
        else {
            System.out.println(" yo'q !!! ");
        }

    }

    @Override
    public void remove() {

    }

    @Override
    public void sign() {
        System.out.println(" Sign in");
        System.out.println("input name: ");
        String name =scanner.next();
        System.out.println("input password: ");
        String password = scanner.next();

        for (int i = 0; i < count; i++) {
            if (Objects.equals((arrLogin[i]), name )&&Objects.equals(arrPass[i],password)){
                isHave=true;
                break;
            }
        }
        if (isHave){
            System.out.println("tizimga hush kelibsiz !!! ");
        } else {
            System.out.println("login or password error");
        }
    }


    @Override
    public void list() {
        for (int i = 0; i < count; i++) {
            System.out.println(arrLogin[i]);
            System.out.println(arrPass[i]);
        }
    }

    @Override
    public void update() {

    }
}
