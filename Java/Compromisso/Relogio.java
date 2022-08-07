public final class Relogio {
   private int hora;
   private int minutos;

    void setMinutos(int m){
        if (m >= 0 && m <= 59) this.minutos = m;
        else this.minutos = 00;
    }
    void setHora(int h){
        if (h >= 0 && h <= 23) this.hora = h;
        else this.hora = 00;
    }
    Relogio(int hora,int minutos){
       setHora(hora);
       setMinutos(minutos);
   }
    @Override
    public String toString(){
        return this.hora + ":"+ this.minutos;
    }
   public boolean equals(Object obj){
        if (this == obj) return true;
        if (!(obj instanceof Relogio)) return false;
        Relogio rel = (Relogio) obj;
        return  this.hora == rel.hora && this.minutos == rel.minutos; 
    }

}