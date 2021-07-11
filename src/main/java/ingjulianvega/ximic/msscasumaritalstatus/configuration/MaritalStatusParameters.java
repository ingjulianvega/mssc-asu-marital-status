package ingjulianvega.ximic.msscasumaritalstatus.configuration;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Component
@ConfigurationProperties(prefix = "marital-status")
public class MaritalStatusParameters {

    private String api;
}
