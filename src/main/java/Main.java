import org.kohsuke.github.GHRepository;
import org.kohsuke.github.GitHub;
import org.kohsuke.github.GitHubBuilder;


import javax.swing.*;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException{

     /* //  GitHub github = GitHub.connect();

        GitHub github = new GitHubBuilder().withPassword("ndiazdossantos", "contraseña").build();

        GHRepository repo = github.createRepository(
                "PruebaPlugin","Prueba siguiendo tutorial",
                "https://noesencillito.com/",true/*public*/);
*/

        // lo hacemos para que nuestro código pueda ser visible para cualquier persona

        String name= JOptionPane.showInputDialog( "Nombre Cuenta");
        String password=JOptionPane.showInputDialog("Tu Contraseña");
        GitHub github = new GitHubBuilder().withPassword(name,password).build();
        String repositoryName= JOptionPane.showInputDialog("Nombre repositorio");
        String description=JOptionPane.showInputDialog("Tu descripción del repositorio");
        String web=JOptionPane.showInputDialog("Tu página web")

        GHRepository repo = github.createRepository(repositoryName,description,web,true/*public*/);
    }
}
