package com.zcx.common.uitls;

import java.util.Collection;

/**
 * 
 * @ClassName: CollectionUtil 
 * @Description: ���Ϲ�����
 * @author: �����
 * @date: 2020��3��26�� ����10:45:58
 */
public class CollectionUtil {
	/**
	 * 
	 * @Title: hasValue 
	 * @Description: �жϼ����Ƿ���ֵ
	 * @return
	 * @return: boolean
	 */
	public static boolean isEmpty(Collection<?> collection ) {
		return collection==null || collection.isEmpty();
	}
}
