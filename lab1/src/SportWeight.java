import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by admin on 08.02.2016.
 */
public class SportWeight extends Fitness {

    public String toString(){
        String state = "Вид спорта:" + this.getSportType() + ' ' + "Вес:" + Float.toString(this.getWeight());
        return state;
    }

}
