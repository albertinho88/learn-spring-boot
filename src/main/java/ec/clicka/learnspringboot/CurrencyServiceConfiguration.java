package ec.clicka.learnspringboot;

//currency-service.url=
//currency-service.username=
//currency-service.key=

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@ConfigurationProperties(prefix = "currency-service")
@Component
@Data
public class CurrencyServiceConfiguration {

    private String url;
    private String username;
    private String key;
}
