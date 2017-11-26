package com.pancy.bookmanagement.dao;

import com.pancy.bookmanagement.entity.Appointment;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AppointmentDao {
    int insertAppointment(@Param("bookId") long bookId, @Param("studentId") long studentId);
    List<Appointment> queryAndReturn(long studentId);
}
