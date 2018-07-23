package com.bittech.springcore.xml;

import com.bittech.springcore.common.Shape;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Author: secondriver
 * Created: 2018/7/9
 */
public class XmlApplication {
    
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("application-context.xml");
        
        XmlShapeCompute xmlShapeCompute = (XmlShapeCompute) context.getBean("xmlShapeCompute");
        
        Shape shape = xmlShapeCompute.computeShape(args[0]);
        System.out.println(shape);
        
    }
}
