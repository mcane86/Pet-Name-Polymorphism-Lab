package com.michaelcane;

import java.util.ArrayList;
import java.util.Scanner;

public class Prompt {

    Scanner sc = new Scanner(System.in);

    public int askUserForNumberOfPets(String msg) {
        promptUser(msg);
        return sc.nextInt();
    }

    public String askUserForTypeOfPet(String msg) {
        promptUser(msg);
        return sc.nextLine();
    }

    public static void promptUser(String msg) {
        System.out.println(msg);
    }


}
