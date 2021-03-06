package com.example.recyclerview.model

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.bumptech.glide.Glide
import com.example.recyclerview.R
import com.example.recyclerview.adapter.Actors
import de.hdodenhof.circleimageview.CircleImageView
import kotlinx.android.synthetic.main.mero_actor_layout.view.*

class ActorAdapter(
    val lstActors : ArrayList<Actors>,
    val context : Context
    ) : RecyclerView.Adapter<ActorAdapter.ActorViewHolder>() {



    class ActorViewHolder(view : View) : RecyclerView.ViewHolder(view)
    {
        val imgProfile : CircleImageView
        val tvName: TextView
        val tvAddress : TextView
        val tvSalary : TextView
        init {
            imgProfile = view.findViewById(R.id.imgProfile)
            tvName = view.findViewById(R.id.tvName)
            tvAddress = view.findViewById(R.id.tvName)
            tvSalary = view.findViewById(R.id.tvSalary)
        }
    }



    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): ActorViewHolder {
        val view = LayoutInflater.from(p0.context)
            .inflate(R.layout.mero_actor_layout,p0, false)
        return ActorViewHolder(view)
    }

    override fun onBindViewHolder(p0: ActorViewHolder, p1: Int) {
        val actor = lstActors[p1]
        p0.tvName.text = actor.actorName
        p0.tvAddress.text = actor.actorAddress
        p0.tvSalary.text = actor.actorSalary.toString()
        Glide.with(context)
            .load(actor.actorImage)
            .into(p0.imgProfile)

    }

    override fun getItemCount(): Int {
       return lstActors.size
    }
}