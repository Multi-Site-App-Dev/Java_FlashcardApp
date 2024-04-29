package utils;

import models.Flashcard;

import java.util.ArrayList;

//T represemts a Generic - Generics allow us to use this interface
// for mutltple data types
//methods on interface are public and abstract by default
public interface CRUD<T> {
    //create

    //when a flashcard is created what do we want to return?
    boolean create(T card);

    //read
    //getting a flashcard by the id it's bee assigned
    //or we can get all  the flashcards

    T getById(int id);

    ArrayList<T> getAll();

    //update
    //once we update a flashcard we want to return that new one

    T update(T card);

    //delete
    //remove flashcard from 'memory'

    boolean delete(T card);
}
