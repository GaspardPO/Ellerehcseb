package eu.gaspard.ellerehcseb.core

data class Chord(val chord_as_string: String) {
    fun containsNote(note: Note) : Boolean {
        return note.note_as_string.toUpperCase().equals(chord_as_string.toUpperCase())
    }
}
