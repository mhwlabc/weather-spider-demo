package com.example.demo;

import com.example.controller.WeatherController;
import com.example.vo.WeatherResponse;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

	private static final Logger logger = LoggerFactory.getLogger(DemoApplicationTests.class);

	@Autowired
	private WeatherController weatherController;

	@Test
	public void contextLoads() {
		//输出有乱码问题
		WeatherResponse response = weatherController.getReportByCityId("101010100");
		logger.info(">>> "+response);

		System.out.println("\r\n");

		WeatherResponse response1 = weatherController.getReportByCityName("北京");
		logger.info(">>> "+response1);
	}

}
