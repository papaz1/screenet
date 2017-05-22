package se.core.repository;

import org.springframework.data.repository.CrudRepository;
import se.core.domain.Resource;

public interface ResourceRepository extends CrudRepository<Resource, Integer> {
}
