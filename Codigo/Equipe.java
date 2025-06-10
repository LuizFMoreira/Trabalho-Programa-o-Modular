package Codigo;

import java.util.List;

public class Equipe {
     private List<Estudante> membros;

     public Equipe(List<Estudante> membros) {
          this.membros = membros;
     }

     public List<Estudante> getMembros() {
          return membros;
     }
     

}
