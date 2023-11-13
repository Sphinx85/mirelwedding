package ru.lex.mirelwedding.Controllers;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.lex.mirelwedding.Interfaces.Fuji;
import ru.lex.mirelwedding.Interfaces.Inter;
import ru.lex.mirelwedding.Objects.Fujiyama;

/**
 * Copyright (c) 2023 Igor Kartashov SphinxCode
 * All rights reserved.
 */
@RestController
@AllArgsConstructor
@RequestMapping("test")
public class MainController {
    Fuji fuji;
    Inter inter;

    @GetMapping("start")
    public Fujiyama start(){
        Fujiyama fujiyama = new Fujiyama();
        Fujiyama fdsf = new Fujiyama(3,"fnhsjkd");
        fuji.sout();
        fuji.welcome();
        inter.aga();
        fujiyama.setValue(5);
        return fujiyama;
    }
}
