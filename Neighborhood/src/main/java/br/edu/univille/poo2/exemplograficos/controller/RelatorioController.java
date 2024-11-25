package br.edu.univille.poo2.exemplograficos.controller;

import br.edu.univille.poo2.sistemareserva.core.dto.RelatorioDTO;
import br.edu.univille.poo2.sistemareserva.core.service.RelatorioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/relatorio")
public class RelatorioController {

    @Autowired
    private RelatorioService relatorioService;

    @GetMapping("/ocupacao-diaria")
    public ModelAndView ocupacaoDiaria() {
        var mv = new ModelAndView("relatorio/ocupacao-diaria");
        RelatorioDTO relatorioDTO = relatorioService.relatorioOcupacaoDiaria();
        mv.addObject("relatorio", relatorioDTO);
        return mv;
    }

    @GetMapping("/receita-mensal")
    public ModelAndView receitaMensal() {
        var mv = new ModelAndView("relatorio/receita-mensal");
        RelatorioDTO relatorioDTO = relatorioService.relatorioReceitaMensal();
        mv.addObject("relatorio", relatorioDTO);
        return mv;
    }

    @GetMapping("/quartos-mais-reservados")
    public ModelAndView quartosMaisReservados() {
        var mv = new ModelAndView("relatorio/quartos-mais-reservados");
        RelatorioDTO relatorioDTO = relatorioService.relatorioQuartosMaisReservados();
        mv.addObject("relatorio", relatorioDTO);
        return mv;
    }
}
