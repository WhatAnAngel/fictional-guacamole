package actadicionalt4pro;
import equipos.*;


public class ActAdicionalT4PRO {

    public static void main(String[] args) {
        Equipo[] misEquipos = new Equipo[4];
        
        //Creamos dos portatiles e impresoras
        Portatil port1 = new Portatil("ASUS", "Rock", 1230.45);
        Portatil port2 = new Portatil("ACER", "Pop", 752.25);
        Impresora impr1 = new Impresora("Laser", "HP", "LaserJet 300", 150.15);
        
        //Los añadimos al array
        misEquipos[0]=port1;
        misEquipos[1]=port2;
        misEquipos[2]=impr1;
        
        //Se puede hacer más facil, de hecho es lo lógico, ejemplo con el último:
        misEquipos[3] = new Impresora("Inyección", "Epson", "FX-460", 105.34);
        
        //Creamos la instancia de tipo CPU
        CPU miCPU = new CPU("Intel i7", 8, 500);
        
        
        for(int i=0; i<misEquipos.length; i++){
            System.out.println(misEquipos[i]);
            //Comprobamos si el equipo es un portátil
            //Y si lo es añadimos CPU
            if (misEquipos[i] instanceof Portatil){
                ((Portatil)misEquipos[i]).instalarCpu(miCPU);
            }
            System.out.println(misEquipos[i]);
        }
        
        System.out.println("------------------------------------");
        
        for(int i=0; i<misEquipos.length; i++){
            misEquipos[i].AumentaPrecio(100);
            System.out.println(misEquipos[i]);
        }
        
        
    }

}
