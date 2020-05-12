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
    B("B")
}

const val NB_OF_NOTES = 12

fun getNotefromString(string : String):Note =
    Note.valueOf(string.toLowerCase(Locale.ROOT).capitalize().replace("#", "s"))