package com.lby.xxx;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		
		String[] strings = { "12", "14", "15" };
		Integer[] is = { 1, 3, 4, 5 };
		Test test = new Test();
		String[] strings2 = test.addValue(strings, 1, "13");
		Integer[] is1 = test.addValue(is, 1, 2);
		
		for (int i = 0; i < strings2.length; i++) {
			System.out.println(strings2[i]);
		}
		
		for (int i = 0; i < is1.length; i++) {
			System.out.println(is1[i]);
		}

	}

	// ��String����ָ��λ�ã����Ԫ��
	public String[] addValue(String[] strings, int i, String s) {

		List<String> list = new ArrayList<String>();
		//����ת��Ϊ���ϣ�����ת���ļ��ϳ��Ȳ��ܱ仯�������¼������棩
		List<String> asList = Arrays.asList(strings);
		for (String s1 : asList) {
			list.add(s1);
		}
		list.add(i, s);
		String[] s2 = new String[list.size()];
		//����ת��Ϊ����
		list.toArray(s2);
		return s2;
	}

	// ��Integer����ָ��λ�ã����Ԫ��
	public Integer[] addValue(Integer[] integers, int i, int s) {

		List<Integer> list = new ArrayList<Integer>();
		List<Integer> asList = Arrays.asList(integers);
		for (int s1 : asList) {
			list.add(s1);
		}
		list.add(i, s);
		Integer[] s2 = new Integer[list.size()];
		list.toArray(s2);
		return s2;
	}

}
