package com.zt.jdbc.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class RandomTime {
	public static Date randomDate(String beginDate,String  endDate ){  

		try {  

		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");  

		Date start = format.parse(beginDate);//���쿪ʼ����  

		Date end = format.parse(endDate);//�����������  

		//getTime()��ʾ������ 1970 �� 1 �� 1 �� 00:00:00 GMT ������ Date �����ʾ�ĺ�������  

		if(start.getTime() >= end.getTime()){  

		return null;  

		}  

		long date = random(start.getTime(),end.getTime());  

		return new Date(date);  

		} catch (Exception e) {  

		e.printStackTrace();  

		}  

		return null;  

		}  

		private static long random(long begin,long end){  

		long rtn = begin + (long)(Math.random() * (end - begin));  

		//������ص��ǿ�ʼʱ��ͽ���ʱ�䣬��ݹ���ñ������������ֵ  

		if(rtn == begin || rtn == end){  

		return random(begin,end);  

		}  

			return rtn;  
		}
		
		public static void main(String[] args) {
			Date randomDate=randomDate("2018-01-01","2018-05-12"); 
			System.out.println(randomDate);
		}
}