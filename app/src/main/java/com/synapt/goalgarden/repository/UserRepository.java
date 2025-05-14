package com.synapt.goalgarden.repository;

import com.synapt.goalgarden.model.User;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;


public interface UserRepository extends CrudRepository<User, Long>
{

    <S extends User> S save(S entity);

    Optional<User> findById(Long id);

    Iterable<User> findAll();

    long count();

    void delete(User entity);

    boolean existsById(long primaryKey);
}
