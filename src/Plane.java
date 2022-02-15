public class Plane {

    // Plane emoji
    private static final String PLANE_EMOJI = 	"\u2708";

    // Colors
    private static final String BLUE = "\u001B[36m";
    private static final String GREEN = "\u001B[32m";
    private static final String RED = "\u001B[31m";
    private static final String BROWN = "\u001B[33m";
    private static final String WHITE = "\u001B[37m";
    private static final String BLACK = "\u001B[30m";
    private static final String CYAN = "\033[0;34m";
    private static final String BLUE_BRIGHT = "\033[0;94m";
    private static final String PURPLE = "\033[0;35m";
    private static final String[] COLORS = new String[] {BLUE, GREEN, RED, BROWN, WHITE, BLACK, CYAN, BLUE_BRIGHT, PURPLE};

    public Plane() {

    }

    public void animate() throws InterruptedException {
        String plane = PLANE_EMOJI;
        for(int i = 1; i < 21; i ++) {
            plane = "    " + plane;
            System.out.println(COLORS[(int) (Math.random() * COLORS.length)] + plane);
            Thread.sleep(500);
        }
        System.out.println(GREEN + "Plane has arrived!");
    }

}
