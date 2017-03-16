package com.pgs.javadev;

import java.util.Scanner;

/**
 * Created by andrzej on 15.03.17.
 */
public class Main {

    public static void main(String[] args) {
        printXmassTree();
    }

    private static void printXmassTree() {
        int wielkoscChoinki = getXmassSize();
        for (int i = 0; i < wielkoscChoinki; i++) {
            generateBranch(wielkoscChoinki, i);
        }
    }

    private static int getXmassSize() {
        Scanner s = new Scanner(System.in);
        return Integer.parseInt(s.nextLine());
    }

    private static void generateBranch(int wielkoscChoinki, int i) {
        printCharacter(" ", wielkoscChoinki - i - 1);
        printCharacter("*", 2 * i + 1);

        System.out.println();
    }

    static void printCharacter(String s, int count) {
        for (int i = 0; i < count; i++) {
            System.out.print(s);
        }
    }


}
