package org.fundatec.mdbspringboot.repository;

import org.bson.Document;
import org.fundatec.mdbspringboot.model.Ford;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;




@EnableMongoRepositories
public interface FordRepository extends MongoRepository<Ford, String> {


}
