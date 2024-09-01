package searchalgorithms.linearsearchalgorithms;

import java.util.ArrayList;

public class SearchGivenCharInString {
    public static String name = "Pooja";
    public static char target = 'j';
    public static ArrayList<Integer> list = new ArrayList<>();
    public static void main(String[] args) {
        System.out.println(findCharInString(name, target));
    }

    public static ArrayList<Integer> findCharInString(String givenName, char target) {
        int length = givenName.length();

        if (length == 0) {
            return list;
        }

        for(int i = 0; i < length; i++) {
            if (givenName.charAt(i) == target) {
                list.add(i);
            }
            if(i == length - 1 && list.isEmpty()) {
                list.add(-1);
            }
        }
        return list;
    }
}
