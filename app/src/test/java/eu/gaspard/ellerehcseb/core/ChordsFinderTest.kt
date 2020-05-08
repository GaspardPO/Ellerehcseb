package eu.gaspard.ellerehcseb.core

import eu.gaspard.ellerehcseb.core.Note.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ChordsFinderShould{
    val allChords = ChordsGenerator().generateAllChords()
    val finder = ChordsFinder(allChords)

    @Test
    fun return_Major_chords(){
        assertThat(finder.find(C, E, G).toString()).isEqualTo("C")
        assertThat(finder.find(E, G, B).toString()).isEqualTo("E")
        assertThat(finder.find(D, Fs, A).toString()).isEqualTo("D")
        assertThat(finder.find(F, A, C).toString()).isEqualTo("F")
        assertThat(finder.find(G, B, D).toString()).isEqualTo("G")
//        assertThat(finder.find(A, Cs, E).toString()).isEqualTo("A")
    }

    @Test
    fun return_Minor_chords(){
        assertThat(finder.find(A, C, E).toString()).isEqualTo("a")
    }

}