package com.app.persistence.repository;

import com.app.persistence.entity.UserEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UserRepository extends CrudRepository<UserEntity, Long> {

    // metodo para buscar un usuario por el nombre
    Optional<UserEntity> findUserEntityByUsername(String userName);

//    @Query("SELECT u FROM UserEntity u WHERE u.username = ?1")
//    Optional<UserEntity> findUser(String userName);
}
