package stringBuilderExercises;

public class Loader {
    private final static double PROGRESS_STEP = 0.5;
    private final static int PROGRESS_BAR_LENGTH = 10;
    private final static double PROGRESS_MAX_VALUE = 100;
    private final static String PROGRESS_BAR_SYMBOL = "#";
    private final static String PRINT_FORMAT = "LOADING %c %5.2f%% (%-" + PROGRESS_BAR_LENGTH +"s)\r";

    public static void main(String[] args) {
        double progress = 0.0;
        for (int i = 0; progress <= PROGRESS_MAX_VALUE; i++) {
            String progressBar = getProgressBar(progress);
            char progressIndicator = i % 2 == 0? '/' : '\\';
            System.out.printf(PRINT_FORMAT, progressIndicator, progress , progressBar);
            progress = i* PROGRESS_STEP;
            pause();
        }
    }

    private static String getProgressBar(double progress) {
        double progressBarStep = PROGRESS_MAX_VALUE / PROGRESS_BAR_LENGTH;
        int numberOfDots = (int)(progress / progressBarStep);
        return PROGRESS_BAR_SYMBOL.repeat(numberOfDots);
    }

    private static void pause() {
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
