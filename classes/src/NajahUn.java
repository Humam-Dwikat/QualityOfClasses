import java.util.ArrayList;
import java.util.List;
public class NajahUn implements IUniversity{
    private List<courses> list_of_courses ;
    private List<Student> list_of_students;

    NajahUn(){
        this.list_of_courses = new ArrayList<>();
        this.list_of_students = new ArrayList<>();
    }
    public List<courses> get_list_of_courses(){
        return this.list_of_courses;
    }
    public List<Student> get_list_of_students(){
        return this.list_of_students;
    }

    @Override
    public void add_student(Student student) {
        list_of_students.add(student);

    }

    @Override
    public void add_courses(courses course) {
        list_of_courses.add(course);

    }

    @Override
    public void enroll_students_in_courses(Student student,courses course) {
        if(course.get_number_of_student()<=course.get_maximum_capacity()){
            student.set_courses(course);
            course.set_number_of_student();

        }
        else{System.out.println("you can't add student to this course");}


    }

    @Override
    public void drop_students_from_courses(Student student, courses course) {
        student.delete_from_course(course);
        //this will edit on the number of students in this course
        course.remove_student_from_course();
    }

    @Override
    public void get_available_courses() {
        ArrayList<String> available_courses = new ArrayList<>();
        for (courses course:this.list_of_courses){
            if(course.get_number_of_student()<= course.get_maximum_capacity()){
                available_courses.add(course.get_title());
            }
        }
        System.out.println(available_courses);

    }

    @Override
    public void get_course_of_specific_student(Student student) {
        System.out.println(student.get_courses());

    }

}
