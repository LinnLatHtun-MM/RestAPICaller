package per.llt.restapicaller.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author: Linn Lat Htun
 * @created: 10/27/2022
 * @project: restapi-caller
 * @package: per.llt.restapi-caller.request
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseObjectList<T> {
    private String timestamp;
    private StatusObject statusObject;
    private T dataList;
}
