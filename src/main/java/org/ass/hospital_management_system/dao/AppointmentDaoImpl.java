package org.ass.hospital_management_system.dao;
import java.util.Date;
import java.util.List;

import org.ass.hospital_management_system.dto.AppointmentDto;
import org.ass.hospital_management_system.entity.AppointmentDetails;
import org.ass.hospital_management_system.entity.DoctorInfo;
import org.ass.hospital_management_system.entity.UserInfo;
import org.ass.hospital_management_system.util.SingleObjectSessionFactory;
import org.hibernate.query.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;


public class AppointmentDaoImpl implements AppointmentDao {

	@Override
	public <t> void create(t entity) {
		Session session = SingleObjectSessionFactory.getInstatnce().openSession();
		Transaction tr =session.beginTransaction();
		session.merge(entity);
		tr.commit();
		
	}

	
	
//	@Override
//	public void saveDoctorDetails(DoctorInfo doctorInfo) {
//		Session session = SingleObjectSessionFactory.getInstatnce().openSession();
//		Transaction tr =session.beginTransaction();
//		session.merge(doctorInfo);
//		tr.commit();
//		
//	}
//
//	@Override
//	public void saveUserInfo(UserInfo userInfo) {
//		Session session = SingleObjectSessionFactory.getInstatnce().openSession();
//		Transaction tr =session.beginTransaction();
//		session.merge(userInfo);
//		tr.commit();
//		
//	}
//
//	@Override
//	public void saveAppointmentDetails(AppointmentDetails ad) {
//		Session session = SingleObjectSessionFactory.getInstatnce().openSession();
//		Transaction tr =session.beginTransaction();
//		session.merge(ad);
//		tr.commit();
//	}

	
	
//	@Override
//	public void UpdateUserByEmail(String email , long contact) {
//		Session session = SingleObjectSessionFactory.getInstatnce().openSession();
//		StringBuilder stringBuilder = new StringBuilder();
//		stringBuilder.append("from User_info where email=:e");
//		Query query = session.createQuery(stringBuilder.toString());
//		query.setParameter("e", email);
//	    Transaction tr=session.beginTransaction();
//	    UserInfo user =(UserInfo) query.uniqueResult();
//		user.setContact(contact);
//		session.merge(user);
//		query.executeUpdate();
//		tr.commit();
//	}
//
//	private String getTimmings(long id) {
//		Session se = SingleObjectSessionFactory.getInstatnce().openSession();
//		DoctorInfo info = se.get(DoctorInfo.class, id);
//		return info.getAvailable_time();
//	}
//
//	@Override
//	public void bookAppointment(AppointmentDto dto) {
//		int count =0;
//		String availableTime=getTimmings(dto.getDoctor_id());
//		if(!availableTime.contains(availableTime)) {
//			System.out.println("doctor is not available");
//			return;
//		}
//		
//		Session session = SingleObjectSessionFactory.getInstatnce().openSession();
//		StringBuilder builder = new StringBuilder();
//		builder.append("from AppointmentDetails where doctorId=:d");
//		Query query =session.createQuery(builder.toString());
//		query.setParameter("d", dto.getDoctor_id());
//		List resultList =query.getResultList();
//		
//		for(Object obj: resultList) {
//			count++;
//		}
//		
//		if(count>=4) {
//			System.out.println("Doctor is not available");
//			return;
//		}
//		
//		Transaction tr =session.beginTransaction();
//		AppointmentDetails ad=new AppointmentDetails();
//		ad.setDoctor_id(dto.getDoctor_id());
//		ad.setPatient_id(dto.getUser_id());
//		ad.setRemarks("------");
//		ad.setAppointmentDate(dto.getAppointmentDate());///
//		session.merge(ad);
//		tr.commit();
//		
//	}
//
//	@Override
//	public void updateRemarkByPatientId(int pId, String remark) {
//		Session session=SingleObjectSessionFactory.getInstatnce().openSession();
//		Transaction tr = session.beginTransaction();
//		AppointmentDetails appointmentDetails=session.get(AppointmentDetails.class, pId);
//		appointmentDetails.setRemarks(remark);
//		session.merge(appointmentDetails);
//		tr.commit();
//	}
//
//	@Override
//	public List<AppointmentDetails> getAllAppointmentByDoctorIdAndDate(int doctorId, Date date) {
//      Session session=SingleObjectSessionFactory.getInstatnce().openSession();
//      StringBuilder builder=new StringBuilder();
//      builder.append("from AppointmentDetails where doctorId=:d and appointmentDate=:ad");
//      Query query =session.createQuery(builder.toString());
//      query.setParameter("d",doctorId);
//      query.setParameter("ad", date);
//		return query.getResultList();
//	}

	

	


}
