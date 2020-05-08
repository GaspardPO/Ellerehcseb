package eu.gaspard.ellerehcseb.core

class ChordsFinder(private val allChords: List<Chord>) {
    fun find(vararg notes : Note): Chord {
        return allChords.filter{it.containsNote(notes[0])}.last()
    }

}
