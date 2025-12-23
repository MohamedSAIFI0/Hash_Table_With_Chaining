package com;
import java.util.LinkedList;

public class HashTable {

    private LinkedList<Integer>[] table;
    private HashFunction hashFunction;

    public HashTable(int size){
        table = new LinkedList[size];
        hashFunction = new HashFunction(size);
    }

    public void insert(int key){
        int index = hashFunction.hash(key);

        if(table[index] == null){
            table[index] = new LinkedList<>();
        }
        table[index].add(key);
    }

    public boolean search(int key){
        int index = hashFunction.hash(key);

        if(table[index] == null){
            return false;
        }
        return table[index].contains(key);
    }

    public void delete(int key){
        int index = hashFunction.hash(key);
        if(table[index] != null){
            table[index].remove(Integer.valueOf(key));
        }
    }
    public void display(){
        for(int i = 0; i < table.length; i++){
            if(table[i] == null)
                System.out.println("vide !");
            else
                System.out.println(table[i]);
        }
    }


}
