package com.iticbcn.hibernate.model;

import java.io.Serializable;

public class tasks implements Serializable{
    private int idTask;
    private String descTask;
    private int numHours;
    private boolean finalitzada;
    
    public tasks(){}
    
    public tasks(String descTask, int numHours, boolean finalitzada) {
        this.descTask = descTask;
        this.numHours = numHours;
        this.finalitzada = finalitzada;
    }

    public int getIdTask() {
        return idTask;
    }

    public void setIdTask(int idTask) {
        this.idTask = idTask;
    }

    public String getDescTask() {
        return descTask;
    }

    public void setDescTask(String descTask) {
        this.descTask = descTask;
    }

    public int getNumHours() {
        return numHours;
    }

    public void setNumHours(int numHours) {
        this.numHours = numHours;
    }

    public boolean isFinalitzada() {
        return finalitzada;
    }

    public void setFinalitzada(boolean finalitzada) {
        this.finalitzada = finalitzada;
    }

    @Override
    public String toString() {
        return "tasks [idTask=" + idTask + ", descTask=" + descTask 
        + ", numHours=" + numHours + ", finalitzada=" + finalitzada + "]";
    } 

}