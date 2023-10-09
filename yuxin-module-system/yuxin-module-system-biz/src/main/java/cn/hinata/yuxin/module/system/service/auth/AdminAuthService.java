package cn.hinata.yuxin.module.system.service.auth;

import cn.hinata.yuxin.module.system.controller.admin.auth.vo.AuthLoginReqVO;
import cn.hinata.yuxin.module.system.controller.admin.auth.vo.AuthLoginRespVO;

/**
 * @Author Etwahl
 * @Date 2023-10-09 19:59
 */
public interface AdminAuthService {
	/**
	 * 账号登录
	 *
	 * @param reqVO 登录信息
	 * @return 登录结果
	 */
	AuthLoginRespVO login(AuthLoginReqVO reqVO);
}
