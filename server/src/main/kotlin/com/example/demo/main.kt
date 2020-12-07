package com.example.demo

import javax.xml.ws.Endpoint

/*
* 
* simpple-soap-jws
* 
* Copyright (c) FBIS Technology LTD
* httsp://wwww.fbistech.com
*
*/

//https://turreta.com/2017/06/23/kotlin-soap-web-service/
//https://turreta.com/2018/05/09/kotlin-soap-web-service-client/
//More info: https://www.baeldung.com/jax-ws
//https://docs.oracle.com/cd/E17802_01/webservices/webservices/docs/2.0/tutorial/doc/JAXWS3.html

//https://medium.com/swlh/wsdl-client-generation-with-kotlin-and-gradle-398483e32191
//https://dzone.com/articles/automate-soap-client-auto-generation-routines-with


fun main() {
    Endpoint.publish("http://localhost:8084/", HiHelloWS())
}


//netstat -vanp tcp | grep 3000
//kill -9 43949