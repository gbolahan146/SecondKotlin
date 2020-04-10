package com.example.OnlineStore

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), SampleInteractionCallback{

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        with(sample_rv) {
            layoutManager = LinearLayoutManager(this@MainActivity)
            adapter = SampleRecyclerAdapter(setData(), this@MainActivity)
        }
    }
    private fun setData(): List<SampleData>{
        return listOf(

            SampleData(itemName= "Ps5 ", itemImage = R.drawable.ps5, itemAds= "190,000", itemImage2 = 0),
            SampleData(itemName= "Gucci", itemImage = R.drawable.bag1, itemAds= "50,000", itemImage2 = 0),
            SampleData(itemName= "Bikini", itemImage = R.drawable.bikini, itemAds= "O2", itemImage2 = 0),
            SampleData(itemName="Nike AirForce 1", itemImage = R.drawable.shoe1, itemAds="23,000", itemImage2 = 0),
            SampleData(itemName= "Tote Bags", itemImage = R.drawable.tote, itemAds="2,000", itemImage2 = 0),
            SampleData(itemName= "Richard Mille", itemImage = R.drawable.watch, itemAds="49,999", itemImage2 = 0),
            SampleData(itemName= "Airmax 990", itemImage = R.drawable.shoe2, itemAds="30,000", itemImage2 = R.drawable.gogo2)

        )

    }

    override fun onClick(item: SampleData) {

        Toast.makeText(this, item.toString(), Toast.LENGTH_SHORT).show()
        val intent = Intent(this, SecondActivity::class.java).apply {
            putExtra( "data", item)
        }
        startActivity(intent)
    }
}
