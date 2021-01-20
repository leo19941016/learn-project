package com.tang;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:
 * @Company: TOO (ps：公司名称)
 * @author: 唐
 * @date: 2021/1/20 下午5:07
 * @version: V1.0.0
 */
@RestController
public class ConvertDto {

    @GetMapping("/add")
    public String add(){
        return "success";
    }
}
