package kr.yangbob.motiontest

import android.content.res.Configuration
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_coordinator.*

class CoordinatorActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_coordinator)

        if( resources.configuration.orientation == Configuration.ORIENTATION_LANDSCAPE){
            coordinatorLayout.loadLayoutDescription(R.xml.scene_no)
        }

        linear.setOnClickListener {
            edit2.requestFocus()
            Toast.makeText(this, "click layout", Toast.LENGTH_LONG).show()
        }
    }
}
