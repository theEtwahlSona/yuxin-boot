package cn.hinata.yuxin.server.controller;

import cn.hinata.yuxin.framework.common.pojo.CommonResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author Etwahl
 * @Date 2023-09-24 19:43
 */
@RestController
@RequestMapping("/hello")
public class HelloController {
	@GetMapping("/world")
	public CommonResult<String> helloWorld() {
		return CommonResult.success("Hello World");
	}
}
