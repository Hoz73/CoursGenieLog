package exercice2;

import datamocklib.Person;
import datamocklib.TxtHelper;
import exercice1.MainExercice1;
import exercice2.models.*;

import java.io.FileNotFoundException;
import java.util.List;

public class MainExercice2 implements Exo2 {

    /* EXO 2
     * Recupérez depuis le serveur la liste des gens qui sont nés à Chambéry.
     * La récupération de Data se fait dans l'ordre :
     *  - Récupération de data sur le server grâce à TxtHelper.getDataFromTxt("server.txt");
     *  - Vider la base de données locale grâce à la fonction TxtHelper.clearDataLocal();
     *  - Insérer les données dans la database locale grâce à la fonction TxtHelper.insertDataInTxt(line, "local.txt")
     *  - Afficher les données locale grace à TxtHelper.getDataFromTxt("local.txt")
     */
    @Override
    public void displayPersonFromChambery()throws FileNotFoundException {
        List<String> list =  TxtHelper.getDataFromTxt("server.txt");
        MainExercice1 exo1 = new MainExercice1();
        List<Person> list_person = exo1.parse(list);
        TxtHelper.clearDataLocal();
        for(Person person : list_person){
            if (person.getCityOfBirth().matches("Chambery")){
                TxtHelper.insertDataInTxt(person.toString(), "local.txt");
            }
        }
        List<String> result = TxtHelper.getDataFromTxt("local.txt");
    }

    /*
     * Recupérez depuis le serveur la liste des gens qui ont plus de 25 ans.
     * La récupération de Data se fait comme dans la question précedente
     * Tips : Vous avez dans la class Person la fonction getAge();
     */
    @Override
    public void displayBoomers() throws FileNotFoundException {
        List<String> list =  TxtHelper.getDataFromTxt("server.txt");
        MainExercice1 exo1 = new MainExercice1();
        List<Person> list_person = exo1.parse(list);
        TxtHelper.clearDataLocal();
        for(Person person : list_person){
            if (person.getAge() > 25){
                TxtHelper.insertDataInTxt(person.toString(), "local.txt");
            }
        }
        List<String> result = TxtHelper.getDataFromTxt("local.txt");
    }

    /*
     * Recupérez depuis le serveur la liste des gens de sexe féminin.
     * La récupération de Data se fait comme dans la question précedente
     */
    @Override
    public void displayFemales() throws FileNotFoundException {
        List<String> list =  TxtHelper.getDataFromTxt("server.txt");
        MainExercice1 exo1 = new MainExercice1();
        List<Person> list_person = exo1.parse(list);
        TxtHelper.clearDataLocal();
        for(Person person : list_person){
            if (person.getGender().matches("female")){
                TxtHelper.insertDataInTxt(person.toString(), "local.txt");
            }
        }
        List<String> result = TxtHelper.getDataFromTxt("local.txt");
    }

    /*
     * Recupérez depuis le serveur la liste des femmes de plus de 25 ans.
     * La récupération de Data se fait comme dans la question précedente
     */
    @Override
    public void displayFemaleBoomers() throws FileNotFoundException {
        List<String> list =  TxtHelper.getDataFromTxt("server.txt");
        MainExercice1 exo1 = new MainExercice1();
        List<Person> list_person = exo1.parse(list);
        TxtHelper.clearDataLocal();
        for(Person person : list_person){
            if (person.getAge() > 25 && person.getGender().matches("female") ){
                TxtHelper.insertDataInTxt(person.toString(), "local.txt");
            }
        }
        List<String> result = TxtHelper.getDataFromTxt("local.txt");

    }

    public static void main(String[] args) throws FileNotFoundException {
        Exo2 exo2 = new MainExercice2();
        exo2.displayPersonFromChambery();
        exo2.displayBoomers();
        exo2.displayFemaleBoomers();
        exo2.displayFemales();
    }
}

