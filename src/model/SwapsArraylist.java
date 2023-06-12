package model;

import java.util.ArrayList;
import java.util.Collections;

public class SwapsArraylist {
    ArrayList<String> arrayList = new ArrayList<>();

    public void create() {

        arrayList.add("black");
        arrayList.add("red");
        arrayList.add("blue");
        arrayList.add("yellow");
    }
    public void swaps(){
        Collections.swap(arrayList,1,2);
    }
    public void ouput(){
        System.out.println("before swaps: " +arrayList);
        swaps();
        System.out.println("after swaps: "+arrayList);
    }

    public static void main(String[] args) {
        SwapsArraylist swapsArraylist=new SwapsArraylist();
        swapsArraylist.create();
        swapsArraylist.ouput();
    }
}
