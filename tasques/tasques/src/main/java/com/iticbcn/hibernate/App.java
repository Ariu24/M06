package com.iticbcn.hibernate;


import org.hibernate.SessionFactory;

import com.iticbcn.hibernate.model.empleats;

import java.time.LocalDate;
import java.time.Month;

import org.hibernate.Session;

public class App 
{
    public static void main( String[] args )
    {
        SessionFactory sesion = HibernateUtil.getSessionFactory();

        Session session = sesion.openSession();

        session.beginTransaction();

        empleats e = new empleats(LocalDate.of(1970, Month.APRIL,3),"Pere" ,"Martinez", 'M',LocalDate.now());

        System.out.println(e);

        session.persist(e);

        //commit y cierre de sesion

        session.getTransaction().commit();

        session.close();

    }
}

