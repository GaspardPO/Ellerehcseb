package eu.gaspard.ellerehcseb.core

import eu.gaspard.ellerehcseb.core.Note.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ChordShould {

    @Test
    fun create_major_chord() {
        val cMajor = MajorChord(C)
        assertThat(cMajor.notes).containsOnly(C, E, G)
        assertThat(cMajor.name).isEqualTo("C")
    }

    @Test
    fun create_major_chord_when_end_of_scale() {
        val bMajor = MajorChord(B)
        assertThat(bMajor.notes).containsOnly(B, Ds, Fs)
        assertThat(bMajor.name).isEqualTo("B")
    }

    @Test
    fun create_minor_chord() {
        val cMinor = MinorChord(C)
        assertThat(cMinor.notes).containsOnly(C, Ds, G)
        assertThat(cMinor.name).isEqualTo("Cm")
    }

    @Test
    fun create_minor_chord_when_end_of_scale() {
        val aMinor = MinorChord(A)
        assertThat(aMinor.notes).containsOnly(A, C, E)
        assertThat(aMinor.name).isEqualTo("Am")
    }

    @Test
    fun create_seventh_chord() {
        val cMajor = SeventhChord(C)
        assertThat(cMajor.notes).containsOnly(C, E, G, As)
        assertThat(cMajor.name).isEqualTo("C7")
    }

    @Test
    fun create_seventh_chord_when_end_of_scale() {
        val bMajor = SeventhChord(B)
        assertThat(bMajor.notes).containsOnly(B, Ds, Fs, A)
        assertThat(bMajor.name).isEqualTo("B7")
    }

    @Test
    fun create_other_chords(){
        val CDim = DiminishedChord(C)
        assertThat(CDim.notes).containsOnly(C, Ds, Fs)
        assertThat(CDim.name).isEqualTo("Cdim")

        val CDim7 = DiminishedSeventhChord(C)
        assertThat(CDim7.notes).containsOnly(C, Ds, Fs, A)
        assertThat(CDim7.name).isEqualTo("Cdim7")
    }


}