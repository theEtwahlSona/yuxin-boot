package cn.hinata.yuxin.module.system.dal.mysql.user;

import cn.hinata.yuxin.module.system.dal.dataobject.user.AdminUserDO;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Author Etwahl
 * @Date 2023-10-09 21:07
 */
@Mapper
public interface AdminUserMapper extends BaseMapper<AdminUserDO> {
}
