package com.example.heksi.loginfirebase;

import java.util.ArrayList;
import java.util.List;

class ImageAssets {

    //membuat list array untuk pengelompokan leg
    private static List<Integer> legs =new ArrayList<Integer>() {
        {
            add(R.drawable.sat);
            add(R.drawable.elfari);
            add(R.drawable.dani);
        }
    };

    //method utk memanggil/mengambil variabel legs
    public static List<Integer> getLegs(){
        return legs;
    }

}
