package headFirst.chapter1;

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
        three.title = "Byte Club";
        three.genre = "Tragic but ultimately uplifting";
        three.rating = 127;

    }

}
