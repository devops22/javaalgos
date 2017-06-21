package at.ac.fh_kufstein;

public class Main {

    public static void main(String[] args) {




        int [] unsortiert1 = {1, 4, 7, 12, 4, 3, 6, 98, 123, 13, 2};
        int [] unsortiert2 = {1, 4, 7, 12, 4, 3, 6, 98, 123, 13, 2};

        ausgabeArray(unsortiert1);

        int [] sortierteListe = bubblesort.bubblesort(unsortiert1);

        ausgabeArray(sortierteListe);

        ausgabeArray(unsortiert2);

        int [] sortierteListe1 = insertionsort.insertionsort(unsortiert2);

        ausgabeArray(sortierteListe1);

    }

    public static void ausgabeArray (int [] liste){
        for (int i = 0; i < liste.length; i++){
            int stelle = i+1;
            System.out.println(stelle + ". Stelle: " + liste[i]);

        }
        System.out.println("-------------------------------");




    }

}
