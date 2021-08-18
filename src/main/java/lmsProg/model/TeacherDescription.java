package lmsProg.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class TeacherDescription implements Serializable {
    @Column
    private String profession;
    @Column(name = "education_background")
    private String educationBackground;
    @Id
    @OneToOne(cascade = CascadeType.ALL) //inchi hamar
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private Users userId;

}
