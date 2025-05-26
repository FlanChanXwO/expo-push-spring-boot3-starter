package com.github.flanchanowo.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@ConfigurationProperties(prefix = "expo.push-notification.client")
public class ExpoPushNotificationClientProperties {
    private String baseUrl;
    private String accessToken;
}
