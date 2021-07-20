package kh.spring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import kh.spring.beans.Person;

public class Main {
	public static void main(String[] args) {
		
		ApplicationContext ctx = new GenericXmlApplicationContext("context.xml");
		Person p = ctx.getBean(Person.class);
		
		System.out.println(p.getContact());
		
//		System.out.println(p.getId());
//		System.out.println(p.getName());
//		System.out.println(p.getContacts().get(0));
//		System.out.println(p.getContacts().get(1));
		
	}

}
