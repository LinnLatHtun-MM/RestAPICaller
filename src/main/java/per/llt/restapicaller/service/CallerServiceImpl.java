package per.llt.restapicaller.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import per.llt.restapicaller.config.AppConfig;
import per.llt.restapicaller.request.*;
import per.llt.restapicaller.response.CallerServiceResponse;

/**
 * @author:  Linn Lat Htun
 * @created: 10/27/2022
 * @project: restapi-caller
 * @package: per.llt.restapi-caller.service
 */

@Service
@Slf4j
public class CallerServiceImpl implements CallerService {

    @Autowired
    AppConfig appConfig;



    CallerServiceResponse callerServiceResponse=new CallerServiceResponse();
    @Override
    public CallerServiceResponse callSingleStringResponse() {

        try {
            log.info("Api Calling Info, URL: {}, Request Data: {}", appConfig.getResponseSingleStringURL(),null);

            RestTemplate restTemplate=new RestTemplate();
            ResponseEntity<String> response=restTemplate.getForEntity(appConfig.getResponseSingleStringURL(),String.class);

            log.info("Third Party Response Status Code: {}", response.getStatusCode().value());
            log.info("Third Party Response Data: {}", response.getBody());

            if(response.getStatusCode()==HttpStatus.OK)
            {
                callerServiceResponse.setMessage("Success");
            }
            else
            {
                callerServiceResponse.setMessage("Fail from third party");
            }

            callerServiceResponse.setDescription("Calling Single String Response Third Party Api");
            callerServiceResponse.setResponseData(response.getBody());
            callerServiceResponse.setStatusCode(response.getStatusCode().value());
            return callerServiceResponse;

        }
        catch (Exception e)
        {
            e.printStackTrace();
            log.error("Error: {}",e.getMessage());
            return new CallerServiceResponse("Error Calling Third Party Api",e.getMessage(),500,null);
        }
    }

    @Override
    public CallerServiceResponse callSingleObjectResponse() {

        try {
            log.info("Api Calling Info, URL: {}, Request Data: {}",appConfig.getResponseSingleObjectURL(),null);
            RestTemplate restTemplate=new RestTemplate();
            ResponseEntity<Salary> response=restTemplate.getForEntity(appConfig.getResponseSingleObjectURL(), Salary.class);
            System.out.println(response);
            log.info("Third Party Response Status Code: {}",response.getStatusCode().value());
            log.info("Third Party Response Data: {}",response.getBody());

            if(response.getStatusCode().value()==200)
            {
                callerServiceResponse.setMessage("Success");
            }
            else
            {
                callerServiceResponse.setMessage("Fail");
            }

            callerServiceResponse.setDescription("Calling Single Object Response Third Party Api");
            callerServiceResponse.setResponseData(response.getBody());
            callerServiceResponse.setStatusCode(response.getStatusCode().value());
            return callerServiceResponse;
        }
        catch (Exception e)
        {
            e.printStackTrace();
            log.error("Error: {}",e.getMessage());
            return new CallerServiceResponse("Error Calling Third Party Api",e.getMessage(),500,null);
        }
    }

    @Override
    public CallerServiceResponse callObjectResponse() {

        try {
            log.info("Api Calling Info, URL: {}, Request Data: {}",appConfig.getResponseObjectURL(),null);

            RestTemplate restTemplate=new RestTemplate();
            ResponseEntity<Employee> response=restTemplate.getForEntity(appConfig.getResponseObjectURL(), Employee.class);

            log.info("Third Party Response Status Code: {}",response.getStatusCode().value());
            log.info("Third Party Response Data: {}",response.getBody());

            if(response.getStatusCode().value()==200)
            {
                callerServiceResponse.setMessage("Success");
            }
            else
            {
                callerServiceResponse.setMessage("Fail");
            }

            callerServiceResponse.setDescription("Calling  Object Response Third Party Api");
            callerServiceResponse.setResponseData(response.getBody());
            callerServiceResponse.setStatusCode(response.getStatusCode().value());
            return callerServiceResponse;
        }
        catch (Exception e)
        {
            e.printStackTrace();
            log.error("Error: {}",e.getMessage());
            return new CallerServiceResponse("Error Calling Third Party Api",e.getMessage(),500,null);
        }
    }

    @Override
    public CallerServiceResponse callStringListResponse() {
        try {
            log.info("Api Calling Info: {}, Request Data: {}",appConfig.getResponseObjectListURL(),null);

            RestTemplate restTemplate=new RestTemplate();
            ResponseEntity<Employee[]> response=restTemplate.getForEntity(appConfig.getResponseObjectListURL(), Employee[].class);

            log.info("Third Party Response Status Code: {}",response.getStatusCode().value());
            log.info("Third Party Response Data: {}",response.getBody());
            if(response.getStatusCode().value()==200)
            {
                callerServiceResponse.setMessage("Success");
            }
            else
            {
                callerServiceResponse.setMessage("Fail");
            }

            callerServiceResponse.setDescription("Calling  Object Response Third Party Api");
            callerServiceResponse.setResponseData(response.getBody());
            callerServiceResponse.setStatusCode(response.getStatusCode().value());
            return callerServiceResponse;
        }
        catch (Exception e)
        {
            e.printStackTrace();
            log.error("Error: {}",e.getMessage());
            return new CallerServiceResponse("Error Calling Third Party Api",e.getMessage(),500,null);
        }
    }

