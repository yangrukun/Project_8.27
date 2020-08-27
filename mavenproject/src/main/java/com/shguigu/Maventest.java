package com.shguigu;

import java.util.HashMap;

public class Maventest {
    public static void main(String[] args){
        Maventest mt  = new Maventest();
        mt.run();
        mt.Map();
        Cat.dog();

    }

    public Maventest() {
        super();
    }

    public void run(){
        System.out.println("abc");
    }
    public void Map(){
        HashMap<String,String> hashMap  = new HashMap<>();
        hashMap.put("name","Tom");
        hashMap.put("school","Tsinghua");
        hashMap.put("age","18");
        hashMap.put("major","computer");

        String age = hashMap.get("age");
        System.out.println("age = " + age);


        hashMap.remove("age");
        System.out.println(hashMap);

    }
}
