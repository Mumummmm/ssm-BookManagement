package com.pancy.bookmanagement.dao;

import com.pancy.bookmanagement.entity.Appointment;

import java.util.List;

public interface AppointmentDao {
    int insertAppointment(long bookId, long studentId);
    List<Appointment> queryAndReturn(long studentId);
}
