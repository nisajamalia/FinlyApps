package com.dean.apihomemarketplace.fragment

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.dean.apihomemarketplace.R
import com.dean.apihomemarketplace.adapter.TrainingListAdapter
import com.dean.apihomemarketplace.model.Model


class TrainingFragment : Fragment() {
    private val traininglist = ArrayList<Model>()

    private lateinit var recyclerViewAdapter: TrainingListAdapter

    override fun onAttach(context: Context) {
        super.onAttach(context)
        traininglist.addAll(getListTraining())
        Log.d("TAG", traininglist.toString())
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_training, container, false)

//        rv_training.setHasFixedSize(true)

        showRecyclerList()

    }

    private fun getListTraining(): ArrayList<Model> {
        val dataName = resources.getStringArray(R.array.title)
        val dataDesc = resources.getStringArray(R.array.desc)
        val dataAddress = resources.getStringArray(R.array.address)
        val dataPhoto = resources.obtainTypedArray(R.array.image)

        // for looping
        val listHotel = ArrayList<Model>()
        for (position in dataName.indices) {
            val hotel = com.dean.apihomemarketplace.model.Model(
                dataName[position],
                dataDesc[position],
                dataAddress[position],
                dataPhoto.getResourceId(position, -1)
            )
            listHotel.add(hotel)
        }
        return listHotel

    }


    private fun showRecyclerList() {
//        rv_training.layoutManager =
//            LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
//
//        recyclerViewAdapter = TrainingListAdapter { showSelected(it) }
//        recyclerViewAdapter.notifyDataSetChanged()
//        recyclerViewAdapter.setData(getListTraining())
//        rv_training.setHasFixedSize(true)
//        rv_training.adapter = recyclerViewAdapter
    }

    private fun showSelected(it: Model) {
//        val page = Intent(context, DetailActivity::class.java)
//        page.putExtra(DetailActivity.KEY_POPULAR_HOTEL, it)
//        startActivity(page)
    }
}

