package persistance;

import models.Flashcard;
import utils.CRUD;

import java.util.ArrayList;

public class FlashcardRepo implements CRUD<Flashcard> {

    //This arraylist is gping to represent our Database

    ArrayList<Flashcard> cardsInDB;

    public FlashcardRepo(){
         cardsInDB = new ArrayList<>();
    }



    @Override
    public boolean create(Flashcard card) {

        //create new row for the flashcard (Adding it to arraylist)
        //using the flashcard being passed into the method

        if(card.getQuestion().isBlank() || card.getAnswer().isEmpty() ) {
            return false;
        }
        cardsInDB.add(card);

        return true;
    }

    @Override
    public Flashcard getById(int id) {

        // we should be iterating through the array that's holding the flashcards


        for(Flashcard card: cardsInDB){

            //and compare the ids to the incoming id to find a match
            if(card.getId() == id){
                // if we get a mcatch we should return that card
                return card;
            }
        }
        //else - or 'if not' re should return null. meaning that we did not find a match
        return null;
    }

    @Override
    public ArrayList<Flashcard> getAll() {

        // we should return the entire arraylist of cards
        return null;
    }

    @Override
    public Flashcard update(Flashcard card) {

        // we should find the card in the array (based on the id)
        // once we find the card we should update what needs to be updated
        // then we can return the card.
        return null;
    }

    @Override
    public boolean delete(Flashcard card) {

        // you can decide to delete the card based on the id of the card of
        //by passing over the entire object/
       // heads up... if you pass over the entire object to be deleted a boolean is returned

        return false;
    }
}
