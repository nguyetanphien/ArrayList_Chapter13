package model;

import java.util.ArrayList;

public class InsertArrayList {
    ArrayList<String> arrayList = new ArrayList<>();

    public void create() {

        arrayList.add("black");
        arrayList.add("red");
        arrayList.add("blue");
    }

    public void insert() {
        //them vi tri dau
        arrayList.add(0, "yellow");
    }

    public void output() {
        System.out.println(arrayList);
    }

    public static void main(String[] args) {
        InsertArrayList insertArrayList = new InsertArrayList();
        insertArrayList.create();
        insertArrayList.output();
        System.out.println();
        insertArrayList.insert();
        insertArrayList.output();
    }
}
