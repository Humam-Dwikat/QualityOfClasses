import java.util.ArrayList;
import java.util.List;


public class Student {
    private int student_id;
    private String name;
    private String email;
    private List<courses> course;
    public Student(int studentId, String name, String email) {
        this.student_id = studentId;
        this.name = name;
        this.email = email;
        this.course = new ArrayList<>();
    }

    public int get_studentId() {
        return this.student_id;
    }

    public void set_studentId(int studentId) {
        this.student_id = studentId;
    }
    public String get_name() {
        return this.name;
    }

    public void set_name(String name) {
        this.name = name;
    }

    public String get_email() {
        return this.email;
    }

    public void set_email(String email) {
        this.email = email;
    }

    public List<courses> get_courses() {
        return this.course;
    }

    public void set_courses( courses course) {
        this.course.add(course);
    }
    public int get_number_of_student_in_course(courses course){
        return course.get_number_of_student();
    }
    public void delete_from_course(courses course){
        this.course.remove(course);
    }
    public String get_specific_course(String course_name){
        for(courses course: this.course){
            if(course.get_title().equals(course_name)){
                return this.name;
            }
        }
        return "no";
    }
    @Override
    public String toString() {
        return  " Title: " + this.name +
                ", Instructor: " + this.email +
                ", Maximum Capacity: " + this.student_id+
                "courses"+ this.course;
    }
}
