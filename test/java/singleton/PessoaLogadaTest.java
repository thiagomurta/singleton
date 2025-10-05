package singleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PessoaLogadaTest {

    @Test
    void deveRetornarCPF(){
        PessoaLogada.getInstance().setCpf("999999999-99");
        assertEquals("999999999-99", PessoaLogada.getInstance().getCpf());
    }

    @Test
    void deveRetornarErroCPF(){
        try {
            PessoaLogada.getInstance().setCpf("");
            fail();
        } catch (IllegalArgumentException e){
            assertEquals("CPF inválido!", e.getMessage());
        }
    }

    @Test
    void deveRetornarNome(){
        PessoaLogada.getInstance().setNome("Thiago Murta");
        assertEquals("Thiago Murta", PessoaLogada.getInstance().getNome());
    }

    @Test
    void deveRetornarErroNome(){
        try {
            PessoaLogada.getInstance().setNome("");
            fail();
        } catch (IllegalArgumentException e){
            assertEquals("Nome inválido!", e.getMessage());
        }
    }

}