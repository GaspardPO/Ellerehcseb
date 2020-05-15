package eu.gaspard.ellerehcseb.core

class ChordsGenerator {

    fun generateAllChords(): List<Chord> =
        Note.values().flatMap { listOf(
            MajorChord(it),
            MinorChord(it),
            SeventhChord(it),
            DiminishedChord(it),
            DiminishedSeventhChord(it)
        ) }
}
