package com.example.mifta.miftah_1202150069_modul3;

import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class DaftarMenu extends AppCompatActivity {
    RecyclerView recv;
    adapter adptr;
    List<menulist> daftarmenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar_menu);
        //menset title
        setTitle("Daftar Air Mineral");

        //membuat array list baru dengan nama daftarmenu
        daftarmenu = new ArrayList<>();
        //mendapat penanganan recycler view
        recv = findViewById(R.id.rvmenu);
        recv.setHasFixedSize(true);
        //kondisi ketika orientasi menjadi landscape
        if(getResources().getConfiguration().orientation== Configuration.ORIENTATION_LANDSCAPE){
            //maka akan menampilkan 2 grid
            recv.setLayoutManager(new GridLayoutManager(DaftarMenu.this, 2));
            //jika orientasi menjadi portrait
        }else {
            //maka akan menampilkan satu grid saja
            recv.setLayoutManager(new GridLayoutManager(DaftarMenu.this, 1));
        }
        //menjalankan fungsi input data
        inputdata();
    }
    public void inputdata(){
        //memasukkan data ke dalam array
        daftarmenu.add(new menulist(R.drawable.ades, "Ades", "Ini adalah air mineral merk Ades."));
        daftarmenu.add(new menulist(R.drawable.amidis,"Amidis", "Ini adalah air mineral merk Amidis."));
        daftarmenu.add(new menulist(R.drawable.aqua, "Aqua", "Ini adalah air mineral merk Aqua."));
        daftarmenu.add(new menulist(R.drawable.cleo, "Cleo", "Ini adalah air mineral merk Cleo."));
        daftarmenu.add(new menulist(R.drawable.club, "Club", "Ini adalah air mineral merk Club."));
        daftarmenu.add(new menulist(R.drawable.equil, "Equil", "Ini adalah air mineral merk Equil."));
        daftarmenu.add(new menulist(R.drawable.evian, "Evian", "Ini adalah air mineral merk Evian."));
        daftarmenu.add(new menulist(R.drawable.leminerale, "leMinerale", "Ini adalah air mineral merk leMinerale."));
        daftarmenu.add(new menulist(R.drawable.nestle, "Nestle", "Ini adalah air mineral merk Nestle. "));
        daftarmenu.add(new menulist(R.drawable.pristine, "Pristine", "Ini adalah air mineral merk Pristine. "));
        daftarmenu.add(new menulist(R.drawable.vit, "Vit", "Ini adalah air mineral merk Vit."));
        //membuat adapter baru yang menghubungkan kelas ini dengan data yang ingin ditampilkan
        adptr = new adapter(this,daftarmenu);
        //menguhubungkan recycler view dengan adapter
        recv.setAdapter(adptr);
    }
}
