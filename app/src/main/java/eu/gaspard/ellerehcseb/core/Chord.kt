package eu.gaspard.ellerehcseb.core

data class Chord(val notes: List<Note>, val name: String = notes[0].note_as_string){
    fun containsExactly(notes: Array<out Note>): Boolean {
        return this.notes.toSortedSet().equals(notes.toSet())
    }
}

fun createMajorChord(root: Note): Chord {
    val root_ordinal = root.ordinal
    val third = Note.values()[(root_ordinal + 4).rem(NB_OF_NOTES)]
    val fifth = Note.values()[(root_ordinal + 7).rem(NB_OF_NOTES)]

    return Chord(listOf(root, third, fifth))
}

fun createMinorChord(root: Note): Chord {
    val root_ordinal = root.ordinal
    val third = Note.values()[(root_ordinal + 3).rem(NB_OF_NOTES)]
    val fifth = Note.values()[(root_ordinal + 7).rem(NB_OF_NOTES)]

    val notes = listOf(root, third, fifth)
    return Chord(notes, root.note_as_string + "m")
}
