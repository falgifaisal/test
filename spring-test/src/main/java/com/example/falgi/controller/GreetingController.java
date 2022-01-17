package com.example.falgi.controller;

import com.example.falgi.messagingstompwebsocket.Greeting;
import com.example.falgi.messagingstompwebsocket.HelloMessage;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.HtmlUtils;
@RestController
public class GreetingController {
    @MessageMapping("/hello")
    @SendTo("/topic/greetings")
    public Greeting greeting(HelloMessage message) throws Exception {
        Thread.sleep(1000); // simulated delay
        return new Greeting("Hello My New Brother, " + HtmlUtils.htmlEscape(message.getName()) + "!");
    }
}
