package com.company;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        // Pipeline - это разделительная черта (или) ||
        // найти собаку или кошку
        Pattern p1 = Pattern.compile("cat|dog");
        Matcher m1 = p1.matcher("I like my dog! I like my cat! Cat kiss dog.");
        while (m1.find()){
            System.out.println(m1.start() +" "+ m1.group()+" ");
        }


        // найдем слово из выбора

        // найдет первым Set его и выдаст
        //Pattern p2 = Pattern.compile("Get|GetValue|Set|SetValue");
        // найдет первым SetValue его и выдаст
        //Pattern p2 = Pattern.compile("GetValue|Get|SetValue|Set");

        //так тоже можно, выдаст SetValue
        //Pattern p2 = Pattern.compile("Get(Value)|Set(Value)");
        //Pattern p2 = Pattern.compile("\\b(Get|GetValue|Set|SetValue)\\b");
        //Pattern p2 = Pattern.compile("\\bGet(Value)?|Set(Value)?\\b");
        Pattern p2 = Pattern.compile("\\b(Get|Set)(Value)?\\b");

        Matcher m2 = p2.matcher("SetValue");
        while (m2.find()){
            System.out.println(m2.start() +" "+ m2.group()+" ");
        }

    }
}