    @Override
    public CallerServiceResponse callObjectListResponse() {
        try {
            log.info("Api Calling Info: {}, Request Data: {}",appConfig.getResponseStringListURL(),null);

            RestTemplate restTemplate=new RestTemplate();
            ResponseEntity<String[]> response=restTemplate.getForEntity(appConfig.getResponseStringListURL(), String[].class);

            log.info("Third Party Response Status Code: {}",response.getStatusCode().value());
            log.info("Third Party Response Data: {}",response.getBody());
            if(response.getStatusCode().value()==200)
            {
                callerServiceResponse.setMessage("Success");
            }
            else
            {
                callerServiceResponse.setMessage("Fail");
            }

            callerServiceResponse.setDescription("Calling  Object Response Third Party Api");
            callerServiceResponse.setResponseData(response.getBody());
            callerServiceResponse.setStatusCode(response.getStatusCode().value());
            return callerServiceResponse;
        }
        catch (Exception e)
        {
            e.printStackTrace();
            log.error("Error: {}",e.getMessage());
            return new CallerServiceResponse("Error Calling Third Party Api",e.getMessage(),500,null);
        }
    }

    @Override
    public CallerServiceResponse callCustomObjectListResponse() {
        try{
            log.info("Api Calling Info: {}, Request Data: {}",appConfig.getResponseCustomObjectListURL(),null);

            RestTemplate restTemplate=new RestTemplate();
            ResponseEntity<EmployeeAndDept[]> response=restTemplate.getForEntity(appConfig.getResponseCustomObjectListURL(), EmployeeAndDept[].class);

            log.info("Third Party Response Status Code: {}",response.getStatusCode().value());
            log.info("Third Party Response Data: {}",response.getBody());
            if(response.getStatusCode().value()==200)
            {
                callerServiceResponse.setMessage("Success");
            }
            else
            {
                callerServiceResponse.setMessage("Fail");
            }

            callerServiceResponse.setDescription("Calling  Object Response Third Party Api");
            callerServiceResponse.setResponseData(response.getBody());
            callerServiceResponse.setStatusCode(response.getStatusCode().value());
            return callerServiceResponse;
        }
        catch (Exception e)
        {
            e.printStackTrace();
            log.error("Error: {}",e.getMessage());
            return new CallerServiceResponse("Error Calling Third Party Api",e.getMessage(),500,null);
        }
    }

    @Override
    public CallerServiceResponse callNestedObjectResponse() {
        try{
            log.info("Api Calling Info: {}, Request Data: {}",appConfig.getResponseNestedObjectURL(),null);

            RestTemplate restTemplate=new RestTemplate();
            ResponseEntity<ResponseObject> response=restTemplate.getForEntity(appConfig.getResponseNestedObjectURL(), ResponseObject.class);

            log.info("Third Party Response Status Code: {}",response.getStatusCode().value());
            log.info("Third Party Response Data: {}",response.getBody());
            if(response.getStatusCode().value()==200)
            {
                callerServiceResponse.setMessage("Success");
            }
            else
            {
                callerServiceResponse.setMessage("Fail");
            }

            callerServiceResponse.setDescription("Calling  Object Response Third Party Api");
            callerServiceResponse.setResponseData(response.getBody());
            callerServiceResponse.setStatusCode(response.getStatusCode().value());
            return callerServiceResponse;
        }
        catch (Exception e)
        {
            e.printStackTrace();
            log.error("Error: {}",e.getMessage());
            return new CallerServiceResponse("Error Calling Third Party Api",e.getMessage(),500,null);
        }
    }

    @Override
    public CallerServiceResponse callNestedObjectAndNestedObjectList() {

        try{
            log.info("Api Calling Info: {}, Request Data: {}",appConfig.getResponseNestedObjectAndNestedObjectListURL(),null);

            RestTemplate restTemplate=new RestTemplate();
            ResponseEntity<ResponseObjectList> response=restTemplate.getForEntity(appConfig.getResponseNestedObjectAndNestedObjectListURL(), ResponseObjectList.class);

            log.info("Third Party Response Status Code: {}",response.getStatusCode().value());
            log.info("Third Party Response Data: {}",response.getBody());
            if(response.getStatusCode().value()==200)
            {
                callerServiceResponse.setMessage("Success");
            }
            else
            {
                callerServiceResponse.setMessage("Fail");
            }

            callerServiceResponse.setDescription("Calling  Object Response Third Party Api");
            callerServiceResponse.setResponseData(response.getBody());
            callerServiceResponse.setStatusCode(response.getStatusCode().value());
            return callerServiceResponse;
        }
        catch (Exception e)
        {
            e.printStackTrace();
            log.error("Error: {}",e.getMessage());
            return new CallerServiceResponse("Error Calling Third Party Api",e.getMessage(),500,null);
        }
    }


}
