package ru.bstu.iitus.vt41.pas;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by admin on 15.02.2016.
 */
public class LabTwo {
    public static void main(String[] args) {
        String filePath;
        System.out.println("Введите путь к файлу");
        Scanner scanner = new Scanner(System.in);
        filePath = scanner.next();
        Pattern pattern = Pattern.compile("^[a-zA-Z]:(\\\\[a-zA-Z]+){1,10}\\.txt$");
        Matcher matcher = pattern.matcher(filePath);
        if(matcher.matches()) {
            EmailCheck emailCheck = new EmailCheck(filePath);
            emailCheck.parseFile();
        }else {
            System.out.println("Некорректный путь к файлу");
        }
    }
}
