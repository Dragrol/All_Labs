import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by admin on 07.02.2016.
 */
public abstract class Fitness extends SportEquipment {
    private float weight;

    public float getWeight(){return this.weight;}

    @Override
    public void init(Scanner scanner){
        System.out.println("Вес: ");
        try{
            this.weight = scanner.nextFloat();
        }catch (InputMismatchException e){
            System.out.println("неверный тип введенных данных");
        }
    }
}
