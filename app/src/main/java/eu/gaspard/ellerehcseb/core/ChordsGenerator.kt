package eu.gaspard.ellerehcseb.core

class ChordsGenerator {

    fun generateAllChords(): List<Chord> {
        val allMajorChords = generateMajorChords()
        val allMinorChords = generateMinorChords()
        return allMajorChords + allMinorChords
    }

    private fun generateMajorChords(): List<Chord> = Note.values().map(::createMajorChord)

    private fun generateMinorChords(): List<Chord> = Note.values().map(::createMinorChord)

}
