![license](https://img.shields.io/badge/license-MIT-blue.svg)
[![author](https://img.shields.io/badge/author-FlanChanOwO-orange.svg)](https://www.cirno.asia)

# expo-push-spring-boot3-starter

`expo-push-spring-boot3-starter` is a Spring Boot-based server-side SDK starter for Expo push notifications. It provides
the `ExpoPushNotificationTemplate` class via Spring dependency injection, greatly simplifying the integration and use of
Expo push services.

**Language: [简体中文(Chinese)](readme_zh.md)**

---

✨ **Features**

- 🚀 Supports official Expo Push API with compatibility for the latest interfaces
- 🔒 Secure HTTP communication using Apache HttpClient5
- 🧩 Modular design for easy extension and customization
- 📦 Supports custom HTTP clients and access tokens
- 📝 Detailed error handling and logging
- 📱 Adapted for mobile push notification scenarios

---

## 📦 Installation

Add the dependency to your Maven project:

```xml

<dependency>
    <groupId>io.github.flanchanxwo</groupId>
    <artifactId>expo-push-spring-boot3-starter</artifactId>
    <version>0.1.0</version>
</dependency>
```

<hr> 

🚀 Quick Start

1. Configure properties (optional)

```properties
expo.push.notification.client.baseUri=https://exp.host/--/api/v2/ # Optional, default value
expo.push.notification.client.accessToken=your-access-token # Optional
```

2. Inject and use `ExpoPushNotificationTemplate`

```java
import com.github.flanchanowo.ExpoPushNotificationTemplate;
import com.github.flanchanowo.request.PushNotification;
import com.github.flanchanowo.response.TicketResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PushService {

    @Autowired
    private ExpoPushNotificationTemplate pushTemplate;

    public void send() throws IOException {
        // Send a simple push notification
        TicketResponse.Ticket ticket = pushTemplate.sendPushNotification(
                "ExponentPushToken[xxxxxx]", "Title", "Message"
        );

        // Send a push notification with custom data
        Map<String, Object> data = new HashMap<>();
        data.put("key", "value");
        ticket = pushTemplate.sendPushNotification(
                "ExponentPushToken[xxxxxx]", "Title", "Message", data
        );
    }
}

```

3. Supported push parameters

ExpoPushNotificationTemplate provides multiple overloaded methods and supports the following parameters:

- to: Target Expo push token
- title: Notification title
- body: Notification body
- badge: Badge count (optional)
- data: Custom payload data (optional)
- priority: Push priority (optional)
- channelId: Notification channel (optional)
- ttl: Time to live (optional)
- expiration: Expiration time (optional)
- sound: Notification sound (optional)
- subtitle: Subtitle (optional)

<hr>

## 📝 Main Configuration Parameters

| 参数名         | 类型     | 说明                                                           |
|-------------|--------|--------------------------------------------------------------|
| baseUri     | String | 	Base URL of Expo API (default: https://exp.host/--/api/v2/) | |
| accessToken | String | 	Expo access token (optional)                                |

<hr>

## 🎨 Highlighted Features

- Error Handling: All interfaces throw detailed exceptions for easier debugging
- Logging: Integrated with SLF4J and supports custom log implementations
- Type Safety: Automatic (de)serialization using Jackson

## 📋 Supported Push Content

- Title, body, and custom data payload
- Multi-device batch push
- Customizable notification parameters (e.g., sound, priority)

## 💡 Recommendations

It is recommended to read the official [Expo documentation]((https://docs.expo.dev/push-notifications/overview/)) to understand the basics of push notifications
Manage your accessToken securely in production environments