package eu.gaspard.ellerehcseb.core

class ChordsFinder(private val allChords: List<Chord>) {
    fun find(vararg notes: Note): Chord =
        allChords.first { it.notes.containsAll(notes.toList()) }
}
