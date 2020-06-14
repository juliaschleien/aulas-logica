import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class NadadorTest.
 *
 * @author  Julia Schleien e Eduardo Rambo
 * @version 1.0
 */
public class NadadorTest {
    
    private Nadador nadador = new Nadador();
    
    public NadadorTest() {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp() {
        nadador.setNome("Julia");
        nadador.setIdade(21);
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown() {
    }
    
    @Test
    public void testSetIdade() {
        nadador.setIdade(21);
        assertEquals(21, nadador.getIdade());
        
        nadador.setIdade(-2);
        assertEquals(0, nadador.getIdade());        
    }
    
    @Test
    public void testGetIdade() {
        assertEquals(21, nadador.getIdade());
    }    
    
    @Test
    public void testSetNome() {
        nadador.setNome("Julia");
        assertEquals("Julia", nadador.getNome());
    }
    
    @Test
    public void testGetNome() {
        assertEquals("Julia", nadador.getNome());
    }
    
    @Test
    public void testVerificarCategoria() {
        nadador.setIdade(2);
        assertEquals("Não pode ser nadador. Minímo 8 anos", nadador.verificarCategoria());
        
        nadador.setIdade(9);
        assertEquals("Infantil", nadador.verificarCategoria());
        
        nadador.setIdade(15);
        assertEquals("Juvenil", nadador.verificarCategoria());        
        
        nadador.setIdade(25);
        assertEquals("Adulto", nadador.verificarCategoria());        
        
        nadador.setIdade(-2);
        assertEquals("Categoria Inexistente", nadador.verificarCategoria());
    }
    
    @Test
    public void testVerificarNome() {
        nadador.setNome("Julia");
        assertEquals(true, nadador.verificarNome());
        
        nadador.setNome("v");
        assertEquals(false, nadador.verificarNome());        
    } 
}
