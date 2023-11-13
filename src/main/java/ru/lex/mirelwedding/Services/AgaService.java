package ru.lex.mirelwedding.Services;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import ru.lex.mirelwedding.Interfaces.Inter;

/**
 * Copyright (c) 2023 Igor Kartashov SphinxCode
 * All rights reserved.
 */
@Component
public class AgaService implements Inter {
    @Override
    public void aga() {
        System.out.println("AGA");
    }
}
