package cn.hinata.yuxin.framework.common.pojo;

import lombok.Data;

import java.io.Serializable;

/**
 * @Author Etwahl
 * @Date 2023-09-24 20:00
 */
@Data
public class CommonResult<T> implements Serializable {
	/**
	 * 错误码
	 */
	private Integer code;
	/**
	 * 返回数据
	 */
	private T data;
	/**
	 * 错误提示
	 */
	private String msg;


	public static <T> CommonResult<T> success(T data) {
		CommonResult<T> result = new CommonResult<>();
		result.code = 200;
		result.data = data;
		result.msg = "";
		return result;
	}
}
