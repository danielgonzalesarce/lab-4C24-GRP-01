public class StudentReport {
    public void generateReport(StudentModel student) {
        System.out.println(" Reporte del Estudiante");
        System.out.println("-------------------------");
        System.out.println("Nombre: " + student.getName());
        System.out.println("Edad: " + student.getAge());
        System.out.println("Curso: " + student.getCourse());
    }
}
