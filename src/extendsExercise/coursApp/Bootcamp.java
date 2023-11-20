package extendsExercise.coursApp;

public class Bootcamp extends OnlineCourse{
    private String coachFirstName;
    private String coachLastName;
    private int consultHours;

    public Bootcamp(String courseId, double price, String name,
                    String description, int videoSizeInMinutes,
                    int courseSizeInMinutes, String coachFirstName,
                    String coachLastName, int consultHours) {
        setCourseId(courseId);
        setPrice(price);
        setName(name);
        setDescription(description);
        setVideoSizeInMinutes(videoSizeInMinutes);
        setCourseSizeInMinutes(courseSizeInMinutes);
        this.coachFirstName = coachFirstName;
        this.coachLastName = coachLastName;
        this.consultHours = consultHours;
    }

    public String getCoachFirstName() {
        return coachFirstName;
    }

    public void setCoachFirstName(String coachFirstName) {
        this.coachFirstName = coachFirstName;
    }

    public String getCoachLastName() {
        return coachLastName;
    }

    public void setCoachLastName(String coachLastName) {
        this.coachLastName = coachLastName;
    }

    public int getConsultHours() {
        return consultHours;
    }

    public void setConsultHours(int consultHours) {
        this.consultHours = consultHours;
    }
}
