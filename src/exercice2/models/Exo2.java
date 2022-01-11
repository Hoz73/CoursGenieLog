package exercice2.models;

import java.io.FileNotFoundException;

public interface Exo2 {

    /**
     * Display all the person born in Chambéry
     */
    void displayPersonFromChambery() throws FileNotFoundException;

    /**
     * Display all the person older than 25 years old
     */
    void displayBoomers() throws FileNotFoundException;

    /**
     * Display females from the database
     */
    void displayFemales() throws FileNotFoundException;

    /**
     * Display all the females older than 25 years old
     */
    void displayFemaleBoomers() throws FileNotFoundException;
}
