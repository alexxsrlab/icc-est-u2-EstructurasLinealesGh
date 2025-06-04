import java.util.Queue;

import Controllers.QueueG;
import Controllers.QueuePersona;
import Controllers.Stack;
import Controllers.StackG;
import Models.Persona;

public class App {
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        /*Stack stack = new Stack();
        stack.push(10);
        stack.push(-1);
        stack.push(5);
        stack.push(8);
        System.out.println("Tamaño= " + stack.size());
        stack.printStack();
        stack.pop();
        System.out.println("Tamamaño= " + stack.size());
        stack.printStack();*/

        /*StackG<Integer> pilaG = new StackG<>();
        pilaG.push(10);
        pilaG.push(8);
        pilaG.push(-1);
        pilaG.push(5);
        System.out.println("Tam = " + pilaG.getSize());
        pilaG.printStackG();
        pilaG.pop();
        System.out.println("Tam = " + pilaG.getSize());
        pilaG.printStackG();*/


        Persona p1 = new Persona("David");
        Persona p2 = new Persona("Maria");
        Persona p3 = new Persona("Pedro");
        QueuePersona colPersonas = new QueuePersona();
        //QueueG<Persona> colPersonas = new QueueG<>();
        colPersonas.add(p1);
        colPersonas.add(p2);
        colPersonas.add(p3);
        colPersonas.printCola();
        System.out.println("Persona atendida -> " + colPersonas.remove());
        colPersonas.printCola();   

        Persona pB = colPersonas.findByName("Juan");
        System.out.println("Persona encontrada -> " + (pB != null ? pB : "No encontrada"));
        Persona pE = colPersonas.deleteByName("Pedro");
        System.out.println("Persona eliminada -> " + (pE != null ? pE : "No eliminada"));
        colPersonas.printCola();
    }

}
