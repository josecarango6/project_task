package co.com.poli.taller1.service;

import co.com.poli.taller1.mapper.BacklogInDtoTOBacklog;
import co.com.poli.taller1.persistence.entity.Backlog;
import co.com.poli.taller1.persistence.repository.BacklogRepository;
import co.com.poli.taller1.service.dto.BacklogInDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BacklogService {

    private final BacklogRepository repository;
    private final BacklogInDtoTOBacklog mapper;
    public Backlog createBacklog(BacklogInDTO backlogInDTO){
        Backlog backlog = mapper.map(backlogInDTO);
        return this.repository.save(backlog);
    }

}
