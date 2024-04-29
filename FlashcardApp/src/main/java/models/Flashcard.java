package models;

import java.util.Objects;

public class Flashcard {

    //primitive data types in Java & their wrapper classes :
    //Wrapper classes give Object functionality to primitives
    //byte => Byte
    //int => Integer
    //boolean => Boolean
    //char => Character
    //double => Double
    //short => Short
    //long => Long


    // our objects need states and behaviors
    //fields

    private int id;
    private String question;
    private String answer;

    //methods

    //Constructors
    // A constructor is a 'special method'
    // The return type of the constructor is the class
    //because it's the methods we use when we want to create an instance
    //of the class.. aka an object.

    //default constructor - a constructor that has no params within
    //the parenthesis
    public Flashcard(){

    }


    //all args constructors
    public Flashcard(int id, String question, String answer){
        this.id = id;
        this.question = question;
        this.answer =  answer;
    }

    //some args constructors
    public Flashcard(String answer,String question){
       this.question = question;
       this.answer = answer;
    }
    // getters and setters
    // if you look at the top of this class you will see that we made all of our
    // fields private by using the 'private' access modifier
    // by doing this we encapsulate our class
    //therefore we need getters and setters in order to get the value
    //of the fields and set the value sof the fields.
    //The action that getter and setter take is checking the state
    // of our object and setting the state of our object.

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        //because it's a method we can make changes before we set a value
        this.question = question;
    }

    public String getAnswer() {
        // or we can make changes before we return the value
        //ex: email tif*******2@aol.com
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }


    // toString() , equals() , hashcode() methods
    // good to have in a class
    // Especially when we move towards adding comparing objects


    @Override
    public String toString() {
        return "Flashcard{" +
                "id=" + id +
                ", question='" + question + '\'' +
                ", answer='" + answer + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flashcard flashcard = (Flashcard) o;
        return id == flashcard.id && Objects.equals(question, flashcard.question) && Objects.equals(answer, flashcard.answer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, question, answer);
    }
}
