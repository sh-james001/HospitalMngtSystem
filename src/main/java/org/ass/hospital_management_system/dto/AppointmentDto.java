package org.ass.hospital_management_system.dto;

import java.io.Serializable;

public class AppointmentDto implements Serializable{
	
	private long user_id;
	private long Doctor_id;
	private String appointmentDate;
	private String time;
	private String remarkId;
	
	public long getUser_id() {
		return user_id;
	}
	public void setUser_id(long user_id) {
		this.user_id = user_id;
	}
	public String getRemarkId() {
		return remarkId;
	}
	public void setRemarkId(String remarkId) {
		this.remarkId = remarkId;
	}
	public long getDoctor_id() {
		return Doctor_id;
	}
	public void setDoctor_id(long doctor_id) {
		Doctor_id = doctor_id;
	}
	public String getAppointmentDate() {
		return appointmentDate;
	}
	public void setAppointmentDate(String appointmentDate) {
		this.appointmentDate = appointmentDate;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	

}
