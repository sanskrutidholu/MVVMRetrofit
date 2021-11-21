package com.example.mvvmretrofit.sample_2.ui

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.mvvmretrofit.R
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.s2_adapter_movie.view.*

class MovieAdapter(val context: Context, var movieList: ArrayList<MovieModel>) : RecyclerView.Adapter<MovieAdapter.MovieHolder>() {

    class MovieHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.s2_adapter_movie, parent, false)
        return MovieHolder(view)
    }

    override fun onBindViewHolder(holder: MovieHolder, position: Int) {
        val movie = movieList[position]
        holder.itemView.name.text = movie.name
        holder.itemView.desc.text = movie.desc
        holder.itemView.category.text = movie.category
        Picasso.get().load(movie.imageUrl).fit().into(holder.itemView.imageview)

    }

    override fun getItemCount(): Int {
        return movieList.size
    }

    fun setMovieData(movieList: ArrayList<MovieModel>) {
        this.movieList = movieList
        notifyDataSetChanged()
    }
}