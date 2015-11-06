
package models;

import javax.persistence.Entity;
import play.data.validation.Required;
import play.db.jpa.Model;

@Entity()
public class Producto extends Model {
    @Required
    public Integer Clave;
    public String Descripcion;
    public Integer CantMin;
    public Integer Stock;
    public float Precio;
    
    public Producto(Integer Clave, String Descripcion, Integer CantMin, Integer Stock, float Precio) {
       this.Clave = Clave;
       this.Descripcion = Descripcion;
       this.CantMin = CantMin;
       this.Stock = Stock;
       this.Precio = Precio;
       
    }
}
