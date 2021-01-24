package com.company;

import java.util.ArrayList;

public class Student implements Comparable{

    private String ime;
    private String prezime;
    private String brojIndeksa;
    private double prosek;

    public Student() {
    }

    public Student(String ime, String prezime, String brojIndeksa, double prosek) {
        this.ime = ime;
        this.prezime = prezime;
        this.brojIndeksa = brojIndeksa;
        this.prosek = prosek;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public String getBrojIndeksa() {
        return brojIndeksa;
    }

    public void setBrojIndeksa(String brojIndeksa) {
        this.brojIndeksa = brojIndeksa;
    }

    public double getProsek() {
        return prosek;
    }

    public void setProsek(double prosek) {
        this.prosek = prosek;
    }

    @Override
    public String toString() {
        return "Student{" +
                "ime='" + ime + '\'' +
                ", prezime='" + prezime + '\'' +
                ", brojIndeksa='" + brojIndeksa + '\'' +
                ", prosek=" + prosek +
                '}';
    }


    public int compareTo(Object o) {
        Student drugi = (Student)o;
        if(this.prosek<((Student) o).prosek) return -1;
        if(this.prosek>((Student) o).prosek) return 1;
        return 0;
    }
}

