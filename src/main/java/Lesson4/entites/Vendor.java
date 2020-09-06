package Lesson4.entites;

import javax.persistence.*;

 @Entity
@Table (name = "vendor")
public class Vendor {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column (name = "id_vendor")
    private int id_vendor;

    @Column (name = "vendor_name")
    private String vendor_name;
}
