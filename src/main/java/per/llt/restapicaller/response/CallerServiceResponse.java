package per.llt.restapicaller.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author: Linn Lat Htun
 * @created: 10/27/2022
 * @project: restapi-caller
 * @package: per.llt.restapi-caller.model.response
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CallerServiceResponse<T> {

    private String message;

    private String description;

    private int statusCode;

    // T is generic data type and all other different data types can store into this variable
    private T responseData;
}
