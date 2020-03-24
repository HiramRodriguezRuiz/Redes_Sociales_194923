package test;

import entity.RedSocial;
import entity.Usuario;
import java.util.Date;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Hiram Rodriguez Ruiz
 */
public class Pruebas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EntityManagerFactory managerFactory = Persistence.createEntityManagerFactory("RedesSociales_194923");
        EntityManager entityManager = managerFactory.createEntityManager();

        entityManager.getTransaction().begin();

        Usuario user = new Usuario();
        user.setNombre("Hiram Rodriguez");
        user.setEmail("hiramrodr14@gmail.com");
        user.setFechaNac(new Date());
        user.setSexo(true);

        entityManager.persist(user);

        RedSocial redSocial1 = new RedSocial();
        redSocial1.setFechaInicio(new Date());
        redSocial1.setNombre("GMAIL");
        redSocial1.setWebsite("GMAIL.com");
        redSocial1.agregarUsuario(user, "Audeves");

        entityManager.persist(redSocial1);

        entityManager.getTransaction().commit();

    }

}
