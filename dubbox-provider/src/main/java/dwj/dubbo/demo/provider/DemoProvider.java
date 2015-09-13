package dwj.dubbo.demo.provider;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoProvider {
	
	
	 public static void main(String[] args) throws IOException {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext( "classpath:dubbo-demo-provider.xml");
		context.start();
		System.out.println("服务已经启动...");
		System.in.read();
	}
	 
}
