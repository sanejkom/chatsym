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
        this.map = new HashMap<>();
    }

    public void dodaj(ArrayList<String> pref, String suf) {
        ArrayList<String> values = map.get(pref);
        if (values == null) {
            values = new ArrayList<>();
            map.put(pref, values);
        }
        values.add(suf);
    }
}
