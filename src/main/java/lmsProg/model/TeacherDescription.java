package lmsProg.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Getter
@Setter
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
