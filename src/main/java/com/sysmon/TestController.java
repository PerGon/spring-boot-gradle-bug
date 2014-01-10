package com.sysmon;

import com.sysmon.debug.ProfileExecutionTime;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@EnableAutoConfiguration
public class TestController {

	@RequestMapping(value = "/", method = RequestMethod.GET)
    @ResponseBody
    @ProfileExecutionTime
    public String getTest() {
        return "Hello there";
    }
}