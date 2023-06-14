
package Main;


import classes.FilaN;
import classes.FilaP;
import classes.Pilha1;
import javax.swing.JOptionPane;

public class Main {
    
   public static String senha,hist1,hist2,hist3,hist4,hist5,hist6,caixa;
   public static int numeron=0,numerop=0,att=0,cont=-1,cont1=0;
   
       
    public static void senhaNormal(){
     numeron++;
        FilaN.enfileirar(numeron);
        JOptionPane.showMessageDialog(null, "Sua Senha : N" + numeron);
}
    
    public static void senhaPref(){
     numerop++;
        FilaP.enfileirar(numerop);
        JOptionPane.showMessageDialog(null, "Sua Senha : P" + numerop);
}

    public String getSenha() {
        return senha;
    }

    
    public String getHist1() {
        return hist1;
    }

    public String getHist2() {
        return hist2;
    }

    public String getHist3() {
        return hist3;
    }

    public String getHist4() {
        return hist4;
    }

    public String getHist5() {
        return hist5;
    }
     public static void chamar01(){
     if (cont == cont1) {
         
         if (FilaP.vazia()) {
         senha= "N" + FilaN.desenfileirar();   
         caixa="01";
         Pilha1.empilhar(senha);
         att++;    
         cont1=0;    
             
         }else{
            senha= "P" + FilaP.desenfileirar(); 
            caixa="01";
            Pilha1.empilhar(senha);
            att++;
            cont1=0;
         }
            
         }else if (FilaN.vazia()) {
             
             senha= "P" + FilaP.desenfileirar(); 
            caixa="01";
            Pilha1.empilhar(senha);
            att++;
            cont1=0;
             
         }else if (FilaP.vazia()) {
             
             senha= "N" + FilaN.desenfileirar();   
               caixa="01";
               cont1=0;
               Pilha1.empilhar(senha);
               att++;
             
         }else{
               senha= "N" + FilaN.desenfileirar();   
               caixa="01";
               cont1++;
               Pilha1.empilhar(senha);
               att++;
        }
     
     
     
         if (att>1) {
            hist1 =""+Pilha1.hist1(); 
         }
         
         if (att>2) {
            hist1 =""+Pilha1.hist1();
            hist2 =""+Pilha1.hist2();
         }
         if (att>3) {
            hist1 =""+Pilha1.hist1();
            hist2 =""+Pilha1.hist2();
            hist3 =""+Pilha1.hist3();
         }
         if (att>4) {
            hist1 =""+Pilha1.hist1();
            hist2 =""+Pilha1.hist2();
            hist3 =""+Pilha1.hist3();
            hist4 =""+Pilha1.hist4();
         }
         if (att>5) {
            hist1 =""+Pilha1.hist1();
            hist2 =""+Pilha1.hist2();
            hist3 =""+Pilha1.hist3();
            hist4 =""+Pilha1.hist4();
            hist5 =""+Pilha1.hist5();
         }
      
    } 
     
     public static void chamar02(){
    if (cont == cont1) {
         
         if (FilaP.vazia()) {
         senha= "N" + FilaN.desenfileirar();   
         caixa="02";
         Pilha1.empilhar(senha);
         att++;    
         cont1=0;    
             
         }else{
            senha= "P" + FilaP.desenfileirar(); 
            caixa="02";
            Pilha1.empilhar(senha);
            att++;
            cont1=0;
         }
            
         }else if (FilaN.vazia()) {
             
             senha= "P" + FilaP.desenfileirar(); 
            caixa="02";
            Pilha1.empilhar(senha);
            att++;
            cont1=0;
             
         }else if (FilaP.vazia()) {
             
             senha= "N" + FilaN.desenfileirar();   
               caixa="02";
               cont1=0;
               Pilha1.empilhar(senha);
               att++;
             
         }else{
               senha= "N" + FilaN.desenfileirar();   
               caixa="02";
               cont1++;
               Pilha1.empilhar(senha);
               att++;
        }
     
     
     
         if (att>1) {
            hist1 =""+Pilha1.hist1(); 
         }
         
         if (att>2) {
            hist1 =""+Pilha1.hist1();
            hist2 =""+Pilha1.hist2();
         }
         if (att>3) {
            hist1 =""+Pilha1.hist1();
            hist2 =""+Pilha1.hist2();
            hist3 =""+Pilha1.hist3();
         }
         if (att>4) {
            hist1 =""+Pilha1.hist1();
            hist2 =""+Pilha1.hist2();
            hist3 =""+Pilha1.hist3();
            hist4 =""+Pilha1.hist4();
         }
         if (att>5) {
            hist1 =""+Pilha1.hist1();
            hist2 =""+Pilha1.hist2();
            hist3 =""+Pilha1.hist3();
            hist4 =""+Pilha1.hist4();
            hist5 =""+Pilha1.hist5();
         }
      
     
     }
     
     
     public static void chamar03(){
     if (cont == cont1) {
         
         if (FilaP.vazia()) {
         senha= "N" + FilaN.desenfileirar();   
         caixa="03";
         Pilha1.empilhar(senha);
         att++;    
         cont1=0;    
             
         }else{
            senha= "P" + FilaP.desenfileirar(); 
            caixa="03";
            Pilha1.empilhar(senha);
            att++;
            cont1=0;
         }
            
         }else if (FilaN.vazia()) {
             
             senha= "P" + FilaP.desenfileirar(); 
            caixa="03";
            Pilha1.empilhar(senha);
            att++;
            cont1=0;
             
         }else if (FilaP.vazia()) {
             
             senha= "N" + FilaN.desenfileirar();   
               caixa="03";
               cont1=0;
               Pilha1.empilhar(senha);
               att++;
             
         }else{
               senha= "N" + FilaN.desenfileirar();   
               caixa="03";
               cont1++;
               Pilha1.empilhar(senha);
               att++;
        }
     
     
     
         if (att>1) {
            hist1 =""+Pilha1.hist1(); 
         }
         
         if (att>2) {
            hist1 =""+Pilha1.hist1();
            hist2 =""+Pilha1.hist2();
         }
         if (att>3) {
            hist1 =""+Pilha1.hist1();
            hist2 =""+Pilha1.hist2();
            hist3 =""+Pilha1.hist3();
         }
         if (att>4) {
            hist1 =""+Pilha1.hist1();
            hist2 =""+Pilha1.hist2();
            hist3 =""+Pilha1.hist3();
            hist4 =""+Pilha1.hist4();
         }
         if (att>5) {
            hist1 =""+Pilha1.hist1();
            hist2 =""+Pilha1.hist2();
            hist3 =""+Pilha1.hist3();
            hist4 =""+Pilha1.hist4();
            hist5 =""+Pilha1.hist5();
         }
      
     
     }

    public static void main(String[] args) {
        
    
    telas.telaAtendente atendente = new telas.telaAtendente();
    telas.telaCliente cliente = new telas.telaCliente();
    telas.telaVizualizacao vizualizacao = new telas.telaVizualizacao(); 
            
    cliente.setVisible(true);
    atendente.setVisible(true);
    vizualizacao.setVisible(true);
    FilaN.FilaN();
    FilaP.FilaP();
    Pilha1.Pilha1();
    
    
    
    
    
 
  }

    
}
    

