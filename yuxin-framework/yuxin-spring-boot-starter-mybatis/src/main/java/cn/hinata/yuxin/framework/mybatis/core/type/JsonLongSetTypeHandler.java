package cn.hinata.yuxin.framework.mybatis.core.type;

import cn.hinata.yuxin.framework.common.util.json.JsonUtils;
import com.baomidou.mybatisplus.extension.handlers.AbstractJsonTypeHandler;
import com.fasterxml.jackson.core.type.TypeReference;

import java.util.Set;

/**
 * @Author Etwahl
 * @Date 2023-10-09 21:13
 */
public class JsonLongSetTypeHandler extends AbstractJsonTypeHandler<Object> {
	private static final TypeReference<Set<Long>> TYPE_REFERENCE = new TypeReference<Set<Long>>(){};

	@Override
	protected Object parse(String json) {
		return JsonUtils.parseObject(json, TYPE_REFERENCE);
	}

	@Override
	protected String toJson(Object obj) {
		return JsonUtils.toJsonString(obj);
	}
}
