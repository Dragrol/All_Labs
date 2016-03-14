package ru.bstu.iitus.vt41.pas;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by admin on 14.03.2016.
 */
public class EmailCheck {
    public String filePath;

    public EmailCheck(String filePath){
        this.filePath = filePath;
    }

    public void parseFile(){
        ArrayList<String> emails = new ArrayList<>();
        try {
            emails = readFile(this.filePath);
        }
        catch (FileNotFoundException ex) {
            System.out.println("Входной файл не найден!");
            System.exit(0);
        }
        catch (IOException ex) {
            System.out.println("Ошибка обработки входного файла");
            System.exit(0);
        }

        Pattern pattern = Pattern.compile("[0-9a-z_\\.\\-]+@[0-9a-z_\\.\\-]+\\.[a-z]{2,4}");

        //"одолженный" патерн
        // Pattern pattern = Pattern.compile("(?:[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*|\"(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21\\x23-\\x5b\\x5d-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])*\")@(?:(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?|\\[(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?|[a-z0-9-]*[a-z0-9]:(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21-\\x5a\\x53-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])+)\\])");

        Matcher matcher;
        for (String email : emails){
            matcher = pattern.matcher(email);
            if(!matcher.matches()){
                System.out.println("Некорректный email-адресс: " + email);
            }
        }
    }

    private ArrayList<String> readFile(String filename) throws IOException {
        ArrayList<String> buffer = new ArrayList<String>();
        BufferedReader bufReader = new BufferedReader(new FileReader(filename));
        String line;
        while ((line = bufReader.readLine()) != null) {
            buffer.add(line);
        }
        bufReader.close();
        return buffer;
    }
}
