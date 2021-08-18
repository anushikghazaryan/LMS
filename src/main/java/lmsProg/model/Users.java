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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
    @Enumerated(EnumType.STRING)
    private Lms_role role;

    @OneToOne(mappedBy = "userId")
    private TeacherDescription teacherDescription;


}
