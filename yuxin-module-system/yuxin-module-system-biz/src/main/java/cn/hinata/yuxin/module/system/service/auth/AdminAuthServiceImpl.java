package cn.hinata.yuxin.module.system.service.auth;

import cn.hinata.yuxin.module.system.controller.admin.auth.vo.AuthLoginReqVO;
import cn.hinata.yuxin.module.system.controller.admin.auth.vo.AuthLoginRespVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @Author Etwahl
 * @Date 2023-10-09 20:00
 */
@Slf4j
@Service
public class AdminAuthServiceImpl implements AdminAuthService {
	@Override
	public AuthLoginRespVO login(AuthLoginReqVO reqVO) {
		return new AuthLoginRespVO();
	}
}
