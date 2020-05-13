package ibrahim.aytimur.whenkosulifadesi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // When koşul ifadesi
        var x = 1
        when(x){
            1 -> textView.text = "Seçilen 1"
            2 -> textView.setText("Seçilen 2")
            else -> {
                textView.setText("Bulunmadı")
            }
        }
    }
}
