package com.picpaysimplificado.services;

import javax.management.Notification;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.picpaysimplificado.domain.user.User;
import com.picpaysimplificado.dtos.NotificationDTO;

@Service
public class NotificationService {
    @Autowired
    private RestTemplate restTemplate;

    public void sendNotification(User user, String msg) {
        String email = user.getEmail();
        NotificationDTO notificationRequest = new NotificationDTO(email, msg);
        // endpoint para a notificar está offline
        //ResponseEntity<String> notificationResponse = restTemplate.postForEntity(http://o4d9z.mocklab.io/notify, notificationRequest, String.class);
        //if(notificationResponse.getStatusCode() == HttpStatus.OK) {
          //  throw new Exception("Serviço de notificação está fora do ar");
     //   }

    }
}
