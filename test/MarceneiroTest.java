
import java.util.Arrays;
import java.util.List;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import static org.mockito.Matchers.any;
import org.mockito.Mock;
import static org.mockito.Mockito.when;
import org.mockito.MockitoAnnotations;

/**
 *
 * @author RODOLFO ROCHA
 */
public class MarceneiroTest {
    
    	@Mock
	private Serra serra;

	@Before
	public void setup() {
		MockitoAnnotations.initMocks(this);
                when(serra.corta(any(Tabua.class))).thenReturn(Arrays.asList(new Tabua(), new Tabua()));
	}

	@Test
	public void deveSerrarUmaTabua() {
		Marceneiro marceneiro = new Marceneiro(serra); 

		List<Tabua> tabuas = marceneiro.serra(new Tabua());

		Assert.assertEquals(2, tabuas.size()); 
	}
}
