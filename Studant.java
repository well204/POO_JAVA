package classes;

public class Studant {
    private String name;
    private double gradeOne;
    private double gradeTwo;
    private double gradeThree;

    public void calculateGrade() {
        double avarege = this.gradeOne + this.gradeTwo + this.gradeThree;
        if (avarege < 60) {
            System.out.printf("FINAL GRADE: %.2f%nFAILED%n", avarege);
            double missing = 60 - avarege;
            System.out.printf("MISSING: %.2f", missing);
        } else {
            System.out.printf("FINAL GRADE: %.2f%nPASS", avarege);
        }
    }

    public void setGradeOne(double gradeOne) {
        this.gradeOne = gradeOne;
    }

    public void setGradeThree(double gradeThree) {
        this.gradeThree = gradeThree;
    }

    public void setGradeTwo(double gradeTwo) {
        this.gradeTwo = gradeTwo;
    }

    public void setName(String name) {
        this.name = name;
    }
}
