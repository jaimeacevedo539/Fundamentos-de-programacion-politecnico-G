//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class GenerateInfoFiles {

    public static Vendedor createSalesManInfoFile() {

            String[] nombres = {"Jaime","Juan","Camila","Marcela"};
            String[] apellidos = {"Roa","Martinez","Gomez","Moreno"};
            Random ramdom = new Random();

            String nombre = nombres[ramdom.nextInt(nombres.length)];
            String apellido = apellidos[ramdom.nextInt(apellidos.length)];
            int id = 1 + ramdom.nextInt(9000);

            Vendedor vendedor = new Vendedor(nombre, apellido, id);

        try(FileWriter writer = new FileWriter("vendedores.txt",true)){
            writer.write("ID vendedor: "+id+" Vendedor: "+nombre+" "+apellido+"\n" );
            System.out.println("vendedor creado: "+nombre+" "+apellido);
        }catch(IOException e) {
            System.out.println(" error al crear el archivo de vendedor" + e.getMessage());
        }
            return vendedor;
    }




}