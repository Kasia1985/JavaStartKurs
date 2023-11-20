package extendsExercise.coursApp;

public class CourseApp {
    public static void main(String[] args) {

        OnlineCourse onlineCourse1 = new OnlineCourse("JAVA-ONLINE-123", 1000, "Java for beginners",
                "Taking this course will provide you\nwith a basic foundation in Java syntax.\n" +
                        "You’ll learn to create conditional statements, functions,\n" +
                        "and loops to process information and solve problems.", 24000, 4800);

        onlineCourse1.printInfo();
    }
}
