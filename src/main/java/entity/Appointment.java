package entity;

import lombok.Data;
import lombok.ToString;

import java.util.Date;

@ToString
@Data
public class Appointment {
	private long bookId;
	private long studentId;
	private Date appointTime;
	private Book book;
}
