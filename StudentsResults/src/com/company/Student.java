package com.company;
import java.util.Random;

public class Student {

    private String[] studentName = {"Ian","Peter","Vasiliy","Nikolai","Ted","Bob","Augusta","Vanessa","Vivien","Bruce","Iosif","Vladimir","Max","Stafan","Luk"};
    private String[] studentLastName = {"Sputnikoff","Donavan","Douglas","Gren","Muller","Winesteine","Ferrari","Alonso","Lebowski","Lee","Sheen","Tai","Chaushesku","Sutin","Van Goge"};

    Random rnd= new Random();

    String getStudent(){
        return (studentName[rnd.nextInt(14)]+ " " + studentLastName[rnd.nextInt(14)]);
    }

    int getMark(){
        return (rnd.nextInt(5)+1);
    }

}
