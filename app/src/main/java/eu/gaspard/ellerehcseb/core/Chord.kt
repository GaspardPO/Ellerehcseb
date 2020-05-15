package eu.gaspard.ellerehcseb.core

abstract class Chord(val notes: List<Note>, val name: String = notes[0].note_as_string) {

    constructor(root: Note, intervals: IntArray, suffix: String = "") :
            this(intervals.map(root::noteAfterInterval), root.note_as_string + suffix)

    fun containsExactly(notes: Array<out Note>) =
        this.notes.toSortedSet().equals(notes.toSet())
}

class MajorChord(root: Note) : Chord(root, intArrayOf(0, 4, 7))
class MinorChord(root: Note) : Chord(root, intArrayOf(0, 3, 7), "m")
class SeventhChord(root: Note) : Chord(root, intArrayOf(0, 4, 7, 10), "7")
class DiminishedChord(root: Note) : Chord(root, intArrayOf(0, 3, 6), "dim")
class DiminishedSeventhChord(root: Note) : Chord(root, intArrayOf(0, 3, 6, 9), "dim7")
