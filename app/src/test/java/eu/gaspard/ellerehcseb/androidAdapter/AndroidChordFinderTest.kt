package eu.gaspard.ellerehcseb.androidAdapter

import eu.gaspard.ellerehcseb.core.Chord
import eu.gaspard.ellerehcseb.core.ChordsFinder
import eu.gaspard.ellerehcseb.core.Note.*
import io.mockk.every
import io.mockk.mockk
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AndroidChordFinderTest{


    @Test
    fun should_call_chords_finder_with_strings(){
        val chordsFinder = mockk<ChordsFinder>()
        val chord = mockk<Chord>()
        every { chord.name } returns "C"
        every { chordsFinder.findExactly(C, E, G) } returns chord

        val androidAdapter = AndroidChordFinder(chordsFinder)

        val string = androidAdapter.findChordFor("C,E,G")

        assertThat(string).isEqualTo("C")
    }

    @Test
    fun should_call_chords_finder_with_spaces(){
        val chordsFinder = mockk<ChordsFinder>()
        val chord = mockk<Chord>()
        every { chord.name } returns "Am"
        every { chordsFinder.findExactly(C, E, A) } returns chord

        val androidAdapter = AndroidChordFinder(chordsFinder)

        val string = androidAdapter.findChordFor("C E A ")

        assertThat(string).isEqualTo("Am")
    }

    @Test
    fun should_call_chords_finder_with_lowercase(){
        val chordsFinder = mockk<ChordsFinder>()
        val chord = mockk<Chord>()
        every { chord.name } returns "Am"
        every { chordsFinder.findExactly(C, E, A) } returns chord

        val androidAdapter = AndroidChordFinder(chordsFinder)

        val string = androidAdapter.findChordFor("c e a")

        assertThat(string).isEqualTo("Am")
    }


    @Test
    fun should_call_chords_finder_removing_other_characters(){
        val chordsFinder = mockk<ChordsFinder>()
        val chord = mockk<Chord>()
        every { chord.name } returns "Am"
        every { chordsFinder.findExactly(C, E, A) } returns chord

        val androidAdapter = AndroidChordFinder(chordsFinder)

        val string = androidAdapter.findChordFor("c, 3,e,a")

        assertThat(string).isEqualTo("Am")
    }

    @Test
    fun should_call_chords_finder_with_sharp() {
        val chordsFinder = mockk<ChordsFinder>()
        val chord = mockk<Chord>()
        every { chord.name } returns "A#m"
        every { chordsFinder.findExactly(Cs, F, As) } returns chord

        val androidAdapter = AndroidChordFinder(chordsFinder)

        val string = androidAdapter.findChordFor("C#,f,a#")

        assertThat(string).isEqualTo("A#m")
    }

    @Test
    fun should_call_return_nop_when_finder_found_nothing() {
        val chordsFinder = mockk<ChordsFinder>()
        every { chordsFinder.findExactly(Cs, F, As) } returns null

        val androidAdapter = AndroidChordFinder(chordsFinder)

        val string = androidAdapter.findChordFor("C#,f,a#")

        assertThat(string).isEqualTo("nop")
    }
}