package cn.hinata.yuxin.framework.common.exception;

import lombok.Data;

/**
 * @Author Etwahl
 * @Date 2023-09-24 20:47
 */
@Data
public class ErrorCode {
	/**
	 * 错误码
	 */
	private final Integer code;
	/**
	 * 错误提示
	 */
	private final String msg;

	public ErrorCode(Integer code, String message) {
		this.code = code;
		this.msg = message;
	}
}
