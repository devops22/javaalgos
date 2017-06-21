package at.ac.fh_kufstein;

/**
 * Created by marti on 21.06.2017.
 */
public class bubblesort {

    public static int [] bubblesort(int [] liste){

        int temp;
        for(int i=1; i<liste.length; i++) {
            for(int j=0; j<liste.length-i; j++) {
                if(liste[j]>liste[j+1]) {
                    temp=liste[j];
                    liste[j]=liste[j+1];
                    liste[j+1]=temp;
                }

            }
        }

        return liste;
    }
}
