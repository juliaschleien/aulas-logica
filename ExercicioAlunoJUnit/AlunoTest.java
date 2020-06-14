

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class AlunoTest.
 *
 * @author  Julia Schleien
 * @version 1.0
 */
public class AlunoTest {
    
    Aluno aluno = new Aluno();
    
    
    /**
     * Default constructor for test class AlunoTest
     */
    public AlunoTest() {
        aluno.setNome("Julia");
        aluno.setNota1(7);
        aluno.setNota2(8.9);
        aluno.setTotalDeAulas(20);
        aluno.setNumeroDePresencas(15.0);
    }
    

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp() {
        aluno.setNota1(7);
        aluno.setNota2(8.9);
        aluno.setTotalDeAulas(20);
        aluno.setNumeroDePresencas(15.0);
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
    public void testCalcularMediaAritmetica() {
        assertEquals(7.95, aluno.calcularMediaAritmetica(), 0.0);
        
        aluno.setNota1(6);
        aluno.setNota2(10);
        assertEquals(8.0, aluno.calcularMediaAritmetica(), 0.0);
        
        aluno.setNota1(10);
        aluno.setNota2(10);
        assertEquals(10.0, aluno.calcularMediaAritmetica(), 0.0);
    }
    
    @Test
    public void testCalcularFrequencia() {
         assertEquals(75.0, aluno.calcularFrequencia(), 0.0);
         
         aluno.setTotalDeAulas(30);
         aluno.setNumeroDePresencas(15);
         assertEquals(50.0, aluno.calcularFrequencia(), 0.0);
         
         aluno.setTotalDeAulas(30);
         aluno.setNumeroDePresencas(30);
         assertEquals(100.0, aluno.calcularFrequencia(), 0.0);
    }

}
