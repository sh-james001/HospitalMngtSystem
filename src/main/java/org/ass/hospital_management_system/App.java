package org.ass.hospital_management_system;

import java.util.Date;
import java.util.List;

import org.ass.hospital_management_system.dao.AppointmentDaoImpl;
import org.ass.hospital_management_system.dto.AppointmentDto;
import org.ass.hospital_management_system.entity.AppointmentDetails;
import org.ass.hospital_management_system.entity.DoctorInfo;
import org.ass.hospital_management_system.entity.UserInfo;
import org.ass.hospital_management_system.util.StringToDate;

public class App 
{
    public static void main( String[] args )
    {
    	///////////
       DoctorInfo di = new DoctorInfo();
       di.setName("dr sharad");
       di.setEmail("sharad@gmail.com");
       di.setContact(6265592210l);
       di.setType("cardiologist");
       di.setAvailable_time("wed");
       
       UserInfo ui = new UserInfo();  
       ui.setName("umesh");
       ui.setContact(875476568l);
       ui.setEmail("umesh@gmail.com");
    	
       AppointmentDaoImpl adi= new AppointmentDaoImpl();
//       adi.saveDoctorDetails(di);
//       adi.saveUserInfo(ui);
       adi.create(di);
       adi.create(ui);
       
       //////////////////
     // adi.UpdateUserByEmail("jony@jobmail.com", 8736827644l);
      
      
//      AppointmentDto dto=new AppointmentDto();
//      dto.setAppointmentDate("13/09/2023");
//      dto.setDoctor_id(3);
//      dto.setUser_id(2);
//      dto.setTime("11 O'clock");
//      dto.setRemarkId("leg pain");
//      
//      adi.bookAppointment(dto);
       
//       adi.updateRemarkByPatientId(2, "take medicine ");
       
       
//      Date date = StringToDate.stringToDate("02/09/2023");
//      List<AppointmentDetails> list= adi.getAllAppointmentByDoctorIdAndDate(1, date);
//      list.forEach(each->{
//    	  System.out.println(each);
//      });
      
      
       
       
    }
}
