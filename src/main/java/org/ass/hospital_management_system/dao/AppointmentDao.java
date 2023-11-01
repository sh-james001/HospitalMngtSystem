package org.ass.hospital_management_system.dao;

import java.util.Date;
import java.util.List;

import org.ass.hospital_management_system.dto.AppointmentDto;
import org.ass.hospital_management_system.entity.AppointmentDetails;
import org.ass.hospital_management_system.entity.DoctorInfo;
import org.ass.hospital_management_system.entity.UserInfo;

public interface AppointmentDao {
	
	public <t> void create(t entity);
	
//	public void saveDoctorDetails(DoctorInfo doctorInfo);
//	
//	public void saveUserInfo(UserInfo userInfo);
//	
//	public void saveAppointmentDetails(AppointmentDetails ad);
	
//	public void UpdateUserByEmail(String email , long contact);
//	
//    public void bookAppointment(AppointmentDto dto);
//	
//	public void updateRemarkByPatientId(int pId , String remark);
//
//	public List<AppointmentDetails> getAllAppointmentByDoctorIdAndDate(int doctorId, Date date);
	

}
