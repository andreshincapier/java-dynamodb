package com.example.dynamodb.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;
import lombok.Data;

@Data
@Builder(toBuilder = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class NotificationsDTO {

    private String id;
    private String msrp;
    private String cost;
}