package cn.hinata.yuxin.module.system.controller.admin.auth;

import cn.hinata.yuxin.framework.common.pojo.CommonResult;
import cn.hinata.yuxin.module.system.controller.admin.auth.vo.AuthLoginReqVO;
import cn.hinata.yuxin.module.system.controller.admin.auth.vo.AuthLoginRespVO;
import cn.hinata.yuxin.module.system.service.auth.AdminAuthService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static cn.hinata.yuxin.framework.common.pojo.CommonResult.success;

/**
 * @Author Etwahl
 * @Date 2023-10-09 19:35
 */
@RestController
@RequestMapping("/system/auth")
public class AuthController {
	@Resource
	private AdminAuthService adminAuthService;

	/**
	 * 使用账号密码登录
	 *
	 * @param reqVO
	 * @return
	 */
	@PostMapping("/login")
	public CommonResult<AuthLoginRespVO> login(@RequestBody AuthLoginReqVO reqVO) {
		return success(adminAuthService.login(reqVO));
	}
}
