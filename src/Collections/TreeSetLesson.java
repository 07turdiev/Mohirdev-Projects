package Collections;

import java.util.TreeSet;

public class TreeSetLesson {
    public static void main(String[] args) {
        TreeSet treeSet = new TreeSet();

        treeSet.add(new Users(1, "Elbek"));
        treeSet.add(new Users(2, "djh "));
        treeSet.add(new Users(3, "adfv"));
        treeSet.add(new Users(4, "adfv"));
        System.out.println(treeSet);
    }
}
