/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kontener;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author Mateusz
 */
public class Kontener {

    public HashMap<ArrayList<String>, ArrayList<String>> map;

    public Kontener() {
        map = new HashMap<>();
    }

    public void dodaj(ArrayList<String> pref, String suf) {
        ArrayList<String> values = map.get(pref);
        if (values == null) {
            values = new ArrayList<String>();
            map.put(pref, values);
        }
        map.get(pref).add(suf);
        //System.out.println("-----prefiks: "+pref+"\n");
        //System.out.println("-----values: "+map.get(pref)+"\n");
        //System.out.println("-----entryset: "+map.entrySet()+"\n");
        //values.add(suf);
    }
}
