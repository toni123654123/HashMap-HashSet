package HashMap_HashSet;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Nam",20,"Ha Noi");
        Student student1 = new Student("Khanh", 30,"Ha Noi");
        Student student2 = new Student("Huynh",21,"Ha Noi");

        Map<Integer, Student> studentMap = new HashMap<Integer, Student>();
        studentMap.put(1,student);
        studentMap.put(2,student1);
        studentMap.put(3,student2);
        studentMap.put(4,student);

        for (Map.Entry<Integer, Student> studentEntry : studentMap.entrySet()){
            System.out.println(studentEntry);
        }
        System.out.println("---------------------------S");
        Set<Student> studentSet = new HashSet<Student>();
        studentSet.add(student);
        studentSet.add(student1);
        studentSet.add(student2);
        studentSet.add(student);

        for (Student studentn : studentSet){
            System.out.println(studentn);
        }
    }
}

