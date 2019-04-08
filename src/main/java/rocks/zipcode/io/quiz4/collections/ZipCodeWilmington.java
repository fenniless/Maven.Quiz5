package rocks.zipcode.io.quiz4.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * @author leon on 11/12/2018.
 */
public class ZipCodeWilmington {
    //public ArrayList<Student> students;
    public ArrayList<Student> students = new ArrayList<>();

    public void enroll(Student student) {
//        if(students==null){
//            this.students = new ArrayList<Student>();
//        }
        this.students.add(student);
    }

    public Boolean isEnrolled(Student student) {
        if(students.contains(student)){
            return true;
        }
        return false;
    }

    public void lecture(double numberOfHours) {
        Double learns = numberOfHours;
        for (Student s: this.students
             ) {
            s.learn(learns);
        }
    }

    public Map<Student, Double> getStudyMap() {
        Map<Student, Double> map = new HashMap<>();
        for (Student s: students
             ) {
            map.put(s,s.getTotalStudyTime());
        }
        return map;
    }
}
