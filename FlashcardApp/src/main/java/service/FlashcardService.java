package service;

import models.Flashcard;
import persistance.FlashcardRepo;
import utils.CRUD;

import java.util.ArrayList;

public class FlashcardService implements CRUD<Flashcard>{

    //make an instance of the Flashcard repo because we have to
    // reach out to the repo class in order to get access to it's methods
    FlashcardRepo repo;

    //constructor

    public FlashcardService(){
        repo = new FlashcardRepo();
    }


    @Override
    public boolean create(Flashcard card) {
        //we sre just calli
        return ;
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
