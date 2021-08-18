package lmsProg.model;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Email;

import javax.persistence.*;
import java.util.List;

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
    // casti manramasnery Vaheic harcnenq
    @Enumerated(EnumType.STRING)
    private Lms_role role;

    @OneToOne(mappedBy = "userId")
    private TeacherDescription teacherDescription;

    @OneToOne(mappedBy = "userId")
    private StudentDescription studentDescription;

    @OneToMany(mappedBy = "teacher")
    private List<Courses> courses;

    @ManyToMany
    @JoinTable(
            name = "enrollments",
            joinColumns = @JoinColumn(name = "student_id", referencedColumnName = "Id"),
            inverseJoinColumns = @JoinColumn(name = "course_id", referencedColumnName = "Id"))
    private List<Courses> enrollCourses;
}
