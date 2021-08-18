package lmsProg.model;

import lombok.Generated;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Entity
public class Courses {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column
    private String name;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "teacher_id", referencedColumnName = "Id")
    private Users teacher;

    @OneToMany(mappedBy = "course")
    private List<Lessons> lessons;

    @ManyToMany(mappedBy = "enrollCourses")
    private List<Users> users;

}
