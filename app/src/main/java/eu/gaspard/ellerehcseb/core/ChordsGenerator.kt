package eu.gaspard.ellerehcseb.core

class ChordsGenerator {

    fun generateAllChords(): List<Chord> =
        Note.values().flatMap { listOf(SeventhChord(it), MajorChord(it), MinorChord(it)) }
}
