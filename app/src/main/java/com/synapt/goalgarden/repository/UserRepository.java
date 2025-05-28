package com.synapt.goalgarden.repository;

import com.synapt.goalgarden.model.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

@NoRepositoryBean
public interface UserRepository extends CrudRepository<User, Long>
{

    <S extends User> S save(S entity);

    Optional<User> findById(Long id);

    Iterable<User> findAll();

    long count();

    void delete(User entity);

    boolean existsById(long primaryKey);

    @Query("SELECT u FROM User u WHERE u.username = :username")
    public User getUserByUsername(@Param("username") String username);
}
