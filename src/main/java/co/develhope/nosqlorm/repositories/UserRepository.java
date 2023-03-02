package co.develhope.nosqlorm.repositories;

import co.develhope.nosqlorm.entities.User;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface UserRepository extends MongoRepository<User, String> {
}