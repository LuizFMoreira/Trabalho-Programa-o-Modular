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

     public void addMembros(Estudante e){
          membros.add(e);
     }
     public void removeMembro(Estudante e){
          for(Estudante a: membros){
               if(a.getMatricula().equals(e.getMatricula())){
                    membros.remove(a);
               }
          }
     }

}
