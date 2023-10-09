package cn.hinata.yuxin.module.system.service.auth;

import cn.hinata.yuxin.module.system.controller.admin.auth.vo.AuthLoginReqVO;
import cn.hinata.yuxin.module.system.controller.admin.auth.vo.AuthLoginRespVO;
import cn.hinata.yuxin.module.system.dal.dataobject.user.AdminUserDO;
import cn.hinata.yuxin.module.system.dal.mysql.user.AdminUserMapper;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @Author Etwahl
 * @Date 2023-10-09 20:00
 */
@Slf4j
@Service
public class AdminAuthServiceImpl implements AdminAuthService {
	@Resource
	private AdminUserMapper adminUserMapper;

	@Override
	public AuthLoginRespVO login(AuthLoginReqVO reqVO) {
		AdminUserDO adminUserDO = adminUserMapper.selectById("1");
		return new AuthLoginRespVO();
	}
}
