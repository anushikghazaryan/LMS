package lmsProg.model;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Email;

import javax.persistence.*;

@Setter
@Getter
@Entity
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    // inchi integer voch te int
    private Integer Id;
    @Column
    private String name;
    @Column
    private String surname;
    @Column
    @Email
    private String email;
    @Column
    private String password;
    @Column
    private Lms_role role;

    @OneToOne(mappedBy = "users")
    private TeacherDescription teacherDescription;


}
