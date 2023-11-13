package ru.lex.mirelwedding.Services;

import org.springframework.stereotype.Service;
import ru.lex.mirelwedding.Interfaces.Fuji;

/**
 * Copyright (c) 2023 Igor Kartashov SphinxCode
 * All rights reserved.
 */
@Service
public class FujiService implements Fuji {
    @Override
    public void sout() {
        System.out.println("OK");
    }

    @Override
    public void welcome() {
        System.out.println("Welcome");
    }
}
