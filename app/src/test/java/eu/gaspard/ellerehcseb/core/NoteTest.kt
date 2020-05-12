package eu.gaspard.ellerehcseb.core

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test

internal class NoteTest {

    @Test
    fun should_create_note_from_string() {
        Assertions.assertThat(Note.C).isEqualTo(getNotefromString("C"))
        Assertions.assertThat(Note.C).isEqualTo(getNotefromString("c"))
    }

    @Test
    fun should_create_note_from_string_for_sharp() {
        Assertions.assertThat(Note.Cs).isEqualTo(getNotefromString("Cs"))
        Assertions.assertThat(Note.Cs).isEqualTo(getNotefromString("C#"))
        Assertions.assertThat(Note.Cs).isEqualTo(getNotefromString("c#"))
        Assertions.assertThat(Note.Cs).isEqualTo(getNotefromString("CS"))
    }
}