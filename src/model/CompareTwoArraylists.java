package model;

import java.util.ArrayList;

public class CompareTwoArraylists {
    ArrayList<String> arrayList = new ArrayList<>();
    ArrayList<String> arrayList2 = new ArrayList<>();


    public void create() {

        arrayList.add("black");
        arrayList.add("red");
        arrayList.add("blue");

        arrayList2.add("1");
        arrayList2.add("2");
        arrayList2.add("3");
    }

    public void compare() {
        if (arrayList.equals(arrayList2))
            System.out.println("true");
        else
            System.out.println("False");
    }


    public static void main(String[] args) {
        CompareTwoArraylists compareTwoArraylists = new CompareTwoArraylists();
        compareTwoArraylists.create();
        compareTwoArraylists.compare();
    }
}
