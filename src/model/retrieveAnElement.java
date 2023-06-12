package model;

import java.util.ArrayList;

public class retrieveAnElement {
    //truy xuat 1 phan tu chi dunh trong mang
    ArrayList<String> arrayList = new ArrayList<>();

    public void create() {

        arrayList.add("black");
        arrayList.add("red");
        arrayList.add("blue");
    }

    public void output() {

        System.out.println(arrayList.get(1));

    }

    public static void main(String[] args) {
        retrieveAnElement anElement = new retrieveAnElement();
        anElement.create();
        anElement.output();
    }
}
