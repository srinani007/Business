package com.SQLDB.SQLDB;


public class Counter {
    private final String name;
    private int count = 0;
    private static int count1 = 0;
    private String Name = "Prasanth";
    private String  Name2 = "Srividya";

    

    public Counter(String id) {
        this.name = id;
    }

    public void increment() {
        count++;
    }

    public int tally() {
        return count;
    }

    @Override
    public String toString() {
        return name + ": " + count;
    }
    public static void main(String[] args) {
        System.out.println("love: "+count1+ "marriage");
    }
}

