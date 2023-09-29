public class Main {
    public static void main(String[] args) {
        NajahUn university = new NajahUn();

        courses course1 = new courses(1,
                "Math",
                "Prof. Smith",
                30,
                29);
        courses course2 = new courses(2,
                "Physics",
                "Prof. Johnson",
                25,
                0);

        Student student1 = new Student(101,
                "Alice",
                "alice@example.com");
        Student student2 = new Student(102,
                "Bob",
                "bob@example.com");
        Student student3 = new Student(123,
                "humam",
                "humam@example.com");
        Student student4 = new Student(89,
                "ahmad",
                "ahmad@example.com");

//        add courses
        university.add_courses(course1);
        university.add_courses(course2);

//        add students
        university.add_student(student1);
        university.add_student(student2);
        university.add_student(student3);
        university.add_student(student4);

        university.enroll_students_in_courses(student1,course1);
        university.enroll_students_in_courses(student1,course2);

        university.enroll_students_in_courses(student2,course1);
        university.enroll_students_in_courses(student3,course2);
//
        System.out.println(university.get_list_of_students());
        System.out.println(university.get_list_of_students());

//        available_courses
        university.get_available_courses();

//        courses for specific student
        university.get_course_of_specific_student(student1);
    }
}
