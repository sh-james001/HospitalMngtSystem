package org.ass.hospital_management_system.util;

import org.ass.hospital_management_system.entity.AppointmentDetails;
import org.ass.hospital_management_system.entity.DoctorInfo;
import org.ass.hospital_management_system.entity.UserInfo;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SingleObjectSessionFactory {
	
	 public static SessionFactory factory;
     private SingleObjectSessionFactory() {
    	 
	}
     
     public static SessionFactory getInstatnce() {
    	 {
    		 if(factory==null) {
    			 Configuration cfg=new Configuration();
    			 cfg.setProperties(ConnectionPropertiesUtil.getConnectionProperties());
    			 cfg.addAnnotatedClass(AppointmentDetails.class);
    			 cfg.addAnnotatedClass(DoctorInfo.class);
    			 cfg.addAnnotatedClass(UserInfo.class);
    			 factory=cfg.buildSessionFactory();
    		 }
    		 return factory;
    	 }
     }
   
}