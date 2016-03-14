import java.util.Scanner;

/**
 * Created by admin on 08.02.2016.
 */
public class Main {
    public static void main(String[] args) {
        int numberOfItem;
        System.out.println("Введите количество предметов:");
        Scanner in = new Scanner(System.in);
        numberOfItem = in.nextInt();
        System.out.print("Тип инвентаря:\n" +
                "1.Волейбольный мяч\n" +
                "2.Тенисный мяч\n" +
                "3.Ракетка\n" +
                "4.Гиря\n" +
                "5.Штанга\n" +
                "6.Копьё\n");
        SportEquipment[] items = new SportEquipment[numberOfItem];
        int i=0;
        while(i<numberOfItem){
            System.out.print("Введите номер типа инвентаря: ");
            int item = in.nextInt();
            switch (item){
                case 1 : Volleyball volleyball = new Volleyball();
                    System.out.println("Волейбольный мяч");
                    volleyball.init(in);
                    items[i] = volleyball;
                    i++;
                    break;
                case 2 : TennisBall tennisBall = new TennisBall();
                    System.out.println("Тенисный мяч");
                    tennisBall.init(in);
                    items[i] = tennisBall;
                    i++;
                    break;
                case 3 : Racket racket = new Racket();
                    System.out.println("Ракетка");
                    racket.init(in);
                    items[i] = racket;
                    i++;
                    break;
                case 4 : SportWeight sportWeight = new SportWeight();
                    System.out.println("Гиря");
                    sportWeight.init(in);
                    items[i] = sportWeight;
                    i++;
                    break;
                case 5 : Barbell barbell = new Barbell();
                    System.out.println("Штанга");
                    barbell.init(in);
                    items[i] = barbell;
                    i++;
                    break;
                case 6 : Spear spear = new Spear();
                    System.out.println("Копьё");
                    spear.init(in);
                    items[i] = spear;
                    i++;
                    break;
                default: System.out.println("Введите нужный тип!");
                    break;
            }
        }
        for (SportEquipment s : items) {
            if(s.getSportType() == 1){
                String str = new String();
                if(s instanceof TennisBall){
                    str = ((TennisBall) s).toString();
                } else {
                     str = ((Racket) s).toString();
                }
                System.out.println(str);
            }
        }
    }
}
