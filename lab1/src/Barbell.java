import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by admin on 08.02.2016.
 */
public class Barbell extends Fitness {
    public float length;

    @Override
    public void init(Scanner scanner){
        super.init(scanner);
        System.out.println("Длина: ");
        try{
            this.length = scanner.nextFloat();
        }catch (InputMismatchException e){
            System.out.println("неверный тип введенных данных");
            System.exit(0);
        }
    }

    public String toString(){
        String state = "Вид спорта:" + this.getSportType() + ' ' + "Вес:" + Float.toString(this.getWeight())+ ' ' + "Длина:" + Float.toString(this.length);
        return state;
    }
}
