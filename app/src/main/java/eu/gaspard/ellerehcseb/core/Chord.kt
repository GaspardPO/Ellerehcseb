package eu.gaspard.ellerehcseb.core

data class Chord(val notes: List<Note>, val name: String = notes[0].note_as_string)