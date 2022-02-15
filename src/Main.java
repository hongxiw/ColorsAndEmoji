public class Main {
    public static void main(String[] args) {
        Plane plane = new Plane();

      /* A. uncomment code below first
            then study my code and see how colors work! */

      /* B. uncomment code below second
            then study the code to see how emojis work! */

      /* C. uncomment code below third
            then study my code and see how 'console animation' is made!
            for more info on try-catch syntax (not required for this course),
            check out https://docs.oracle.com/javase/tutorial/essential/exceptions/index.html */

        try {
          plane.animate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}