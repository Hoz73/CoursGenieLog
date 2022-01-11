package exercice1;

import datamocklib.Person;
import datamocklib.TxtHelper;

import java.util.ArrayList;
import java.util.List;

public class MainExercice1 {

    // Format du fichier : firstName,lastName,birthDate,gender,cityOfResidence,cityOfBirth
    // Pas de header
    public static List<Person> parse(List<String> data) {
        // A COMPLETER
        for(String person : data){
            String[] pers = person.split(",");
            System.out.println(pers);

        }
        return new ArrayList<Person>();
    }

    public static void main(String[] args) {
        System.out.println("test");
        List<String> data = TxtHelper.getDataFromTxt("persons.txt");
        List<Person> list_person = MainExercice1.parse(data);
        // EXO 1
        /*
         * - Récuperez la liste des personnes sous la forme -> firstName,lastName,birthDate,gender,cityOfResidence,cityOfBirth
         *   grâce à la fonction TxtHelper.getDataFromTxt("persons.txt")
         * - Parser la liste des Personnes grâce à la fonction parse())
         * - Calculer le nombre de personnes nées dans chaque ville avec les données obtenues.
         * Les données contiennent une trentaine de villes, Bonne chance !
        */


    }
}
