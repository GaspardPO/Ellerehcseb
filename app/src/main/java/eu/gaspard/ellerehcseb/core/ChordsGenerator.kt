package eu.gaspard.ellerehcseb.core

class ChordsGenerator {

    fun generateAllChords(): List<Chord> {
        val allMajorChords = generateMajorChords()
        val allMinorChords = arrayOf(Chord(listOf("a")))
        return allMajorChords + allMinorChords
    }

    private fun generateMajorChords(): List<Chord> {
        val allMajorChords = Note.values().map { Chord(listOf(it.note_as_string.toUpperCase())) }
        return allMajorChords
    }
}
