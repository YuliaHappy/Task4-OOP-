package com.epam.javauniversity.human;

import java.util.Calendar;

public class Human implements Comparable<Human> {
    private final String name;
    private final Calendar birthDate;
    private int idDocument;

    public Human(String name, Calendar birthDate, int idDocument) {
        this.name = name;
        this.birthDate = birthDate;
        this.idDocument = idDocument;
    }

    public String getName() {
        return name;
    }

    public Calendar getBirthDate() {
        return birthDate;
    }

    public int getIdDocument() {
        return idDocument;
    }

    public void setIdDocument(int idDocument) {
        this.idDocument = idDocument;
    }

    @Override
    public String toString() {
        return "Human{ name: " + this.name + "; birthday data: " + birthDate + "; idDocument: " + idDocument + "}";
    }

    @Override
    public int compareTo(Human human) {
        if (isNull(human) || isNull(this)) {
            return Integer.MIN_VALUE;
        }
        if (this.birthDate.compareTo(human.birthDate) == 0) {
            if (this.idDocument == human.idDocument) {
                return 0;
            }
            return (human.getIdDocument() > this.idDocument) ? -1 : 1;
        }
        return (-1)*this.birthDate.compareTo(human.birthDate);
    }

    private boolean isNull(Human human) {
        return (human == null);
    }
}
