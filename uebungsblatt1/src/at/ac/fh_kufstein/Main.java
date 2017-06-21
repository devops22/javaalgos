package at.ac.fh_kufstein;

public class Main {

    public static final long ITERATIONS = (long)(1e9);
    public static final int DO_TEST = 10;

    public static void main(String[] args){
        System.out.println("start test");


        long[] times = new long[DO_TEST];

        //main loop
        for (int i = 0; i < DO_TEST; i++) {
            times[i] = System.currentTimeMillis();


            //konstant();
            //linear(1000000000); //1mrd
            //quadratisch(100000); //100.000
            kubisch(2000);


            //test loop
            /*
            for (long j = 0; j < ITERATIONS; j++) {
                //add50Nr();
                //writeArray10();
                //divide20();
                //if5();
                //assign10();
            }
            */
            times[i] = System.currentTimeMillis() - times[i];
            System.out.println("Durchlauf: "  + (i+1) + ", benötigte Zeit: " + times[i] + "ms");
        }

        //calc average
        long total = 0;
        for (int i = 0; i < DO_TEST; i++)
            total += times[i];

        double average = total / DO_TEST;

        System.out.println("Durchschnitt: " + average + "ms");

    }

    private static void add50Nr() {
        int sum = 0;
        for (int i = 0; i < 50; i++) {
            sum += 1;
        }
    }

    static int[] ar = new int[10];
    private static void writeArray10(){
        for (int i = 0; i < 10; i++) {
            ar[i] = i;
        }
    }

    private static void divide20(){
        double d = Integer.MAX_VALUE;
        for (int i = 0; i < 20; i++) {
            d /= i;
            //d = d / i;
        }
    }

    private static void if5(){
        for (int i = 0; i < 5; i++) {
            if(i % 2 == 0){
                int leer = i;
            }
        }
    }

    private static void assign10(){
        for (int i = 0; i < 10; i++) {
            int ii = i;
        }
    }

    //Komplexität: O(1) --> Operation dauert immer gleich lange,
    //keine anbhängigkeit von n
    private static void konstant(){
        int i = Integer.parseInt("1337");
        i += 1;
    }

    //Komplexität: O(n) --> 1 * n
    private static void linear(long n){
        for (long i = 0; i < n; i++) {
            //"konstant" wird n-mal ausgeführt
            konstant();
        }
    }

    //Komplexität: O(n²) --> n * n
    private static void quadratisch(long n){
        for (long i = 0; i < n; i++) {
            /*
                linear wird n-mal ausgeführt.
                daher wird "konstant" n*n-oft ausgeführt
                verschachtelung der schleifen
             */
            linear(n);
        }
    }

    //Komplexität: O(n³) --> n² * n
    private static void kubisch(long n){
        for (long i = 0; i < n; i++) {
            quadratisch(n);
        }
    }


}
