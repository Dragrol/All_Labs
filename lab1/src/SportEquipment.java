import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by admin on 06.02.2016.
 */
public abstract class SportEquipment {
    private int sportType;
    public void init(Scanner scanner){
        System.out.println("Введите характеристики:\nВид спорта(1-тенис, 2-волейбол, 3-атлетика, 4-метание копья): ");
        try{
            this.sportType = scanner.nextInt();
            if(this.sportType<1 || this.sportType>4){
                throw new WrongSportTypeException();
            }
        }catch (InputMismatchException e){
            System.out.println("неверный тип введенных данных");
        }catch (WrongSportTypeException ex){
            System.out.println(ex.getMessage());
        }
    }
    public int getSportType() {
        return sportType;
    }
    public void setSportType(int sport){
        this.sportType = sport;
    }

    public class WrongSportTypeException extends Exception{
        private String message = "Введите номер спорта из списка!";
        public String getMessage(){return this.message;}
    }
}
