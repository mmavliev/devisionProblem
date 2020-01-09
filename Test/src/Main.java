import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        long x = 8;
        int y = 3;
        List<Long> spaces = new ArrayList<>(Arrays.asList(x));

        for (int i = 0; i < y; i++) {
            if(i == y - 1){
               devide(spaces).forEach(System.out::println);
            } else {
                devide(spaces);
            }
        }
    }
    public static List<Long> devide (List<Long> spaces) {
        long biggestSpace = Collections.max(spaces); //находим самую большую территорию
        spaces.remove(biggestSpace);
        ArrayList<Long> lastSpaces = new ArrayList<>();
            long newSpace;
            if (biggestSpace % 2 == 0) {
                newSpace = biggestSpace / 2;
                lastSpaces.add(newSpace);
                lastSpaces.add(newSpace - 1);
            } else {
                newSpace = (biggestSpace - 1) / 2;
                lastSpaces.add(newSpace);
                lastSpaces.add(newSpace);
            }
            spaces.addAll(lastSpaces);
        return lastSpaces;
    }
}
