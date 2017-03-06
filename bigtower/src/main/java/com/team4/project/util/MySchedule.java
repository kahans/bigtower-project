package com.team4.project.util;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class MySchedule {
	@Scheduled(cron = "*/10 * * * * *") // 5초 간격 실행
	public void updateUrbanServiceArea() {
		java.util.Calendar calendar = java.util.Calendar.getInstance();
		java.text.SimpleDateFormat dateFormat = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		//System.out.println("현재 시각: " + dateFormat.format(calendar.getTime()));
	}
}
