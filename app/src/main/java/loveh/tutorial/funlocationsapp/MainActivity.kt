package loveh.tutorial.funlocationsapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fabAddFunLocation = findViewById<FloatingActionButton>(R.id.fabAddFunLocation)

        fabAddFunLocation.setOnClickListener {
            val intent = Intent(this, AddFunLocationActivity::class.java)
            startActivity(intent)
        }


    }
}