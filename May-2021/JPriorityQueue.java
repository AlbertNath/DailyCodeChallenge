import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Queue;
import java.util.PriorityQueue;


class Student implements Comparable<Student> {
    private int id;
    private String name;
    private double cgpa;

    public Student(int id, String name, double cgpa){
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getCgpa() {
        return cgpa;
    }

    @Override
    public int compareTo(Student s1) {
        if(this.cgpa == s1.getCgpa()){
            if(name.compareTo(s1.getName()) == 0){
                if(this.id == s1.getId())
                    return 0;
                else 
                    return (this.id > s1.getId())? 1 : -1;
            } else {
                return name.compareTo(s1.getName());
            }
        }
        else
            return (this.cgpa > s1.getCgpa())? -1 : 1;   
    }
}

class Priorities {
    public ArrayList<Student> getStudents(List<String> events) {
        PriorityQueue<Student> pq = new PriorityQueue<>();

        for(String e : events){
            String[] tmp = e.split("\\s");
            
            if(tmp.length > 1){
                String name = tmp[1];
                double cgpa = Double.valueOf(tmp[2]);
                int id = Integer.valueOf(tmp[3]);

                pq.add(new Student(id, name, cgpa));
            } else {
                pq.poll();
            }
        }
        
        while(pq.size() > 1)
            System.out.println(pq.poll().getName());

        return new ArrayList<Student>(pq);
    }
}

public class JPriorityQueue {
    private final static Scanner scan = new Scanner(System.in);
    private final static Priorities priorities = new Priorities();
    
    public static void main(String[] args) {
        int totalEvents = Integer.parseInt(scan.nextLine());    
        List<String> events = new ArrayList<>();
        
        while (totalEvents-- != 0) {
            String event = scan.nextLine();
            events.add(event);
        }
        
        List<Student> students = priorities.getStudents(events);
        
        if (students.isEmpty()) {
            System.out.println("EMPTY");
        } else {
            for (Student st: students) {
                System.out.println(st.getName());
            }
        }
    }
}