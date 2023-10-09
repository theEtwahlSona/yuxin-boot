package cn.hinata.yuxin.framework.jackson.core.databind;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;

import java.io.IOException;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;

/**
 * LocalDateTime反序列化规则
 * <p>
 * 会将毫秒级时间戳反序列化为LocalDateTime
 *
 * @Author Etwahl
 * @Date 2023-10-09 21:49
 */
public class LocalDateTimeDeserializer extends JsonDeserializer<LocalDateTime> {
	public static final LocalDateTimeDeserializer INSTANCE = new LocalDateTimeDeserializer();

	@Override
	public LocalDateTime deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
		return LocalDateTime.ofInstant(
				Instant.ofEpochMilli(p.getValueAsLong()),
				ZoneId.systemDefault() // 返回系统默认时区
		);
	}
}