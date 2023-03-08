package utils;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;

public class HibernateUtils {
	private static SessionFactory sf;
	static {
		System.out.println("in static init block");
		sf = new Configuration().configure().buildSessionFactory();// cn pool will be created n entire hib frmwork will
																	// be loaded in the JVM's mem
	}
	public static SessionFactory getSf() {
		return sf;
	}
	
	
}
