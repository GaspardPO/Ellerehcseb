package eu.gaspard.ellerehcseb

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import eu.gaspard.ellerehcseb.androidAdapter.AndroidChordFinder
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener {
            // TODO : dependency injection / koin ?
            output_chord.text = AndroidChordFinder().findChordFor(input_notes.text.toString())
       }
    }
}