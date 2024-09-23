public class Student {
    String name;
    double cgpa;

    public void setCgpa(double cgpa) {
        this.cgpa = cgpa;
    }

    public double getCgpa() {
        return cgpa;
    }

    double FindPercentage(){
        return cgpa * 10;
    }
}
