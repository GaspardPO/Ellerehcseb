package eu.gaspard.ellerehcseb.core

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ChordsGeneratorTest{

    @Test
    fun should_generate_all_chords(){
        val nb_of_differents_types_of_chords = 2 // minor, major
        assertThat(ChordsGenerator().generateAllChords()).hasSize(NB_OF_NOTES* nb_of_differents_types_of_chords)
    }
}