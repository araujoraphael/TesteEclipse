    // TesteStatic.java  
    class Classe1  
    {  
        // Variavel static  
        public static int contador = 0;  
      
        // Variavel nao-static  
        public int outroContador = 0;  
      
        public Classe1() {}  
      
        // Precisa ser static porque "contador" � static  
        public static void incrementaContador()  
        {  
            contador++;  
      
            System.out.println("contador agora � "+ contador);  
        }  
      
        public void incrementaOutroContador()  
        {  
            outroContador++;  
      
            System.out.println("outroContador agora � "+ outroContador);  
        }  
    }  
      
    public class TesteStatic  
    {  
        public static void main(String args[])  
        {  
        	int x=0xbdaf0;
        
        System.out.println(x);
        }
    }  