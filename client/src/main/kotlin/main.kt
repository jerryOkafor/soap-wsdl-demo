import com.example.myproject.HiHelloWSService

/*
*
* soap-wsdl-demo
*
* Copyright (c) FBIS Technology LTD
* httsp://wwww.fbistech.com
*
*/

fun main() {
    val client = HiHelloWSService()

    print(client.hiHelloWSPort.sayHello())

}