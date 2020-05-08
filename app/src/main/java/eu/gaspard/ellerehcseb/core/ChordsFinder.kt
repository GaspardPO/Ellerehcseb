package eu.gaspard.ellerehcseb.core

class ChordsFinder(private val allChords: List<Chord>) {
    fun find(vararg notes : Note): Chord {
        return allChords.find{it.containsNote(notes[0])}!!
    }

}
