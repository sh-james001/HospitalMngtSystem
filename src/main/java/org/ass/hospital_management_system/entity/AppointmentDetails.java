package org.ass.hospital_management_system.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="appointment_details")
public class AppointmentDetails {
	@Id
	@GenericGenerator(name="reg_auto" , strategy = "increment")
	@GeneratedValue(generator = "reg_auto")
	@Column(name="id")
    private long id;
	
	@Column(name="patient_id")
	private long patient_id;
	
	@Column(name="Doctor_id")
	private long Doctor_id;
	
	@Column(name="appointmentDate")
	private String appointmentDate;
	
	@Column(name="time")
	private String time;
	
	@Column(name = "remarks")
	private String remarks;
	
	
	public long getPatient_id() {
		return patient_id;
	}
	public void setPatient_id(long patient_id) {
		this.patient_id = patient_id;
	}
	
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
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
