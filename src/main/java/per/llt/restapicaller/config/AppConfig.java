package per.llt.restapicaller.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * @author: Linn Lat Htun
 * @created: 10/27/2022
 * @project: restapicaller
 * @package: per.llt.restapi-caller.config
 */

@Configuration
@ConfigurationProperties(prefix = "caller.api.receiverservice.endpoint")
@Data
public class AppConfig {

    private String responseSingleStringURL;

    private String responseSingleObjectURL;

    private String responseObjectURL;

    private String responseStringListURL;

    private String responseObjectListURL;

    private String responseCustomObjectListURL;

    private String responseNestedObjectURL;

    private String responseNestedObjectAndNestedObjectListURL;

}
