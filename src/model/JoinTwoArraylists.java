package model;

import java.util.ArrayList;

public class JoinTwoArraylists {
    ArrayList<String> arrayList = new ArrayList<>();
    ArrayList<String> arrayList2 = new ArrayList<>();
    ArrayList<String> result = new ArrayList<>();

    public void create() {

        arrayList.add("black");
        arrayList.add("red");
        arrayList.add("blue");
        arrayList2.add("1");
        arrayList2.add("2");
        arrayList2.add("3");
    }

    public void join() {
        result.addAll(arrayList);
        result.addAll(arrayList2);
    }

    public void output() {
        System.out.println(result);
    }

    public static void main(String[] args) {
        JoinTwoArraylists joinTwoArraylists = new JoinTwoArraylists();
        joinTwoArraylists.create();
        joinTwoArraylists.join();
        joinTwoArraylists.output();
    }
}
