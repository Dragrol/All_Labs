import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by admin on 06.02.2016.
 */
public abstract class Ball extends SportEquipment {
    private float radius;

    public float getRadius(){return this.radius;}

    @Override
    public void init(Scanner scanner){
        super.init(scanner);
        System.out.println("Радиус: ");
        try{
            this.radius = scanner.nextFloat();
        }catch (InputMismatchException e){
            System.out.println("неверный тип введенных данных");
        }
    }
}
