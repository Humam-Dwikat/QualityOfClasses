
public interface IUniversity {
    void add_student(Student student);
    void add_courses(courses courses);
    void enroll_students_in_courses(Student student, courses course);
    void drop_students_from_courses(Student student, courses course);
    void get_available_courses();
    void get_course_of_specific_student(Student student);
}
