package com.example.repository;
// Repository Layer -> used to interact with DATABASE


import com.example.db.DatabaseConnection;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserRepository {

    private DatabaseConnection db;

    public UserRepository(DatabaseConnection db) {  // @Autowired work by def
        this.db = db;
    }

    public List<String> findAll(){
        return db.getUsers();
    }

    public void save(String user){
        db.addUser(user);
    }
}
