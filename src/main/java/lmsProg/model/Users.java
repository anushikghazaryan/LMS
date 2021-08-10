package lmsProg.model;

import com.vladmihalcea.hibernate.type.basic.PostgreSQLEnumType;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;
import org.hibernate.validator.constraints.Email;

import javax.persistence.*;

@Setter
@Getter
@Entity
@TypeDef(
        name = "pgsql_enum",
        typeClass = PostgreSQLEnumType.class
)
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

    @Enumerated(EnumType.STRING)
    @Column
    @Type( type = "pgsql_enum" )
    private Lms_role role;

//    @OneToOne(mappedBy = "users")
//    private TeacherDescription teacherDescription;


}
