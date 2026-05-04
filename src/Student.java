
public class Student {

    private String name;
    private int grade;

    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public boolean isPassed() {
        return grade >= 13;
    }

    public void printStatus(){
        if (isPassed()) {
            System.out.println("The student has passed");
        } else {
            System.out.println("The student has not passed");
        }
    }

}
