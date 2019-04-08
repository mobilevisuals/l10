/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pac;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import javax.faces.component.UIGraphic;

/**
 *
 * @author eyvind
 */
@Named(value = "bController")
@SessionScoped
public class BController implements Serializable {
    
    private UIGraphic graphic;

    public UIGraphic getGraphic() {
        return graphic;
    }

    public void setGraphic(UIGraphic graphic) {
        this.graphic = graphic;
    }
    
    public void show()
    {graphic.setRendered(true);}
    
    public void hide()
    {graphic.setRendered(false);}   

    /**
     * Creates a new instance of BController
     */
    public BController() {
    }
    
    public void onChange()
    {graphic.setRendered(true);
    }
    
}
