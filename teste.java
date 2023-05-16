/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package muitos.para.muitos;

/**
 *
 * @author Gui
 */
public class teste {

    public static void main(String args[]) {
        
     Aluno aluno = new Aluno();
     
     
      Nomes nome = new Nomes();
      nome.setAlunoNome("Guilherme");
      
      Nomes nome2 = new Nomes();
      nome2.setAlunoNome("fernando");
      
      Nomes nome3 = new Nomes();
      nome3.setAlunoNome("Marcelo");
      
      Nomes[] nomes = new Nomes[3];
      nomes[0] = nome;
      nomes[1] = nome2;
      nomes[2] = nome3;
      
      aluno.setNomes(nomes);
      
     
      Diciplinas disciplina = new Diciplinas();
      disciplina.setNomeDisciplina("Matematica");
      
      Diciplinas disciplina2 = new Diciplinas();
      disciplina2.setNomeDisciplina("Fisica");
      
      Diciplinas disciplina3 = new Diciplinas();
      disciplina3.setNomeDisciplina("Historia");
      
      Diciplinas[] diciplinas = new Diciplinas[3];
      diciplinas[0] = disciplina;
      diciplinas[1] = disciplina2;
      diciplinas[2] = disciplina3;
      
      aluno.setDiciplinas(diciplinas);
      
      
      if(aluno != null && aluno.getNomes() != null){
         for (Nomes n : aluno.getNomes()){
             System.out.println(n.getAlunoNome());
         }
     }
      
      
     if(aluno != null && aluno.getDiciplinas() != null){
         for (Diciplinas d : aluno.getDiciplinas()){
             System.out.println(d.getNomeDisciplina());
         }
     }
     
        
        
    }
}
