import java.util.Scanner;
import java.util.Stack;

public class metodo{
    Scanner sc=new Scanner(System.in);
    public Stack<Objpunto7> Llenar(){
        Stack<Objpunto7> p =new Stack<>();
        boolean pedir= treu;
        int opt=sc.nextInt();
        while (pedir) {
            Objpunto7 o=new Objpunto7();
            System.out.println("ingrese el valor");
            o.seta(sc.nextInt());
            p.push(o);
            System.out.println("desea continuar");
            if (opt==2) {
                pedir=false;
            }
        }  
        return p;
    }

    public void Mostrar(Stack<Objpunto7> p){
        for(Objpunto7 o : p)
        System.out.println(p.geta());
    }


    public Stack<Objpunto7>Modificar(Stack<Objpunto7> p , int numero){
        
        for(Objpunto7 o : p){
            if (o.geta()==numero) {
                o.seta(255);
            }
        }
        return p;
    }

    public Stack<Objpunto7>Eliminar(Stack<Objpunto7> p, int numero){
        
        int i=0;
        for (Objpunto7 o : p) {
            if (o.geta()==numero) {
                p.remove(i);
            }
            i++;
        }
        return p;
    }
}