package br.edu.univille.poo2.exemplograficos.core.service;

import br.edu.univille.poo2.sistemareserva.core.dto.RelatorioDTO;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Random;

@Service
public class RelatorioService {

    public RelatorioDTO relatorioOcupacaoDiaria() {
        Random random = new Random();
        var dto = new RelatorioDTO();
        dto.setTitulo("Ocupação Diária de Quartos");
        dto.setLegenda("Número de quartos ocupados");
        dto.setXLabel("Dia do Mês");
        var valores = new ArrayList<String>();
        var labels = new ArrayList<String>();

        LocalDate startDate = LocalDate.now().withDayOfMonth(1);
        LocalDate endDate = startDate.plusMonths(1);

        while (startDate.isBefore(endDate)) {
            labels.add(Integer.toString(startDate.getDayOfMonth()));
            valores.add(Integer.toString(random.nextInt(50)));
            startDate = startDate.plusDays(1);
        }

        dto.setLabels(labels);
        dto.setValores(valores);
        return dto;
    }

    //receita mensal
    public RelatorioDTO relatorioReceitaMensal() {
        var dto = new RelatorioDTO();
        dto.setTitulo("Receita Mensal do Hotel");
        dto.setLegenda("Receita (em R$)");
        dto.setXLabel("Mês");
        var valores = new ArrayList<String>();
        var labels = new ArrayList<String>();

        labels.add("Jan");
        labels.add("Feb");
        labels.add("Mar");
        labels.add("Apr");
        labels.add("May");
        labels.add("Jun");
        labels.add("Jul");
        labels.add("Aug");
        labels.add("Sep");
        labels.add("Oct");
        labels.add("Nov");
        labels.add("Dec");

        //receita
        for (int i = 0; i < 12; i++) {
            valores.add(Integer.toString(new Random().nextInt(200000) + 50000));
        }

        dto.setLabels(labels);
        dto.setValores(valores);
        return dto;
    }

    //tipos de quartos mais reservados
    public RelatorioDTO relatorioQuartosMaisReservados() {
        var dto = new RelatorioDTO();
        dto.setTitulo("Tipos de Quartos Mais Reservados");
        dto.setLegenda("Quantidade de Reservas");
        dto.setXLabel("Tipo de Quarto");
        var valores = new ArrayList<String>();
        var labels = new ArrayList<String>();

        //tipos de quartos
        labels.add("Single");
        labels.add("Double");
        labels.add("Suite");
        labels.add("Deluxe");

        //reservas simuladas
        valores.add("150");
        valores.add("200");
        valores.add("75");
        valores.add("50");

        dto.setLabels(labels);
        dto.setValores(valores);
        return dto;
    }
}
