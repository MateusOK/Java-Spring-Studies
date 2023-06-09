package br.com.compass.pb.repository;

import br.com.compass.pb.entity.Users;
import org.apache.catalina.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UsersRepository extends MongoRepository<Users, String> {

    List<Users> findByName(String name);
}
