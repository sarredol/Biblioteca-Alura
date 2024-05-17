package com.aluracursos.radioalura.modelos;

public class Audio {

    private String titulo;
    private  int totalDeReproducciones;

    private  int totalMegusta;
    private  int clasificacion;

    public void meGusta(){
        this.totalMegusta++;
    }

    public void reproduce(){
        this.totalDeReproducciones++;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getTotalDeReproducciones() {
        return totalDeReproducciones;
    }

    public void setTotalDeReproducciones(int totalDeReproducciones) {
        this.totalDeReproducciones = totalDeReproducciones;
    }

    public int getTotalMegusta() {
        return totalMegusta;
    }

    public void setTotalMegusta(int totalMegusta) {
        this.totalMegusta = totalMegusta;
    }

    public int getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(int clasificacion) {
        this.clasificacion = clasificacion;
    }
}
