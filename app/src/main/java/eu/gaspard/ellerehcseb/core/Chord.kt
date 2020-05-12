package eu.gaspard.ellerehcseb.core

data class Chord(val notes: List<Note>, val name: String = notes[0].note_as_string){
    fun containsExactly(notes: Array<out Note>): Boolean {
        return this.notes.toSortedSet().equals(notes.toSet())
    }
}

fun createMajorChord(root: Note): Chord {
    val third = root.noteAfterInterval(4)
    val fifth = root.noteAfterInterval(7)

    return Chord(listOf(root, third, fifth))
}

fun createMinorChord(root: Note): Chord {
    val third = root.noteAfterInterval(3)
    val fifth = root.noteAfterInterval(7)

    val notes = listOf(root, third, fifth)
    return Chord(notes, root.note_as_string + "m")
}

fun createSeventhChord(root: Note): Chord {
    val third = root.noteAfterInterval(4)
    val fifth = root.noteAfterInterval(7)
    val seventh = root.noteAfterInterval(10)

    return Chord(listOf(root, third, fifth, seventh), root.note_as_string + "7")
}
