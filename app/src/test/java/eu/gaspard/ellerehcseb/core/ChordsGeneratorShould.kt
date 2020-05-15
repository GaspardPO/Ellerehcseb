package eu.gaspard.ellerehcseb.core

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ChordsGeneratorShould{

    @Test
    fun generate_all_chords(){
        val nb_of_differents_types_of_chords = 5 // minor, major, seventh, dim, dim7
        val nb_of_notes = 12
        assertThat(ChordsGenerator().generateAllChords())
            .hasSize(nb_of_notes * nb_of_differents_types_of_chords)
    }
}