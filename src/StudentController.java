public class StudentController {
    public static void main(String[] args) {
        StudentModel student = new StudentModel("Kevin Flores", 18);
        StudentView view = new StudentView();
        StudentReport report = new StudentReport();

        // Mostrar información en pantalla
        view.showStudent(student);

        // Generar un reporte
        report.generateReport(student);
    }
}