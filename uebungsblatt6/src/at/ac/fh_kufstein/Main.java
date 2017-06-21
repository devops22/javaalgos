package at.ac.fh_kufstein;

import org.omg.CORBA.Object;

import javax.swing.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        warteschlangenEingabe();




        }

        public static void warteschlangenEingabe(){

            String eingabe;

            ArrayList<Integer> liste = new ArrayList<>();



            boolean frage = true;

            while (frage == true){

                if (liste.size()>=1){
                    System.out.println("Die Liste ist voll");
                    frage = false;
                    break;
                }

                int j = Integer.parseInt(JOptionPane.showInputDialog("Geben Sie eine Zahl ein"));

                liste.add(j);

                eingabe = JOptionPane.showInputDialog("Weitere Daten ein lesen [w} oder Liste ausgeben [l]");

                System.out.println(eingabe);

                if (eingabe.equals("w")){
                    frage = true;

                } else if (eingabe.equals("l")){
                    frage = false;
                    ausgabeListe(liste);
                } else {
                    frage = false;
                }

            }


        }


        public static void ausgabeListe(ArrayList<Integer> list){
        for (int j = 1; j < list.size(); j++){
            System.out.println(list.get(j));
        }

        }


    }

