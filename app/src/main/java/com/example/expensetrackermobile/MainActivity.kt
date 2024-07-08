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
        val expense2 = Expense("Salary","KES 50,000","20 July 2024")
        val expense3 = Expense("Salary","KES 40,000","3 July 2024")
        val expense4 = Expense("Salary","KES 30,000","30 July 2024")
        val expense5 = Expense("Salary","KES 40,000","1 July 2024")
        val expense6 = Expense("Salary","KES 50,000","20 July 2024")
        val expense7 = Expense("Salary","KES 70,000","1 July 2024")
        val myexpenses = listOf(expense1,expense2,expense3,expense4,expense5,expense6,expense7)


        val expenseAdapter = ExpenseAdapter(myexpenses)
        binding.rvExpenses.adapter = expenseAdapter




    }
}