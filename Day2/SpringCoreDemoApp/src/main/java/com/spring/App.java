package com.spring;

import java.util.Map;
import java.util.Set;

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
        /**
        Double amount  = 0D;
        Item item = (Item)iocContainer.getBean("item_2");
        System.out.println(item);
        
        Order order = (Order) iocContainer.getBean("order_3");
        System.out.println("Order is : "+ order);
        
       Map<String,Order> orderMap = iocContainer.getBeansOfType(com.spring.Order.class);
       Set<String> keyset = orderMap.keySet();
      
       for(String key : keyset) {
    	   amount = amount + orderMap.get(key).getItem().getValue();
       }
       System.out.println(amount);
       */
        
        
        Order order = (Order) iocContainer.getBean("order_1");
        System.out.println("Order is : "+ order);
        
        Order order2 = (Order) iocContainer.getBean("order_1");
        System.out.println("Order is : "+ order2);
       
    }
}
