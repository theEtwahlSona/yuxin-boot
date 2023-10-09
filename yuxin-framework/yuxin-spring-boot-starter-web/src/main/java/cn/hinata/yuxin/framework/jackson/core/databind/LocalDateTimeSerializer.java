package cn.hinata.yuxin.framework.jackson.core.databind;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

import java.io.IOException;
import java.time.LocalDateTime;
import java.time.ZoneId;

/**
 * LocalDateTime序列化规则
 * <p>
 * 会将LocalDateTime序列化为毫秒级时间戳
 *
 * @Author Etwahl
 * @Date 2023-10-09 21:54
 */
public class LocalDateTimeSerializer extends JsonSerializer<LocalDateTime> {

	public static final LocalDateTimeSerializer INSTANCE = new LocalDateTimeSerializer();

	@Override
	public void serialize(LocalDateTime value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
		gen.writeNumber(value.atZone(ZoneId.systemDefault()).toInstant().toEpochMilli());
	}
}