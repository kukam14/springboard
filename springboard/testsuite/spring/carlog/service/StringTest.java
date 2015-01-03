package spring.carlog.service;

import org.apache.commons.lang.StringUtils;

public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringTest test =  new StringTest() ;
		test.arrayTest() ;
		
	}
	
	public void subStrTest() {
		String str = "암사동 SK 셀프주유소 - 1678원" ;
		System.out.println(StringUtils.substringBefore(StringUtils.substringAfterLast(str, "-"),"원").trim()) ;
	}
	
	public void arrayTest() {
		String[] refuel = {"abc", "def", "" } ;
		System.out.println(refuel.length);
	}

}
