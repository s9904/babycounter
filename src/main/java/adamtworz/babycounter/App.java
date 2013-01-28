package adamtworz.babycounter;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;



import adamtworz.babycounter.businessObjects.Measurement;
import adamtworz.babycounter.management.HibernateMeausermentManager;


public class App 
{
    public static void main( String[] args )
    {
    	SessionFactory factory = new Configuration().configure()
    			.buildSessionFactory();
		
		Session session = factory.openSession();
        
        
        
        HibernateMeausermentManager mm = new HibernateMeausermentManager(session);

        mm.add("2012-01-01 10:00", 20, 3.5);
        mm.add("2012-01-07 10:00", 25, 5.5);
        
         
        List<Measurement> measurements = mm.getAll();
        
    	for(Measurement m :measurements)
		{
			System.out.println(m.print());
		}
        
    }
}
