import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Animals> zoo = new ArrayList<>();
        button s = new button();
        while (true) {
            s.menu(zoo);
            System.out.println(zoo);
        }

    }
}
