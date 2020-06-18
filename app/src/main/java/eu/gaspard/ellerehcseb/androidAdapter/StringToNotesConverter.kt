package eu.gaspard.ellerehcseb.androidAdapter

import eu.gaspard.ellerehcseb.core.Note
import eu.gaspard.ellerehcseb.core.getNotefromString

private val VALID_CHARACTERS = "[a-gA-G][#|s|b]?".toRegex()
fun String.asNotes(): Array<Note> {
    val notes: Array<Note> = VALID_CHARACTERS
        .findAll(this)
        .toList().map { it.value }
        .map(::getNotefromString)
        .toTypedArray()
    return notes
}