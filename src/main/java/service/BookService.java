package service;

import dto.AppointExecution;
import entity.Book;

import java.util.List;

/**
 * 业务接口：站在使用者角度设计接口，三个方面：方法定义粒度，参数，返回类型（return 类型，异常）
 */
public interface BookService {
	/**
	 * 查询一本图书
	 * @param bookId
	 * @return
	 */
	Book getById(long bookId);
	/**
	 * Search all books
	 * @return
	 */
	List<Book> getList();
	/**
	 * Reserve Books
	 * @param bookId
	 * @param studentId
	 * @return
	 */
	AppointExecution appoint(long bookId,long studentId);
}
