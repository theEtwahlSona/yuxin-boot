package cn.hinata.yuxin.framework.common.pojo;

import cn.hinata.yuxin.framework.common.exception.ErrorCode;
import cn.hinata.yuxin.framework.common.exception.enums.GlobalErrorCodeConstants;
import lombok.Data;
import org.springframework.util.Assert;

import java.io.Serializable;

/**
 * 通用返回结果
 *
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

	/**
	 * 成功响应
	 *
	 * @param data
	 * @param <T>
	 * @return
	 */
	public static <T> CommonResult<T> success(T data) {
		CommonResult<T> result = new CommonResult<>();
		result.code = GlobalErrorCodeConstants.SUCCESS.getCode();
		result.data = data;
		result.msg = "";
		return result;
	}

	/**
	 * 失败响应
	 *
	 * @param errorCode
	 * @param <T>
	 * @return
	 */
	public static <T> CommonResult<T> error(ErrorCode errorCode) {
		return error(errorCode.getCode(), errorCode.getMsg());
	}

	/**
	 * 失败响应
	 *
	 * @param code
	 * @param message
	 * @param <T>
	 * @return
	 */
	public static <T> CommonResult<T> error(Integer code, String message) {
		Assert.isTrue(
				!GlobalErrorCodeConstants.OK.getCode().equals(code)
						&& !GlobalErrorCodeConstants.SUCCESS.getCode().equals(code),
				"code 必须是错误的！"
		);
		CommonResult<T> result = new CommonResult<>();
		result.code = code;
		result.msg = message;
		return result;
	}
}
