package muchamadalfaidzin.informatika.tilas

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import muchamadalfaidzin.informatika.tilas.databinding.ActivitySearchButtonBinding

class SearchButtonActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySearchButtonBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySearchButtonBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Contoh listener CardView pertama
        binding.cardItem1.setOnClickListener {
            Toast.makeText(this, "Item 1 diklik", Toast.LENGTH_SHORT).show()
        }

        // Contoh listener CardView kedua
        binding.cardItem2.setOnClickListener {
            Toast.makeText(this, "Item 2 diklik", Toast.LENGTH_SHORT).show()
        }

        binding.cardItem3.setOnClickListener {
            Toast.makeText(this, "Item 2 diklik", Toast.LENGTH_SHORT).show()
        }

        binding.cardItem4.setOnClickListener {
            Toast.makeText(this, "Item 2 diklik", Toast.LENGTH_SHORT).show()
        }

        val bottomNav = binding.bottomNavigation
        bottomNav.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.nav_home -> {
                    startActivity(Intent(this, HomepageMainActivity::class.java))
                    finish() // Biar tidak menumpuk halaman
                    true
                }
                R.id.nav_profile -> {
                    startActivity(Intent(this, ProfileActivity::class.java))
                    finish()
                    true
                }
                R.id.nav_search -> true
                else -> false
            }
        }

    }
}
