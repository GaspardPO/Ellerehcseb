package eu.gaspard.ellerehcseb.core

class ChordsGenerator {

    fun generateAllChords(): List<Chord> {
        val allMajorChords = generateMajorChords()
        val allMinorChords = generateMinorChords()
        val allSeventhChords= generateSeventhChords()
        return allMajorChords + allMinorChords + allSeventhChords
    }

    private fun generateSeventhChords(): List<Chord> = Note.values().map(::createSeventhChord)

    private fun generateMajorChords(): List<Chord> = Note.values().map(::createMajorChord)

    private fun generateMinorChords(): List<Chord> = Note.values().map(::createMinorChord)

}
