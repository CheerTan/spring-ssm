package dto;

import lombok.Data;
import lombok.ToString;

/**
 * 封装json对象，所有返回结果都使用他
 */
@Data
@ToString
public class Result<T> {
	private boolean success;
	private T data;//return param when it's successful
	private String error;
	public Result(){}
	//Success Constructor
	public Result(boolean success,T data){
		this.success=success;
		this.data=data;
	}
	//Fail Constructor
	public Result(boolean success,String error){
		this.success=success;
		this.error=error;
	}

}
