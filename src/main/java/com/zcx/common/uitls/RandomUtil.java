package com.zcx.common.uitls;

import java.util.HashSet;
import java.util.Random;

/**
 * 
 * @ClassName: RandomUtil 
 * @Description: ���������
 * @author: �����
 * @date: 2020��3��26�� ����8:54:31
 */
public class RandomUtil {
	//����1������min-max֮����������������min��maxֵ�������緵��1-3֮������������ô����1��2��3������ȷ�ģ�����4�Ͳ��ԡ� (5��)
	public static int random(int min, int max){
		Random r = new Random();
		int i = r.nextInt(max - min + 1)+min;//���ڵ���0,С��max
		return i;
	}
	//����2������Сֵmin�����ֵmax֮���ȡsubs�����ظ����������������1-10֮��ȡ3�����ظ������������ô[2,6,9]�ǶԵģ�[3,5,5]�򲻶ԣ���Ϊ5�ظ��ˡ�Ӧ�ó�������100ƪ���������ȡ10ƪ���£��¿����ܻ�ʹ�õ��� (8��)
	public static int[] subRandom (int min, int max, int subs){
		if(subs>max-min+1) {
			throw new RuntimeException("sbus�������Ϸ�");
		}
		int [] x =new  int[subs];
		HashSet<Integer> set = new HashSet<Integer>();
		while(set.size()!=subs) {
			set.add(random(min, max));
		}
		
		int i=0;
		for (Integer integer : set) {
			x[i]=integer;
			i++;
		}
		
		return x;
	}
	//����3������1��1-9,a-Z֮�������ַ��� (8��)
	public static char randomCharacter (){
		String string="123456789qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGGHJKLZXCVBNM";
		char c = string.charAt(random(0, 35));
		return c;
	
	}
	//����4�����ز���length���ַ���(5��)�������ڲ�Ҫ����randomCharacter()���� (4��)
	public static String randomString(int length){
		StringBuffer s = new StringBuffer();
		for (int i = 0; i < length; i++) {
			s.append(randomCharacter());
		}
		return s.toString();
	}


}
