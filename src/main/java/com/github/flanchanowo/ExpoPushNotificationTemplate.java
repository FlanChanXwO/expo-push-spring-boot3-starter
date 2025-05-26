package com.github.flanchanowo;

import com.github.flanchanowo.request.PushNotification;
import com.github.flanchanowo.response.TicketResponse;

import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class ExpoPushNotificationTemplate {
    private final ExpoPushNotificationClient client;

    public ExpoPushNotificationTemplate(ExpoPushNotificationClient client) {
        this.client = client;
    }

    public List<TicketResponse.Ticket> sendPushNotifications(List<PushNotification> pushNotifications) throws IOException {
        return client.sendPushNotifications(pushNotifications);
    }

    public TicketResponse.Ticket sendPushNotification(PushNotification pushNotification) throws IOException {
        return client.sendPushNotifications(Collections.singletonList(pushNotification)).get(0);
    }


    public TicketResponse.Ticket sendPushNotification(String to, String title, String body) throws IOException {
        PushNotification pushNotification = PushNotification.builder()
                .to(Collections.singletonList(to))
                .title(title)
                .body(body)
                .build();
        return client.sendPushNotifications(Collections.singletonList(pushNotification)).get(0);
    }

    public TicketResponse.Ticket sendPushNotification(String to, String title, String body, Map<String, Object> data) throws IOException {
        PushNotification pushNotification = PushNotification.builder()
                .to(Collections.singletonList(to))
                .title(title)
                .body(body)
                .data(data)
                .build();
        return client.sendPushNotifications(Collections.singletonList(pushNotification)).get(0);
    }

    public TicketResponse.Ticket sendPushNotification(String to, String title, String body, Map<String, Object> data, PushNotification.Priority priority) throws IOException {
        PushNotification pushNotification = PushNotification.builder()
                .to(Collections.singletonList(to))
                .title(title)
                .body(body)
                .data(data)
                .priority(priority)
                .build();
        return client.sendPushNotifications(Collections.singletonList(pushNotification)).get(0);
    }


    public TicketResponse.Ticket sendPushNotification(String to, String body) throws IOException {
        PushNotification pushNotification = PushNotification.builder()
                .to(Collections.singletonList(to))
                .body(body)
                .build();
        return client.sendPushNotifications(Collections.singletonList(pushNotification)).get(0);
    }

    public TicketResponse.Ticket sendPushNotification(String to, String title, String body, Long badge) throws IOException {
        PushNotification pushNotification = PushNotification.builder()
                .to(Collections.singletonList(to))
                .title(title)
                .body(body)
                .badge(badge)
                .build();
        return client.sendPushNotifications(Collections.singletonList(pushNotification)).get(0);
    }

    public TicketResponse.Ticket sendPushNotification(String to, String title, String body, Long badge, Map<String, Object> data) throws IOException {
        PushNotification pushNotification = PushNotification.builder()
                .to(Collections.singletonList(to))
                .title(title)
                .body(body)
                .badge(badge)
                .data(data)
                .build();
        return client.sendPushNotifications(Collections.singletonList(pushNotification)).get(0);
    }


    public TicketResponse.Ticket sendPushNotification(String to, String title, String body, Long badge, Map<String, Object> data, PushNotification.Priority priority) throws IOException {
        PushNotification pushNotification = PushNotification.builder()
                .to(Collections.singletonList(to))
                .title(title)
                .body(body)
                .badge(badge)
                .data(data)
                .priority(priority)
                .build();
        return client.sendPushNotifications(Collections.singletonList(pushNotification)).get(0);
    }

    public TicketResponse.Ticket sendPushNotification(String to, String title, String body, Long badge, Map<String, Object> data, PushNotification.Priority priority, String channelId) throws IOException {
        PushNotification pushNotification = PushNotification.builder()
                .to(Collections.singletonList(to))
                .title(title)
                .body(body)
                .badge(badge)
                .data(data)
                .priority(priority)
                .channelId(channelId)
                .build();
        return client.sendPushNotifications(Collections.singletonList(pushNotification)).get(0);
    }


    public TicketResponse.Ticket sendPushNotification(String to, String title, String body, Long badge, Map<String, Object> data, PushNotification.Priority priority, String channelId, Long ttl) throws IOException {
        PushNotification pushNotification = PushNotification.builder()
                .to(Collections.singletonList(to))
                .title(title)
                .body(body)
                .badge(badge)
                .data(data)
                .priority(priority)
                .channelId(channelId)
                .ttl(ttl)
                .build();
        return client.sendPushNotifications(Collections.singletonList(pushNotification)).get(0);
    }

    public TicketResponse.Ticket sendPushNotification(String to, String title, String body, Long badge, Map<String, Object> data, PushNotification.Priority priority, String channelId, Long ttl, Long expiration) throws IOException {
        PushNotification pushNotification = PushNotification.builder()
                .to(Collections.singletonList(to))
                .title(title)
                .body(body)
                .badge(badge)
                .data(data)
                .priority(priority)
                .channelId(channelId)
                .ttl(ttl)
                .expiration(expiration)
                .build();
        return client.sendPushNotifications(Collections.singletonList(pushNotification)).get(0);
    }


    public TicketResponse.Ticket sendPushNotification(String to, String title, String body, Long badge, Map<String, Object> data, PushNotification.Priority priority, String channelId, Long ttl, Long expiration, String sound) throws IOException {
        PushNotification pushNotification = PushNotification.builder()
                .to(Collections.singletonList(to))
                .title(title)
                .body(body)
                .badge(badge)
                .data(data)
                .priority(priority)
                .channelId(channelId)
                .ttl(ttl)
                .expiration(expiration)
                .sound(sound)
                .build();
        return client.sendPushNotifications(Collections.singletonList(pushNotification)).get(0);
    }

    public TicketResponse.Ticket sendPushNotification(String to, String title, String body, Long badge, Map<String, Object> data, PushNotification.Priority priority, String channelId, Long ttl, Long expiration, String sound, String subtitle) throws IOException {
        PushNotification pushNotification = PushNotification.builder()
                .to(Collections.singletonList(to))
                .title(title)
                .body(body)
                .badge(badge)
                .data(data)
                .priority(priority)
                .channelId(channelId)
                .ttl(ttl)
                .expiration(expiration)
                .sound(sound)
                .subtitle(subtitle)
                .build();
        return client.sendPushNotifications(Collections.singletonList(pushNotification)).get(0);
    }
}
