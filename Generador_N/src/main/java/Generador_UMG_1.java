import java.io.*;
import java.util.*;
import javax.swing.JOptionPane;


public class Generador_UMG_1 {
    static String muestras[];
    static List <String> al = new ArrayList<String>();
    static String arrDesordenado[];
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws IOException {
        int op;
        do{
        op = Integer.parseInt(JOptionPane.showInputDialog(null,
                "1.Generar Numeros \n"
                +"2.Ordenar Numeros \n"));
        
        switch(op){
        
            case 1:
                try (FileWriter fichero = new FileWriter ("C:\\Users\\Diego\\Desktop\\Ejemplo N\\prueba.txt")) {
                int negativo=-1000000;
                int neutro=1000000;
                int positivo=1000000;
                //int n=100;
                for(int r=0; r<=positivo; r++){
                    Random aleatorio = new Random();
                    int x=aleatorio.nextInt(neutro - negativo+1) +negativo;
                   fichero.write(+x+"\n");   
                    }
                }
               break;
            
            case 2:
                try{
            File archivo = new File("C:\\Users\\Diego\\Desktop\\Ejemplo N\\prueba.txt");
            
            BufferedReader lectura = new BufferedReader(new FileReader(archivo.getAbsolutePath()));
            
            
            String leerLinea = lectura.readLine();
            
            
            while(leerLinea != null){
                //ArrayList que está recibiendo los valores de leerLinea
                al.add(leerLinea);
                
                leerLinea = lectura.readLine();
                
            }
            
            arrDesordenado = al.toArray(new String[al.size()]);
            
            Arrays.sort(arrDesordenado);
            
            try (FileWriter fichero2 = new FileWriter ("C:\\Users\\Diego\\Desktop\\Ejemplo N\\ficheroordenado.txt");) {
                   fichero2.write("Numeros Ordenados de manera ascendente \n\n");
           fichero2.write( Arrays.toString(arrDesordenado)+"\n");}
            
        }catch(FileNotFoundException e){
            // Cuidado los espacios
            System.out.println("El Archivo solicitado no ha sido encontrado: " + e.getMessage());
        }catch(IOException IOe){
            System.out.println("El Archivo solicitado no se pudo abrir o cerrar" + IOe.getMessage());
        }
                break;
               
               
        }
        }while(op>0 && op<=3);
        
    }
}
    

