package eu.gaspard.ellerehcseb.core

class ChordsGenerator {

    fun generateAllChords(): List<Chord> {
        val allMajorChords = generateMajorChords()
        return allMajorChords
    }

    private fun generateMajorChords(): List<Chord> {
        val allMajorChords = Note.values().map { Chord(it.note_as_string.toUpperCase()) }
        return allMajorChords
    }
}
