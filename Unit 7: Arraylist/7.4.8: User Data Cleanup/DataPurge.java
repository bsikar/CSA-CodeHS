import java.util.ArrayList;

public class DataPurge {
    static void removeDuplicates(ArrayList<String> list) {
        for (int i = 0; i < list.size(); ++i) {
            int j = list.indexOf(list.get(i));
            if (j != -1 && j != i) {
                list.remove(i);
                i -= 1;
            }
        }
    }

    static void removeAOL(ArrayList<String> list) {
        for (int i = 0; i < list.size(); ++i) {
            if (list.get(i).contains("aol")) {
                list.remove(i);
                i -= 1;
            }
        }
    }

    static Boolean containsOnlyEmails(ArrayList<String> list) {
        for (String email : list) {
            if (!(email.contains("@") && email.contains("."))) {
                return false;
            }
        }
        return true;
    }
}
