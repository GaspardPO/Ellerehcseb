package eu.gaspard.ellerehcseb.androidAdapter

import eu.gaspard.ellerehcseb.core.Chord
import eu.gaspard.ellerehcseb.core.ChordsFinder
import eu.gaspard.ellerehcseb.core.ChordsGenerator
import eu.gaspard.ellerehcseb.core.Note

// TODO : dependecy injection à faire c'est tout cracra.
class AndroidChordFinder(val chordsFinder: ChordsFinder = ChordsFinder(ChordsGenerator().generateAllChords())) {

    fun findChordFor(inputString: String): String {

        val notes: Array<Note> = inputString.split("")
            .map(String::toUpperCase)
            .map { createNoteFromString(it) }
            .filterNotNull()
            .toTypedArray()

        val chord: Chord = chordsFinder.find(*notes)

        return chord.name
    }

    private fun createNoteFromString(it: String): Note? = try {
        Note.valueOf(it)
    } catch (e: IllegalArgumentException) {
        null
    }
}
