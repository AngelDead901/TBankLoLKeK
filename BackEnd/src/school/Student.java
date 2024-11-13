package school;

public class Student {
    private final String fName, lName, pName;
    private int age;
    double avgRating;
    private final boolean gender; //1 - мальчик
    public Student(String fName, String lName, String pName, int age, double avgRating, boolean gender) {
        this.fName = fName;
        this.gender = gender;
        this.lName = lName;
        this.pName = pName;
        this.age = age;
        this.avgRating = avgRating;
    }

    public String getFirstName() {
        return fName;
    }

    public String getLastName() {
        return lName;
    }

    public String getParentName() {
        return pName;
    }

    public boolean isGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public void birthday(){
        age++;
    }

    public void setAvgRating(double avgRating) {
        this.avgRating = avgRating;
    }

    public double getAvgRating() {
        return avgRating;
    }
}
