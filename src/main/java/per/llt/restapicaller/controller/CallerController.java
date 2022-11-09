package per.llt.restapicaller.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import per.llt.restapicaller.response.CallerServiceResponse;
import per.llt.restapicaller.service.CallerService;

/**
 * @author: Linn Lat Htun
 * @created: 10/27/2022
 * @project: restapi-caller
 * @package: per.llt.restapi-caller.controller
 */

@Slf4j
@RestController
public class CallerController {

    @Autowired
    CallerService callerService;

    @GetMapping("/callResponseSingleStringURL")
    public ResponseEntity singleStringMethod() {
        try {
            log.info("====Start Calling Single String Method====");
            CallerServiceResponse response = callerService.callSingleStringResponse();
            log.info("Response Data: {}", response);
            log.info("====End Calling Single String Method====");
            return new ResponseEntity(response, HttpStatus.OK);
        } catch (Exception e) {
            e.printStackTrace();
            log.error("Internal Server Error:{} ", e.getMessage());
            return ResponseEntity.internalServerError().build();
        }
    }

    @GetMapping("/callerResponseSingleObjectURL")
    public ResponseEntity singleObjectMethod() {
        try {
            log.info("====Start Calling Single Object Method====");
            CallerServiceResponse response = callerService.callSingleObjectResponse();
            log.info("Response Data: {}", response);
            log.info("====End Calling Single Object Method====");
            return new ResponseEntity(response, HttpStatus.OK);
        } catch (Exception e) {
            e.getMessage();
            log.error("Internal Server Error: {}", e.getMessage());
            return ResponseEntity.internalServerError().build();
        }
    }


    @GetMapping("/callerResponseObjectURL")
    public ResponseEntity responseObjectMethod() {
        try {
            log.info("====Start Calling Response Object Method====");
            CallerServiceResponse response = callerService.callObjectResponse();
            log.info("Response Data: {}", response);
            log.info("====End Calling Response Object Method====");
            return new ResponseEntity(response, HttpStatus.OK);
        } catch (Exception e) {
            e.getMessage();
            log.error("Internal Server Error: {}", e.getMessage());
            return ResponseEntity.internalServerError().build();
        }
    }

    @GetMapping("/callerResponseStringListURL")
    public ResponseEntity stringListMethod() {
        try {
            log.info("====Start Calling String List Method====");
            CallerServiceResponse response = callerService.callStringListResponse();
            log.info("Response Data: {}", response);
            log.info("====End Calling String List Method====");
            return new ResponseEntity(response, HttpStatus.OK);
        } catch (Exception e) {
            e.getMessage();
            log.error("Internal Server Error: {}", e.getMessage());
            return ResponseEntity.internalServerError().build();
        }
    }

    @GetMapping("/callerResponseObjectListURL")
    public ResponseEntity objectListMethod() {
        try {
            log.info("====Start Calling Object List Method====");
            CallerServiceResponse response = callerService.callObjectListResponse();
            log.info("Response Data: {}", response);
            log.info("====End Calling Object List Method====");
            return new ResponseEntity(response, HttpStatus.OK);
        } catch (Exception e) {
            e.getMessage();
            log.error("Internal Server Error: {}", e.getMessage());
            return ResponseEntity.internalServerError().build();
        }
    }

    @GetMapping("/callerResponseCustomObjectListURL")
    public ResponseEntity customObjectListMethod() {
        try {
            log.info("====Start Calling Custom Object List Method====");
            CallerServiceResponse response = callerService.callCustomObjectListResponse();
            log.info("Response Data: {}", response);
            log.info("====End Calling Custom Object List Method====");
            return new ResponseEntity(response, HttpStatus.OK);
        } catch (Exception e) {
            e.getMessage();
            log.error("Internal Server Error: {}", e.getMessage());
            return ResponseEntity.internalServerError().build();
        }
    }


    @GetMapping("/callerResponseNestedObjectURL")
    public ResponseEntity nestedObjectMethod() {
        try {
            log.info("====Start Calling Nested Object Method====");
            CallerServiceResponse response = callerService.callNestedObjectResponse();
            log.info("Response Data: {}", response);
            log.info("====End Calling Nested Object  Method====");
            return new ResponseEntity(response, HttpStatus.OK);
        } catch (Exception e) {
            e.getMessage();
            log.error("Internal Server Error: {}", e.getMessage());
            return ResponseEntity.internalServerError().build();
        }
    }

    @GetMapping("/callerResponseNestedObjectListURL")
    public ResponseEntity nestedObjectListMethod() {
        try {
            log.info("====Start Calling Nested Object List Method====");
            CallerServiceResponse response = callerService.callNestedObjectAndNestedObjectList();
            log.info("Response Data: {}", response);
            log.info("====End Calling Nested Object List  Method====");
            return new ResponseEntity(response, HttpStatus.OK);
        } catch (Exception e) {
            e.getMessage();
            log.error("Internal Server Error: {}", e.getMessage());
            return ResponseEntity.internalServerError().build();
        }
    }
}
