package com.sys.selectcource.Controller;

import com.sys.selectcource.enities.DateEnity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DateController {

    @PostMapping("/date")
    public void getDate(@RequestBody DateEnity date){
        System.out.println(date);
    }
}
