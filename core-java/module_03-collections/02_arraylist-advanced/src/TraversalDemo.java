import java.util.ArrayList;

public class TraversalDemo {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);

        // for loop
        for (int i = 0; i < list.size(); i++) {
            System.out.println("Index " + i + ": " + list.get(i));
        }

        // enhanced for loop
        for (int num : list) {
            System.out.println("Value: " + num);
        }
    }
}