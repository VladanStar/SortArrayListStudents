package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Student s1 = new Student("Vladan","Cupric","96/511",9.98);
        Student s2 = new Student("Filip","Terzic","98/789",9.0);
        Student s3 = new Student("Vojin","Markovic","98/511",9.08);
        Student s4 = new Student("Sreten","Tomovic","94/789",8.0);
        ArrayList<Student> studenti = new ArrayList<Student>();
        studenti.add(s1);
        studenti.add(s2);
        studenti.add(s3);
        studenti.add(s4);

  Collections.sort(studenti);
  for(Student st: studenti){
      System.out.println(st);
  }
        System.out.println("Najveci prosek ima student");
        System.out.println(studenti.get(studenti.size()-1));
    }
}
