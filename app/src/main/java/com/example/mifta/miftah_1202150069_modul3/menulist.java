package com.example.mifta.miftah_1202150069_modul3;


public class menulist {
    //deklarasi variable yang akan digunakan
    int gambar;
    String nama;
    String desc;

    //method setter
    public menulist(int gambar, String nama, String desc){
        this.gambar=gambar;
        this.nama=nama;
        this.desc=desc;
    }

    //method mengambil gambar
    public int getGambar() {
        return gambar;
    }

    //method mengambil nama
    public String getNama() {
        return nama;
    }

    //method mengambil deskripsi
    public String getDesc() {
        return desc;
    }
}