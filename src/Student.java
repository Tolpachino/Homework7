public class Student {
    int studentID;
    String name;
    String surname;
    int studYear;
    double midMathGrade;
    double midEconomicGrade;
    double midLanguageGrade;

    public void midGrade() {
        System.out.println((midEconomicGrade + midMathGrade + midLanguageGrade) / 3);
    }
}

class StudentTest {
    public static void main(String[] args) {
        Student studentFirst = new Student();
        studentFirst.studentID = 1;
        studentFirst.name = "Stepan";
        studentFirst.surname = "Ivanov";
        studentFirst.studYear = 2022;
        studentFirst.midMathGrade = 3.8;
        studentFirst.midEconomicGrade = 4.6;
        studentFirst.midLanguageGrade = 5.0;


        Student studentSecond = new Student();
        studentSecond.studentID = 2;
        studentSecond.name = "Ivan";
        studentSecond.surname = "Vagner";
        studentSecond.studYear = 2019;
        studentSecond.midMathGrade = 4.5;
        studentSecond.midEconomicGrade = 2.7;
        studentSecond.midLanguageGrade = 3.4;

        Student studentThird = new Student();
        studentThird.studentID = 3;
        studentThird.name = "Aleksey";
        studentThird.surname = "Suvorov";
        studentThird.studYear = 2020;
        studentThird.midMathGrade = 3.4;
        studentThird.midEconomicGrade = 4.0;
        studentThird.midLanguageGrade = 4.2;

        studentFirst.midGrade();
        studentSecond.midGrade();
        studentThird.midGrade();

    }
}
