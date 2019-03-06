package com.step.assignments;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CatPlayingTest {

    @Test
    void shouldReturnFalseWhenTempIs10() {
        Boolean output = CatPlaying.isCatPlaying(true, 10);
        assertEquals(false,output);
    }
}