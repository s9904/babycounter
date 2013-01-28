package adamtworz.babycounter.management;

import java.util.List;

import org.hibernate.Session;

import adamtworz.babycounter.businessObjects.Measurement;



public class HibernateMeausermentManager {
	Session session;
	public HibernateMeausermentManager(Session session) {
		this.session=session;
	}
	public void add(String date, int length, double weight) {
		Measurement measurement = new Measurement();
	      
        measurement.setDate(date);
        measurement.setLength(length);
        measurement.setWeight(weight);

        session.beginTransaction();
        session.save(measurement);
        session.getTransaction().commit();

      
	}
	public List<Measurement> getAll() {
		List<Measurement> result =
				session.createQuery("from Measurement")
				.list();
		return result;
	}

	
}
