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

        Pattern pattern = Pattern.compile("^[0-9a-z_\\.\\-]+@[0-9a-z_\\.\\-]+\\.[a-z]{2,4}$");
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
