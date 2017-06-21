package at.ac.fh_kufstein;

/**
 * Created by marti on 21.06.2017.
 */
public class insertionsort {

    public static int [] insertionsort (int [] liste){
        int temp;
        for (int i = 1; i < liste.length; i++) {
            temp = liste[i];
            int j = i;
            while (j > 0 && liste[j - 1] > temp) {
                liste[j] = liste[j - 1];
                j--;
            }
            liste[j] = temp;
        }
        return liste;
    }
}
