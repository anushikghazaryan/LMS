package lmsProg.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class StudentDescription implements Serializable {
    @Column
    private String profession;
    @Column(name="education_background")
    private String educationBackground;
    @Column(name="work_experience")
    private String workExperience;
    @Column(name="current_workplace")
    private String currentWorkplace;
    @Column(name="interested_courses")
    private String interestedCourses;
    @Id
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="user_id", referencedColumnName = "Id")
    private User userId;
}
