package headFirst.chapter1;

public class OOP {
}
////OOP
//When you designe a class think about the objects that will be created from that class type.
//THINK ABOUT: 1) things Object knows    2) things Object does
//Shopping cart-> cart contents{knows}:: addToCart(), removeFromCart(), checkOut() {does}
//Button ->  label, color {knows} :: setColor(), setLabel(), dePress(), unDepress() {does}
//Alarm -> alarmTime, alarmMode {knows}:: setAlarmTime(), getAlarmTime(), isAlarmSet(), snooze () {does}
//Things and objects knows about itself are called  INSTANT VARIABLES
//Instant variables (state) -> Song -> title, artist {knows}
//Things the object can do are called METHODS (behavior)-> Song setTitle (), setArtist(), play()  {does}
//A CLASS is not an object. IT IS a BLUEPRINT FOR AN OBJECT. An object is like one entry in your address book
//Write your class:
//class Dog {
// int size;
// String breed;      instant variables
// String name;       instant variables
// void bark() {      method
// System.out.println ("Ruff, ruff");
// }
// }                Dog -> size, breed, name  -> bark();

// Write a tester (TestDrive) class
//classDogTestDrive{
// public static void main (String[] args){  - just a main method (we are going to put code in it next step)
//dog test code goes here
// }
//}
//In your tester make an object and acess the object variables and methods
//class DogTestDrive{
// public static void main (String[]args)}
// Dog d = new Dog ();  make a Dog object
//d.size = 40;  dog operator        use the dot operator(.) to set the size of the Dog
//d.bark ();    dog operator        and to call it bark method
//}
//}

//
class movie {
    String title;
    String genre;
    int rating;

    void playIt(){
        System.out.println("Playing the movie");

    }
}
public class MovieTestDrive{
    public static void main(String[] args) {
        movie one = new movie();
        one.title = "Gone with a Stock";
        one.genre = "Tragic";
        one.rating = -2;
        movie two = new movie();
        two.title = "Lost in cubical space";
        two.genre = "Tragedy";
        two.rating = 5;
        two.playIt();
        movie three = new movie();
        switch (three.title = "Byte Club") {
            three.genre = "Tragic but ultimately uplifting";
            three.rating = 127;
        }

    }


