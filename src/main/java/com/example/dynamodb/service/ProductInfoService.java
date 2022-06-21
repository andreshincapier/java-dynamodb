package com.example.dynamodb.service;

import com.example.dynamodb.models.Notifications;
import com.example.dynamodb.models.NotificationsDTO;
import com.example.dynamodb.repository.NotificationsRepository;
import java.util.List;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class ProductInfoService {

    private final NotificationsRepository notificationsRepository;

    public List<Notifications> findAll() {
        return notificationsRepository.findAll();
    }

    public Notifications save(final NotificationsDTO dto) {

        final Notifications p = Notifications
            .builder()
            .notificationId("some-id-2")
            .userId("1040")
            .phoneNumber("3116715649")
            .isSend("false")
            .userName("John Doe")
            .lastSend(1655815520L)
            .build();

        return notificationsRepository.save(p);
    }
}
