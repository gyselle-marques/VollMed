package med.voll.api.domain.consulta.validacoes.agendamento;

import jakarta.validation.ValidationException;
import med.voll.api.domain.consulta.DadosAgendamentoConsulta;
import org.springframework.stereotype.Component;

import java.time.DayOfWeek;

@Component
public class ValidadorHorarioFuncionamento implements ValidadorAgendamentoDeConsulta {

    public void validar(DadosAgendamentoConsulta dados) {
        var dataConsulta = dados.data();

        var domingo = dataConsulta.getDayOfWeek().equals(DayOfWeek.SUNDAY);
        var horarioAntesAbertura = dataConsulta.getHour() < 7;
        var horarioDepoisEncerramento = dataConsulta.getHour() > 18; //consultas possuem horário fixo de 1 hora de duração
        if (domingo || horarioAntesAbertura || horarioDepoisEncerramento) {
            throw new ValidationException("Consulta fora do horário de funcionamento da clínica! " +
                    "Horário de Funcionamento: Segunda a Sábado, das 07:00 às 19:00.");
        }
    }
}
