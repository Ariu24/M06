package com.iticbcn.hibernate.model;

package com.iticbcn.hibernate.model;


import java.io.Serializable;
import java.time.LocalDate;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="autors")

public class Autors implements Serializable {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int idAutor;
    @Column(name="emp_no")
    private int numeroEmpleat;
    @Column(name="birth_date")
    private LocalDate DataNaixement;
    @Column(name="first_name")
    private String nom;
    @Column(name="last_name")
    private String cognoms;
    @Column(name="gender")
    private char genere;
    @Column(name="hire_date")
    private LocalDate dataAlta;
    
    public empleats(LocalDate dataNaixement, String nom, String cognoms, char genere, LocalDate dataAlta) {
        this.DataNaixement = dataNaixement;
        this.nom = nom;
        this.cognoms = cognoms;
        this.genere = genere;
        this.dataAlta = dataAlta;
    }
}
