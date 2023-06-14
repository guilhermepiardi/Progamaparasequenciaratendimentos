package classes;


import javax.swing.JOptionPane;

public class  Pilha1 {
    //Declarando os atributos da classe
   public static int topo;
   public static int tamanho;
   public static Object vetor[];
    
     public static void Pilha1(){
        topo = -1; //Marca que a pilha está vazia
        tamanho = 1000;
        vetor = new Object[1000];
    }
    public static boolean vazia(){
        if (topo == -1)
            return true;
        else
            return false;
    }
    public static boolean cheia(){
        if(topo == tamanho -1)
            return true;
        else
            return false;
    }
    public static void empilhar(Object elem){
        if (cheia() == false){
            topo++;
            vetor[topo]=elem;
        }
        else{
            JOptionPane.showMessageDialog(null, 
                    "PILHA CHEIA!");
        }
    }
    public static Object desempilhar(){
        Object valorDesempilhado;
        if(vazia() == true){
            valorDesempilhado = "Pilha Vazia";
        }
        else{
            valorDesempilhado = vetor[topo]; 
            topo--;
        }
        return valorDesempilhado;
    }
    public static void ExibePilha(){
        if(vazia() == true){
            JOptionPane.showMessageDialog(null, 
                    "PILHA VAZIA!");
        }
        else{
            for(int i=topo; i>=0; i--){
                System.out.println("Elemento " 
                        + vetor[i] + " - posição " + i);
            }
        }
    }
    public static Object hist1(){       
       return vetor[topo-1];
    }
     public static Object hist2(){       
       return vetor[topo-2];
    }
     
     public static Object hist3(){       
       return vetor[topo-3];
    }
     public static Object hist4(){       
       return vetor[topo-4];
    }
     public static Object hist5(){       
       return vetor[topo-5];
    }
     public static Object hist6(){       
       return vetor[topo-6];
    }
}