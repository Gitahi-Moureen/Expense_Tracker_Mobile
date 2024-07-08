package com.example.expensetrackermobile

import android.os.Bundle
import android.widget.LinearLayout
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.expensetrackermobile.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.rvExpenses.layoutManager = LinearLayoutManager(this)
        displayExpenses()


    }
    fun displayExpenses(){
        val expense1 = Expense("Salary","KES 40,000","1 July 2024")
        val expense2 = Expense("Salary","KES 50,000","2 July 2024")
        val expense3 = Expense("Salary","KES 40,000","3 July 2024")
        val expense4 = Expense("Salary","KES 30,000","4 July 2024")
        val expense5 = Expense("Salary","KES 40,000","1 July 2024")
        val myexpenses = listOf(expense1,expense2,expense3,expense4,expense5)




    }
}