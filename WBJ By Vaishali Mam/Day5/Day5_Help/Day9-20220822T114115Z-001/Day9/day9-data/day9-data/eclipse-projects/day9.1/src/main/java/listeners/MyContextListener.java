package listeners;

import java.sql.SQLException;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import utils.DBUtils;

/**
 * Application Lifecycle Listener implementation class MyContextListener
 *
 */
@WebListener
public class MyContextListener implements ServletContextListener {

	/**
	 * Default constructor.
	 */
	public MyContextListener() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see ServletContextListener#contextDestroyed(ServletContextEvent)
	 */
	public void contextDestroyed(ServletContextEvent sce) {

		try {
			System.out.println("in ctx destroyed");
			DBUtils.closeConnection();
		} catch (SQLException e) {
			System.out.println("err in ctx destroyed " + e);
		}
	}

	/**
	 * @see ServletContextListener#contextInitialized(ServletContextEvent)
	 */
	public void contextInitialized(ServletContextEvent sce) {
		try {
			System.out.println("in ctx inited");
			DBUtils.openConnection();
		} catch (SQLException e) {
			System.out.println("err in ctx inited " + e);
		}
	}

}
