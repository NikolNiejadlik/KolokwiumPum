package com.example.student.rejestracjawizyt;

/**
 * Created by student on 2018-01-17.
 */

public class Lekarz {

    private String nazwisko;
    private String specjalizacja;

    public Lekarz(String nazwisko, String specjalizacja){
        this.nazwisko=nazwisko;
        this.specjalizacja=specjalizacja;
    }
    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public String getSpecjalizacja() {
        return specjalizacja;
    }

    public void setSpecjalizacja(String specjalizacja) {
        this.specjalizacja = specjalizacja;
    }


}
