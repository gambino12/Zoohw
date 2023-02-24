import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Animalcontroller {

    public Animals addAnimals() {
        System.out.println("Вид животного?" + Arrays.toString(Type.values()) + "\nНапишите цифру -> ");
        Scanner scType = new Scanner(System.in);
        int type = scType.nextInt();
        if (type <= 3) {
            return new HomePet(addName(),Type.getValueByCode(type), addDateOfBirth(), addComand());
        } else {
            return new PackAnimals(addName(),Type.getValueByCode(type),addDateOfBirth(), addComand());
        }
    }
    public String [] addComand(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Команды которые знает через запятую ->");
        String[] c = sc.nextLine().split(",");
        return c;
    }
    public String  addName(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите имя ->");
        return sc.nextLine();
    }

    public String addDateOfBirth() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Дата рождения (dd.mm.yyyy)-> ");
        String[] date = sc.nextLine().split("\\.");
        String date1 = "";
        if (date[0].length() != 2 && date[1].length() != 2 && date[2].length() != 4) {
            throw new RuntimeException("неверный формат ввода (dd.mm.yyyy)");
        }
        ArrayList<Integer> a = new ArrayList<>();
        try {
            for (String st : date) {  //проверка на число
                int temp = Integer.parseInt(st);
                a.add(temp);
            }
        } catch (NumberFormatException ex) {
            return "неверный ввод чисел";
        }
        if ((a.get(0) > 31 || a.get(0) < 1) || (a.get(1) > 12 || a.get(1) < 1)) {
            throw new RuntimeException("неверная дата");
        }
        StringBuilder sb = new StringBuilder();
        for (int st : a) {
            if (st < 10) {
                date1 = String.valueOf(sb.append("0").append(st).append("."));
            } else if (st > 1000) {
                date1 = String.valueOf(sb.append(st));
            } else
                date1 = String.valueOf(sb.append(st).append("."));
        }
        return date1;
    }

public void showCommand(List<Animals> animals) {
    for (int i = 0; i < animals.size(); i++) {
        System.out.println(i+1 +  ") " + animals.get(i).type + " " + animals.get(i).name);
    }
    Scanner scanner = new Scanner(System.in);
    System.out.print("Введите цифру животного у которого хотите узнать команды -> ");
    int count = scanner.nextInt();
    for (int i = 0; i < animals.size() ; i++) {
        if (count-1 == i){
            System.out.println(Arrays.toString(animals.get(i).Command));
        }
    }
}
}

