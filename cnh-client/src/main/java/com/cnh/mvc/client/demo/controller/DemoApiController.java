package com.cnh.mvc.client.demo.controller;

import com.cnh.mvc.api.DemoApi;
import com.cnh.mvc.client.demo.entity.Demo;
import com.github.pagehelper.PageInfo;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * ${Description}
 *
 * @author Administrator
 * @version v1.0.0
 * @since 2017/1/13
 */
@RestController
@RequestMapping("/demo/")
public class DemoApiController {

    @Autowired
    private DemoApi demoApi;


    @ApiOperation(value = "list")
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public PageInfo<Demo> list(@RequestParam(value = "pageNo", defaultValue = "1", required = false) Integer pageNo,
                               @RequestParam(value = "pageSize", defaultValue = "10", required = false) Integer pageSize,
                               @RequestParam(value = "account", required = false) String account) {
        return demoApi.list(pageNo, pageSize, account);
    }

}
