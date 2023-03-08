package listener;

import java.sql.SQLException;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import utils.DBUtils;

/**
 * Application Lifecycle Listener implementation class MyJspListner
 *
 */
@WebListener
public class MyJspListner implements ServletContextListener {

	public void contextDestroyed(ServletContextEvent sce) {
		System.out.println("------contextDestroyed------");

	}

	/**
	 * @see ServletContextListener#contextInitialized(ServletContextEvent)
	 */
	public void contextInitialized(ServletContextEvent sce) {

		System.out.println("---contextInitialized-----");
		try {
			DBUtils.openConnection();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
