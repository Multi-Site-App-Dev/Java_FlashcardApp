package persistance;

import models.Flashcard;
import utils.CRUD;

import java.util.ArrayList;

public class FlashcardRepo implements CRUD<Flashcard> {

    //This arraylist is gping to represent our Database

    ArrayList<Flashcard> cardsInDB = new ArrayList<>();



    @Override
    public boolean create(Flashcard card) {

        //create new row for the flashcard (Adding it to arraylist)
        //using the flashcard being passed into the method

        if(card.getQuestion().isEmpty()  ){
            return false;
        }
        cardsInDB.add(card);


        return false;
    }

    @Override
    public Flashcard getById(int id) {
        return null;
    }

    @Override
    public ArrayList<Flashcard> getAll() {
        return null;
    }

    @Override
    public Flashcard update(Flashcard card) {
        return null;
    }

    @Override
    public boolean delete(Flashcard card) {
        return false;
    }
}
