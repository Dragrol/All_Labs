import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by admin on 06.02.2016.
 */
public class Racket extends SportEquipment {
    private String material;

    @Override
    public void init(Scanner scanner){
        super.init(scanner);
        System.out.println("Материал: ");
        try{
            this.material = scanner.next();
        }catch (InputMismatchException e){
            System.out.println("неверный тип введенных данных");
            System.exit(0);
        }
    }

    public String toString(){
        String state = "Вид спорта:" + this.getSportType() + ' ' + "Материал:" + this.material;
        return state;
    }
}
