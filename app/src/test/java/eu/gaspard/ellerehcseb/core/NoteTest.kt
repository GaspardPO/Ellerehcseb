package eu.gaspard.ellerehcseb.core

import eu.gaspard.ellerehcseb.core.Note.*
import org.assertj.core.api.Assertions.*
import org.junit.jupiter.api.Test

internal class NoteTest {

    @Test
    fun should_create_note_from_string() {
        assertThat(C).isEqualTo(getNotefromString("C"))
        assertThat(C).isEqualTo(getNotefromString("c"))
    }

    @Test
    fun should_create_note_from_string_for_sharp() {
        assertThat(Cs).isEqualTo(getNotefromString("Cs"))
        assertThat(Cs).isEqualTo(getNotefromString("C#"))
        assertThat(Cs).isEqualTo(getNotefromString("c#"))
        assertThat(Cs).isEqualTo(getNotefromString("CS"))
    }

    @Test
    fun should_give_note_after_interval(){
        assertThat(Cs).isEqualTo(C.noteAfterInterval(1))
        assertThat(G).isEqualTo(C.noteAfterInterval(7))
    }

    @Test
    fun should_give_note_after_interval_when_end_of_scale(){
        assertThat(D).isEqualTo(G.noteAfterInterval(7))
        assertThat(D).isEqualTo(C.noteAfterInterval(14))
    }
}