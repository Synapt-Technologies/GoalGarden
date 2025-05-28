package com.synapt.goalgarden.repository;

import com.synapt.goalgarden.model.Organisation;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;


public interface OrganisationRepository extends CrudRepository<Organisation, Long>
{

    <S extends Organisation> S save(S entity);

    Optional<Organisation> findById(Long id);

    Iterable<Organisation> findAll();

    long count();

    void delete(Organisation entity);

    boolean existsById(long primaryKey);
}
