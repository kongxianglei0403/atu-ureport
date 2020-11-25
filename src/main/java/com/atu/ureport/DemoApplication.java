package com.atu.ureport;

import com.bstek.ureport.console.UReportServlet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ImportResource;

@ImportResource("classpath:context.xml")
@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}


	/**
	 *    "/ureport/*"  固定写法
	 * @return
	 */
	@Bean
	public ServletRegistrationBean buildUreportServlet(){
		return new ServletRegistrationBean(new UReportServlet(),"/ureport/*");
	}
}
