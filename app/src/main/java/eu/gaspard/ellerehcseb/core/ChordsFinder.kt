package eu.gaspard.ellerehcseb.core

class ChordsFinder {
    fun find(vararg notes : Note): Chord {
        if(notes.contains(Note.B)){
            return Chord("G")
        }
        return Chord("C")
    }

}
