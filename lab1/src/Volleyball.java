import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by admin on 08.02.2016.
 */
public class Volleyball extends Ball {
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
        String state = "Вид спорта:" + this.getSportType() + ' ' + "Радиус:" + Float.toString(this.getRadius()) + ' ' + this.material;
        return state;
    }
}
