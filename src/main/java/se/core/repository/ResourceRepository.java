package se.core.repository;

import org.springframework.data.repository.CrudRepository;
import se.core.domain.DomainOjbect;

public interface ResourceRepository extends CrudRepository<DomainOjbect, Integer> {
}
