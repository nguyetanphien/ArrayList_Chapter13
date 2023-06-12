package model;

import java.util.ArrayList;

public class SearchForAnElement {
    ArrayList<String> arrayList = new ArrayList<>();

    public void create() {

        arrayList.add("black");
        arrayList.add("red");
        arrayList.add("blue");
        arrayList.add("yellow");
    }

    public void search() {
        //chen vi tri dau
        String search = "black";
        if (arrayList.contains(search))
            System.out.println("true");
        else
            System.out.println("false");
    }

    public static void main(String[] args) {
        SearchForAnElement anElement = new SearchForAnElement();
        anElement.create();
        anElement.search();
    }
}
