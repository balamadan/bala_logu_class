package com.example.basic;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class ClassA implements InitializingBean, DisposableBean, BeanNameAware, BeanFactoryAware, ApplicationContextAware{

    private String messageA;

    public ClassA() {
        System.out.println("ClassA: default constructor called.");
    }

    public void customInitMethod(){
        System.out.println("ClassA: customInitMethod() method called.");
    }

    public void customDestroyMethod(){
        System.out.println("ClassA: customDestroyMethod() method called.");

    }

    public String getMessageA() {
        System.out.println("ClassA: message get method called.");
        return messageA;
    }

    public void setMessageA(String message) {
        System.out.println("ClassA: message set method called.");
        this.messageA = message;
    }

    public void afterPropertiesSet() throws Exception {
        System.out.println("ClassA: afterPropertiesSet() called because InitializingBean interface.");
    }

    public void destroy() throws Exception {
        System.out.println("ClassA: destroy() called because DisposableBean interface.");
    }

    public void setApplicationContext(ApplicationContext arg0)
            throws BeansException {
        System.out.println("ClassA: application context set: " + arg0.getApplicationName());
    }

    public void setBeanFactory(BeanFactory arg0) throws BeansException {
        System.out.println("ClassA: beanFacrory set.");
    }

    public void setBeanName(String arg0) {
        System.out.println("ClassA: bean name set: " + arg0);
    }

}/*public class ClassA implements InitializingBean, DisposableBean, BeanNameAware, BeanFactoryAware, ApplicationContextAware{

    private String messageA;

    public ClassA() {
        System.out.println("ClassA: default constructor called.");
    }

    public void customInitMethod(){
        System.out.println("ClassA: customInitMethod() method called.");
    }

    public void customDestroyMethod(){
        System.out.println("ClassA: customDestroyMethod() method called.");

    }

    public String getMessageA() {
        System.out.println("ClassA: message get method called.");
        return messageA;
    }

    public void setMessageA(String message) {
        System.out.println("ClassA: message set method called.");
        this.messageA = message;
    }

    public void afterPropertiesSet() throws Exception {
        System.out.println("ClassA: afterPropertiesSet() called because InitializingBean interface.");
    }

    public void destroy() throws Exception {
        System.out.println("ClassA: destroy() called because DisposableBean interface.");
    }

    public void setApplicationContext(ApplicationContext arg0)
            throws BeansException {
        System.out.println("ClassA: application context set: " + arg0.getApplicationName());
    }

    public void setBeanFactory(BeanFactory arg0) throws BeansException {
        System.out.println("ClassA: beanFacrory set.");
    }

    public void setBeanName(String arg0) {
        System.out.println("ClassA: bean name set: " + arg0);
    }

}*/
