package se.core.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import se.core.domain.Resource;
import se.core.repository.ResourceRepository;
import se.core.service.ResourceService;

@Service
public class ResourceServiceImpl implements ResourceService {
    private ResourceRepository resourceRepository;

    @Autowired
    public void setResourceRepository(ResourceRepository resourceRepository) {
        this.resourceRepository = resourceRepository;
    }

    @Override
    public Resource getResource(Integer id) {
        return resourceRepository.findOne(id);
    }
}
