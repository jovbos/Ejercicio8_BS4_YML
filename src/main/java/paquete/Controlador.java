package paquete;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controlador {

    @Autowired
    Propiedades propiedades;

    @GetMapping("/valores")
    public String outputPropiedades() {
        String var1 = propiedades.getVAR1();
        String var2 = propiedades.getVAR2().toString();
        String output = "El valor de VAR1 es: " + var1 + ", el valor de VAR2 es: " + var2;
        return output;
    }

    @GetMapping("/var3")
    public String outputVar3() {
        String var3 = propiedades.getVAR3();
        return var3;
    }
}
