package com.zcx.common.uitls;
/**
 * 
 * @ClassName: DateUtil 
 * @Description: 日期处理类
 * @author: 念念不忘
 * @date: 2020年3月27日 上午8:56:16
 */

import java.util.Date;


public class DateUtil {

	/**
	 * 
	 * @Title: randomDate 
	 * @Description: 随即产生一个间隔内的日期
	 * @param startDate
	 * @param endDate
	 * @return
	 * @return: Date
	 */
	public static Date randomDate(Date startDate ,Date endDate) {
		long start = startDate.getTime();//从1970到startDate的毫秒数
		long end = endDate.getTime();//从1970到endDate的毫秒数
		if(start>end) {
			throw new RuntimeException("开始日期不能大于结束日期");
		}
		//随机产生一个在start和end之间的毫秒数
		long t = (long) ((Math.random()*(end-start+1))+start);
		Date date = new Date(t);
		return date;
	}
}
