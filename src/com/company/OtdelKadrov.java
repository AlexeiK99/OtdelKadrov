package com.company;

import java.util.ArrayList;
import java.util.List;

public class OtdelKadrov {
    private ArrayList<Sotrudnik> arrayList;

    OtdelKadrov() {
        arrayList = new ArrayList();
    }

    public Sotrudnik addSotrudnik(String name) {
        Sotrudnik sotrudnik = new Sotrudnik(arrayList.size(), name, -1);
        arrayList.add(sotrudnik);
        return sotrudnik;
    }

    private Sotrudnik getSotrudnikByID(int ID){
        for (Sotrudnik s:arrayList) {
            if(s.getID()==ID){
                return s;
            }
        }
        return null;
    }

    public List getAllManager(Sotrudnik sotrudnik){
        if(sotrudnik.getIdManager()==-1){
            return new ArrayList();
        }
        Sotrudnik manager = getSotrudnikByID(sotrudnik.getIdManager());
        List result = getAllManager(manager);
        result.add(manager);
        return result;
    }

    public List getAllSotrudnik(){
        return arrayList;
    }

    public Sotrudnik findByName(String name) {
        for (Sotrudnik s : arrayList) {
            if (s.getName().equals(name)) {
                return s;
            }
        }
//        for(int i = 0 ; i < arrayList.size();i++){
//           if(arrayList.get(i).getName().equals(name)){
//               return arrayList.get(i);
//           }
//        }
        return null;
    }

}
