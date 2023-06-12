package model;

import java.util.ArrayList;

public class PrintAllElementsByPosition {
    ArrayList<String> arrayList = new ArrayList<>();

    public void create() {

        arrayList.add("black");
        arrayList.add("red");
        arrayList.add("blue");
    }

    public void output() {
        for (String s : arrayList) {
            System.out.println(s);
        }
    }

    public static void main(String[] args) {
        PrintAllElementsByPosition list=new PrintAllElementsByPosition();
        list.create();
        list.output();
    }
}
