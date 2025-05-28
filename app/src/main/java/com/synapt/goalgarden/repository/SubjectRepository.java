package com.synapt.goalgarden.repository;

import com.synapt.goalgarden.model.Subject;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.Optional;

public interface SubjectRepository extends PagingAndSortingRepository<Subject, Long>
{
    //    Quote save(Quote quote);

    <S extends Subject> S save(S entity);

    Optional<Subject> findById(Long id);

    Iterable<Subject> findAll();

    Iterable<Subject> findAll(Sort sort);

    Page<Subject> findAll(Pageable pageable);

    long count();

    void delete(Subject entity);

    boolean existsById(long primaryKey);

}