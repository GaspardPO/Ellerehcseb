package eu.gaspard.ellerehcseb.core

import java.util.*

enum class Note(val note_as_string: String) {
    C("C"),
    Cs("C#"),
    D("D"),
    Ds("D#"),
    E("E"),
    F("F"),
    Fs("F#"),
    G("G"),
    Gs("G#"),
    A("A"),
    As("A#"),
    B("B");

    fun noteAfterInterval(interval: Int): Note {
        return values()[(this.ordinal + interval).rem(NB_OF_NOTES)]
    }
}

private const val NB_OF_NOTES = 12

fun getNotefromString(string : String):Note {
    if(string.length == 2 && string[1] == 'b'){
        return Note.valueOf(string[0].toUpperCase().toString()).noteAfterInterval(-1)
    }
    return Note.valueOf(string.toLowerCase(Locale.ROOT).capitalize().replace("#", "s"))
}