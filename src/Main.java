import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numere = new ArrayList<>();//cream o lista de nr pt a stoca valorile
        Random random = new Random();//obiect random pt a genera valorile
        for (int i = 0; i < 15; i++) {
            numere.add(random.nextInt(50));//adaugam 15 nr random de la 0 la 50 in lista
        }
        for(int numar : numere) {
            System.out.println(numar + " ");//afisam nr din lista
        }
        HashSet<String> set = new HashSet<>();//hashset de tip string pt a nu duplica
        set.add("TEST1");
        set.add("TEST2");//adaugam doua elemente string in set, daca punem test1 de n ori il va afisa doar odata
        System.out.println(set);//afisare set
    }
}

//daca vrem sa afisam [TEST1, TEST2] putem folosi:
// HashSet<String> set = new LinkedHashSet<>();