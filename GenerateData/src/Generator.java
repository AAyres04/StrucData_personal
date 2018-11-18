/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.GregorianCalendar;
import java.util.Random;

/**
 *
 * @author Gabriel
 */
public class Generator {

    public String generate() {
        Random rnd = new Random();
        return plateNumberGenerator() + ";"
                + (1 + rnd.nextInt(2)) + ";" + stringRandomizer() + ";"
                + kmGenerator() + ";" + datesGenerator() + ";"
                + (rnd.nextInt(3) + 1);
    }

    public String kmGenerator() {
        long kmAct = (long) (120000 * Math.random() + 0.4);
        long kmUM = (long) (kmAct - 40000 * Math.random());
        if (kmUM < 0) {
            if (kmAct < (-kmUM)) {
                return -kmUM + ";" + kmAct;
            } else {
                return kmAct + ";" + -kmUM;
            }
        } else {
            if (kmAct < kmUM) {
                return kmUM + ";" + kmAct;
            } else {
                return kmAct + ";" + kmUM;
            }
        }

    }

    public String datesGenerator() {
        GregorianCalendar gc = new GregorianCalendar();
        int year = randBetween(2000, 2013);
        gc.set(gc.YEAR, year);
        int dayOfYear = randBetween(1, gc.getActualMaximum(gc.DAY_OF_YEAR));
        gc.set(gc.DAY_OF_YEAR, dayOfYear);
        int year2 = randBetween(year + 3, 2017);
        int dayOfYear2 = randBetween(1, gc.getActualMaximum(gc.DAY_OF_YEAR));
        GregorianCalendar gc2 = new GregorianCalendar();
        gc2.set(gc.YEAR, year2);
        gc2.set(gc.DAY_OF_YEAR, dayOfYear2);
        String mant = gc2.get(gc2.YEAR) + "-" + (gc2.get(gc2.MONTH) + 1) + "-" + gc2.get(gc2.DAY_OF_MONTH);
        String buy = gc.get(gc.YEAR) + "-" + (gc.get(gc.MONTH) + 1) + "-" + gc.get(gc.DAY_OF_MONTH);

        gc2.set(gc.YEAR, year2 - 1);
        gc2.set(gc.DAY_OF_YEAR, randBetween(1, gc.getActualMaximum(gc.DAY_OF_YEAR)));
        String ult = gc2.get(gc2.YEAR) + "-" + (gc2.get(gc2.MONTH) + 1) + "-" + gc2.get(gc2.DAY_OF_MONTH);
        return buy + ";" + mant + ";" + ult;
    }

    public int randBetween(int start, int end) {
        return start + (int) Math.round(Math.random() * (end - start));
    }

    public String stringRandomizer() {
        String[] strings = {"A", "B", "C", "D", "E","F", "G"};
        Random r = new Random();
        return strings[r.nextInt(7)];
    }

    public String plateNumberGenerator() {
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < 3; i++) {
            char ch = (char) (Math.random() * 26 + 'A');
            s.append(ch);
        }
        for (int i = 0; i < 4; i++) {
            char digit1 = (char) (Math.random() * 10 + '0');
            s.append(digit1);
        }
        return s.toString();
    }
}
