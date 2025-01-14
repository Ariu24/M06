package com.iticbcn.hibernate;

import org.hibernate.SessionFactory;
import org.hibernate.Session;
import com.iticbcn.hibernate.model.*;
public class Main 
{
    public static void main( String[] args )
    {
        // es crea la sessio
        SessionFactory sesionFactor = HibernateUtil.getSessionFactory();
        //s'obre la sessio
        Session session = sesionFactor.openSession();
        // quan es fa un insert update o delete aixì es pot fer un rollback
        session.beginTransaction();
        tasks t1 = new tasks("Assistir al rotllo del Toni", 1,true);
        session.persist(t1);
        System.out.println("Hola desde Hibernate");
        //un commit per assegurar l'accio 
        session.getTransaction().commit();

        session.close();

    }
}