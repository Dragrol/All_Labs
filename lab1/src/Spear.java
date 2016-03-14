import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by admin on 06.02.2016.
 */
public class Spear extends SportEquipment {
    public float length;

    @Override
    public void init(Scanner scanner){
        super.init(scanner);
        System.out.println("Длина: ");
        try{
            this.length = scanner.nextFloat();
        }catch (InputMismatchException e){
            System.out.println("неверный тип введенных данных");
        }
    }

    public String toString(){
        String state = "Вид спорта:" + this.getSportType() + ' ' + "Длина:" + Float.toString(this.length);
        return state;
    }
}
