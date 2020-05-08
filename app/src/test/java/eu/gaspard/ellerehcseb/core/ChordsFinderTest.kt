package eu.gaspard.ellerehcseb.core

import eu.gaspard.ellerehcseb.core.Note.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ChordsFinderShould{


    @Test
    fun return_C_when_c_e_g(){
        val finder = ChordsFinder()

        val find = finder.find(C, E, G)

        assertThat(find).isEqualTo(Chord("C"))
    }

    @Test
    fun return_G_when_G_B_D(){
        val finder = ChordsFinder()

        val find = finder.find(G, B, D)

        assertThat(find).isEqualTo(Chord("G"))
    }



}