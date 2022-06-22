package co.com.poli.taller1.persistence.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = "project_tasks")
public class ProjectTask {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    private String summary;
    @Column(name = "acceptance_criteria")
    private String acceptanceCriteria;
    private String status;
    private int priority;
    private Double hours;
    @Column(name = "start_date")
    private Date startDate;
    @Column(name = "end_date")
    private Date endDate;
    @Column(name = "project_identifier")
    private String projectIdentifier;
    @ManyToOne
    private Backlog backlog;
}
