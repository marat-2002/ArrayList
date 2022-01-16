package com.company;

import javax.swing.text.html.HTMLDocument;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
        // write your code here
        ArrayList<String> users = new ArrayList<>();
        users.add("Ares");
        users.add("Islam");
        users.add("Mercury");
        users.add("Duff");
        users.add("Mustang");
        System.out.println(users);

        System.out.println("______________________");

        ArrayList<String> users1 = new ArrayList<>();
        System.out.println(users1);
        users1.add("Michael");
        users1.add("Jordan");
        users1.add("Matay");
        users1.add("Simba");
        users1.add("Leonard");
        System.out.println(users1);

        System.out.println("______________________");

        ArrayList<String> users2 = new ArrayList<>();
        Collections.reverse(users1);

        Iterator<String> iteratorA = users.iterator();
        Iterator<String> iteratorB = users1.iterator();
        for (int i = 0; i < users.size(); i++) {

            users2.add(iteratorA.next());
            users2.add(iteratorB.next());
        }
        System.out.println(users2);
        Collections.sort(users2, new LengthFirstComparator());
        System.out.println("Сортировка:  "+  users2 );
    }
}



