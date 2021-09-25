import java.util.ArrayList;
import java.util.Scanner;
import persona.persona;


public class Crud {

    
    public static void main(String[] args) {
           Scanner entrada = new Scanner(System.in);
           ArrayList<persona> listaPersona = new ArrayList<>();
           
            boolean salir = false;
        while (!salir) {
            System.out.println(" INGRESE LA OPCION ");
            System.out.println(" 1 - Crear usuario ");
            System.out.println(" 2 - Lista de usuarios");
            System.out.println(" 3 - Eliminar usuario ");
            System.out.println(" 4 - Modificar usuario ");
            System.out.println(" 0 - Salir ");
            
            int opcion = Integer.parseInt(entrada.nextLine());
            
            switch(opcion) {
                case 1:
                    persona p = new persona();
                    System.out.println("Ingrese nombre del usuario: ");
                    p.setNombre(entrada.nextLine());
                    System.out.println("Ingrese apellido paterno: ");
                    p.setAp_paterno(entrada.nextLine());
                    System.out.println("Ingrese apellido materno: ");
                    p.setAp_materno(entrada.nextLine());
                    System.out.println("Ingrese direccion: ");
                    p.setDireccion(entrada.nextLine());
                    
                    listaPersona.add(p);
                     System.out.println("USUARIO CREADO: ");
                    System.out.println("Nombre " + p.getNombre());
                    System.out.println("Apellidos " + p.getAp_paterno()+" "+p.getAp_materno());
                    System.out.println("Direccion " + p.getDireccion());
                    
                    break;
                case 2:
                    for(int i = 0; i < listaPersona.size(); i++){
                        System.out.println("usuario: " + (i + 1));
                        persona usuario =  listaPersona.get(i);
                        System.out.println("Nombres: " + usuario.getNombre());
                       System.out.println("Apellidos: " + usuario.getAp_paterno()+" "+usuario.getAp_materno());
                       System.out.println("Direccion: " + usuario.getDireccion());
                    }
                    
                    break;
                case 3:
                    System.out.println("Ingreser el nombre del usuario a eliminar: ");
                    String nombre = entrada.nextLine();
                     for (int i = 0; i < listaPersona.size(); i++){
                         persona usuario = listaPersona.get(i);
                         if (nombre.equals(usuario.getNombre())){
                             listaPersona.remove(i);
                            System.out.println("Usuario eliminado");
                         }
                     }
                     
                    break;
                case 4:
                    System.out.println(" Ingrese nombre de usuario a mdificar");
                    nombre = entrada.nextLine();
                    for (int i = 0; i < listaPersona.size(); i++){
                        persona usuario = listaPersona.get(i);
                         if (nombre.equals(usuario.getNombre())){
                             System.out.println("Nombre: " + usuario.getNombre());
                            System.out.println("Apellido paterno: " + usuario.getAp_paterno());
                            System.out.println("Apellido materno: " + usuario.getAp_materno());
                            System.out.println("Direccion: " + usuario.getDireccion());
                            System.out.println("Ingrese nuevo nombre: ");
                            String Nombre = entrada.nextLine();
                            System.out.println("Ingrese Apellido paterno: ");
                            String Ap_paterno = entrada.nextLine();
                            System.out.println("Ingrese Apellido materno: ");
                            String Ap_materno = entrada.nextLine();
                            System.out.println("Ingrese direccion: ");
                            String Direccion = entrada.nextLine();
                            usuario.setNombre(Nombre);
                            usuario.setAp_paterno(Ap_paterno);
                            usuario.setAp_materno(Ap_materno);
                            usuario.setDireccion(Direccion);
                         }
                    }
                    
                    break;
                case 0:
                    salir = true;
                    System.out.println("Saliendo del programa");
                    
                    break;
                default:
                    System.out.println("Opcion invalida!!!!!!!");
            }
                
        }
           
    }
    
}

