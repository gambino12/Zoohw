import java.util.List;
import java.util.Scanner;

public class button {
    public void menu(List<Animals> animalsList){
        Animalcontroller animalcontroller = new Animalcontroller();
        Scanner sc = new Scanner(System.in);
        System.out.println("1)Добавить животное.\n2)Увидить список команд которое выполняет животное." +
                "\n3)обучить животное новым командам.");
        int temp = sc.nextInt();
        if (temp == 1){
            animalcontroller.addAnimals();
        } else if (temp == 2) {
            animalcontroller.showCommand(animalsList);
        }

    }
}
