package Lesson_3.Task2;

import javax.persistence.*;

@Entity
@Table (name = "students_tbl")
public class Student {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column (name = "id_student")
    private int id;

    @Column (name = "student_name")
    private String name;

    @OneToOne
    @JoinColumn (name = "id_faculty")
    private Faculty faculty;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return "Student: " + name + ", id: " + id + ", Faculty " + faculty;
    }
}
