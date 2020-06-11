/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import java.sql.Connection;

public class HibernateUtil {

    private Session currentSession;
    private Transaction currentTransaction;
    private static ServiceRegistry serviceRegistry;
    private static String mainConfiguration;
    private static SessionFactory sessionFactory;
    
    public static void OpenConnection(String configurationPath){
        mainConfiguration = configurationPath;
        setSessionFactory(mainConfiguration);
    }
    
    public static void CloseConnection(){
        sessionFactory.close();
        StandardServiceRegistryBuilder.destroy(serviceRegistry);
     
    }


    public static String getMainConfiguration(){
        return mainConfiguration;
    }
    
    public static ServiceRegistry getServiceRegistry() {
        return HibernateUtil.serviceRegistry;
    }
    
    private static void setSessionFactory(String pathConfiguration) {
        Configuration configuration = new Configuration().configure(pathConfiguration);
        serviceRegistry = new StandardServiceRegistryBuilder().configure().loadProperties(pathConfiguration).build();
         sessionFactory = configuration.buildSessionFactory(serviceRegistry);
    }
        
    public Session openCurrentSession() {
        currentSession = sessionFactory.openSession();
        return currentSession;
    }

    public Session openCurrentSessionwithTransaction() {
        currentSession = sessionFactory.openSession();
        currentTransaction = currentSession.beginTransaction();
        return currentSession;
    }

    public void closeCurrentSession() {
        currentSession.close();
    }

    public void closeCurrentSessionWithTransaction() {
        currentTransaction.commit();
        currentSession.close();
    }

    public Session getCurrentSession() {
        return currentSession;
    }

    public Transaction getCurrentTransaction() {
        return currentTransaction;
    }
}
