package tester;
import static utils.HibernateUtils.getSf;
import org.hibernate.*;

public class TestHibernate {

	public static void main(String[] args) {
		try(SessionFactory sf=getSf())
		{
			System.out.println("hib up n running....."+sf);
		}  //sf.close() => cleaning up db cn pool !
		catch (Exception e) {
			e.printStackTrace();
		}

	}

}
