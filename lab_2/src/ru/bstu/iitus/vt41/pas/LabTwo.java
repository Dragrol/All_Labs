package ru.bstu.iitus.vt41.pas;

import java.util.Scanner;

/**
 * Created by admin on 15.02.2016.
 */
public class LabTwo {
    public static void main(String[] args) {
        String filePath;
        System.out.println("Введите путь к файлу");
        Scanner scanner = new Scanner(System.in);
        filePath = scanner.next();
        EmailCheck emailCheck = new EmailCheck(filePath);
        emailCheck.parseFile();
    }
}
