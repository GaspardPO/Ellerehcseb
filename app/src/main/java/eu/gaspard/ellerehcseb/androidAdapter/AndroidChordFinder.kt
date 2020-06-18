package eu.gaspard.ellerehcseb.androidAdapter

import eu.gaspard.ellerehcseb.core.*

// TODO : dependecy injection à faire c'est tout cracra.
class AndroidChordFinder(private val chordsFinder: ChordsFinder = ChordsFinder(ChordsGenerator().generateAllChords())) {
    fun findChordFor(inputString: String): String {
        val notes: Array<Note> = inputString.asNotes()

        val chord: Chord? = chordsFinder.findExactly(*notes)

        return chord?.name ?: "nop"
    }
}
