package model;

public class Sessao {

    private int id;
    private String horarioInicio;
    private String horarioFim;
    private int publico;

    public Sessao() {
    }

    public Sessao(String horarioInicio,
                   String horarioFim,
                   int publico) {

        this.horarioInicio = horarioInicio;
        this.horarioFim = horarioFim;
        this.publico = publico;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getHorarioInicio() {
        return horarioInicio;
    }

    public void setHorarioInicio(String horarioInicio) {
        this.horarioInicio = horarioInicio;
    }

    public String getHorarioFim() {
        return horarioFim;
    }

    public void setHorarioFim(String horarioFim) {
        this.horarioFim = horarioFim;
    }

    public int getPublico() {
        return publico;
    }

    public void setPublico(int publico) {
        this.publico = publico;
    }
}
