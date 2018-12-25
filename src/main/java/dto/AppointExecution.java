package dto;

import entity.Appointment;
import enums.AppointStateEnum;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class AppointExecution {
	private long bookId;
	private int state;
	private String stateInfo;
	private Appointment appointment;
//	预约成功对象
	public AppointExecution(){}
	//预约失败的构造器
	public AppointExecution(long bookId, AppointStateEnum stateEnum){
		this.bookId=bookId;
		this.state=stateEnum.getState();
		this.stateInfo=stateEnum.getStateInfo();
	}
	//预约成功的构造器
	public AppointExecution(long bookId, AppointStateEnum stateEnum,Appointment appointment){
		this.bookId=bookId;
		this.state=stateEnum.getState();
		this.stateInfo=stateEnum.getStateInfo();
		this.appointment=appointment;
	}
}
