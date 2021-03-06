package org.d3if4020.galerihewan2

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import org.d3if4020.galerihewan2.databinding.ListItemBinding

class MainAdapter(private val data: List<Hewan>) :
    RecyclerView.Adapter<MainAdapter.ViewHolder>() {
    class ViewHolder(private val binding: ListItemBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(hewan: Hewan) = with(binding) {
            namaTextView.text = hewan.nama
            latinTextView.text = hewan.namaLatin
            jenisHewan.text = hewan.jenisHewan
            imageView.setImageResource(hewan.imageResId)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = ListItemBinding.inflate(inflater, parent, false)
        return ViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return data.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(data[position])
    }
}