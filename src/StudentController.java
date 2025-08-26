public class StudentController {
    public static void main(String[] args) {
        StudentModel student = new StudentModel("Kevin Flores", 18);
        StudentView view = new StudentView();
        StudentReport report = new StudentReport();

        view.showStudent(student);

        report.generateReport(student);
    }
}

// Kevin Flores