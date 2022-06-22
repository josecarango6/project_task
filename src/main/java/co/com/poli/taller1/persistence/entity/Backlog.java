package co.com.poli.taller1.persistence.entity;

import co.com.poli.taller1.persistence.entity.Project;
import lombok.Setter;
import lombok.Getter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "backlogs")
public class Backlog {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name = "project_identifier" )
    private String projectIdentifier;
    @OneToOne
    private Project project;
    @OneToMany
    @Column(name = "project_task" )
    private List<ProjectTask> projectTask;

}
