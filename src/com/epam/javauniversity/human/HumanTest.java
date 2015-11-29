package com.epam.javauniversity.human;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.GregorianCalendar;

import static org.hamcrest.core.Is.is;

public class HumanTest {
    Human human;

    @Before
    public void initialize() {
        human = new Human("Juanne", new GregorianCalendar(1990, 1, 1), 1112);
    }

    @Test
    public void compareToTestOtherHumanIsNull() throws Exception {
        Assert.assertThat(Integer.MIN_VALUE, is(human.compareTo(null)));
    }

    @Test
    public void compareToTestBirthdayMoreOther() throws Exception {
        Assert.assertThat(1, is(human.compareTo(new Human("Tom", new GregorianCalendar(1995, 1, 1), 1111))));
    }

    @Test
    public void compareToTestBirthdayLessOther() throws Exception {
        Assert.assertThat(-1, is(human.compareTo(new Human("Tom", new GregorianCalendar(1989, 1, 1), 1111))));
    }

    @Test
    public void compareToTestBirthdayEquallyIdMoreOther() throws Exception {
        Assert.assertThat(1, is(human.compareTo(new Human("Tom", new GregorianCalendar(1990, 1, 1), 1111))));
    }

    @Test
    public void compareToTestBirthdayEquallyIdLessOther() throws Exception {
        Assert.assertThat(-1, is(human.compareTo(new Human("Tom", new GregorianCalendar(1990, 1, 1), 1113))));
    }

    @Test
    public void compareToTestBirthdayEquallyIdEquallyOther() throws Exception {
        Assert.assertThat(0, is(human.compareTo(new Human("Tom", new GregorianCalendar(1990, 1, 1), 1112))));
    }
}