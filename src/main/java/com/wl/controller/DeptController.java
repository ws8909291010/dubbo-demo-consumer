package com.wl.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.wl.model.User;
import com.wl.service.DeptService;
import com.wl.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Description:
 * @Auther:wangliang
 * @Date:2021/2/4 8:55
 */
@RestController
public class DeptController {
    //此处如果注明版本version,一直会报错,去掉了就没有报错
    @Reference
    private DeptService deptService;

    @RequestMapping("/sayDept")
    public Object sayDept(String name){
        return deptService.sayDeptName("111");
    }

}
