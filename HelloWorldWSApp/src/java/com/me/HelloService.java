package com.me;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

@WebService(serviceName = "HelloService")
public class HelloService 
{

    @WebMethod(operationName = "sayhello")
    public String sayhello(@WebParam(name = "username") String usr) 
    {
        return "Hello " + usr + " !";
    }
}
