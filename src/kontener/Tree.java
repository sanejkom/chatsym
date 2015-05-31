/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kontener;

import java.util.ArrayList;

/**
 *
 * @author Mateusz
 */
public class Tree {

    private Node head;

    public void Tree() {
        head = null;
    }

    public static class Node {

        public ArrayList<String> prefiks;
        public ArrayList<String> sufiksy;
        int liczbaWyst;
        Node lewy;
        Node prawy;

        Node(Node t, ArrayList<String> pref, String suf) {
            this.prefiks = pref;
            this.sufiksy.add(suf);
            this.liczbaWyst = 1;
            this.lewy = null;
            this.prawy = null;
        }
    }

    public void dodaj(ArrayList<String> pref, String suf) {
        head = dodaj(head, pref, suf);
    }

    private Node dodaj(Node t, ArrayList<String> pref, String suf) {
        if (t == null) {
            Node n = new Node(t, pref, suf);
            return n;
        } else {
            //boolean a = true;
            int j = 0;
            for (int i = 0; i < pref.size(); i++) {
                //if(!pref.get(i).equals(t.prefiks.get(i)))
                //    a = false;
                j = pref.get(i).compareTo(t.prefiks.get(i));
                if (j != 0) {
                    break;
                }
            }

            if (j > 0) {
                dodaj(t.prawy, pref, suf);
            } else if (j < 0) {
                dodaj(t.lewy, pref, suf);
            } else {
                t.sufiksy.add(suf);
                t.liczbaWyst++;
            }
        }
    }

    private Node szukaj(Node t, ArrayList<String> pref) {
        int j = 0;
        for (int i = 0; i < pref.size(); i++) {
            j = pref.get(i).compareTo(t.prefiks.get(i));
            if (j != 0) {
                break;
            }
        }

        if (j > 0) {
            szukaj(t.prawy, pref);
        } else if (j < 0) {
            szukaj(t.lewy, pref);
        } else {
            return t;
        }
    }
}
