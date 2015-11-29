package com.epam.javauniversity;

import com.epam.javauniversity.human.Human;

import java.util.Arrays;
import java.util.Comparator;
import java.util.GregorianCalendar;

public class AppFourthTask {
    public static void main(String[] args) {
        Human[] humans = new Human[5];
        humans[0] = new Human("Bobi", new GregorianCalendar(1994, 1, 6), 1234561);
        humans[1] = new Human("Lizi", new GregorianCalendar(1993, 1, 6), 1234562);
        humans[2] = new Human("Tom", new GregorianCalendar(1995, 1, 6), 1234563);
        humans[3] = new Human("Gven", new GregorianCalendar(1994, 1, 6), 1234567);
        humans[4] = new Human("Raul", new GregorianCalendar(1991, 1, 6), 1234564);

        Arrays.sort(humans, new Comparator<Human>() {
            @Override
            public int compare(Human firstHuman, Human secondHuman) {
                return firstHuman.getBirthDate().compareTo(secondHuman.getBirthDate());
            }
        });
        printHumans(humans);

        Arrays.sort(humans, new Comparator<Human>() {
            @Override
            public int compare(Human firstHuman, Human secondHuman) {
                return firstHuman.getName().compareTo(secondHuman.getName());
            }
        });
        printHumans(humans);
    }

    private static void printHumans(Human[] humans) {
        System.out.println("#------------------------------------#");
        for (Human human : humans) {
            System.out.println(human.toString());
        }
        System.out.println("#------------------------------------#");
        System.out.println();
    }
}
