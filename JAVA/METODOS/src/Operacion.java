import javax.swing.JOptionPane;
public class Operacion {
    int a;
    int b;
    int suma;
    int resta;
    int division;
    int multiplicacion;

    public void leer(){
        a=Integer.parseInt(JOptionPane.showInputDialog("ingrese el primer numero"));
        b=Integer.parseInt(JOptionPane.showInputDialog("ingrese el segundo numero"));
    }
    //Metodo para suma
    public void sumar(){
        suma = a+b;
    }
    //Metodo para resta
     public void restar(){
        resta = a-b;
    }
     //Metodo para multiplicar
      public void multiplicar(){
        multiplicacion = a*b;
    }
      //Metodo para dividir
       public void dividir(){
        division = a/b;
    }
    
       
       public void MostraResultado(){
           System.out.println("el resultado de la suma es:"+suma);
           System.out.println("el resultado de la resta es:"+resta);
           System.out.println("el resultado de la multiplicacion es:"+multiplicacion);
           System.out.println("el resultado de la division es:"+division);
       }


}
