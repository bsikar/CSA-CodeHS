import java.util.ArrayList;

public class ArrayListMethods {
    static void print(ArrayList<String> list) {
        for (String string : list) {
            System.out.println(string);
        }
    }

    static void condense(ArrayList<String> list) {
        for (int i = 0; i < list.size() / 2; ++i) {
            list.set(i, list.get(i) + list.remove(i + 1));
        }
    }

    static void duplicate(ArrayList<String> list) {
        for (int i = 0; i < list.size(); ++i) {
            list.set(i, list.get(i) + '\n' + list.get(i));
        }
    }
}
