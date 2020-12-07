package com.example.demo



import javax.jws.WebMethod
import javax.jws.WebService

/*
* 
* simpple-soap-jws
* 
* Copyright (c) FBIS Technology LTD
* httsp://wwww.fbistech.com
*
*/

@WebService
class HiHelloWS {
    @WebMethod
    open fun sayHello(): String {
        return "Hello from HiHelloWS"
    }

}