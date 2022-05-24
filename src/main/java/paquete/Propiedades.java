package paquete;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "my")
public class Propiedades {

    @Value("${VAR1:valor_defecto}")
    private String VAR1;

    private Integer VAR2;

    @Value("${VAR3:var3 no tiene valor}")
    private String VAR3;

    public String getVAR1() {
        return VAR1;
    }

    public void setVAR1(String VAR1) {
        this.VAR1 = VAR1;
    }

    public Integer getVAR2() {
        return VAR2;
    }

    public void setVAR2(Integer VAR2) {
        this.VAR2 = VAR2;
    }


    public String getVAR3() {
        return VAR3;
    }

    public void setVAR3(String VAR3) {
        this.VAR3 = VAR3;
    }

    @Override
    public String toString() {
        return "Propiedades{" +
                "VAR1='" + VAR1 + '\'' +
                ", VAR2=" + VAR2 +
                ", VAR3='" + VAR3 + '\'' +
                '}';
    }
}

