package per.llt.restapicaller.service;

import per.llt.restapicaller.response.CallerServiceResponse;

/**
 * @author: Linn Lat Htun
 * @created: 10/27/2022
 * @project: restapi-caller
 * @package: per.llt.restapi-caller.service
 */

public interface CallerService {
    CallerServiceResponse callSingleStringResponse();

    CallerServiceResponse callSingleObjectResponse();

    CallerServiceResponse callObjectResponse();

    CallerServiceResponse callStringListResponse();

    CallerServiceResponse callObjectListResponse();

    CallerServiceResponse callCustomObjectListResponse();

    CallerServiceResponse callNestedObjectResponse();

    CallerServiceResponse callNestedObjectAndNestedObjectList();
}
