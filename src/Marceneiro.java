
import java.util.List;

/**
 *
 * @author RODOLFO ROCHA
 */
public class Marceneiro {
    private final Serra serra;

    public Marceneiro(Serra serra) {
            this.serra = serra;
    }

    public List<Tabua> serra(Tabua tabua) {
            return serra.corta(tabua);
    }
}
