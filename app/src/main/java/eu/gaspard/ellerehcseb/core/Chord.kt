package eu.gaspard.ellerehcseb.core

data class Chord(val notes : List<String>) {
    fun containsNote(note: Note) : Boolean {
        return note.note_as_string.toUpperCase().equals(notes[0].toUpperCase())
    }

    override fun toString(): String {
        return notes[0]
    }
}
