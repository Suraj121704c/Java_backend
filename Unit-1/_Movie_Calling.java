public class _Movie_Calling {
    public static void main(String[] args) {
        _Movie movieObject = new _Movie();

//        calling movie class
        movieObject.namaste();

//     assigning value of movies;
        movieObject.duration = 2.3;
        movieObject.name = "Extraction 2";

        System.out.println(movieObject.duration);
        System.out.println(movieObject.name);
    }
}
