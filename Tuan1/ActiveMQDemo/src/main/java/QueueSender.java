import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import java.util.Scanner;

import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.Destination;
import javax.jms.Message;
import javax.jms.MessageProducer;
import javax.jms.Session;
import javax.naming.Context;
import javax.naming.InitialContext;
import org.apache.log4j.BasicConfigurator;
import data.Person;
import helper.XMLConvert;

public class QueueSender {
	public static void main(String[] args) throws Exception {
	
		Scanner sc = new Scanner(System.in);
		
		
//config environment for JMS
		BasicConfigurator.configure();
//config environment for JNDI
		Properties settings = new Properties();
		settings.setProperty(Context.INITIAL_CONTEXT_FACTORY, "org.apache.activemq.jndi.ActiveMQInitialContextFactory");
		settings.setProperty(Context.PROVIDER_URL, "tcp://localhost:61616");
//create context
		Context ctx = new InitialContext(settings);
//lookup JMS connection factory
		ConnectionFactory factory = (ConnectionFactory) ctx.lookup("ConnectionFactory");
//lookup destination. (If not exist-->ActiveMQ create once)
		Destination destination = (Destination) ctx.lookup("dynamicQueues/thanthidet");
//get connection using credential
		Connection con = factory.createConnection("admin", "admin");
//connect to MOM
		con.start();
//create session
		Session session = con.createSession(/* transaction */false, /* ACK */Session.AUTO_ACKNOWLEDGE);
//create producer
		MessageProducer producer = session.createProducer(destination);
//create text message
		
		System.out.println("Nhap x de thoat");
		String input = sc.nextLine();
		
		while(!input.equalsIgnoreCase("x")) {
			Message msg = session.createTextMessage(input);
			producer.send(msg);
			input = sc.nextLine();
		}
		
//		System.out.printf("Nhap mssv : ");
//		long mssv = sc.nextLong();
//		
//		sc.nextLine();
//		System.out.printf("Nhap ho ten : ");
//		String hoten = sc.nextLine();
//		System.out.printf("Nhap ngay sinh : ");
//		String date = sc.nextLine();
//		Date ngaysinh = new SimpleDateFormat("dd/MM/yyyy").parse(date);  
//		
//		Message msg = session.createTextMessage("hello mesage from ActiveMQ");
//		producer.send(msg);
//		Person p = new Person(mssv, hoten, ngaysinh);
//		String xml = new XMLConvert<Person>(p).object2XML(p);
//		msg = session.createTextMessage(xml);
//		producer.send(msg);
////shutdown connection
//		session.close();
//		con.close();
//		System.out.println("Finished...");

	}
}