package adamtworz.babycounter;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import adamtworz.babycounter.businessObjects.Measurement;


public class App 
{
    public static void main( String[] args )
    {
    	SessionFactory factory = new Configuration().configure()
    			.buildSessionFactory();
		
		Session session = factory.openSession();
        System.out.println( session);
        
        Measurement measurement = new Measurement();
        measurement.setID(1);
        measurement.setDate("2012-01-01 10:00");
        measurement.setLength(20);
        measurement.setWeight(3.5);
        
        
        session.beginTransaction();
        session.save(measurement);
        session.getTransaction().commit();
    }
}
