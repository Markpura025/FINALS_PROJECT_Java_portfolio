class Person { String name; int age; String gender;

public Person(String name, int age, String gender) {
    this.name = name;
    this.age = age;
    this.gender = gender;
}

public void displayInfo() {
    System.out.println("Name: " + name);
    System.out.println("Age: " + age);
    System.out.println("Gender: " + gender);
}
}

class Student extends Person { String studentId;

public Student(String name, int age, String gender, String studentId) {
    super(name, age, gender);
    this.studentId = studentId;
}

public void displayStudent() {
    System.out.println("\n--- Student Information ---");
    displayInfo();
    System.out.println("Student ID: " + studentId);
}
}

class Course { String courseCode; String courseName;

public Course(String courseCode, String courseName) {
    this.courseCode = courseCode;
    this.courseName = courseName;
}

public void displayCourse() {
    System.out.println(courseCode + " - " + courseName);
}
}

class Teacher extends Person { String department; Course[] courses; // Aggregation (Teacher HAS-A Course)

public Teacher(String name, int age, String gender, String department, Course[] courses) {
    super(name, age, gender);
    this.department = department;
    this.courses = courses;
}

public void displayTeacher() {
    System.out.println("\n--- Teacher Information ---");
    displayInfo();
    System.out.println("Department: " + department);
    System.out.println("Courses Handled:");
    for (Course c : courses) {
        c.displayCourse();
    }
}
}

public class TeacherStudentAssignment { public static void main(String[] args) { // Create a student Student s1 = new Student("Mark Cruz", 19, "Male", "202411121"); s1.displayStudent();

    Course c1 = new Course("FITT1", "Physical Fitness Education");
    Course c2 = new Course("FITT2", "Physical Activies Fitness Towards Health");
    
    Student s1 = new Student("Mark Cruz", 19, "Male", "202411121");
   
   s1.displayStudent();
    
    Course[] teacherCourses = {c1, c2};
    Teacher t1 = new Teacher("Mr. Tommy", 35, "Male", "P.E Department", teacherCourses);

    t1.displayTeacher();
   
    System.out.println("\nDisplaying the course");
    c1.displayCourse();
}
}