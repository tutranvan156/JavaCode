package com.company;

import com.sun.xml.internal.ws.util.StringUtils;

import java.util.Scanner;

public class StandardTask {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        s = s.trim().toLowerCase();
        String[] temp = s.split("\\s+");
        for (int i = 0; i < temp.length; i++) {
            System.out.printf(StringUtils.capitalize(temp[i]) + " ");
        }
    }
}
