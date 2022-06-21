package com.example.dynamodb.models;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAutoGeneratedKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@DynamoDBTable(tableName = "Notifications")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Component
public class Notifications {

    @DynamoDBHashKey(attributeName = "notificationId")
    @DynamoDBAutoGeneratedKey
    private String notificationId;

    @DynamoDBAttribute
    private String userId;

    @DynamoDBAttribute
    private String phoneNumber;

    @DynamoDBAttribute
    private Boolean isSend;

    @DynamoDBAttribute
    private String userName;

    @DynamoDBAttribute
    private Long lastSend;
}