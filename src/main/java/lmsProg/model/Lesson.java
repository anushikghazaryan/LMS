package lmsProg.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@Table(name = "lessons")
public class Lesson {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column
    private String name;
    @Column
    private String description;
    // columnDefinition = "DATE" for found [date (Types#DATE)], but expecting [bytea (Types#VARBINARY)]
    @Column(name = "created_time", columnDefinition = "DATE")
    private LocalDateTime createdTime;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "course_id", referencedColumnName = "Id")
    private Course course;
}
