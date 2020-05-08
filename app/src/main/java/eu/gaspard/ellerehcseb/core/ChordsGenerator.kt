package eu.gaspard.ellerehcseb.core

class ChordsGenerator {

    fun generateAllChords(): List<Chord> {
        val allMajorChords = generateMajorChords()
        val allMinorChords = generateMinorChords()
        return allMajorChords + allMinorChords
    }

    private fun generateMinorChords(): List<Chord> = Note.values().map(this::createMinor)

    private fun generateMajorChords(): List<Chord> = Note.values().map(this::createMajor)

    fun createMajor(root: Note): Chord {
        val root_ordinal = root.ordinal
        val third = Note.values()[(root_ordinal + 4).rem(NB_OF_NOTES)]
        val fifth = Note.values()[(root_ordinal + 7).rem(NB_OF_NOTES)]

        return Chord(listOf(root, third, fifth))
    }

    fun createMinor(root: Note): Chord {
        val root_ordinal = root.ordinal
        val third = Note.values()[(root_ordinal + 3).rem(NB_OF_NOTES)]
        val fifth = Note.values()[(root_ordinal + 7).rem(NB_OF_NOTES)]

        val notes = listOf(root, third, fifth)
        return Chord(notes, root.note_as_string + "m")
    }
}
