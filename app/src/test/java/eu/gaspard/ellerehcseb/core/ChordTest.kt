package eu.gaspard.ellerehcseb.core

import eu.gaspard.ellerehcseb.core.Note.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ChordTest {

    @Test
    fun should_create_major_chord() {
        val cMajor = createMajorChord(C)
        assertThat(cMajor.notes).containsOnly(
            C,
            E,
            G
        )
        assertThat(cMajor.name).isEqualTo("C")
    }

    @Test
    fun should_create_major_chord_when_end_of_scale() {
        val bMajor = createMajorChord(B)
        assertThat(bMajor.notes).containsOnly(
            B,
            Ds,
            Fs
        )
        assertThat(bMajor.name).isEqualTo("B")
    }

    @Test
    fun should_create_minor_chord() {
        val cMinor = createMinorChord(C)
        assertThat(cMinor.notes).containsOnly(
            C,
            Ds,
            G
        )
        assertThat(cMinor.name).isEqualTo("Cm")
    }

    @Test
    fun should_create_minor_chord_when_end_of_scale() {
        val aMinor = createMinorChord(A)
        assertThat(aMinor.notes).containsOnly(
            A,
            C,
            E
        )
        assertThat(aMinor.name).isEqualTo("Am")
    }

}