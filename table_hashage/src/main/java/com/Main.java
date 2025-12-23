package com;
import java.util.LinkedList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {

        int[] keys = {5, 28, 9, 17, 82, 19, 44, 7};
        int m = keys.length;

        HashTable ht = new HashTable(m);

        for(int k : keys){
            ht.insert(k);
        }

        ht.display();

        System.out.println(ht.search(17));
        System.out.println(ht.search(1));

    }
}