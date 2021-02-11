package com.example.tugas1.recycleview.models;

public class Buku {
    String Judul;
    String Warna;

    public Buku(String judul, String warna, String harga) {
        Judul = judul;
        Warna = warna;
        Harga = harga;
    }

    String Harga;

    public String getJudul() {
        return Judul;
    }

    public void setJudul(String judul) {
        Judul = judul;
    }

    public String getWarna() {
        return Warna;
    }

    public void setWarna(String warna) {
        Warna = warna;
    }

    public String getHarga() {
        return Harga;
    }

    public void setHarga(String harga) {
        Harga = harga;
    }
}
