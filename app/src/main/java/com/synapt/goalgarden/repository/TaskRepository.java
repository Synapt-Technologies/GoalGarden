package com.synapt.goalgarden.repository;

import com.synapt.goalgarden.model.Task;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.Optional;

public interface TaskRepository extends PagingAndSortingRepository<Task, Long>
{
    //    Quote save(Quote quote);

    <S extends Task> S save(S entity);

    Optional<Task> findById(Long id);

    Iterable<Task> findAll();

    Iterable<Task> findAll(Sort sort);

    Page<Task> findAll(Pageable pageable);

    long count();

    void delete(Task entity);

    boolean existsById(long primaryKey);

}