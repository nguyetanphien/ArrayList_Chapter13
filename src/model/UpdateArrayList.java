package model;

import java.util.ArrayList;

public class UpdateArrayList {
    ArrayList<String> arrayList = new ArrayList<>();

    public void create() {

        arrayList.add("black");
        arrayList.add("red");
        arrayList.add("blue");
    }

    public void insert() {
        //chen vi tri dau
        arrayList.set(0, "yellow");
    }

    public void output() {
        System.out.println(arrayList);
    }

    public static void main(String[] args) {
        UpdateArrayList updateArrayList = new UpdateArrayList();
        updateArrayList.create();
        updateArrayList.output();
        System.out.println();
        updateArrayList.insert();
        updateArrayList.output();
    }
}
