package org.fundatec.ti19.vinilemess.cassandraconnectionpoc.repository;

import org.fundatec.ti19.vinilemess.cassandraconnectionpoc.model.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface StudentRepository extends CrudRepository<Student, UUID> {
}
