package com.citi.xz16303.learn.HelloWorld;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sun.org.apache.bcel.internal.generic.NEW;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//    	ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");    	 
//        HelloWorld obj = (HelloWorld) context.getBean("helloWorld"); 
//        obj.printMessage();
        
        try {
			FileReader fileReader = new FileReader("demo.txt");
			BufferedReader bf = new BufferedReader(fileReader);
			String line;
			while ((line = bf.readLine()) != null) {
				System.out.println("before:"+line);
//				line = line.replace('I', 'A');
				line = line.replaceAll("\\\\", "/");
				System.out.println(line);
				
			}
			bf.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}
