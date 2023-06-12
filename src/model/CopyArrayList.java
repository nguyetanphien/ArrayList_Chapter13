package model;

import java.util.ArrayList;
import java.util.Collections;

public class CopyArrayList {
    ArrayList<String> arrayList = new ArrayList<>();
    ArrayList<String> arrayList2 = new ArrayList<>();

    public void create() {

        arrayList.add("black");
        arrayList.add("red");
        arrayList.add("blue");
        arrayList.add("yellow");
    }

    public void copy() {
        arrayList2 = arrayList;

    }

    public void output() {

        System.out.println(arrayList2);

    }

    public static void main(String[] args) {
        CopyArrayList list = new CopyArrayList();
        list.create();
        list.copy();
        list.output();
    }

}
