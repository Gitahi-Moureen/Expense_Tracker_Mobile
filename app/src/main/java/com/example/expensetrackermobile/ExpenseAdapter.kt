package com.example.expensetrackermobile

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.view.menu.MenuView.ItemView
import androidx.recyclerview.widget.RecyclerView

class ExpenseAdapter(var expenseList: List<Expense>): RecyclerView.Adapter<ExpenseViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ExpenseViewHolder {
        var itemView = LayoutInflater.from(parent.context).inflate(R.layout.expenses,parent,false)
        return ExpenseViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return expenseList.size
    }

    override fun onBindViewHolder(holder: ExpenseViewHolder, position: Int) {
        val expense = expenseList[position]
        holder.tvSalary.text = expense.salary
        holder.tvAmount.text = expense.amount
        holder.tvDate.text = expense.date
    }


}
class ExpenseViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
    var tvSalary = itemView.findViewById<TextView>(R.id.tvSalary)
    var tvAmount = itemView.findViewById<TextView>(R.id.tvAmount)
    var tvDate = itemView.findViewById<TextView>(R.id.tvDate)
}


