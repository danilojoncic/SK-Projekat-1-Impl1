package org.raf;

import model.boljeRijesenje.Dogadjaj;
import model.boljeRijesenje.Raspored;

import java.util.HashMap;
import java.util.List;

public class StampacImp1 {
    private Raspored raspored;

    public StampacImp1(Raspored raspored) {
        this.raspored = raspored;
    }

    public void stampajImp1(){
        HashMap<String, List<Dogadjaj>> hm = raspored.getBozePomozi().get(4);
        for (String s : hm.keySet()) {
            System.out.println(s);
            for (Dogadjaj s1 : hm.get(s)) {
                System.out.println(s1);
            }
        }
    }
}