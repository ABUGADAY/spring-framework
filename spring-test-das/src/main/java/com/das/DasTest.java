package com.das;

import com.das.config.ApplicationConfig;
import com.das.service.IndexService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DasTest {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(ApplicationConfig.class);
		System.out.println(annotationConfigApplicationContext.getBean(IndexService.class));
	}
}
