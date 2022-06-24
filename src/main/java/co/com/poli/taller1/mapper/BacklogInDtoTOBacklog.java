package co.com.poli.taller1.mapper;

import co.com.poli.taller1.persistence.entity.Backlog;
import co.com.poli.taller1.service.dto.BacklogInDTO;
import org.springframework.stereotype.Component;

@Component
public class BacklogInDtoTOBacklog implements IMapper<BacklogInDTO, Backlog>{

    @Override
    public Backlog map(BacklogInDTO in) {
        Backlog backlog = new Backlog();
        backlog.setProjectIdentifier(in.getProjectIdentifier());
        backlog.setProject(in.getProject());
        backlog.setProjectTask(in.getProjectTask());
        return backlog;
    }
}
