package com.spring;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        AbstractApplicationContext iocContainer = 
        		new ClassPathXmlApplicationContext("beans.xml");
      
        ChatRoom chatroom = (ChatRoom) iocContainer.getBean("chatroom");
        System.out.println("Chatroom is : "+ chatroom);
       
    }
}
