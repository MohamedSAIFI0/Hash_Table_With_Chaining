package com;

public class HashFunction {
    private int size;

    public HashFunction(int size){
        this.size = size;
    }

    public int hash(int key){
        return key % size;
    }
}
