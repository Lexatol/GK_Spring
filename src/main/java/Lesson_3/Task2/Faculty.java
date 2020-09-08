package Lesson_3.Task2;

import javax.persistence.*;

@Entity
@Table (name = "faculty_tbl")
public class Faculty {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column (name = "id_faculty")
    private int id;

    @Column (name = "faculty_name")
    private String name;

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
        return "[Faculty: " + name + "(id:" + id + ")]";
    }
}
