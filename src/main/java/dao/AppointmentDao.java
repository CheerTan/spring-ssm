package dao;

import org.apache.ibatis.annotations.Param;

import entity.Appointment;

public interface AppointmentDao {

	/**
	 * 插入预约图书记录
	 *
	 * @param bookId
	 * @param studentId
	 * @return 插入的行数
	 */
	int insertAppointment(@Param("bookId") long bookId, @Param("studentId") long studentId);

	/**
	 * 通过主键查询预约图书记录，并且携带图书实体
	 *
	 * @param bookId
	 * @param studentId
	 * @return
	 */
	Appointment queryByKeyWithBook(@Param("bookId") long bookId, @Param("studentId") long studentId);
	/**
	 * 这里有两个参数时必须加入@Param，不然mybatis无法识别，这里无须写实现接口，mybatis会帮我们实现
	 */
}
