package data;

/**
 * Created by Oleg on 3/14/2017.
 */
public class Student {
    private int studentId;
    private String pib;
    private int course;



    public int getCourse() {
        return course;
    }

    public int getStudentId() {
        return studentId;
    }

    public String getPib() {
        return pib;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public void setPib(String pib) {
        this.pib = pib;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }
}
