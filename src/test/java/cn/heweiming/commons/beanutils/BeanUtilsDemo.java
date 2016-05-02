package cn.heweiming.commons.beanutils;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.commons.beanutils.BeanUtils;
import org.junit.Test;

public class BeanUtilsDemo {

	@Test
	public void test01() throws IllegalAccessException,
			InvocationTargetException, NoSuchMethodException {
		Map<String, String> map = BeanUtils.describe(new Person());
		map.remove("class");
		
	}
	
	@Test
	public void testMap() throws IllegalAccessException, Exception, NoSuchMethodException{
		Person person = new Person();
		Map<String, String> map = BeanUtils.describe(person);
		for(String str: map.keySet()){
			System.out.println(str+"\t"+map.get(str));
		}
		List<Person> list = new ArrayList<Person>();
	}

}
