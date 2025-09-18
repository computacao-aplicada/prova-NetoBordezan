import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class ValidadorTest {

    @Test
    void deveValidarCPFValido() {
        assertTrue(Validador.validarCPF("529.982.247-25")); //cpf correto com "." e "-"
        assertTrue(Validador.validarCPF("52998224725")); //cpf correto limpo
    }

    @Test
    void deveRejeitarEntradasInvalidas() {
        assertFalse(Validador.validarCPF(null)); // cpf nulo
        assertFalse(Validador.validarCPF("")); // cpf vazio
        assertFalse(Validador.validarCPF("529.982.247-2X")); //cpf com um carácter distinto
        assertFalse(Validador.validarCPF("00000000000")); //sequências repetidas
    }

    @Test
    void deveRejeitarTamanhosIncorretos() {
        assertFalse(Validador.validarCPF("935.411.347-8"));   // 10 dígitos
        assertFalse(Validador.validarCPF("935.411.347-800")); // 12 dígitos
    }

    @Test
    void deveRejeitarDVIncorreto() {
        assertFalse(Validador.validarCPF("529.982.247-24")); //DV errado
        assertFalse(Validador.validarCPF("123.456.789-00")); //DV errado
    }
}


