package co.elastic.support.apm.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import co.elastic.apm.api.CaptureSpan;

@RestController
public class TestController {
    @CaptureSpan
    @GetMapping("/hello")
    public String hello() {
        return "Hello, world";
    }
}
