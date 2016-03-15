import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by admin on 08.02.2016.
 */
public class TennisBall extends Ball {
    private float weight;

    @Override
    public void init(Scanner scanner){
        super.init(scanner);
        System.out.println("Вес: ");
        try{
            this.weight = scanner.nextFloat();
        }catch (InputMismatchException e){
            System.out.println("неверный тип введенных данных");
            System.exit(0);
        }
    }

    public String toString(){
        String state = "Вид спорта:" + this.getSportType() + ' ' + "Радиус:" + Float.toString(this.getRadius()) + ' ' + "Вес:" + Float.toString(this.weight);
        return state;
    }
}
