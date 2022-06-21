package com.example.dynamodb.models;

import java.util.List;

public interface NotificationsGateway {

    List<Notifications> findAll();
}
