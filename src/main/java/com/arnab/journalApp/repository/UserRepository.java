package com.arnab.journalApp.repository;

import com.arnab.journalApp.entity.JournalEntry;
import com.arnab.journalApp.entity.User;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, ObjectId> {

    User findByUserName(String userName);
}
