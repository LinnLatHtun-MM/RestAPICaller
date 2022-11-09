package per.llt.restapicaller.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author: Linn Lat Htun
 * @created: 10/27/2022
 * @project: restapicaller
 * @package: per.llt.restapicaller.model.request
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseObject {
    private String timestamp;
    private StatusObject statusObject;
}
