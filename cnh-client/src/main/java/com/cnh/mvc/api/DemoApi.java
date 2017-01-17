package com.cnh.mvc.api;

import com.cnh.mvc.client.demo.entity.Demo;
import com.github.pagehelper.PageInfo;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * ${Description}
 *
 * @author Administrator
 * @version v1.0.0
 * @since 2017/1/13
 */
@FeignClient(url = "${custom.api}")
public interface DemoApi {

    @ApiOperation(value = "list", response = Demo.class)
    @RequestMapping(value = "/api/demo", method = RequestMethod.GET)
    public PageInfo<Demo> list(
            @ApiParam(value = "pageNo", required = false) @RequestParam(value = "pageNo", defaultValue = "1") Integer pageNo,
            @ApiParam(value = "pageSize", required = false) @RequestParam(value = "pageSize", defaultValue = "10") Integer pageSize,
            @ApiParam(value = "帐号", required = false) @RequestParam(value = "account") String account);

}
