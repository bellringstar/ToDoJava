package com.todo.todoweb.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class SayHelloController {
    //"say hello!"

    @ResponseBody
    @RequestMapping("say-hello")
    public String sayHello(){
        return "Hello! What are you learing today?";
    }
    @ResponseBody
    @RequestMapping("say-hello-html")
    public String sayHelloHtml(){
        StringBuffer sb = new StringBuffer();
        sb.append("<html>");
        sb.append("<head>");
        sb.append("<title> change My first HTML PAGE</title>");
        sb.append("</head>");
        sb.append("<body>");
        sb.append("My first html body test ing?? auto-compile-test too slow");
        sb.append("</body>");
        sb.append("</html>");



        return sb.toString();
    }

    //JSP
    //sayHello.jsp
    @RequestMapping("say-hello-jsp")

    public String sayHelloJsp(){
        return "sayHello";
    }

}
