package eu.gaspard.ellerehcseb.core

import eu.gaspard.ellerehcseb.core.Note.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ChordsFinderShould{
    val allChords = ChordsGenerator().generateAllChords()
    val finder = ChordsFinder(allChords)

    @Test
    fun return_Major_chords(){
        assertThat(finder.find(C, E, G)).isEqualTo(Chord("C"))
        assertThat(finder.find(E, G, B)).isEqualTo(Chord("E"))
        assertThat(finder.find(D, Fs, A)).isEqualTo(Chord("D"))
        assertThat(finder.find(F, A, C)).isEqualTo(Chord("F"))
        assertThat(finder.find(G, B, D)).isEqualTo(Chord("G"))
    }

}