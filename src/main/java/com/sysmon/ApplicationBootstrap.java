package com.sysmon;

import lombok.extern.apachecommons.CommonsLog;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

@Configuration
@ComponentScan
@EnableAutoConfiguration
@EnableScheduling
@CommonsLog
public class ApplicationBootstrap {


    //(... there is stuff in here, but is not needed to reproduce the bug)
}