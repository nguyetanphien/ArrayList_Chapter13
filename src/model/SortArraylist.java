package model;

import java.util.ArrayList;
import java.util.Comparator;

public class SortArraylist {
    ArrayList<String> arrayList = new ArrayList<>();

    public void create() {

        arrayList.add("black");
        arrayList.add("red");
        arrayList.add("blue");
        arrayList.add("yellow");
    }

    public void sort() {
        arrayList.sort(Comparator.naturalOrder());
        System.out.println(arrayList);
    }

    public static void main(String[] args) {
        SortArraylist sortArraylist = new SortArraylist();
        sortArraylist.create();
        sortArraylist.sort();
    }
}
