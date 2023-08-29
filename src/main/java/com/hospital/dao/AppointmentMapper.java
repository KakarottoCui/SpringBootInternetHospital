package com.hospital.dao;

import com.hospital.entity.Appointment;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AppointmentMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Appointment record);

//微信：egvh56ufy7hh ，QQ：821898835 

    Appointment selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Appointment record);

    int updateByPrimaryKey(Appointment record);
    List<Appointment> findAll(List<Integer> doctorids,List<Integer> patientids);
    List<Appointment> selectByPatientId(@Param("patientid")Integer patientId);
    List<Appointment> selectByDoctorId(@Param("doctorId")Integer doctorId,List<Integer> patientids,String time);
    Integer selectTheLast(@Param("patientid")Integer patientId);
}