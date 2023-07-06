package com.kanezi.github.package_consumer;


import com.kanezi.github.UuidTimestampGenerator;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RequestMapping("/")
@RestController
@Log4j2
public class HomeController {

    @GetMapping
    public String display() {
        //return "hello";
        return UuidTimestampGenerator.generate();
    }

}
