package com.aleksey.yappr.repository;

import com.aleksey.yappr.entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "users", path = "users")

public interface UserRepository extends MongoRepository<User, String> {

    User findByUsername(@Param("username") String username);
    List<String> getFollowedUsers(@Param("username") String username);
}
