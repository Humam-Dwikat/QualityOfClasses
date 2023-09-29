public class courses {
    private int course_code;
    private String title;
    private String instructor;
    private int maximum_capacity;
    private int number_of_student;


    public courses(int course_code,String title, String instructor, int maximum_capacity, int number_of_student) {
        this.course_code = course_code;
        this.title = title;
        this.instructor = instructor;
        this.maximum_capacity = maximum_capacity;
        this.number_of_student =number_of_student;

    }
    public void set_number_of_student(){
        this.number_of_student += 1;
    }
    public void set_course_code(int course_code){
        this.course_code = course_code;
    }
    public void set_title(String title){
        this.title = title;
    }
    public void set_instructor(String instructor){
        this.instructor = instructor;
    }
    public void set_maximum_capacity(int maximum_capacity){
        this.maximum_capacity = maximum_capacity;
    }
    public int get_course_code(){
        return this.course_code;
    }
    public String get_title(){
        return this.title;
    }
    public int get_maximum_capacity(){
        return this.maximum_capacity;
    }
    public String get_instructor(){
        return this.instructor;
    }
    public int get_number_of_student(){return this.number_of_student;}
    public void remove_student_from_course(){
        this.number_of_student-=1;
    }

    @Override
    public String toString() {
        return  " Title: " + title +
                ", Instructor: " + instructor +
                ", Maximum Capacity: " + maximum_capacity;
    }
}
