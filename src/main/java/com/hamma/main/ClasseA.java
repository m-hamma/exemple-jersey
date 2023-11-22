package com.hamma.main;

import java.util.Objects;

public final record ClasseA (String nom, String prenom){
   public ClasseA (String nom,String prenom) {
        this.nom = nom;
        this.prenom = prenom;
   }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ClasseA classeA = (ClasseA) o;
        return Objects.equals(nom, classeA.nom) && Objects.equals(prenom, classeA.prenom);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nom, prenom);
    }

    @Override
    public String nom() {
        return nom;
    }

    @Override
    public String prenom() {
        return prenom;
    }
}
