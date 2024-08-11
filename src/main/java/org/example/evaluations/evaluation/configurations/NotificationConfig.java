package org.example.evaluations.evaluation.configurations;

import org.example.evaluations.evaluation.models.Content;
import org.example.evaluations.evaluation.models.ContentType;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class NotificationConfig {

    @Bean
    public Content getXmlContent() {
        Content content = new Content();
        content.setContentType(ContentType.XML);
        content.setMessage("xml message");
        return content;
    }

    @Bean
    public Content getJsonContent() {
        Content content = new Content();
        content.setContentType(ContentType.JSON);
        content.setMessage("json message");
        return content;
    }

    @Bean
    public Content getHtmlContent() {
        Content content = new Content();
        content.setContentType(ContentType.HTML);
        content.setMessage("html message");
        return content;
    }
}
