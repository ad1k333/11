package com.company;

public class Kamni {
    public String setCena;
    private String nazvanie;
    private int cena, kolichestvo;
    private double karat;
    private boolean ogranennyi;

    public Kamni(String nazvanie, int cena, int kolichestvo, double karat, boolean ogranennyi) {
        this.nazvanie = nazvanie;
        this.cena = cena;
        this.kolichestvo = kolichestvo;
        this.karat = karat;
        this.ogranennyi = ogranennyi;
    }

    public String getNazvanie() {
        return nazvanie;
    }

    public void setNazvanie(String nazvanie) {
        this.nazvanie = nazvanie;
    }

    public int getCena() {
        return cena;
    }

    public void setCena(int cena) {
        this.cena = cena;
    }

    public int getKolichestvo() {
        return kolichestvo;
    }

    public void setKolichestvo(int kolichestvo) {
        this.kolichestvo = kolichestvo;
    }

    public double getKarat() {
        return karat;
    }

    public void setKarat(double karat) {
        this.karat = karat;
    }

    public boolean isOgranennyi(boolean b) {
        return ogranennyi;
    }

    public void setOgranennyi(boolean ogranennyi) {
        this.ogranennyi = ogranennyi;}

    @Override
    public String toString() {
        return "Kamni{" +
                "nazvanie='" + nazvanie + '\'' +
                ", cena=" + cena +
                ", kolichestvo=" + kolichestvo +
                ", karat=" + karat +
                ", ogranennyi=" + ogranennyi +
                '}';
    }
}
