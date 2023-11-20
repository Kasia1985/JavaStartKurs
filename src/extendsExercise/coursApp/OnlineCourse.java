package extendsExercise.coursApp;

public class OnlineCourse extends Course {
    private int videoSizeInMinutes;
    private int courseSizeInMinutes;

    public OnlineCourse() {
    }

    public OnlineCourse(String courseId, double price, String name, String description,
                        int videoSizeInMinutes, int courseSizeInMinutes) {
        setCourseId(courseId);
        setPrice(price);
        setName(name);
        setDescription(description);
        this.videoSizeInMinutes = videoSizeInMinutes;
        this.courseSizeInMinutes = courseSizeInMinutes;
    }

    public int getVideoSizeInMinutes() {
        return videoSizeInMinutes;
    }

    public void setVideoSizeInMinutes(int videoSizeInMinutes) {
        this.videoSizeInMinutes = videoSizeInMinutes;
    }

    public int getCourseSizeInMinutes() {
        return courseSizeInMinutes;
    }

    public void setCourseSizeInMinutes(int courseSizeInMinutes) {
        this.courseSizeInMinutes = courseSizeInMinutes;
    }

    public void printInfo(){
        System.out.println("Course ID: " + getCourseId() + "\nCourse name: " + getName()
                + "\nAll videos have " + getVideoSizeInMinutes()
                + "min \nTotal course length is " + getCourseSizeInMinutes()
                + "min\nCourse description: " + getDescription() + "\nPrice: " + getPrice() + " euro");

    }
}
