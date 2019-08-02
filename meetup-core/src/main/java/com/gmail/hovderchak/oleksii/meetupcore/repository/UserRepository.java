package com.gmail.hovderchak.oleksii.meetupcore.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.gmail.hovderchak.oleksii.meetupcore.document.User;

public interface UserRepository extends MongoRepository<User, Integer> {
}
