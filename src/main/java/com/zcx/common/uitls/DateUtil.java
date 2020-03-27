package com.zcx.common.uitls;
/**
 * 
 * @ClassName: DateUtil 
 * @Description: ���ڴ�����
 * @author: �����
 * @date: 2020��3��27�� ����8:56:16
 */

import java.util.Date;


public class DateUtil {

	/**
	 * 
	 * @Title: randomDate 
	 * @Description: �漴����һ������ڵ�����
	 * @param startDate
	 * @param endDate
	 * @return
	 * @return: Date
	 */
	public static Date randomDate(Date startDate ,Date endDate) {
		long start = startDate.getTime();//��1970��startDate�ĺ�����
		long end = endDate.getTime();//��1970��endDate�ĺ�����
		if(start>end) {
			throw new RuntimeException("��ʼ���ڲ��ܴ��ڽ�������");
		}
		//�������һ����start��end֮��ĺ�����
		long t = (long) ((Math.random()*(end-start+1))+start);
		Date date = new Date(t);
		return date;
	}
}
