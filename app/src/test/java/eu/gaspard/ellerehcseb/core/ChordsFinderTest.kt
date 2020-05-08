package eu.gaspard.ellerehcseb.core

import eu.gaspard.ellerehcseb.core.Note.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ChordsFinderShould {
    val allChords = ChordsGenerator().generateAllChords()
    val finder = ChordsFinder(allChords)

    @Test
    fun return_Major_chords() {
        assertThat(finder.find(C, E, G).name).isEqualTo("C")
        assertThat(finder.find(E, Gs, B).name).isEqualTo("E")
        assertThat(finder.find(D, Fs, A).name).isEqualTo("D")
        assertThat(finder.find(F, A, C).name).isEqualTo("F")
        assertThat(finder.find(G, B, D).name).isEqualTo("G")
        assertThat(finder.find(A, Cs, E).name).isEqualTo("A")
    }

    @Test
    fun return_Minor_chords() {
        assertThat(finder.find(A, C, E).name).isEqualTo("Am")
        assertThat(finder.find(C, Ds, G).name).isEqualTo("Cm")
    }

}