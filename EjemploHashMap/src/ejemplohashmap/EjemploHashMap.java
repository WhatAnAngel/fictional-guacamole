package ejemplohashmap;

import java.util.HashMap;


public class EjemploHashMap {

    public static void main(String[] args) {

        HashMap<String, String> mapCoches = new HashMap();
        mapCoches.put("marca", "Ford");
        mapCoches.put("modelo", "Kuga");
        mapCoches.put("precio", "23450.56");
        mapCoches.put("extras", "Full Equip");
        
        //Método que devuelve las claves
        System.out.println(mapCoches.keySet());
        
        for (String clave : mapCoches.keySet()){
            //recuperamos el valor asociado a la clave
            //con el método .get
            System.out.println(clave + ": " + mapCoches.get(clave));
        }
        
        //Utilizamos .size para saber la cantidad de elementos
        System.out.println("Elementos: " + mapCoches.size());
        
        //Método que muestra los valores del hashmap
        System.out.println(mapCoches.values());
        
        //Comprobar si existe una clave con containsKey()
        if(mapCoches.containsKey("Kuga")){
            System.out.println("El valor kuga existe");
        }else{
            System.out.println("El valor Kuga no existe");
        }
        
        //Comprobar si un valor existe con containsValue()
        if(mapCoches.containsValue("Tesla")){
            System.out.println("El valor Tesla existe");
        }else{
            System.out.println("El valor Tesla no existe");
        }
        
        //.isEmpty para saber si esta vacío
        
        
        //Método .clear() para vaciar el elemento
        
        
        //Eliminar elemento del HashMap con .remove(clave)
        mapCoches.remove("extras");
        System.out.println(mapCoches.keySet());
        System.out.println(mapCoches.values());
        
        //Para modificar un valor utilizamos el método .replace()
        mapCoches.replace("modelo", "Escort");
        mapCoches.put("modelo", "Ateca");
    }

}
