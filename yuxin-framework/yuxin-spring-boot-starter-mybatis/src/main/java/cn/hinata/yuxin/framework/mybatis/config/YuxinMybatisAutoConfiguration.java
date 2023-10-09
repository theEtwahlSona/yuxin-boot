package cn.hinata.yuxin.framework.mybatis.config;

import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.autoconfigure.AutoConfiguration;

/**
 * @Author Etwahl
 * @Date 2023-10-09 21:10
 */
@AutoConfiguration
@MapperScan(value = "cn.hinata.yuxin", annotationClass = Mapper.class)
public class YuxinMybatisAutoConfiguration {
}
