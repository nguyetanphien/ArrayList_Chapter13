package model;

import java.util.ArrayList;

public class CreateArrayList {
    ArrayList<String> arrayList = new ArrayList<>();

    public void create() {

        arrayList.add("black");
        arrayList.add("red");
        arrayList.add("blue");
    }

    public void output() {
        System.out.println(arrayList);
    }

    public static void main(String[] args) {
        CreateArrayList list = new CreateArrayList();
        list.create();
        list.output();
    }
}
