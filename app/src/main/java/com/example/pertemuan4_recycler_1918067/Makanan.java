package com.example.pertemuan4_recycler_1918067;

public class Makanan {
    private int logo;
    public Makanan(String nama, String rasa, String harga, int logo) {
        this.nama = nama;
        this.rasa = rasa;
        this.harga = harga;
        this.logo = logo;
    }

    private String nama, rasa, harga;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getRasa() {
        return rasa;
    }

    public void setRasa(String rasa) {
        this.rasa = rasa;
    }

    public String getHarga() {
        return harga;
    }

    public void setHarga(String harga) {
        this.harga = harga;
    }

    public int getLogo() {
        return logo;
    }

    public void setLogo(int logo) {
        this.logo = logo;
    }
}


