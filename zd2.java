package Student;

public class zd2 {
    public static void main(String[] args) {
        Student[] students = {
            new Student("Мадияр", 20, "Информатика"),
            new Student("Макпал", 22, "Филология"),
            new Student("Исатай", 21, "Математика"),
            new Student("Елеусин", 23, "Экономика")
        };

        Student oldestStudent = Student.findOldestStudent(students);
        
        System.out.println("Самый старший студент:");
        oldestStudent.displayInfo();
    }
}

