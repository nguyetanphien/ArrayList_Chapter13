package model;

import java.util.ArrayList;

public class RemoveTheThirdElement {
    ArrayList<String> arrayList = new ArrayList<>();

    public void create() {

        arrayList.add("black");
        arrayList.add("red");
        arrayList.add("blue");
        arrayList.add("yellow");
    }

    public void remove() {
        //chen vi tri dau
        arrayList.remove(3);
    }

    public void output() {
        System.out.println(arrayList);
    }

    public static void main(String[] args) {
       RemoveTheThirdElement removeTheThirdElement=new RemoveTheThirdElement();
       removeTheThirdElement.create();
       removeTheThirdElement.remove();
       removeTheThirdElement.output();
    }
}
