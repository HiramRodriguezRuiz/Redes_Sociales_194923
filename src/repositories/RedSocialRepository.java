package repositories;

import java.util.List;
import entity.RedSocial;
import persistencia.ConnectionFactory;

/**
 *
 * @author Hiram Rodriguez Ruiz
 */
public class RedSocialRepository extends BaseRepository<RedSocial> {

    public RedSocialRepository(ConnectionFactory connectionFactory) {
        super(connectionFactory);
    }

    @Override
    public RedSocial find(int id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<RedSocial> getAll() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<RedSocial> getAllWith(String referencia) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void add(RedSocial objeto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(RedSocial objeto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(int id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
