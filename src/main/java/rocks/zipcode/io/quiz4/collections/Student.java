package rocks.zipcode.io.quiz4.collections;

/**
 * @author leon on 11/12/2018.
 */
public class Student {
    private Double totalAmountOfHoursLearned;
    private Integer id;

    public Student() {
        this(null);
    }
    public Student(Integer id) {
        this.id = id;
        this.totalAmountOfHoursLearned = 0.0;
    }

    public void learn(Double amountOfHours) {
        this.totalAmountOfHoursLearned += amountOfHours;
    }

    public Double getTotalStudyTime() {
        return this.totalAmountOfHoursLearned;
    }
}
