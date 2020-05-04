class Movie {
    String title;
    String genre;
    int rating;

    void playIt() {
        System.out.println(title + " is playing");
    }
}

public class MovieTestDrive {
    public static void main (String[] args) {
        Movie one = new Movie();
        one.title = "Gone with the wind";
        one.genre = "Tragic";
        one.rating = 2;
        one.playIt();
    }
}
