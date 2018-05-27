package com.company;

public class Sotrudnik {
    private int ID;
    private String name;
    private int idManager;

    Sotrudnik(int ID, String name, int idManager) {
        this.ID = ID;
        this.name = name;
        this.idManager = idManager;
    }

    public void setManager(Sotrudnik manager)throws Exception{
        if(idManager!=-1){
            throw new Exception("Manager for " + name + " is already set");
        }
       idManager = manager.ID;
    }

    public int getIdManager() {
        return idManager;
    }

    public String getName() {
        return name;
    }

    public int getID() {
        return ID;
    }

    @Override
    public String toString() {
       return ID+"\t"+name+"\t"+idManager;
    }
}
