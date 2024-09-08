import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class CreateProductsFile {

    public static void createProductsFile(int productsCount){
        try(FileWriter writer = new FileWriter("productos.txt")){
            Random random = new Random();

            for(int i = 0; i<productsCount; i++){
                int id = 1+i;
                String nombre = "producto" + id;
                double precio = 1000+(random.nextDouble()*1000);
                writer.write(id+": "+nombre+": $"+ String.format("%.2f",precio)+ "\n");
            }
            System.out.println("Archivo productos creado");
        }catch (IOException e){
            System.out.println("error al crear el archivo productos"+e.getMessage());
        }
    }
}
