package at.ac.fh_kufstein;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        System.out.println(naivesuche("alaa", "Halamadrid"));
        System.out.println(knuthmorrisprat("wie", "hallo, wie geht es "));

        int[] array1 = new int[10];
        Random random = new Random();
        for (int i = 0; i < array1.length; i++) {
            int j = random.nextInt(100);
            System.out.println(j);
            array1[i] = j;
        }
        int[] array2 = new int[5];
        array2[0] = 1;
        array2[1] = 5;
        array2[2] = 7;
        array2[3] = 9;
        array2[4] = 17;
    }

    public static int naivesuche(String mustervar, String testvar) {

        for (int i = 0; i < testvar.length() - mustervar.length() + 1; i++) {
            boolean erfolg = true;
            for (int j = 0; j < mustervar.length(); j++) {
                if (testvar.charAt(j + i) != mustervar.charAt(j)) {
                    erfolg = false;
                }
            }
            if (erfolg) {
                return i;
            }
        }
        return -1;
    }

    public static int knuthmorrisprat(String s, String t) {
        int m = s.length();
        int n = t.length();
        int i = 0, j = 0, k = 0;
        int[] B = new int[m + 1];
        B[0] = -1;
        B[1] = 0;
        for (int l = 2; l <= m; l++) {
            while ((k >= 0) && !(s.charAt(k) == s.charAt(l - 1))) k = B[k];
            B[l] = ++k;
        }
        while (i <= (n - m)) {
            while ((j < m) && (s.charAt(j) == t.charAt(i + j))) j++;
            if (j == m) return (i);
            i = i + j - B[j];
            j = Math.max(0, B[j]);
        }
        return (-1);
    }

    public static int lineareSuche(final int gesucht, final int[] daten) {
        for (int i = 0; i < daten.length; i++) {
            if (daten[i] == gesucht) {
                return i;
            }
        }
        return -1;
    }

    static void binaerSuche(int[] feld, int links, int rechts, int kandidat) {
        int mitte;
        do {
            System.out.println("Intervall [" + links +
                    "," + rechts + "]");

            mitte = (rechts + links) / 2;
            if (feld[mitte] < kandidat) {
                links = mitte + 1;
            } else {
                rechts = mitte - 1;
            }
        } while (feld[mitte] != kandidat && links <= rechts);
        if (feld[mitte] == kandidat) {
            System.out.println("Position: " + mitte);
        } else {
            System.out.println("Wert nicht vorhanden!");
        }
    }


        public static int interpolationssuche(int[] sortedArray, int toFind) {
            // Returns index of toFind in sortedArray, or -1 if not found
            final int NOT_FOUND = -1;
            int low = 0;
            int high = sortedArray.length - 1;
            int lastMid = -1;

            while (true) {
                int mid = (low + high) / 2;
                if (sortedArray[mid] == toFind)
                    return mid;
                if (toFind > sortedArray[mid]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
                if (lastMid == mid)
                    return NOT_FOUND;
                lastMid = mid;
            }
        }
    }



