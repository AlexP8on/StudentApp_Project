package ie.atu;

public class Student {
    private String name;
    private String email;
    private String course;

    // Constructors
    public Student() {
        // Default constructor
        this.name = "";
        this.email = "";
        this.course = "";
    }
    public Student(String name, String email, String course) {
        this.name = name;
        this.email = email;
        this.course = course;
    }
    public Student(String name) {
        this.name = name;
    }
    // Getter and Setter methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }
}

