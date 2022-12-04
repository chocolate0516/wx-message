package com.gl.wxmessage.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author gaolei
 * @date 2022/12/04
 */
@RestController
@RequestMapping
@Slf4j
public class TestController {

    @GetMapping
    public void test() {
        log.info("test!");
    }

    @GetMapping
    public void test1() {
        log.info("test!");
    }
}
