package com.example.dynamodb.repository;

import com.example.dynamodb.models.Notifications;
import java.util.List;
import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@EnableScan
@Repository
public interface NotificationsRepository extends CrudRepository<Notifications, String> {

    List<Notifications> findAll();
    Notifications findByPhoneNumber(String phoneNumber);
}
