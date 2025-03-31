import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numere = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 15; i++) {
            numere.add(random.nextInt(50));
        }
        for(int numar : numere) {
            System.out.println(numar + " ");
        }
        HashSet<String> set = new HashSet<>();
        set.add("TEST1");
        set.add("TEST2");
        System.out.println(set);
    }
}