![license](https://img.shields.io/badge/license-MIT-blue.svg)
[![author](https://img.shields.io/badge/author-FlanChanOwO-orange.svg)](https://www.cirno.asia)

# expo-push-spring-boot-starter

`expo-push-spring-boot-starter` 是一个基于 Spring Boot 的 Expo 推送通知服务端 SDK Starter，支持通过 Spring 依赖注入方式获取推送模板类
`ExpoPushNotificationTemplate`，极大简化了 Expo 推送的集成与使用。

---

✨ **特性**

- 🚀 支持 Expo 官方推送 API，兼容最新接口
- 🔒 安全的 HTTP 通信，基于 Apache HttpClient5
- 🧩 模块化设计，易于扩展和自定义
- 📦 支持自定义 HTTP 客户端与访问令牌
- 📝 详细的错误处理与日志输出
- 📱 适配移动端推送场景

---

## 📦 安装

Maven 项目中添加依赖：

```xml

<dependency>
    <groupId>com.github.flanchanowo</groupId>
    <artifactId>expo-push-spring-boot-starter</artifactId>
    <version>0.1.0</version>
</dependency>
```

<hr>
🚀 快速上手

1. 配置参数（可选）

```properties
expo.push.notification.client.baseUri=https://exp.host/--/api/v2/ # 可选，默认值
expo.push.notification.client.accessToken=your-access-token # 可选
```

2. 注入并使用 ExpoPushNotificationTemplate

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
        // 发送简单推送
        TicketResponse.Ticket ticket = pushTemplate.sendPushNotification(
                "ExponentPushToken[xxxxxx]", "标题", "内容"
        );

        // 发送带自定义参数的推送
        Map<String, Object> data = new HashMap<>();
        data.put("key", "value");
        ticket = pushTemplate.sendPushNotification(
                "ExponentPushToken[xxxxxx]", "标题", "内容", data
        );
    }
}
```

3. 支持的推送参数

ExpoPushNotificationTemplate 提供多种重载方法，支持如下参数：

- to：目标 Expo 推送 Token
- title：通知标题
- body：通知内容
- badge：角标（可选）
- data：自定义数据（可选）
- priority：推送优先级（可选）
- channelId：通知通道（可选）
- ttl：消息生存时间（可选）
- expiration：过期时间（可选）
- sound：通知声音（可选）
- subtitle：副标题（可选）

<hr>

## 📝 主要参数

| 参数名         | 类型     | 说明                                                |
|-------------|--------|---------------------------------------------------|
| baseUri     | String | Expo API 基础地址（默认值 "https://exp.host/--/api/v2/" ） | |
| accessToken | String | Expo 访问令牌（可选）                                     |

<hr>

## 🎨 特色功能

- 错误处理：所有接口均抛出详细异常，便于定位问题
- 日志输出：集成 SLF4J，支持自定义日志实现
- 类型安全：基于 Jackson 自动序列化/反序列化

<hr>

## 📋 支持的推送内容

- 标题、正文、数据 payload
- 多设备批量推送
- 自定义通知参数（如声音、优先级等）

<hr>

## 💡 使用建议

推荐先阅读 [Expo 官方文档](https://docs.expo.dev/push-notifications/overview/) 了解推送通知基本概念
生产环境请妥善管理 accessToken
<hr>