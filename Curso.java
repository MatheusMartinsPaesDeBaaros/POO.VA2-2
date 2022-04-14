class Curso {

  String nome;
  Disciplina disciplina1 = new Disciplina();
  Disciplina disciplina2 = new Disciplina();
  Disciplina disciplina3 = new Disciplina();
  float calcularMedia;





  float calcularMedia(float dis1, float dis2, float dis3){

        calcularMedia = (dis1 + dis2 + dis3)/3;


    return calcularMedia;        
    
  }
  
}