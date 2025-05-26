package com.github.flanchanowo.autoconfig;

import com.github.flanchanowo.ExpoPushNotificationClient;
import com.github.flanchanowo.ExpoPushNotificationTemplate;
import com.github.flanchanowo.properties.ExpoPushNotificationClientProperties;
import org.apache.hc.client5.http.impl.classic.HttpClients;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;

@AutoConfiguration
@EnableConfigurationProperties({ExpoPushNotificationClientProperties.class})
public class ExpoPushNotificationClientConfiguration {
    private final ExpoPushNotificationClientProperties expoPushNotificationClientProperties;

    public ExpoPushNotificationClientConfiguration(ExpoPushNotificationClientProperties expoPushNotificationClientProperties) {
        this.expoPushNotificationClientProperties = expoPushNotificationClientProperties;
    }


    @Bean
    public ExpoPushNotificationTemplate expoPushNotificationClient() {
        final ExpoPushNotificationClient.Builder builder = ExpoPushNotificationClient.builder();
        final String baseUrl = expoPushNotificationClientProperties.getBaseUrl();
        final String accessToken = expoPushNotificationClientProperties.getAccessToken();
        builder.setHttpClient(HttpClients.createDefault());
        if (baseUrl != null) {
            builder.setBaseUri(baseUrl);
        }
        if (accessToken != null) {
            builder.setAccessToken(accessToken);
        }
        return new ExpoPushNotificationTemplate(builder.build());
    }

}
