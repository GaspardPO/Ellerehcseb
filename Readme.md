# Ellerehcseb

Chords Finder

an application where I can enter notes, and it give me the name of the chord:
C, D#, F#, A  -> Cdim7

Algo:
- all chords are generated,
- then we search in the list for the chord with the same notes as input.

## Archi
[core folder](app/src/main/java/eu/gaspard/ellerehcseb/core): all "business" about music.  
[androidAdapter](app/src/main/java/eu/gaspard/ellerehcseb/androidAdapter) convert String to core business.  
only one activity.

### App, GUI, UX :
- [x] input: note as character
- [ ] input: note as button
- [ ] input: note on piano keyboard
- [ ] input: note on piano keyboard
- [ ] input: note on guitar/uku/banjo/... neck
- [x] output: chord name
- [ ] output: chord info (name, interval, third,
- [ ] display the chord name using b and # ?
- [x] uses character (A, B, C ...)
- [x] uses # or s for sharp
- [x] uses b for flat
- [ ] uses notes (Do, Ré, Mi ...)

### infra:
- [x] Continuous Unit Tests
- [x] Continuous End-to-End Tests
- [ ] UI Test using mock
- [ ] build apk
- [ ] deploy on store?
- [ ] dependecy injection: [koin?](https://insert-koin.io/)

### business core:
- [x] perfect major
- [x] perfect minor
- [x] (dominant) 7th : maj7, min7, m(maj7)
- [x] diminished
- [x] diminished seventh  
...
- [x] Don't use the first notes as root (inversion).
- [x] chords with exactly the given notes
- [ ] chords with other notes (not only the ones given as input)
- [ ] chords with other notes, using the first as root?  
...
- [x] sharp/flat (using fretted instrument, D# == Eb)
- [x] error when chord not found
...
- [ ] use a csv config file with the chords list ?

###  Chord to notes
From the chord, give the notes.

