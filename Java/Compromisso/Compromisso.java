public class Compromisso{
    private String descrição;
    private Relogio horario;
    
    Compromisso(String descrição, int hora, int minutos){
        this.descrição = descrição;
        this.horario = new Relogio(hora,minutos);
    }
    void setHorario(Relogio horario){
        this.horario = horario;
    }
    void setDescrição(String descrição){
        this.descrição = descrição;
    }
    Relogio getHorario(){
        return this.horario;
    }
    
    public boolean equals(Object obj){
        if (this == obj) return true;
        if (!(obj instanceof Compromisso)) return false;
        Compromisso comp = (Compromisso) obj;
        return this.descrição.equals(comp.descrição);
    }
    @Override
    public String toString(){
        return "Compromisso: "+ this.descrição + "\nHorário: "+ this.horario;
    }

}
