package co.com.poli.taller1.service.dto;

import co.com.poli.taller1.persistence.entity.Project;
import co.com.poli.taller1.persistence.entity.ProjectTask;
import lombok.Data;

import java.util.List;
@Data
public class BacklogInDTO {
    private String projectIdentifier;
    private Project project;
    private List<ProjectTask> projectTask;
}
