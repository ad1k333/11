package com.company;

import javax.naming.PartialResultException;
import java.sql.SQLOutput;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Kamni kamni[] = new Kamni[5];
        kamni[0] = new Kamni("Almaz", 990, 8, 1.2, true);
        kamni[1] = new Kamni("Rubin", 1500, 5, 0.4, true);
        kamni[2] = new Kamni("Nifrit", 600, 45, 2.8, false);
        kamni[3] = new Kamni("Izumrud", 2700, 4, 0.3, true);
        kamni[4] = new Kamni("Sapfir", 3300, 1, 0.1, false);
        System.out.println("Almazy doroge 1000$:");
        for (int i = 0; i < kamni.length; i++) {
            if (kamni[i].getCena() >= 1000) {
                System.out.println(kamni[i].toString());
            }
        }
        System.out.println("Ogranennye kamni:");
        for (int i = 0; i < kamni.length; i++) {
            if (kamni[i].isOgranennyi(true)) {
                System.out.println(kamni[i].toString());
            }
        }
        System.out.println("Sortirovka po karatam:");
//        Comparator<Kamni> comparByKarat = new Comparator<Kamni>() {
//            public int compare(Kamni o1, Kamni o2) {
//                return o1.setKarat(); - o2.setKarat();
//            }
//        };
//        Collections.sort(kamni, compareByKarat);
    }
}
