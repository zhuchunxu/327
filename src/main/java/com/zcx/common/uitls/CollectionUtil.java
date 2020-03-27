package com.zcx.common.uitls;

import java.util.Collection;

/**
 * 
 * @ClassName: CollectionUtil 
 * @Description: 集合工具类
 * @author: 念念不忘
 * @date: 2020年3月26日 上午10:45:58
 */
public class CollectionUtil {
	/**
	 * 
	 * @Title: hasValue 
	 * @Description: 判断集合是否有值
	 * @return
	 * @return: boolean
	 */
	public static boolean isEmpty(Collection<?> collection ) {
		return collection==null || collection.isEmpty();
	}
}
