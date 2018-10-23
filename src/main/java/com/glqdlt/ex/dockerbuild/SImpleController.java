package com.glqdlt.ex.dockerbuild;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class SImpleController {

    @GetMapping("/greeting")
    public String echo() {
        return "hi";
    }
}
