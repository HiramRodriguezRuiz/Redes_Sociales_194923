
package entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

/**
 *
 * @author Hiram Rodriguez Ruiz
 */

@MappedSuperclass
public abstract class EntityBase {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    protected Integer id;
    
    public Integer getId() {
        return id;
    }
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }    
    
    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof EntityBase)) {
            return false;
        }
        EntityBase other=(EntityBase) obj;
        if((this.id==null&&other.id!=null) || (this.id!=null&&!this.id.equals(other.id)))
            return false;
        return true;
    }
}