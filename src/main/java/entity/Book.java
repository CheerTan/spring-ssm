package entity;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class Book {
	private long bookId;
	private String name;
	private int number;
}
