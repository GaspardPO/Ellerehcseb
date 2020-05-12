package eu.gaspard.ellerehcseb.androidAdapter

import eu.gaspard.ellerehcseb.core.*

// TODO : dependecy injection à faire c'est tout cracra.
class AndroidChordFinder(private val chordsFinder: ChordsFinder = ChordsFinder(ChordsGenerator().generateAllChords())) {
    private val VALID_CHARACTERS = "[a-gA-G]#?".toRegex()

    fun findChordFor(inputString: String): String {
        val notes: Array<Note> = VALID_CHARACTERS
            .findAll(inputString)
            .toList().map { it.value }
            .map(::getNotefromString)
            .toTypedArray()

        val chord: Chord? = chordsFinder.findExactly(*notes)

        return chord?.name ?: "nop"
    }
}
